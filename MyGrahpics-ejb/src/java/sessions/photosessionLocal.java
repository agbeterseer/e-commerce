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
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author JPT TERSOO AGBE
 */
@Local
public interface photosessionLocal {
     void addGrommet(String id, String grommetname, String productcode, String price, String desceiption, String status, String sizes, String price2, String price3, String size1);
   Userbean userlogin(String username, String password);

    List viewAllUsers();

    Userbean viewSingleUserRec(String username);

    void addRoles(String rolename, String Default, String status);

    Rolebean viewSingleRole(String rolename);

    void modifyRoles(String rolename);

    List viewAllRoles();

    String authenticatePassword(String username, String password);
    
    String authenticatePassword2(String username, String password);

    Sizetablebean removeSize(String id);

    void addSize(String code, String sizetab, String description, String status, String productcode, String price, String pagecost, String minpages, String minorder);

    void modifySizes(String code, String sizetab, String description, String status, String productcode, String price, String pagecost, String minpages, String minorder);

    List viewAllSize();

    void addPages(String pageId, String pageNumber, String del, String price, String productid, String pagename);
   void modifyPages(String pageId, String pageNumber, String del, String price, String productid, String pagename);

    Pagestabbean viewSinglePages(String pageID);

    List viewAllPages();

    List viewAllPagesByProductid(String productid);

    void removepages(String code);

    void addPaperType(String paperTypeId, String paperName, String description, String productName);

    void modifyPaperType(String paperTypeId, String paperName, String description, String productName);

    void removePaperType(String id);

    Papertypebean viewSinglePaperType(String id);

    List viewAllPaperType();

    List viewAllPaperTypeByProductName(String productname);

    void addBinding(String bindingId, String bindingName, String description, String price, String productid);
    
    void modifyBinding(String bindingId, String bindingName, String description, String price, String productid);

    Bindingbean viewSingleBinding(String bindingId);

    List viewAllBinding();

    List viewAllBindingProductId(String Productid);

    void removeBinding(String productID);

    void addBindPlacement(String bpId, String bpName, String description, String price, String productid);
    
    void modifyBindPlacement(String bpId, String bpName, String description, String price, String productid);

    Bindpalcementbean viewSingleBindPlacement(String bpId);

    List viewAllBindPlacement();

    List viewAllBindPlacementByProductID(String productId);

    void addCoverPaper(String cpId, String cpName, String description,  String productid);
    
    void modifyCoverPaper(String cpId, String cpName, String description,  String productid);

    Coverpaperbean viewSingleCoverPaper(String cpId);

    List viewAllCoverPaper();

    List viewAllCoverPaperByProductId(String productid);

    void removeCoverPaper(String id);

    void addPrintturarround(String id, String printType, String price, String productid);
    
    void modifyPrintturarround(String id, String printType, String price, String productid);

    Printturnarroundbean viewSinglePrintTunaround(String id);

    List viewAllByCodePrintTurnAround(String productid);

    List viewAllPrintTurnAround();

    List viewAllSubCategoris();

    void removePrintTuraround(String id);

    Staffbean viewSingleStaff(String username);

    String addPolePocket(String id, String polepocketname, String productcode, String price, String description);
    
    void modifyPolePocket(String id, String polepocketname, String productcode, String price, String description);

    Polepocketbean viewSinglePolePocket(String id);

    List viewAllPolePocket();

    List viewBYPolePocketCODE(String productcode);

    void removePolePocket(String id);

    String addSubcategory(String code, String productId, String subcategory, String defaultprice, byte [] pix);

    void modifySubcategory(String code, String productId, String subcategory, String size, String sizeandcut, String printturnaround, String papertype, String printedside, String envelope, String sequentialnumbering, String startingnumber, String holedrilling, String holelocation, String roundedcorners, String lamination, String cardslot, String tabbing, String canvaswrapping, String canvascut, String grommet, String herms, String polepocket, String pages, String interiorpaper, String inkcolor, String interiocolor, String binding, String bpunch, String bindplacement, String folding, String perforation, String coverpaper, String defaultprice, byte [] pix, String numberinglocation, String treeholedrilling, String status);
    
    Subcategorybean viewSingleSubcategory(String id);
    
    void removeSubCategoris(String id);
    
    List viewAllSubCategorisFolding(String folding);
    
    List viewAllSubCategorisProductID(String productid);

    void addStaff(String username, String firstName, String lastName, String gender, String position, String nationality, String stateOfOrigin, String lga, String homeAddress, String phoneNumber, String dateOfAppointment, byte[] passport);
    
    void modifyStaff(String username, String firstName, String lastName, String gender, String position, String nationality, String stateOfOrigin, String lga, String homeAddress, String phoneNumber, String dateOfAppointment, byte[] passport);

    List viewAllProducts();

    void addYear(String productid, String productname, byte [] pix, byte [] pix2, String description);

    void modifyYear(String productid, String productname, byte [] pix, byte [] pix2, String description);

    Productsservicesbean viewSingleProduct(String productid);

    void addRequest(String rpId, String name, String companyName, String phone, String email, String website, String description, byte[] pix, String status, String vCode);

    Requestprintbean viewSingleRequest(String rpId);

    List viewAllRequest();

    void addAboutUs(String abtId, String abtUs, String description);

    void modifyAboutUs(String abtId, String abtUs, String description);

    Aboutusbean viewAllAboutUS(String id);

    List viewAboutUs();

    void removeAboutUs(String id);

    void addContactUs(String cuId, String cus, String description, String street, String states, String city, String country);

    List viewAllAboutUs();

    Contactusbean viewSingleContactUs(String id);

    List viewAllContacts();

    void InitializeProducts(String productName, String productStatus, String productDefaultPrice, String defaultpage);

    Initializeprodutsbean viewSingleInitial(String id);

    List viewAllInitialProducts();

    void modifyInitialzeProducts(String productName, String productStatus, String productDefaultPrice, String defaultpage);

    void removeInitializedProduct(String id);

    List viewAllData();

    void deleteSingleRec(String id);

    void addCardSlot(String id, String cardslotname, String productcode, String price, String description, String status, String vision);
    
    void modifyCardSlot(String id, String cardslotname, String productcode, String price, String description, String status, String vision);

    Cardslotbean viewSingleCardSlot(String id);

    List viewAllCardSolt();

    void removeCardSlot(String id);

    String addHerms(String id, String hermsname, String productcode, String price, String desceiption, String status, String email, String fax, String officeaddress, String skype);
    
    String modifyHerms(String id, String hermsname, String productcode, String price, String desceiption, String status, String email, String fax, String officeaddress, String skype);

    Hermsbean viewSingleHerms(String id);

    List viewAllHerms();

    void removeHerms(String id);

    String addInteriorColor(String id, String interiorcolorname, String productcode, String price, String description);
    
    String modifyInteriorColor(String id, String interiorcolorname, String productcode, String price, String description);

    Interiorcolorbean viewSingleInteriorColor(String id);

    List viewAllInterioColor();

    void removeInterior(String id);

    String addLamination(String id, String laminate, String productcode, String price, String description);
    
    String modifyLamination(String id, String laminate, String productcode, String price, String description);

    Laminationbean viewSingleLamination(String id);

    List viewAllLamination();

    List viewAllLaminationProductCode(String productcode);

    void removeLamination(String id);

    String addPrintedSide(String printedsidename, String productid, String price, String description);
    
    String modifyPrintedSide(String id, String printedsidename, String productid, String price, String description);

    Printedsidebean viewSinglePrintedSide(String id);

    List viewAllPrintedSideByProductCode(String productcode);

    List viewAllPrintedSide();

    void removePrintedSide(String id);

    String addBindingPlacement(String bpId, String bpName, String description, String price, String productid);
    
    String modifyBindingPlacement(String bpId, String bpName, String description, String price, String productid);

    Bindpalcementbean viewSingleBindingPlacement(String productcode);

    List viewAllBlindingPlacement();

    void removeBlindPlacement(String id);

    String addQuantity(String qytId, String qty, String description, String productcode);
    
    String modifyQuantity(String qytId, String qty, String description, String productcode);

    Quantitybean veiwSingleQuantity(String id);

    List viewAllQuatityBydescription(String productcode);
    
    Sizetablebean viewSingleSize(String id);

    int viewSingleSize2(String p, String pages, String q, String defprice, String qtydprice, String productcode, String binding);
    
    Grommetbean findByGPDS(String p, String pages, String q, String defprice, String qtydprice, String productcode, String binding);

    int claculateCalender(String pages, String productcode, String Quantity, String size1);
    
    Grommetbean findByGromPSS(String pages, String produtcode, String Quantity, String size);

    int viewSingleSize4(String q, String qty, String qtydprice, String defprice);

    int computeIDCard(String qty, String size, String productcode);
    
    Grommetbean findByQSP(String qty, String size, String productcode);
    
    Grommetbean findByQS2P(String qty, String size, String productcode);

    int computeLuagageTag(String productcode, String qty, String size);

    int computeBusinessCard(String productcode, String printedside, String papertype, String Quantity);
    
    Grommetbean findByPSDS(String productcode, String printedside, String papertype, String Quantity);
    
    Grommetbean findByProSDS(String productcode, String printedside, String papertype, String Quantity);

    int computeStickerLabels(String productcode, String printedside, String papertype, String Quantity);

    int computRollUpBanner(String size, String productcode);
    
    Grommetbean findBySizeProductcode(String size, String productcode);

    int computeLetterHead(String size1, String papertype, String Quantity, String productcode);
    
    Grommetbean findBySProSP(String size, String papertype, String Quantity, String productcode);

    int computeExerciesBook(String Grommetname, String Productcode, String Status, String size);

    int computCanvas(String size1, String productcode);

    int computFlayers(String size1, String qty, String papertype, String pages, String productcode);
    
    Grommetbean findByPPQPS(String size, String qty, String papertype, String pages, String productcode);

    int computeEnvelops(String size, String qty, String productcode, String printedside);
    
    Grommetbean findBySSPD(String size, String qty, String productcode, String printedsize);

    int computeGoodyBag(String size1, String qty, String productcode, String lamination);
    
    Grommetbean findBySSPDd(String sizes, String qty, String productcode, String printedsize);

    int computeCDLayers(String productcode, String qty);
    
    Grommetbean findByproductcodeAndStatus(String productcode, String qty);

    String addBilling(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String productid, String dateoftransaction, String invoice, String properties);

    Billingbean viewSingleBilling(String username);

    List viewAllBillings();

    void removeBilling(String id);

    String addDeliveryAddress(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String deliverymethod, String paymentmethod, String deliverycomment, String paymentcomment, String shippment);
    
    void modifyDeliveryAddress(String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region, String deliverymethod, String paymentmethod, String deliverycomment, String paymentcomment, String shippment);

    Deliverydetailsbean viewSingleDelivery(String username);

    List viewAllDeliveryAddress();

    void addBlog(String code, String blogtitle, String comment, String dateofpost, String category, String procductcode, String status, String others, byte[] pic);
    
    void modifyBlog(String code, String blogtitle, String comment, String dateofpost, String category, String procductcode, String status, String others, byte[] pic);

    Blogbean viewSingleBlog(String code);

    List viewAllBlog();

    String addOrder(String ordernumber, String productcode, String properties, String dateoforder, String amount, String shippingmethod, String bill, String delivery, byte[] pix, String status, String description, String customerid);

    Order1bean viewSingleOrder(String ordernumber);

    List viewAllOrders();

    String AddUser(String username, String password, String role, String status);
    
    int viewSingleSizeEvent(String q, String defprice, String qtydprice);
    
    Grommetbean findBySQP(String size1, String qty, String productcode);
    
    int viewSingleSizePhotoBook(String q, String qty, String productcode);
    
    String compareString(String a, String b);
     
    boolean checkUserPassword(String username, String password);

    List searchBySubCategory(String subcate);
    
    List viewAllInterioColorByProductCode(String productcode); 

    void addProductImage(String code, byte [] pic, String productcode, String startprice);

    List viewAlProductsImageslByProductCode(String productcode);

    Productimagesbean viewSingleProductsImages(String p);
    
    Productimagesbean viewSingleProductsImagesByProductcode(String p);
    
    Grommetbean findByPQS(String productcode, String size, String qty);
         
    void removeGrommet(String p);

    List viewAllGrommet();

    Grommetbean viewSingleGrommet(String p);

    List viewAllInteriorColor();
    
    void removeInteriorColor(String p);
    
    void removeQuanity(String p);
    
    List viewAllQuatity();
    
    void sendMail(String host, String port, String user, String pass, String recipient, String subject, String body);
   
    //PasswordAuthentication getPasswordAuthentication();

    public void persist(Object object);

    String addCustomers(String customerid, String firstname, String lastname, String gender, String homeaddress, String shippingaddress, String phonenumber, String soo, String lga, String landmark, String status, String city, String town, byte[] passport, String postcode);
   
     String modifyCustomers(String customerid, String firstname, String lastname, String gender, String homeaddress, String shippingaddress, String phonenumber, String soo, String lga, String landmark, String status, String city, String town, byte[] passport, String postcode);

    Customersbean viewSingleCustomer(String customerid);

    List viewAllCustomers();

    public String randomString(int len);

    public String UserChangePassword(String username, String password, String newpassword, String status);

    List viewOrderByCustomerID(String customerid);

    int calculateTotal(String price, String price2);
   
}
