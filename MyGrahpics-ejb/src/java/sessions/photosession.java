/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import Entities.Aboutusbean;
import Entities.Billingbean;
import Entities.Bindingbean;
import Entities.Bindpalcementbean;
import Entities.Blogbean;
import Entities.Cardslotbean;
import Entities.Contactusbean;
import Entities.Coverpaperbean;
import Entities.Customersbean;
import Entities.Deliverydetailsbean;
import Entities.Grommetbean;
import Entities.Hermsbean;
import Entities.Initializeprodutsbean;
import Entities.Interiorcolorbean;
import Entities.Laminationbean;
import Entities.Order1bean;
import Entities.Pagestabbean;
import Entities.Papertypebean;
import Entities.Polepocketbean;
import Entities.Printedsidebean;
import Entities.Printturnarroundbean;
import Entities.Productimagesbean;
import Entities.Productsservicesbean;
import Entities.Quantitybean;
import Entities.Requestprintbean;
import Entities.Rolebean;
import Entities.Sizetablebean;
import Entities.Staffbean;
import Entities.Subcategorybean;
import Entities.Userbean;
import Utill.CONST;
import Utill.CryptoLibrary;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author JPT TERSOO AGBE
 */
@Stateless
public class photosession implements photosessionLocal {

    @PersistenceContext(unitName = "MyGrahpics-ejbPU")
    private EntityManager em;
    //SMTP server.
private final int port = 465;
private final String host = "smtp.inspirationalimagesltd.com";
private final String from = "info@inspirationalimagesltd.com";
//private boolean auth = true;
private final String username = "info@inspirationalimagesltd.com";
private final String password = "secretpw";
private final Protocol protocol = Protocol.SMTPS;
private final boolean debug = true;
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
    static Random rnd = new Random();
 String dt = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    DecimalFormat df = new DecimalFormat("#.##");
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
    // Add business logic below. (Right-click in editor and choose
                                                                                                                                
    
    @Override
    public void addGrommet(String id, String grommetname, String productcode, String price, String desceiption, String status, String sizes, String price2, String price3, String size1) {
        try {

            Grommetbean gb = new Grommetbean();
            gb.setId(this.randomString(8).toUpperCase());
            gb.setGrommetname(grommetname);
            gb.setProductcode(productcode);
            gb.setPrice(price);
            gb.setDesceiption(desceiption);
            gb.setStatus(status);
            gb.setSizes(sizes);
            gb.setPrice2(price2);
            gb.setPrice3(price3);
            gb.setSize1(size1);
            em.persist(gb);
            this.em.persist(gb);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }

    }
    
        @Override
    public Userbean userlogin(String username, String password) {
        Userbean userl = new Userbean();
        String pass = "NA";
  CryptoLibrary cl = new CryptoLibrary();       
        
            //return em.find(Userbean.class, username);
        String getStaffid = this.viewSingleStaff(username).getUsername();
        Query q  = em.createNamedQuery("authenticate");
        q.setParameter("username", getStaffid);
        q.setParameter("password", cl.decrypt(password));
        q.setParameter("status", "1");
        
        return (Userbean)q.getSingleResult();
    }
    @Override
 public boolean checkUserPassword(String username, String password) {
     CryptoLibrary cl = new CryptoLibrary();
        boolean bl =false;
        try{
        em.createNamedQuery("Userbean.authenticate").setParameter("username", username).setParameter(cl.decrypt("password"), password).getSingleResult();
        bl=true;
        }catch(Exception bn){
            
        }
        return bl;
    }

    // view All user Table Name: UserBean
    @Override
    public List viewAllUsers() {
        List ll = em.createNamedQuery("Userbean.findAll").getResultList();
        return ll;
    }

    // view user record
    @Override
    public Userbean viewSingleUserRec(String username) {
          Userbean ub;
        ub = new Userbean();
        try {
          
            ub = em.find(Userbean.class, username);
            
           
        } catch (Exception ex) {

        }
        return ub;
    }

    @Override
    public void addRoles(String rolename, String Defaults, String status) {
        Rolebean rb = new Rolebean();
        try {

            rb.setRoleName(rolename);
            rb.setDefaultName(Defaults);
            rb.setStatus(status);
            em.persist(rb);

        } catch (Exception ex) {
        }

    }
    // ivew Single Role

    @Override
    public Rolebean viewSingleRole(String rolename) {
        Rolebean gb = new Rolebean();
        try {
            return gb = em.find(Rolebean.class, rolename);
        } catch (Exception ex) {
        }
        return null;
    }

    @Override
    public void modifyRoles(String rolename) {
        Rolebean rb = new Rolebean();
        try {

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }
// View All Roles

    @Override
    public List viewAllRoles() {
        List lk = em.createNamedQuery("Rolebean.findAll").getResultList();
        return lk;
    }

    @Override
    public String authenticatePassword(String username, String password) {
        CryptoLibrary cl = new CryptoLibrary();
        String msg = "";
         try {
          
         Userbean us;
             Staffbean sb = this.viewSingleStaff(username);
            us = em.find(Userbean.class, sb.getUsername());
           
        System.out.println("this is the session password=="+ us.getPassword());
            if (password.equalsIgnoreCase(cl.decrypt(us.getPassword()))) {
               // System.out.println("this is the decripted version== "+ cl.decrypt(us.getPassword()));
                msg = cl.decrypt(us.getPassword());
                //x=true;
            } else {
                //x=false;
                msg = "invalid password or username";
            }
          return msg;

        } catch (Exception ex) {
        }
        return msg;
    }
    
     @Override
    public String authenticatePassword2(String username, String password) {
        CryptoLibrary cl = new CryptoLibrary();
        String msg = "";
         try {
          
         Userbean us;
             Customersbean sb = this.viewSingleCustomer(username);
            us = em.find(Userbean.class, sb.getCustomerId());
           
        System.out.println("this is the session password=="+ us.getPassword());
            if (password.equalsIgnoreCase(cl.decrypt(us.getPassword()))) {
               // System.out.println("this is the decripted version== "+ cl.decrypt(us.getPassword()));
                msg = cl.decrypt(us.getPassword());
                //x=true;
            } else {
                //x=false;
                msg = "invalid password or username";
            }
          return msg;

        } catch (Exception ex) {
        }
        return msg;
    }

    @Override
    public Sizetablebean removeSize(String id) {
        Sizetablebean sb = new Sizetablebean();
        try {
            em.find(Sizetablebean.class, id).getCode();
            em.remove(sb);

        } catch (Exception exd) {
        }
        return sb;
    }

    @Override

    public void addSize(String code, String sizetab, String description, String status, String productcode, String price, String pagecost, String minpages, String minorder) {
        Sizetablebean st = new Sizetablebean();
        try {
            st.setCode(this.randomString(5));
            st.setSizetab(sizetab);
            st.setDescription(description);
            st.setStatus(Utill.CONFIG.getSET_STATUS());
            st.setProductcode(productcode);
            st.setPrice(price);
            st.setPagecost(pagecost);
            st.setMinpages(minpages);
            st.setMinorder(minorder);
            em.persist(st);
          //  System.out.println("pass this section now!!!!");
        } catch (Exception ex) {
            throw new EJBException();
        }

    }

    @Override

    public void modifySizes(String code, String sizetab, String description, String status, String productcode, String price, String pagecost, String minpages, String minorder) {
    
        try {

            Sizetablebean st  = em.find(Sizetablebean.class, code);
            //  st.setCode(this.randomString(5));
            st.setSizetab(sizetab);
            st.setDescription(description);
            st.setStatus(Utill.CONFIG.getSET_STATUS());
            st.setProductcode(productcode);
            st.setPrice(price);
            st.setPagecost(pagecost);
            st.setMinpages(minpages);
            st.setMinorder(minorder);
            em.persist(st);
        } catch (Exception ex) {
            throw new EJBException();
        }

    }
    
    @Override
    public Sizetablebean viewSingleSize(String id) {
         Sizetablebean sb = new Sizetablebean();
        try {
           //sb = new Sizetablebean();
             sb = em.find(Sizetablebean.class, id);
        } catch (Exception ex) {
        }
        return sb;
    }

    @Override
    public List viewAllSize() {

        List lt;
        lt= em.createNamedQuery("Sizetablebean.findAll").getResultList();

        return lt;
    }
  
    //#############################3 PAGES SECTION #############################
    @Override
    public void addPages(String pageId, String pageNumber, String del, String price, String productid, String pagename) {
        Pagestabbean pt = new Pagestabbean();
        try {
            pt.setPageId(pageId);
            pt.setPageNumber(pageNumber);
            pt.setPagename(pagename);
            pt.setPrice(price);
            pt.setProductid(productid);
            pt.setStatus("ACTIVE");
            pt.setDel("Active");
            em.persist(pt);

        } catch (Exception ex) {
            throw new EJBException("INSIDE ADD PAGES=" + ex.getMessage());
        }
    }
    @Override
    public void modifyPages(String pageId, String pageNumber, String del, String price, String productid, String pagename) {
        Pagestabbean pt = em.find(Pagestabbean.class, pageId);
        try {

            pt.setPageId(pageId);
            pt.setPageNumber(pageNumber);
            pt.setPagename(pagename);
            pt.setPrice(price);
            pt.setProductid(productid);
            pt.setStatus(price);
            em.persist(pt);

        } catch (Exception ex) {
            throw new EJBException("INSIDE ADD PAGES=" + ex.getMessage());
        }
    }

    @Override
    public Pagestabbean viewSinglePages(String pageID) {
        Pagestabbean pb = new Pagestabbean();
        try {
            return pb = em.find(Pagestabbean.class, pageID);

        } catch (Exception ex) {

        }
        return null;
    }

    @Override
    public List viewAllPages() {
        List lt = em.createNamedQuery("Pagestabbean.findAll").getResultList();
        return lt;
    }

    @Override
    public List viewAllPagesByProductid(String productid) {
        List li = em.createNamedQuery("Pagestabbean.findByProductid").setParameter("productid", productid).getResultList();
        return li;
    }

    @Override
    public void removepages(String code) {
        try {
             
           Pagestabbean pt = em.find(Pagestabbean.class, code);
            em.remove(pt);

        } catch (Exception ex) {

        }
    }

    //##############################################################################
    @Override
    public void addPaperType(String paperTypeId, String paperName, String description, String productName) {
        Papertypebean pb = new Papertypebean();
        try {
            pb.setPaperTypeId(this.randomString(5));
            pb.setPaperName(paperName);
            pb.setDescription(description);
            pb.setProductName(productName);
            pb.setStatus("1");
            pb.setDel("Active");
            em.persist(pb);
        } catch (Exception ex) {
            throw new EJBException("INSIDE ADD PaperType" + ex.getMessage());
        }
    }

    @Override
    public void modifyPaperType(String paperTypeId, String paperName, String description, String productName) {
        Papertypebean pb = new Papertypebean();
        try {
            em.find(Papertypebean.class, paperTypeId);
            pb.setPaperName(paperName);
            pb.setDescription(description);
            pb.setProductName(productName);
            pb.setStatus("1");
            pb.setDel("Active");
            em.persist(pb);
        } catch (Exception ex) {
            throw new EJBException("INSIDE MODIFY PaperType" + ex.getMessage());
        }
    }

    @Override
    public void removePaperType(String id) {
        Papertypebean pb = new Papertypebean();
        try {
            em.remove(pb);

        } catch (Exception ex) {   }
    }

    @Override
    public Papertypebean viewSinglePaperType(String id) {
Papertypebean ps = new Papertypebean();
        try {
         return ps =  em.find(Papertypebean.class, id);

        } catch (Exception ex) { }
        return null;
    }

    @Override
    public List viewAllPaperType() {
        List lit = em.createNamedQuery("Papertypebean.findAll").getResultList();
        return lit;
    }

    @Override
    public List viewAllPaperTypeByProductName(String productname) {
        List lit = em.createNamedQuery("Papertypebean.findByProductName").setParameter("productName", productname).getResultList();
        return lit;
    }
    //########################### BINDING SECTION ##########################

    @Override
    public void addBinding(String bindingId, String bindingName, String description, String price, String productid) {
        Bindingbean bd = new Bindingbean();
        try {
            bd.setBindingId(this.randomString(5));
            bd.setBindingName(bindingName);
            bd.setDescription(description);
            bd.setPrice(price);
            bd.setProductid(productid);
            bd.setStatus("1");
            bd.setDel("Activate");
            em.persist(bd);

        } catch (Exception ex) {
            throw new EJBException();
        }
    }

    @Override
    public void modifyBinding(String bindingId, String bindingName, String description, String price, String productid) {
        Bindingbean bd = new Bindingbean();
        try {
            em.find(Bindingbean.class, bindingId);
            bd.setBindingId(bindingId);
            bd.setBindingName(bindingName);
            bd.setDescription(description);
            bd.setPrice(price);
            bd.setProductid(productid);
            bd.setStatus("1");
            bd.setDel("Activate");

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Bindingbean viewSingleBinding(String bindingId) {
        try {
            Bindingbean bl = new Bindingbean();
           return bl = em.find(Bindingbean.class, bindingId);

        } catch (Exception ex) {}

        return null;
    }

    @Override
    public List viewAllBinding() {
        List li = em.createNamedQuery("Bindingbean.findAll").getResultList();
        return li;
    }

    @Override
    public List viewAllBindingProductId(String Productid) {
        List li = em.createNamedQuery("Bindingbean.findByProductid").setParameter("productid", Productid).getResultList();
        return li;
    }

    @Override
    public void removeBinding(String productID) {
        Bindingbean bd = new Bindingbean();
        try {
            em.find(Bindingbean.class, productID);
            em.remove(bd);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void addBindPlacement(String bpId, String bpName, String description, String price, String productid) {
        Bindpalcementbean bl = new Bindpalcementbean();
        try {
            bl.setBpId(this.randomString(5));
            bl.setBpName(bpName);
            bl.setDescription(description);
            bl.setPrice(price);
            bl.setProductid(productid);
            bl.setStatus("1");
            bl.setDel("0");
            em.persist(bl);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void modifyBindPlacement(String bpId, String bpName, String description, String price, String productid) {
        Bindpalcementbean bl = new Bindpalcementbean();
        try {
            bl.setBpId(bpId);
            bl.setBpName(bpName);
            bl.setDescription(description);
            bl.setPrice(price);
            bl.setProductid(productid);
            bl.setStatus("1");
            bl.setDel("0");
            em.persist(bl);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Bindpalcementbean viewSingleBindPlacement(String bpId) {
        try {
            Bindpalcementbean bp = new Bindpalcementbean();
            return bp = em.find(Bindpalcementbean.class, bpId);

        } catch (Exception ex) {}
        return null;
    }

    @Override
    public List viewAllBindPlacement() {
        List li = em.createNamedQuery("Bindpalcementbean.findAll").getResultList();
        return li;
    }

    @Override
    public List viewAllBindPlacementByProductID(String productId) {
        List li = em.createNamedQuery("Bindpalcementbean.findByProductid").setParameter("productId", productId).getResultList();
        return li;
    }
    //######################################################################################
    //##################### ADD COVER PAPER ###################################################

    @Override
    public void addCoverPaper(String cpId, String cpName, String description, String productid) {
        Coverpaperbean cp = new Coverpaperbean();
        try {
            cp.setCpId(this.randomString(5));
            cp.setCpName(cpName);
            cp.setDescription(description);
            cp.setProductid(productid);
            cp.setDel("0");
            cp.setStatus("Active");
            em.persist(cp);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void modifyCoverPaper(String cpId, String cpName, String description, String productid) {
        Coverpaperbean cp = new Coverpaperbean();
        try {
            em.find(Coverpaperbean.class, productid);
            cp.setCpName(cpName);
            cp.setDescription(description);
            cp.setProductid(productid);
            cp.setDel("0");
            cp.setStatus("Active");
            em.persist(cp);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Coverpaperbean viewSingleCoverPaper(String cpId) {

        try {
            Coverpaperbean cp = new Coverpaperbean();
          return cp = em.find(Coverpaperbean.class, cpId);

        } catch (Exception ex) {  }
        return null;
    }

    @Override
    public List viewAllCoverPaper() {
        List lit = em.createNamedQuery("Coverpaperbean.findAll").getResultList();
        return lit;
    }

    @Override
    public List viewAllCoverPaperByProductId(String productid) {
        List li = em.createNamedQuery("Coverpaperbean.findByProductid").setParameter("productid", productid).getResultList();
        return li;
    }

    @Override
    public void removeCoverPaper(String id) {
        Coverpaperbean cp = new Coverpaperbean();
        try {
            em.find(Coverpaperbean.class, id);
            em.persist(cp);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }

    }

    //@################################################################################################################3
    @Override
    public void addPrintturarround(String id, String printType, String price, String productid) {
        Printturnarroundbean pb = new Printturnarroundbean();
        try {
            pb.setId(id);
            pb.setPrintType(printType);
            pb.setPrice(price);
            pb.setProductid(productid);
            pb.setStatus("1");
            pb.setDel("0");
            em.persist(pb);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void modifyPrintturarround(String id, String printType, String price, String productid) {
        Printturnarroundbean pb = new Printturnarroundbean();
        try {
            em.find(Printturnarroundbean.class, id);
            pb.setPrintType(printType);
            pb.setPrice(price);
            pb.setProductid(productid);
            pb.setStatus("1");
            pb.setDel("0");
            em.persist(pb);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Printturnarroundbean viewSinglePrintTunaround(String id) {
       try {
            Printturnarroundbean pt = new Printturnarroundbean();
           return pt = em.find(Printturnarroundbean.class, id);

        } catch (Exception ex) {}

        return null;
    }

    @Override
    public List viewAllByCodePrintTurnAround(String productid) {
        List li = em.createNamedQuery("Printturnarroundbean.findByProductid").setParameter("productid", productid).getResultList();
        return li;
    }

    @Override
    public List viewAllPrintTurnAround() {
        List li = em.createNamedQuery("Printturnarroundbean.findAll").getResultList();
        return li;
    }

    @Override
    public void removePrintTuraround(String id) {
        Printturnarroundbean pb = new Printturnarroundbean();
        try {
           em.find(Printturnarroundbean.class, id);
            em.remove(pb);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    //####################################################################################
    //#################### SUB CATEGORY SECTION @##########################################3
    @Override
    public String addSubcategory(String code, String productId, String subcategory, String defaultprice, byte[] pix) {
        Subcategorybean sc = new Subcategorybean();
        String coded = this.randomString(5);
        try {
            sc.setCode(coded);
            sc.setProductId(productId);
            sc.setSubcategory(subcategory);
            sc.setSize("0");
            sc.setSizeandcut("0");
            sc.setPrintturnaround("0");
            sc.setPapertype("0");
            sc.setPrintedside("0");
            sc.setEnvelope("0");
            sc.setSequentialnumbering("0");
            sc.setStartingnumber("0");
            sc.setHoledrilling("0");
            sc.setHolelocation("0");
            sc.setRoundedcorners("0");
            sc.setLamination("0");
            sc.setCardslot("0");
            sc.setTabbing("0");
            sc.setCanvaswrapping("0");
            sc.setCanvascut("0");
            sc.setGrommet("0");
            sc.setHerms("0");
            sc.setPolepocket("0");
            sc.setPages("0");
            sc.setInteriorpaper("0");
            sc.setInkcolor("0");
            sc.setInteriocolor("0");
            sc.setBinding("0");
            sc.setBpunch("0");
            sc.setBindplacement("0");
            sc.setFolding("0");
            sc.setPerforation("0");
            sc.setCoverpaper("0");
            sc.setDefaultprice("0");
            sc.setPix(pix);
            sc.setNumberinglocation("0");
            sc.setTreeholedrilling("0");
            sc.setStatus("1");
            em.persist(sc);

        } catch (Exception ex) {
           
        }
        return coded;
    }
            @Override
    public void modifySubcategory(String code, String productId, String subcategory, String size, String sizeandcut, String printturnaround, String papertype, String printedside, String envelope, String sequentialnumbering, String startingnumber, String holedrilling, String holelocation, String roundedcorners, String lamination, String cardslot, String tabbing, String canvaswrapping, String canvascut, String grommet, String herms, String polepocket, String pages, String interiorpaper, String inkcolor, String interiocolor, String binding, String bpunch, String bindplacement, String folding, String perforation, String coverpaper, String defaultprice, byte[] pix, String numberinglocation, String treeholedrilling, String status) {
         
        try {
            Subcategorybean sc = em.find(Subcategorybean.class, code);
            sc.setProductId(productId);
            sc.setSubcategory(subcategory);
            sc.setSize(size);
            sc.setSizeandcut(sizeandcut);
            sc.setPrintturnaround(printturnaround);
            sc.setPapertype(papertype);
            sc.setPrintedside(printedside);
            sc.setEnvelope(envelope);
            sc.setSequentialnumbering(sequentialnumbering);
            sc.setStartingnumber(startingnumber);
            sc.setHoledrilling(holedrilling);
            sc.setHolelocation(holelocation);
            sc.setRoundedcorners(roundedcorners);
            sc.setLamination(lamination);
            sc.setCardslot(cardslot);
            sc.setTabbing(tabbing);
            sc.setCanvaswrapping(canvaswrapping);
            sc.setCanvascut(canvascut);
            sc.setGrommet(grommet);
            sc.setHerms(herms);
            sc.setPolepocket(polepocket);
            sc.setPages(pages);
            sc.setInteriorpaper(interiorpaper);
            sc.setInkcolor(inkcolor);
            sc.setInteriocolor(interiocolor);
            sc.setBinding(binding);
            sc.setBpunch(bpunch);
            sc.setBindplacement(bindplacement);
            sc.setFolding(folding);
            sc.setPerforation(perforation);
            sc.setCoverpaper(coverpaper);
            sc.setDefaultprice(defaultprice);
            sc.setPix(pix);
            sc.setNumberinglocation(numberinglocation);
            sc.setTreeholedrilling(treeholedrilling);
            sc.setStatus(status);
            em.persist(sc);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Subcategorybean viewSingleSubcategory(String id) {
        try {
             
            
          Subcategorybean sb = em.find(Subcategorybean.class, id);
         // System.out.println("this is where the pix" + sb.getCode());
           return sb;

        } catch (Exception ex) { }
        return null;
    }

    @Override
    public List viewAllSubCategoris() {
        List li = em.createNamedQuery("Subcategorybean.findAll").getResultList();
        return li;
    }

    @Override
    public List viewAllSubCategorisFolding(String folding) {
        List li = em.createNamedQuery("Subcategorybean.findByFolding").setParameter("folding", folding).getResultList();
        return li;
    }

    @Override
    public List viewAllSubCategorisProductID(String productid) {
        List li = em.createNamedQuery("Subcategorybean.findByProductId").setParameter("productId", productid).getResultList();
        return li;
    }

    @Override
    public void removeSubCategoris(String id) {
        Subcategorybean pb = new Subcategorybean();
        try {
            em.find(Subcategorybean.class, id);
            em.remove(pb);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    //################################################################################################################
    //###################### STAFF SECTI0N ###########################################################
    @Override
    public void addStaff(String username, String firstName, String lastName, String gender, String position, String nationality, String stateOfOrigin, String lga, String homeAddress, String phoneNumber, String dateOfAppointment, byte[] passport) {
        Staffbean sb = new Staffbean();
        try {

            sb.setUsername(username);
            sb.setFirstName(firstName);
            sb.setLastName(lastName);
            sb.setGender(gender);
            sb.setPosition(position);
            sb.setNationality(nationality);
            sb.setStateOfOrigin(stateOfOrigin);
            sb.setLga(lga);
            sb.setHomeAddress(homeAddress);
            sb.setPhoneNumber(phoneNumber);
            sb.setDateOfAppointment(dateOfAppointment);
            sb.setPassport(passport);
            sb.setDel("0");
            em.persist(sb);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void modifyStaff(String username, String firstName, String lastName, String gender, String position, String nationality, String stateOfOrigin, String lga, String homeAddress, String phoneNumber, String dateOfAppointment, byte[] passport) {
        
        try {
            Staffbean sb = em.find(Staffbean.class, username);

            sb.setFirstName(firstName);
            sb.setLastName(lastName);
            sb.setGender(gender);
            sb.setPosition(position);
            sb.setNationality(nationality);
            sb.setStateOfOrigin(stateOfOrigin);
            sb.setLga(lga);
            sb.setHomeAddress(homeAddress);
            sb.setPhoneNumber(phoneNumber);
            sb.setDateOfAppointment(dateOfAppointment);
            sb.setPassport(passport);
            sb.setDel("0");
            em.persist(sb);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Staffbean viewSingleStaff(String username) {

        try {
            Staffbean sb;
            
         return sb =  em.find(Staffbean.class, username);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
        //return sb;
    }

//####################################### ADD POLEPOCKET FOR SIZES ###############################
    @Override
    public String addPolePocket(String id, String polepocketname, String productcode, String price, String description) {
        Polepocketbean pp = new Polepocketbean();
        try {
            pp.setId(this.randomString(8).toUpperCase());
            pp.setPolepocketname(polepocketname);
            pp.setProductcode(productcode);
            pp.setPrice(price);
            pp.setDescription(description);
            pp.setStatus("Active");
            em.persist(pp);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
        return CONST.ADD_RECORD;
    }

    @Override
    public void modifyPolePocket(String id, String polepocketname, String productcode, String price, String description) {
        
        try {
            Polepocketbean pp = em.find(Polepocketbean.class, id);
            pp.setPolepocketname(polepocketname);
            pp.setProductcode(productcode);
            pp.setPrice(price);
            pp.setDescription(description);
            pp.setStatus("Active");
            em.persist(pp);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Polepocketbean viewSinglePolePocket(String id) {

        try {
            Polepocketbean pb = new Polepocketbean();
          return pb = em.find(Polepocketbean.class, id);
        } catch (Exception ex) {  }
        return null;
    }

    @Override
    public List viewAllPolePocket() {
        List li = em.createNamedQuery("Polepocketbean.findAll").getResultList();
        return li;
    }

    @Override
    public List viewBYPolePocketCODE(String productcode) {
        List li = em.createNamedQuery("Polepocketbean.findByProductcode").setParameter("productcode", productcode).getResultList();
        return li;
    }

    @Override
    public void removePolePocket(String id) {
        Polepocketbean pg = new Polepocketbean();
        try {
            em.find(Polepocketbean.class, id);
            em.remove(pg);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());

        }
    }
//#############################viewAllProducts################################################################33
//######################################PRODUCT SERVICE SECTION

    @Override
    public List viewAllProducts() {
        List li = em.createNamedQuery("Productsservicesbean.findAll").getResultList();
        return li;
    }

    @Override
    public void addYear(String productid, String productname, byte[] pix, byte[] pix2, String description) {
        Productsservicesbean ps = new Productsservicesbean();

        try {
            ps.setProductsId(productid);
            ps.setProductsName(productname);
            ps.setPix(pix);
            ps.setPix2(pix2);
            ps.setStatus("Active");
            ps.setDescription(description);
            em.persist(ps);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void modifyYear(String productid, String productname, byte[] pix, byte[] pix2, String description) {
       try {
          Productsservicesbean ps = em.find(Productsservicesbean.class, productid);
            ps.setProductsName(productname);
            ps.setPix(pix);
            ps.setPix2(pix2);
            ps.setStatus("Active");
            ps.setDescription(description);
            em.persist(ps);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public Productsservicesbean viewSingleProduct(String productid) {
        try {
            Productsservicesbean ps;
           return ps = em.find(Productsservicesbean.class, productid);

        } catch (Exception ex) {
           // throw new EJBException(ex.getMessage());
        }
        return null;
    }

    
    @Override
    public void deleteSingleRec(String id) {
         
        try{
         Productsservicesbean pb = em.find(Productsservicesbean.class, id);
         em.remove(pb);
        }catch(Exception ex){
        
        }
    }
    //#############################################################################################33
    @Override
    public void addRequest(String rpId, String name, String companyName, String phone, String email, String website, String description, byte[] pix, String status, String vCode) {
        Requestprintbean rp = new Requestprintbean();
        try {
            rp.setRpId(this.randomString(5));
            rp.setName(name);
            rp.setCompanyName(companyName);
            rp.setPhone(phone);
            rp.setEmail(email);
            rp.setWebsite(website);
            rp.setDescription(description);
            rp.setPix(pix);
            rp.setStatus("Active");
            rp.setVCode(vCode);
            em.persist(rp);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());

        }

    }

    @Override
    public Requestprintbean viewSingleRequest(String rpId) {
        try {
            Requestprintbean rp;
         return rp = em.find(Requestprintbean.class, rpId);

        } catch (Exception ex) {  }
        return null;
    }

    @Override
    public List viewAllRequest() {
        List li = em.createNamedQuery("Requestprintbean.findAll").getResultList();
        return li;
    }

    @Override
    public void addAboutUs(String abtId, String abtUs, String description) {
        Aboutusbean ab = new Aboutusbean();
        try {
            ab.setAbtId(this.randomString(5));
            ab.setAbtUs(abtUs);
            ab.setDescription(description);
            ab.setStatus("Active");
            ab.setDel("0");
            em.persist(ab);

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public void modifyAboutUs(String abtId, String abtUs, String description) {
        
        try {
            Aboutusbean ab = em.find(Aboutusbean.class, abtId);
            ab.setAbtUs(abtUs);
            ab.setDescription(description);
            ab.setStatus("Active");
            ab.setDel("0");
            em.persist(ab);
        } catch (Exception ec) {
           // throw new EJBException(ec.getMessage());

        }
    }

    @Override
    public Aboutusbean viewAllAboutUS(String id) {
            Aboutusbean ab = new Aboutusbean();
        try {
            
           return ab = em.find(Aboutusbean.class, id);
        } catch (Exception ex) {}
        return null;
    }

    @Override
    public List viewAboutUs() {
        List li = em.createNamedQuery("Requestprintbean.findAll").getResultList();
        return li;
    }

    @Override
    public void removeAboutUs(String id) {
       
        try {
             Aboutusbean ab = em.find(Aboutusbean.class, id);
            em.remove(ab);
        } catch (Exception ex) {
          //  throw new EJBException();
        }
    }

    @Override
    public void addContactUs(String cuId, String cus, String description, String street, String states, String city, String country) {
        Contactusbean cul = new Contactusbean();
        try {
            cul.setCuId(cuId);
            cul.setCus(cus);
            cul.setDel("0");
            cul.setDescription(description);
            cul.setStatus(Utill.CONFIG.getSET_STATUS());
            cul.setCity(city);
            cul.setCountry(country);
            cul.setStreet(street);
            cul.setStates(states);
            em.persist(cul);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    @Override
    public List viewAllAboutUs() {
        return null;
    }

    @Override
    public Contactusbean viewSingleContactUs(String id) {
        Contactusbean cb = new Contactusbean();
        try{
           return cb = em.find(Contactusbean.class, id);
          }catch(Exception ex){
        //throw new EJBException("");
        }
        return null;
    }

    @Override
    public List viewAllContacts() {
        List li = em.createNamedQuery("Contactusbean.findAll").getResultList();
        return li;
    }

    @Override
    public void InitializeProducts(String productName, String productStatus, String productDefaultPrice, String defaultpage) {
       Initializeprodutsbean ib = new Initializeprodutsbean();
        try{
            ib.setProductName(productName);
            ib.setProductStatus(productStatus);
            ib.setProductDefaultPrice(productDefaultPrice);
            ib.setDefaultpage(defaultpage);
            em.persist(ib);
        
        }catch(Exception ex){
        throw new EJBException(ex.getMessage());
        }
       
    }

    @Override
    public Initializeprodutsbean viewSingleInitial(String id) {
        Initializeprodutsbean ip = new Initializeprodutsbean();
        try{
          return ip =  em.find(Initializeprodutsbean.class, id);
        
        }catch(Exception ex){ }
        return null;
    }

    @Override
    public List viewAllInitialProducts() {
        List li = em.createNamedQuery("Initializeprodutsbean.findAll").getResultList();
        return li;
    }

    @Override
    public void modifyInitialzeProducts(String productName, String productStatus, String productDefaultPrice, String defaultpage) {
      

        try{
            Initializeprodutsbean ib = em.find(Initializeprodutsbean.class, productName);
            ib.setProductStatus(productStatus);
            ib.setProductDefaultPrice(productDefaultPrice);
            ib.setDefaultpage(defaultpage);
            em.persist(ib);
            }catch(Exception  ex){
        
        }
    }

    @Override
    public void removeInitializedProduct(String id) {
        Initializeprodutsbean ib = em.find(Initializeprodutsbean.class, id);
        List li = em.createNamedQuery("Initializeprodutsbean.findAll").getResultList();
        li.remove(ib);
        
    }
    
    //############## PRDUCT MANIFULATION #####################
   //########################################################

    @Override
    public List viewAllData() {
         List li = em.createNamedQuery("Productsservicesbean.findAll").getResultList();
        return li;
       
    }
    
////##########   ADD CARD SLOT ###########\\\\

    @Override
    public void addCardSlot(String id, String cardslotname, String productcode, String price, String description, String status, String vision) {
        Cardslotbean cs = new Cardslotbean();
        try{
            cs.setId(this.randomString(5));
            cs.setCardslotname(cardslotname);
            cs.setProductcode(productcode);
            cs.setPrice(price);
            cs.setDescription(description);
            cs.setStatus(status);
            cs.setVision(vision);
           em.persist(cs);
        
        }catch(Exception ex){
        
        }
    }
    
    
    @Override
    public void modifyCardSlot(String id, String cardslotname, String productcode, String price, String description, String status, String vision) {
        
        try{
            Cardslotbean cs = em.find(Cardslotbean.class, id);
            cs.setCardslotname(cardslotname);
            cs.setProductcode(productcode);
            cs.setPrice(price);
            cs.setDescription(description);
            cs.setStatus(status);
            cs.setVision(vision);
            em.persist(cs);
        
        }catch(Exception ex){
        
        }
    }

    @Override
    public Cardslotbean viewSingleCardSlot(String id) {
        try{
            Cardslotbean sd;
         return  sd =  em.find(Cardslotbean.class, id);
        
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllCardSolt() {
        List li = em.createNamedQuery("Cardslotbean.findAll").getResultList();
        return li;
    }

    @Override
    public void removeCardSlot(String id) {
        try{
        Cardslotbean ss = em.find(Cardslotbean.class, id);
        em.remove(ss);
        
        }catch(Exception ex){}
    }

    @Override
    public String addHerms(String id, String hermsname, String productcode, String price, String desceiption, String status, String email, String fax, String officeaddress, String skype) {
       Hermsbean hb = new Hermsbean();
        try{
            hb.setId(this.randomString(5));
            hb.setHermsname(hermsname);
            hb.setProductcode(productcode);
            hb.setPrice(price);
            hb.setDesceiption(desceiption);
            hb.setStatus(status);
            hb.setEmail(email);
            hb.setFax(fax);
            hb.setOfficeaddress(officeaddress);
            hb.setSkype(skype);
            em.persist(hb);
        
       }catch(Exception ex){}
        return CONST.ADD_RECORD;
    }
    @Override
    public String modifyHerms(String id, String hermsname, String productcode, String price, String desceiption, String status, String email, String fax, String officeaddress, String skype) {
       //Hermsbean hb = null;
        try{
           Hermsbean hb = em.find(Hermsbean.class, id);
            hb.setHermsname(hermsname);
            hb.setProductcode(productcode);
            hb.setPrice(price);
            hb.setDesceiption(desceiption);
            hb.setStatus(status);
            hb.setEmail(email);
            hb.setFax(fax);
            hb.setOfficeaddress(officeaddress);
            hb.setSkype(skype);
            em.persist(hb);
        
       }catch(Exception ex){}
        return CONST.ADD_RECORD;
    }

    @Override
    public Hermsbean viewSingleHerms(String id) {
        Hermsbean hb = new Hermsbean();
        try{
           hb = em.find(Hermsbean.class, id);
        
        }catch(Exception ex){}
        
        return null;
    }

    @Override
    public List viewAllHerms() {
       List li = em.createNamedQuery("Hermsbean.findAll").getResultList();
        return li;
    }

    @Override
    public void removeHerms(String id) {
       // = new Hermsbean();
        try{
           Hermsbean sd =  em.find(Hermsbean.class, id);
           em.remove(sd);
        
        }catch(Exception ex){
        
        }
    }
    
    //// ################################### INTERIOR COLOR SECTION ##############################
    //addInteriorColor

    @Override
    public String addInteriorColor(String id, String interiorcolorname, String productcode, String price, String description) {
        Interiorcolorbean ic = new Interiorcolorbean();
        String msg = CONST.ADD_RECORD;
        try{
            ic.setId(this.randomString(5));
            ic.setInteriorcolorname(interiorcolorname);
            ic.setProductcode(productcode);
            ic.setPrice(price);
            ic.setDescription(description);
            em.persist(ic);
        
        }catch(Exception ex){
        
        }
        
        return msg;
    }
     @Override
    public String modifyInteriorColor(String id, String interiorcolorname, String productcode, String price, String description) {
         
        String msg = CONST.ADD_RECORD;
        try{
            Interiorcolorbean ic = em.find(Interiorcolorbean.class, id);
            ic.setInteriorcolorname(interiorcolorname);
            ic.setProductcode(productcode);
            ic.setPrice(price);
            ic.setDescription(description);
            em.persist(ic);
        
        }catch(Exception ex){
       }
        
        return msg;
    }

    @Override
    public Interiorcolorbean viewSingleInteriorColor(String id){ 
     
    try{
        Interiorcolorbean ib = new Interiorcolorbean();
       return ib = em.find(Interiorcolorbean.class, id);
    
    }catch(Exception ex){}
      return null;
    }

    @Override
    public List viewAllInterioColor() {
         List li = em.createNamedQuery("Interiorcolorbean.findAll").getResultList();
        return li;
    }
    
    @Override
    public List viewAllInterioColorByProductCode(String productcode) {
         List li = em.createNamedQuery("Interiorcolorbean.findByProductcode").setParameter("productcode", productcode).getResultList();
        return li;
    }

    @Override
    public void removeInterior(String id) {
        
        try{
        Interiorcolorbean ib = em.find(Interiorcolorbean.class, id);
        em.remove(ib);
        }catch(Exception ex){
        
        }
    }
  ////// #######################  LAMINATION  SECTION #######################

    @Override
    public String addLamination(String id, String laminate, String productcode, String price, String description) {
        Laminationbean lb = new Laminationbean();
        String msg = CONST.ADD_RECORD;
        try{
            lb.setId(this.randomString(5));
            lb.setLaminate(laminate);
            lb.setProductcode(productcode);
            lb.setPrice(price);
            lb.setDescription(description);
            em.persist(lb);
        
        }catch(Exception ex){}
        
        return msg;
    }
    
    
        @Override
    public String modifyLamination(String id, String laminate, String productcode, String price, String description) {
        // new Laminationbean();
        String msg = CONST.MODIFY_RECORD;
        try{
            Laminationbean lb = em.find(Laminationbean.class, id);
            lb.setId(id);
            lb.setLaminate(laminate);
            lb.setProductcode(productcode);
            lb.setPrice(price);
            lb.setDescription(description);
            em.persist(lb);
        
        }catch(Exception ex){}
        
        return msg;
    }

    @Override
    public Laminationbean viewSingleLamination(String id) {
       
        try{
            Laminationbean lb = new Laminationbean();
           return lb = em.find(Laminationbean.class, id);
        
        }catch(Exception ex){
        
        }
        return null;
    }

    @Override
    public List viewAllLamination() {
        List li = em.createNamedQuery("Laminationbean.findAll").getResultList();
        return li;
    }

    @Override
    public List viewAllLaminationProductCode(String productcode) {
        List li;
        li = em.createNamedQuery("Laminationbean.findByProductcode").setParameter("productcode", productcode).getResultList();
        return li;
    }

    @Override
    public void removeLamination(String id) {
        
        try{
        Laminationbean lb = em.find(Laminationbean.class, id);
        em.remove(lb);
        }catch(Exception ex){}
    }

    @Override
    public String addPrintedSide(String printedsidename, String productid, String price, String description) {
        Printedsidebean ps = new Printedsidebean();
        String msg = CONST.ADD_RECORD;
        try{
            ps.setId(this.randomString(5));
            ps.setPrintedsidename(printedsidename);
            ps.setProductid(productid);
            ps.setPrice(price);
            ps.setDescription(description);
            ps.setStatus("ACTIVE");
            em.persist(ps);
                    
        }catch(Exception ex){}
        return msg;
    }
    
    
       @Override
    public String modifyPrintedSide(String id, String printedsidename, String productid, String price, String description) {
      //  new Printedsidebean();
        String msg = CONST.ADD_RECORD;
        try{
            Printedsidebean ps = em.find(Printedsidebean.class, id);
            ps.setPrintedsidename(printedsidename);
            ps.setProductid(productid);
            ps.setPrice(price);
            ps.setDescription(description);
            ps.setStatus("ACTIVE");
            em.persist(ps);
                    
        }catch(Exception ex){}
        return msg;
    }

    @Override
    public Printedsidebean viewSinglePrintedSide(String id) {
        try{
            Printedsidebean pb = new Printedsidebean();
          return pb = em.find(Printedsidebean.class, id);
             
        }catch(Exception ex){
        }
        return null;
    }

    @Override
    public List viewAllPrintedSideByProductCode(String productcode) {
        List li;
        li = em.createNamedQuery("Printedsidebean.findByProductid").setParameter("productid", productcode).getResultList();
        return li;
    }

    @Override
    public List viewAllPrintedSide() {
       List li;
        li = em.createNamedQuery("Printedsidebean.findAll").getResultList();
        return li;
    }

    @Override
    public void removePrintedSide(String id) {
        
        try{
            Printedsidebean ps = em.find(Printedsidebean.class, id);
            em.remove(ps);
        
        }catch(Exception ex){
        }
                
    }
    //#############################################################33
    //#################BIND PLACEMENT ################################3

    @Override
    public String addBindingPlacement(String bpId, String bpName, String description, String price, String productid) {
       Bindpalcementbean bp = new Bindpalcementbean();
       String msg = CONST.ADD_RECORD;
        try{
        
            bp.setBpId(this.randomString(5));
            bp.setBpName(bpName);
            bp.setDescription(description);
            bp.setStatus("ACTIVE");
            bp.setDel("0");
            bp.setProductid(productid);
            em.persist(bp);
        }catch(Exception ex){
        }
        return msg;
    }
    
    @Override
    public String modifyBindingPlacement(String bpId, String bpName, String description, String price, String productid) {
        
       String msg = CONST.MODIFY_RECORD;
        try{
            Bindpalcementbean bp = em.find(Bindpalcementbean.class, bpId);
            bp.setBpName(bpName);
            bp.setDescription(description);
            bp.setStatus("ACTIVE");
            bp.setDel("0");
            bp.setProductid(productid);
            em.persist(bp);
        }catch(Exception ex){
        }
        return msg;
    } 

    @Override
    public Bindpalcementbean viewSingleBindingPlacement(String productcode) {
       
        try{
        Bindpalcementbean bp;
           return bp = em.find(Bindpalcementbean.class, productcode);
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllBlindingPlacement() {
          List li;
        li = em.createNamedQuery("Bindpalcementbean.findAll").getResultList();
        return li;
    }

    @Override
    public void removeBlindPlacement(String id) {
        
        try{
        
            Bindpalcementbean bp = em.find(Bindpalcementbean.class, id);
            em.remove(bp);
            
        }catch(Exception ex){
        }
    }

    @Override
    public String addQuantity(String qytId, String qty, String description, String productcode) {
       Quantitybean qb = new Quantitybean();
        
        try{
            qb.setQytId(this.randomString(5));
            qb.setQty(qty);
            qb.setDescription(description);
            qb.setStatus("ACTIVE");
            qb.setDel("0");
            qb.setProductcode(productcode);
            em.persist(qb);
        
        }catch(Exception ex){
        }
        return CONST.ADD_RECORD;
    }
    
      @Override
    public String modifyQuantity(String qytId, String qty, String description, String productcode) {
       
        
        try{
            Quantitybean qb = em.find(Quantitybean.class, qytId);
            qb.setQty(qty);
            qb.setDescription(description);
            qb.setStatus("ACIVE");
            qb.setDel("0");
            qb.setProductcode(productcode);
            em.persist(qb);
        
        }catch(Exception ex){
        }
        return CONST.ADD_RECORD;
    }

    @Override
    public Quantitybean veiwSingleQuantity(String id) {
        
        try{
            em.find(Quantitybean.class, id);
        
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllQuatityBydescription(String productcode) {
      List li= em.createNamedQuery("Quantitybean.findByProductcode").setParameter("productcode", productcode).getResultList();
      return li;
     
    }
     @Override
    public List viewAllQuatity() {
        List li = em.createNamedQuery("Quantitybean.findAll").getResultList();
      return li;
    }
    
    
    
    
  
    
    
    //###############################################################################33
    //##################### COMPUTE PRICE
//Grommetbean.findByGromPSS
          @Override
    public Grommetbean findByGPDS(String p, String pages, String q, String defprice, String qtydprice, String productcode, String binding){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByGPDS").setParameter("grommetname", pages).setParameter("productcode", productcode).setParameter("desceiption", binding).setParameter("status", q).getSingleResult().toString();
     
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
        @Override
    public Grommetbean findByGromPSS(String pages, String produtcode, String Quantity, String size){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByGromPSS").setParameter("grommetname", pages).setParameter("productcode", produtcode).setParameter("status", Quantity).setParameter("size1", size).getSingleResult().toString();
   //  g.grommetname = ?1 and g.productcode = ?2 and g.status = ?3 and g.size = ?4
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    @Override
    public int viewSingleSize2(String p, String pages, String q, String defprice, String qtydprice, String productcode, String binding) {
       String afor = "A4";
        String afiv = "A5";
        String Wire = "Wire-o";
        String Stapling = "Stapling";
        int sum = 0;
        int total = 0;
        try{
         
           
          
            if(afor.equalsIgnoreCase(p)){
                
            Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByGPDS").setParameter("grommetname", pages).setParameter("productcode", productcode).setParameter("desceiption", binding).setParameter("status", q).getSingleResult();
     
               sum =  Integer.parseInt(gl.getPrice());
            }
            else{
           Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByGPDS").setParameter("grommetname", pages).setParameter("productcode", productcode).setParameter("desceiption", binding).setParameter("status", q).getSingleResult();
     
               sum =  Integer.parseInt(gl.getPrice2());

            }
           
        }catch(Exception ex){
        }
        return sum;
    }

    @Override
    public int claculateCalender(String pages, String productcode, String Quantity, String size1) {
        //grommetname AND g.productcode = :productcode AND g.status = :status AND g.size1 = :size1
        //grommetname AND g.productcode = :productcode AND g.status = :status AND g.size1 = :size1
        int sum = 0;
          String atwo = "A2";
        String atree = "A3";
        
        try{ 
         // = this.findByGromPSS(pages, productcode, Quantity, size1);
            if(atwo.equalsIgnoreCase(size1)){
         Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByGromPSS").setParameter("grommetname", pages).setParameter("productcode", productcode).setParameter("status", Quantity).setParameter("size1", size1).getSingleResult();
   //  
         sum =  Integer.parseInt(gl.getPrice());
         
            }else{
            Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByGromPSSo").setParameter("grommetname", pages).setParameter("productcode", productcode).setParameter("status", Quantity).setParameter("sizes", size1).getSingleResult();
   //  
         sum =  Integer.parseInt(gl.getPrice2());
            
            }
         
         
        }catch(Exception ex){
        }
        return sum;
    }
    
    
    //viewSingleSize4(String q, String qty, String qtydprice, String defprice)

    @Override
    public int viewSingleSize4(String q, String qty, String qtydprice, String defprice) {
        
        try{
        
        }catch(Exception ex){
        
        }
        return 0;
    }
    @Override
    public Grommetbean findByQSP(String qty, String size, String productcode){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByQSP").setParameter("status", qty).setParameter("size1", size).setParameter("productcode", productcode).getSingleResult().toString();
   //  g.status = ?1 and g.size = ?2 and g.productcode = ?3
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
        @Override
    public Grommetbean findByQS2P(String qty, String size, String productcode){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByQS2P").setParameter("status", qty).setParameter("sizes", size).setParameter("productcode", productcode).getSingleResult().toString();
   //  g.status = ?1 and g.size = ?2 and g.productcode = ?3
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    @Override
    public int computeIDCard(String qty, String size, String productcode) {
        int sum = 0;
        int total = 0;
       // int quantity = new Integer(q).intValue();
        String landscape = "landscape";
        String portrait = "portrait";
        try{
        if(landscape.equalsIgnoreCase(size)){
           Grommetbean gl = (Grommetbean)em.createNamedQuery("Grommetbean.findByQSP").setParameter("status", qty).setParameter("size1", size).setParameter("productcode", productcode).getSingleResult();
   //
           //Grommetbean gl = this.findByQSP(qty, size, productcode);
   
             sum = Integer.parseInt(gl.getPrice());
            }else{
            //  sd = em.createNamedQuery("Grommetbean.findByQS2P").setParameter("status", qty).setParameter("sizes", size).setParameter("productcode", productcode).getSingleResult().toString();
   
             //Grommetbean gl = this.findByQS2P(qty, size, productcode);
            Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByQS2P").setParameter("status", qty).setParameter("sizes", size).setParameter("productcode", productcode).getSingleResult();
   
             
             sum = Integer.parseInt(gl.getPrice2());
            }

        }catch(Exception ec){}
        return sum;
    }
    
    //int computeLuagageTag(String qty, String size, String productcode)
 @Override
    public Grommetbean findByPQS(String productcode, String size, String qty){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByPQS").setParameter("productcode", productcode).setParameter("status", qty).setParameter("size1", size).getSingleResult().toString();
   //  g.status = ?1 and g.size = ?2 and g.productcode = ?3
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    @Override
    public int computeLuagageTag(String qty, String size, String productcode) {
           //computeLuagageTag(hsc.getCode(), Quantity, sizes )
        int sum = 0;
        int total = 0;
        try{
            //SELECT g FROM Grommetbean g WHERE g.status = :status AND g.size1 = :size1  AND g.productcode = :productcode
              Grommetbean gl = (Grommetbean)em.createNamedQuery("Grommetbean.findByQSP").setParameter("status", qty).setParameter("size1", size).setParameter("productcode", productcode).getSingleResult();
   ////computeLuagageTag(Quantity, sizes, session.getAttribute("ag").toString());//.computeLuagageTag(Quantity, sizes, hsc.getCode());
             // Grommetbean gl = this.findByQSP(qty, size, productcode);
   
             sum = Integer.parseInt(gl.getPrice());
        
        }catch(Exception ex){}
        return sum;
    }
    
    
    
    //int computeBusinessCard(String productcode, String printedside, String papertype, String Quantity)
   @Override
    public Grommetbean findByPSDS(String productcode, String printedside, String papertype, String Quantity){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
     sd = em.createNamedQuery("Grommetbean.findByPSDS").setParameter("productcode", productcode).setParameter("size1", printedside).setParameter("desceiption", papertype).setParameter("status", Quantity).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){
        }
         return new Grommetbean(sd);
                 //new Grommetbean(sd);  
    }  
    
    @Override
    public Grommetbean findByProSDS(String productcode, String printedside, String papertype, String Quantity){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByProSDS").setParameter("productcode", productcode).setParameter("sizes", printedside).setParameter("desceiption", papertype).setParameter("status", Quantity).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    @Override
    public int computeBusinessCard(String productcode, String printedside, String papertype, String Quantity) {
        
        int sum = 0;
        int total = 0;
        String SIDE1 = "1-SIDE";
        String SIDE2 = "2-SIDE";
        try{
        //productcode = ?1 and g.size = ?2 and g.desceiption = ?3 and g.status = ?4
             if(SIDE1.equalsIgnoreCase(printedside)){
           //Grommetbean gl = this.findByPSDS(productcode,printedside,papertype,Quantity);
            Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByPSDS").setParameter("productcode", productcode).setParameter("size1", printedside).setParameter("desceiption", papertype).setParameter("status", Quantity).getSingleResult();
   
          
            sum = Integer.parseInt(gl.getPrice());
            }else{
         //  Grommetbean gl = this.findByProSDS(productcode, printedside, papertype, Quantity);
           Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByProSDS").setParameter("productcode", productcode).setParameter("sizes", printedside).setParameter("desceiption", papertype).setParameter("status", Quantity).getSingleResult();
   //  

             sum = Integer.parseInt(gl.getPrice2());
            }
                   
        }catch(Exception ex){}
        return sum;
    }

    @Override
    public int computeStickerLabels(String productcode, String printedside, String papertype, String Quantity) {
         
        int sum = 0;
        int total = 0;
        String SIDE1 = "1-SIDE";
        String SIDE2 = "2-SIDE";
        try{
            
           // Grommetbean gl = this.findByPSDS(productcode,printedside,papertype,Quantity);
               Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByPSDS").setParameter("productcode", productcode).setParameter("size1", printedside).setParameter("desceiption", papertype).setParameter("status", Quantity).getSingleResult();
   
            sum = Integer.parseInt(gl.getPrice());
      
        }catch(Exception ex){
       }
        return sum;
    }

     @Override
    public Grommetbean findBySizeProductcode(String size, String productcode){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findBySizeProductcode").setParameter("size1", size).setParameter("productcode", productcode).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    
    
    //
    @Override
    public int computRollUpBanner(String size, String productcode) {
        
        int sum = 0;
        int total = 0;
        try{
             //  Grommetbean gl = this.findBySizeProductcode(size, productcode);
           Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySizeProductcode").setParameter("size1", size).setParameter("productcode", productcode).getSingleResult();
   //  
             sum = Integer.parseInt(gl.getPrice());

            
        }catch(Exception ex){}
        return sum;
    }
    
    
    //int computeLetterHead(String size, String papertype, String Quantity, String productcode)
 @Override
    public Grommetbean findBySProSP(String size, String papertype, String Quantity, String productcode){
        String sd;
        sd = "";
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findBySProSP").setParameter("size1", size).setParameter("desceiption", papertype).setParameter("status", Quantity).setParameter("productcode", productcode).getSingleResult().toString();
   //    g WHERE g.size1 = :size1 AND g.desceiption = :desceiption AND g.status AND g.productcode = :productcode"
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    
    @Override
    public int computeLetterHead(String size, String papertype, String Quantity, String productcode) {
        
        int sum = 0;
        int total = 0;
        try{
             // gl = this.findBySizeProductcode(size, productcode);
       //  Grommetbean gl = this.findBySProSP(size, papertype, Quantity, productcode);
         Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySProSP").setParameter("size1", size).setParameter("desceiption", papertype).setParameter("status", Quantity).setParameter("productcode", productcode).getSingleResult();
   // 
             sum = Integer.parseInt(gl.getPrice());
        }catch(Exception ex){
        
        }
        return sum;
    }

    @Override
    public int computeExerciesBook(String Grommetname, String Productcode, String Status, String size) {
      
        int sum = 0;
        int total = 0;
        try{
        
         // Grommetbean gl = this.findByGromPSS(Grommetname, Productcode, Status, size);
         Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByGromPSS").setParameter("grommetname", Grommetname).setParameter("productcode", Productcode).setParameter("status", Status).setParameter("size1", size).getSingleResult();
   // 
           sum = Integer.parseInt(gl.getPrice());

        }catch(Exception e){}
        return sum;
    }
    
    
    
    //int computCanvas(String size, String productcode)

    @Override
    public int computCanvas(String size1, String productcode) {
        
        int sum = 0;
        int total = 0;
        try{
        //  Grommetbean gl = this.findBySizeProductcode(size1, productcode);
           Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySizeProductcode").setParameter("size1", size1).setParameter("productcode", productcode).getSingleResult();
   // 
             sum = Integer.parseInt(gl.getPrice());
        }catch(Exception ex){
        }
        return sum;
    }
     @Override
    public Grommetbean findByPPQPS(String productcode, String pages, String qty, String papertype, String size1){
        String sd = "";
        try{  
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByPPQPS").setParameter("productcode", productcode).setParameter("grommetname", pages).setParameter("status", qty).setParameter("desceiption", papertype).setParameter("size1", size1).getSingleResult().toString();
   //  /.g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    //int computFlayers(String size, String qty, String papertype, String pages, String productcode)

    @Override
    public int computFlayers(String productcode, String pages, String qty, String papertype, String size1) {
        //s(code, pages,Quantity, papertype, size);
           
        int sum = 0;
        int total = 0;
        try{
            
         // Grommetbean gl = this.findBySQPPP(size, qty, papertype, pages, productcode);
            // productcode pages qty  papertype size1
          Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByPPQPS").setParameter("productcode", productcode).setParameter("grommetname", pages).setParameter("status", qty).setParameter("desceiption", papertype).setParameter("size1", size1).getSingleResult();
   //  /./g.productcode = :productcode AND g.grommetname = :grommetname AND g.status = :status AND g.desceiption = :desceiption  AND g.size1 = :size1"),
             sum = Integer.parseInt(gl.getPrice());
           
        }catch(Exception ex){
        
        }
        
        return sum;
    }
    
     @Override
    public Grommetbean findBySSPD(String size, String qty, String productcode, String printedsize){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findBySSPD").setParameter("size1", size).setParameter("status", qty).setParameter("productcode", productcode).setParameter("desceiption", printedsize).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
      @Override
    public Grommetbean findBySSPDd(String sizes, String qty, String productcode, String printedsize){
        String sd = null;
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findBySSPDd").setParameter("sizes", sizes).setParameter("status", qty).setParameter("productcode", productcode).setParameter("desceiption", printedsize).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
  //int computeEnvelops(String size, String qty, String color, String productcode, String printedsize)  

    @Override
    public int computeEnvelops(String size, String qty, String productcode, String printedside) {
         
        int sum = 0;
        int total = 0;
        try{
       
                  Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySSPD").setParameter("size1", size).setParameter("status", qty).setParameter("productcode", productcode).setParameter("desceiption", printedside).getSingleResult();
   // 
//= "SELECT g FROM Grommetbean g WHERE g.size1 = :size1 AND g.status = :status AND g.productcode = :productcode AND g.desceiption = :desceiption"),
               sum =  Integer.parseInt(gl.getPrice());

        
        }catch(Exception ex){}
        return sum;
    }

    @Override
    public int computeGoodyBag(String size, String qty, String productcode, String lamination) {
         
        int sum = 0;
        int total = 0;
           String A4 = "A4";
        String A3 ="A3";
        try{
            
           if(A4.equalsIgnoreCase(size)){

                // Grommetbean gl = this.findBySSPD(size1, qty, productcode, lamination);
                   Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySSPD").setParameter("size1", size).setParameter("status", qty).setParameter("productcode", productcode).setParameter("desceiption", lamination).getSingleResult();
   // 

               sum =  Integer.parseInt(gl.getPrice());
          }else{
                  
                //  Grommetbean gl = this.findBySSPDd(size1, qty, productcode, lamination);
               Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySSPDd").setParameter("sizes", size).setParameter("status", qty).setParameter("productcode", productcode).setParameter("desceiption", lamination).getSingleResult();
   // 
                  

               sum =  Integer.parseInt(gl.getPrice2());  
                      
                  }
        
        }catch(Exception ex){}
        return sum;
    }
    
   //int computeCDLayers(String qty, String price, String productcode) 
 @Override
    public Grommetbean findByproductcodeAndStatus(String productcode, String qty){
        String sd = "";
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findByproductcodeAndStatus").setParameter("productcode", productcode).setParameter("status", qty).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    @Override
    public int computeCDLayers(String productcode, String qty) {
          
        int sum = 0;
        int total = 0;
           String A4 = "A4";
        String A3 ="A3";
        try{
            
            
           if(qty != null && productcode !=null){

              // Grommetbean gl = this.findByproductcodeAndStatus(productcode, qty);
               //computeCDLayers(Quantity, session.getAttribute("ag").toString());
               //.computeCDLayers(session.getAttribute("ag").toString(), Quantity);
                // int computeCDLayers(String productcode, String qty);
  
              Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findByproductcodeAndStatus").setParameter("productcode", productcode).setParameter("status", qty).getSingleResult();
            //  

               sum =  Integer.parseInt(gl.getPrice());
          }
        }catch(Exception ex){}
        return sum;
      }

    @Override
    public String addBilling(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String productid, String dateoftransaction, String invoice, String propertiess) {
  Billingbean bl = new Billingbean();
          
          String billcode = this.randomString(8).toUpperCase();
        try{
            
            bl.setUsername(billcode);
            bl.setAddress1(address1);//addOrder
            bl.setAddress2(address2);
            bl.setCity(city);
            bl.setCompany(company);
            bl.setCountry(country);
            bl.setEmail(email);
            bl.setFax(fax);
            bl.setFirstname(firstname);
            bl.setLastname(lastname);
            bl.setPostcode(postcode);
            bl.setProductid(productid);
            bl.setDateoftransaction(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            bl.setRegion(region);
            bl.setTelephone(telephone);
            bl.setInvoice(this.randomString(8).toUpperCase());
            em.persist(bl);
   
   }catch(Exception ex){}
        return billcode;
    }
    
     public void modifyBilling(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String productid, Timestamp dateoftransaction, String invoice, String propertiess) {
  
        try{
           Billingbean bl= em.find(Billingbean.class, username);
            bl.setAddress1(address1);
            bl.setAddress2(address2);
            bl.setCity(city);
            bl.setCompany(company);
            bl.setCountry(country);
            bl.setEmail(email);
            bl.setFax(fax);
            bl.setFirstname(firstname);
            bl.setLastname(lastname);
            bl.setPostcode(postcode);
            bl.setProductid(productid);
            bl.setRegion(region);
            bl.setTelephone(telephone);
            bl.setInvoice(this.randomString(5));
            em.persist(bl);
   
   }catch(Exception ex){}
   }

    @Override
    public Billingbean viewSingleBilling(String username) {
        
        try{
            Billingbean bl = new Billingbean();
         return bl = em.find(Billingbean.class, username);
        
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllBillings() {
        List li = em.createNamedQuery("Billingbean.findAll").getResultList();
        return li;
    }

    @Override
    public void removeBilling(String id) {
         
        try{
          Billingbean bl = em.find(Billingbean.class, id);
            em.remove(bl);
        
        }catch(Exception ex){}
    }

    @Override
    public String addDeliveryAddress(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String deliverymethod, String paymentmethod, String deliverycomment, String paymentcomment, String shippment) {
    String delicode = this.randomString(5);
        try{
             Deliverydetailsbean dl = new Deliverydetailsbean();
             dl.setUsername(delicode);
             dl.setAddress1(address1);
             dl.setAddress2(address2);
             dl.setCity(city);
             dl.setCompany(company);
             dl.setCountry(country);
             dl.setEmail(email);
             dl.setFax(fax);
             dl.setFirstname(firstname);
             dl.setLastname(lastname);
             dl.setPostcode(postcode);
             dl.setRegion(region);
             dl.setDeliverycomment(deliverycomment);
             dl.setDeliverymethod(deliverymethod);
             dl.setPaymentcomment(paymentcomment);
             dl.setPaymentmethod(paymentmethod);
             dl.setShippment(this.randomString(5));
             em.persist(dl);
    }catch(Exception ex){}
        return delicode;
    }
    
     @Override
    public void modifyDeliveryAddress(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String deliverymethod, String paymentmethod, String deliverycomment, String paymentcomment, String shippment) {
    
        try{
            
             Deliverydetailsbean dl = em.find(Deliverydetailsbean.class, username);
             dl.setAddress1(address1);
             dl.setAddress2(address2);
             dl.setCity(city);
             dl.setCompany(company);
             dl.setCountry(country);
             dl.setEmail(email);
             dl.setFax(fax);
             dl.setFirstname(firstname);
             dl.setLastname(lastname);
             dl.setPostcode(postcode);
             dl.setRegion(region);
             dl.setDeliverycomment(deliverycomment);
             dl.setDeliverymethod(deliverymethod);
             dl.setPaymentcomment(paymentcomment);
             dl.setPaymentmethod(paymentmethod);
             dl.setShippment(this.randomString(5));
             em.persist(dl);
    }catch(Exception ex){}
    }

    @Override
    public Deliverydetailsbean viewSingleDelivery(String username) {
        try{
            Deliverydetailsbean db = new Deliverydetailsbean();
           return db = em.find(Deliverydetailsbean.class, username);
        
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllDeliveryAddress() {
         List li = null;
        try{
      li  = em.createNamedQuery("Deliverydetailsbean.findAll").getResultList();
        }catch(Exception ex){
        
        }
        return li;
    }

    @Override
    public void addBlog(String code, String blogtitle, String comment, String dateofpost, String category, String procductcode, String status, String others, byte[] pic) {
        Blogbean bl = new Blogbean(); 
        try{
              bl.setCode(this.randomString(8));
            bl.setBlogtitle(blogtitle);
            bl.setCategory(category);
            bl.setComment(comment);
            bl.setOthers(others);
            bl.setProcductcode(procductcode);
            bl.setStatus(status); 
            bl.setOthers(others);
            bl.setDateofpost(new SimpleDateFormat("yyyy-MM-dd").format(new Date())); 
            bl.setPix(pic);
            em.persist(bl);
            }catch(Exception ex){}
    }
     @Override
    public void modifyBlog(String code, String blogtitle, String comment, String dateofpost, String category, String procductcode, String status, String others, byte[] pic) {
         
        try{
           Blogbean bl = em.find(Blogbean.class, code);
             bl.setCode(this.randomString(5));
            bl.setBlogtitle(blogtitle);
            bl.setCategory(category);
            bl.setComment(comment);
            bl.setOthers(others);
            bl.setProcductcode(procductcode);
            bl.setStatus(status); 
            bl.setOthers(others);
            bl.setPix(pic);
            em.persist(bl);
                  
        }catch(Exception ex){}
    }

    @Override
    public Blogbean viewSingleBlog(String code) {
        Blogbean bl = new Blogbean(); 
        try{
            
       return bl = em.find(Blogbean.class, code);
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllBlog() {
         List li = null;
        try{
      li  = em.createNamedQuery("Blogbean.findAll").getResultList();
        }catch(Exception ex){
        
        }
        return li;
    }

    @Override
    public String addOrder(String ordernumber, String productcode, String properties, String dateoforder, String amount, String shippingmethod, String bill, String delivery, byte[] pix, String status, String description, String customerid) {
    Order1bean ol = new Order1bean();
    String billcode = this.randomString(8).toUpperCase();
        try{
            ol.setOrdernumber(billcode);
            ol.setAmount(amount);
            ol.setBill(bill);
           ol.setDateoforder(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            ol.setDelivery(delivery);
            ol.setDescription(description);
            ol.setPix(pix);
            ol.setProductcode(productcode);
            ol.setProperties(properties);
            ol.setShippingmethod(shippingmethod);
            ol.setStatus(status);
            em.persist(ol);
            
    }catch(Exception ex){}
    return billcode;
    }

    @Override
    public Order1bean viewSingleOrder(String ordernumber) {
       
        try{
            Order1bean ob = new Order1bean();
           return ob = em.find(Order1bean.class, ordernumber);
                
        }catch(Exception ex){}
        return null;
    }

    @Override
    public List viewAllOrders() {
         List li = null;
        try{
      li  = em.createNamedQuery("Order1bean.findAll").getResultList();
        }catch(Exception ex){
        
        }
        return li;
    }

    @Override
    public String AddUser(String username, String password, String role, String status) {
        Userbean ub = new Userbean();
        CryptoLibrary cl = new CryptoLibrary();
        try{
        ub.setUsername(username);
        ub.setPassword(cl.encrypt(password));
        ub.setRole(role);
        ub.setStatus(status);
        em.persist(ub);
        }catch(Exception ex){
        
        }
        return CONST.ADD_RECORD;
    }
    
     public String UserChangePassword(String username, String password, String newpassword, String status) {
    
       
        try{
          Userbean ub = em.find(Userbean.class, username);
          if(password.equalsIgnoreCase(ub.getPassword())){
              ub.setPassword(newpassword);
          }
       
        em.persist(ub);
        }catch(Exception ex){
        
        }
        return CONST.ADD_RECORD;
    }
    
    
     @Override
    public int viewSingleSizeEvent(String q, String defprice, String qtydprice) {
    
       int sum = 0;
        try{
          Sizetablebean st = em.find(Sizetablebean.class, q);
           
            if( q !=null){

               sum =  Integer.parseInt(st.getPrice());
             }
                
        }catch(Exception ex){}
        return sum;
    }
    
    @Override
    public Grommetbean findBySQP(String size1, String qty, String productcode){
        String sd = "";
        try{
            Grommetbean l = new Grommetbean();
          // l = new String();
        sd = em.createNamedQuery("Grommetbean.findBySQP").setParameter("size1", size1).setParameter("status", qty).setParameter("productcode", productcode).getSingleResult().toString();
   //   g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status
        }catch(Exception ex){}
        
    return new Grommetbean(sd);
    }
    
    @Override
     public int viewSingleSizePhotoBook(String q, String qty, String productcode) {
        
        int sum = 0;
        int total = 0;
       // int quantity = new Integer(q).intValue();
        try{
          
            if( q != null && qty !=null){

             // Grommetbean gl = this.findBySQP(q, qty, productcode);
             Grommetbean gl = (Grommetbean) em.createNamedQuery("Grommetbean.findBySQP").setParameter("size1", q).setParameter("status", qty).setParameter("productcode", productcode).getSingleResult();
   //
              
             sum = Integer.parseInt(gl.getPrice());
        }
        }catch(Exception ex){
        throw new EJBException(ex.getMessage());
        }
        return sum;
    }
     
     @Override
      public String compareString(String a, String b) {
//Grommetbean gb = null;
String sure = "";

        try{
            if(a.equalsIgnoreCase(Utill.CONFIG.getGift_Certificate())){
            
                sure = Utill.CONFIG.getGift_Certificate();

            }
            if(a.equalsIgnoreCase(Utill.CONFIG.getDoor_Hanger())){
                
            sure = Utill.CONFIG.getDoor_Hanger();
            }


        }catch(Exception ex){
        throw new EJBException(ex.getMessage());
        }
        return sure;
    }

    @Override
    public List searchBySubCategory(String subcate) {
        //List li =null;
        
           System.out.println("subcate===this is sessionBean"+subcate);
         return em.createQuery("SELECT s FROM Subcategorybean s WHERE s.subcategory LIKE ?1").setParameter(1, "%" + subcate+ "%").getResultList();
       
    }

    @Override
    public void addProductImage(String code, byte [] pic, String productcode, String startprice) {
        
        try{
            Productimagesbean p = new Productimagesbean();
            //this.randomString(8)
            p.setCode(this.randomString(8).toUpperCase());
            p.setPix(pic);
            p.setProductcode(productcode); 
            p.setStartprice(startprice);
            em.persist(p);
            
        
        }catch(Exception ex){
        throw new EJBException();
        }
    }

    @Override
    public List viewAlProductsImageslByProductCode(String productcode) {
        List li = em.createNamedQuery("Productimagesbean.findByProductCode").setParameter("productcode", productcode).getResultList();
        return li;
    }

    @Override
    public Productimagesbean viewSingleProductsImages(String p) {
        try{
              Productimagesbean sb = em.find(Productimagesbean.class, p);
         // System.out.println("this is where the pix" + sb.getCode());
           return sb;
       
        }catch(Exception ex){
     //  throw new EJBException();
        }
        return null;
    }
      
       @Override
    public Productimagesbean viewSingleProductsImagesByProductcode(String p) {
        try{
            //  Productimagesbean sb = em.find(Productimagesbean.class, p);
         // System.out.println("this is where the pix" + sb.getCode());
               Productimagesbean gl = (Productimagesbean) em.createNamedQuery("Productimagesbean.findByProductCode").setParameter("productcode", p).getSingleResult();
   //  
      
               return gl;
       
        }catch(Exception ex){
     //  throw new EJBException();
        }
        return null;
    }
    
    @Override
      public void removeGrommet(String p){
    try{
           // = new Grommetbean();

       Grommetbean gb = em.find(Grommetbean.class, p);
        em.remove(gb);
                //.getGrommetLocalHome().findByPrimaryKey(p).remove();
    }catch(Exception ex){
    throw new EJBException(ex.getMessage());
    }
    }

    @Override
    public List viewAllGrommet() {
        
        List li = em.createNamedQuery("Grommetbean.findAll").getResultList();
        return li;
    }

    @Override
    public Grommetbean viewSingleGrommet(String p) {
        Grommetbean gb = null;
        try{
             gb = em.find(Grommetbean.class, p);
            
      //  return gb;
        }catch(Exception ex){
       throw new EJBException(ex.getMessage());
        }
        return gb;
    }

    @Override
    public List viewAllInteriorColor() {
        List li = em.createNamedQuery("Interiorcolorbean.findAll").getResultList();
        return li;
    }
      
      
    @Override
   public void removeInteriorColor(String p){
//InteriorcolorLocal lcl = null;
        try{
Interiorcolorbean ib = em.find(Interiorcolorbean.class, p);
em.remove(ib);
            //lsl.getInteriorcolorLocalHome().findByPrimaryKey(p).remove();
        }catch(Exception ec){
        throw new EJBException(ec.getMessage());
        }
    }
   
    @Override
   public void removeQuanity(String p) {
       // SizetableLocal stl = null;
       // MenutabLocal ml = null;
        try{
              
                 Quantitybean gt = em.find(Quantitybean.class, p);
                  em.remove(gt);
   
        }catch(Exception ex){throw new EJBException(ex.getMessage());}
    }
   
    @Override
    //host, port, user, pass, recipient, subject,
                   // content
    public void sendMail(String host, String port, String user, String pass, String recipient, String subject, String body) {
          Properties props = new Properties();
props.put("mail.smtp.host", host);
props.put("mail.smtp.port", port);
switch (protocol) {
    case SMTPS:
        props.put("mail.smtp.ssl.enable", true);
        break;
    case TLS:
        props.put("mail.smtp.starttls.enable", true);
        break;
}
////Authenticator authenticator = null;
////if (auth) {
//    props.put("mail.smtp.auth", true);
//     Authenticator auth;
//        auth = new Authenticator() {
//        private final PasswordAuthentication pa = new PasswordAuthentication(username, password);
//       // @Override
//        @Override
//        public PasswordAuthentication getPasswordAuthentication() { 
//            return pa;
//        }
//    };


//Session session = Session.getInstance(props, auth);
 Session session = Session.getInstance(props, auth); 
session.setDebug(debug);

MimeMessage message = new MimeMessage(session);
try {
    message.setFrom(new InternetAddress(from));
    InternetAddress[] address = {new InternetAddress(recipient)}; 
    message.setRecipients(Message.RecipientType.TO, address);
    message.setSubject(subject);
    message.setSentDate(new Date());
    message.setText(body);
    Transport.send(message);
} catch (MessagingException ex) {
}
    }

    /**
     *
     * @param customerid
     * @param firstname
     * @param lastname
     * @param gender
     * @param homeaddress
     * @param shippingaddress
     * @param phonenumber
     * @param soo
     * @param lga
     * @param landmark
     * @param status
     * @param city
     * @param town
     * @param passport
     * @return
     */
    @Override
    public String addCustomers(String customerid, String firstname, String lastname, String gender, String homeaddress, String shippingaddress, String phonenumber, String soo, String lga, String landmark, String status, String city, String town, byte [] passport, String postcode) {
     Customersbean cb = new Customersbean();
        try{
            cb.setCustomerId(customerid);
            cb.setFirstname(firstname);
            cb.setLastname(lastname);
            cb.setGender(gender);
            cb.setHomeaddress(homeaddress);
            cb.setShippingaddress(shippingaddress);
            cb.setPhonenumber(phonenumber);
            cb.setStateoforgin(soo);
            cb.setLga(lga);
            cb.setLandmark(landmark);
            cb.setStatus(status);
            cb.setCity(city);
            cb.setTown(town);
            cb.setPassport(passport); 
            cb.setPostcode(postcode);
            em.persist(cb);
     
     }catch(Exception ex){
     throw new EJBException();
     }
        
        return customerid;
    }
   
    
    
     @Override
    public String modifyCustomers(String customerid, String firstname, String lastname, String gender, String homeaddress, String shippingaddress, String phonenumber, String soo, String lga, String landmark, String status, String city, String town, byte [] passport, String postcode) {
        try{
               
  Customersbean cb= em.find(Customersbean.class, customerid);
            cb.setCustomerId(customerid);
            cb.setFirstname(firstname);
            cb.setLastname(lastname);
            cb.setGender(gender);
            cb.setHomeaddress(homeaddress);
            cb.setShippingaddress(shippingaddress);
            cb.setPhonenumber(phonenumber);
            cb.setStateoforgin(soo);
            cb.setLga(lga);
            cb.setLandmark(landmark);
            cb.setStatus(status);
            cb.setCity(city);
            cb.setTown(town);
            cb.setPassport(passport); 
            cb.setPostcode(postcode);
            em.persist(cb); 
     
     }catch(Exception ex){
     throw new EJBException();
     
     }
        
        return customerid;
    }

    /**
     *
     * @param customerid
     * @return
     */
    @Override
    public Customersbean viewSingleCustomer(String customerid) {
        
        try{
         Customersbean cb= em.find(Customersbean.class, customerid);
         return cb;
        }catch(Exception ex){
       // throw new EJBException();
            
        }
        return null;
    }

    @Override
    public List viewAllCustomers() {
        List list = em.createNamedQuery("Customersbean.findAll").getResultList();
//em.createNamedQuery("Grommetbean.findAll").getResultList();
                
        return list;
    }

    @Override
    public List viewOrderByCustomerID(String customerid) {
        return  em.createNamedQuery("Order1bean.findByNeworder").setParameter("neworder", customerid).getResultList();
    }

    @Override
    public int calculateTotal(String price, String price2) {
        int total = 0;
        try{
        total = (Integer.parseInt(price) * 5/100) + Integer.parseInt(price);
        }catch(Exception ex){
        
        }
        return total;
    }
   
    
    
 
}
