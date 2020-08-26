/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JPT TERSOO AGBE
 */
@Entity
@Table(name = "subcategorybean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategorybean.findAll", query = "SELECT s FROM Subcategorybean s"),
    @NamedQuery(name = "Subcategorybean.findByCode", query = "SELECT s FROM Subcategorybean s WHERE s.code = :code"),
    @NamedQuery(name = "Subcategorybean.findByProductId", query = "SELECT s FROM Subcategorybean s WHERE s.productId = :productId"),
    @NamedQuery(name = "Subcategorybean.findBySubcategory", query = "SELECT s FROM Subcategorybean s WHERE s.subcategory = :subcategory"),
    @NamedQuery(name = "Subcategorybean.findBySubcategoryA", query = "SELECT s FROM Subcategorybean s WHERE s.subcategory LIKE ?1"),
    @NamedQuery(name = "Subcategorybean.findBySize", query = "SELECT s FROM Subcategorybean s WHERE s.size = :size"),
    @NamedQuery(name = "Subcategorybean.findBySizeandcut", query = "SELECT s FROM Subcategorybean s WHERE s.sizeandcut = :sizeandcut"),
    @NamedQuery(name = "Subcategorybean.findByPrintturnaround", query = "SELECT s FROM Subcategorybean s WHERE s.printturnaround = :printturnaround"),
    @NamedQuery(name = "Subcategorybean.findByPapertype", query = "SELECT s FROM Subcategorybean s WHERE s.papertype = :papertype"),
    @NamedQuery(name = "Subcategorybean.findByPrintedside", query = "SELECT s FROM Subcategorybean s WHERE s.printedside = :printedside"),
    @NamedQuery(name = "Subcategorybean.findByEnvelope", query = "SELECT s FROM Subcategorybean s WHERE s.envelope = :envelope"),
    @NamedQuery(name = "Subcategorybean.findBySequentialnumbering", query = "SELECT s FROM Subcategorybean s WHERE s.sequentialnumbering = :sequentialnumbering"),
    @NamedQuery(name = "Subcategorybean.findByStartingnumber", query = "SELECT s FROM Subcategorybean s WHERE s.startingnumber = :startingnumber"),
    @NamedQuery(name = "Subcategorybean.findByHoledrilling", query = "SELECT s FROM Subcategorybean s WHERE s.holedrilling = :holedrilling"),
    @NamedQuery(name = "Subcategorybean.findByHolelocation", query = "SELECT s FROM Subcategorybean s WHERE s.holelocation = :holelocation"),
    @NamedQuery(name = "Subcategorybean.findByRoundedcorners", query = "SELECT s FROM Subcategorybean s WHERE s.roundedcorners = :roundedcorners"),
    @NamedQuery(name = "Subcategorybean.findByLamination", query = "SELECT s FROM Subcategorybean s WHERE s.lamination = :lamination"),
    @NamedQuery(name = "Subcategorybean.findByCardslot", query = "SELECT s FROM Subcategorybean s WHERE s.cardslot = :cardslot"),
    @NamedQuery(name = "Subcategorybean.findByTabbing", query = "SELECT s FROM Subcategorybean s WHERE s.tabbing = :tabbing"),
    @NamedQuery(name = "Subcategorybean.findByCanvaswrapping", query = "SELECT s FROM Subcategorybean s WHERE s.canvaswrapping = :canvaswrapping"),
    @NamedQuery(name = "Subcategorybean.findByCanvascut", query = "SELECT s FROM Subcategorybean s WHERE s.canvascut = :canvascut"),
    @NamedQuery(name = "Subcategorybean.findByGrommet", query = "SELECT s FROM Subcategorybean s WHERE s.grommet = :grommet"),
    @NamedQuery(name = "Subcategorybean.findByHerms", query = "SELECT s FROM Subcategorybean s WHERE s.herms = :herms"),
    @NamedQuery(name = "Subcategorybean.findByPolepocket", query = "SELECT s FROM Subcategorybean s WHERE s.polepocket = :polepocket"),
    @NamedQuery(name = "Subcategorybean.findByPages", query = "SELECT s FROM Subcategorybean s WHERE s.pages = :pages"),
    @NamedQuery(name = "Subcategorybean.findByInteriorpaper", query = "SELECT s FROM Subcategorybean s WHERE s.interiorpaper = :interiorpaper"),
    @NamedQuery(name = "Subcategorybean.findByInkcolor", query = "SELECT s FROM Subcategorybean s WHERE s.inkcolor = :inkcolor"),
    @NamedQuery(name = "Subcategorybean.findByInteriocolor", query = "SELECT s FROM Subcategorybean s WHERE s.interiocolor = :interiocolor"),
    @NamedQuery(name = "Subcategorybean.findByBinding", query = "SELECT s FROM Subcategorybean s WHERE s.binding = :binding"),
    @NamedQuery(name = "Subcategorybean.findByBpunch", query = "SELECT s FROM Subcategorybean s WHERE s.bpunch = :bpunch"),
    @NamedQuery(name = "Subcategorybean.findByBindplacement", query = "SELECT s FROM Subcategorybean s WHERE s.bindplacement = :bindplacement"),
    @NamedQuery(name = "Subcategorybean.findByFolding", query = "SELECT s FROM Subcategorybean s WHERE s.folding = :folding"),
    @NamedQuery(name = "Subcategorybean.findByPerforation", query = "SELECT s FROM Subcategorybean s WHERE s.perforation = :perforation"),
    @NamedQuery(name = "Subcategorybean.findByCoverpaper", query = "SELECT s FROM Subcategorybean s WHERE s.coverpaper = :coverpaper"),
    @NamedQuery(name = "Subcategorybean.findByDefaultprice", query = "SELECT s FROM Subcategorybean s WHERE s.defaultprice = :defaultprice"),
    @NamedQuery(name = "Subcategorybean.findByNumberinglocation", query = "SELECT s FROM Subcategorybean s WHERE s.numberinglocation = :numberinglocation"),
    @NamedQuery(name = "Subcategorybean.findByTreeholedrilling", query = "SELECT s FROM Subcategorybean s WHERE s.treeholedrilling = :treeholedrilling"),
    @NamedQuery(name = "Subcategorybean.findByStatus", query = "SELECT s FROM Subcategorybean s WHERE s.status = :status")})
public class Subcategorybean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Size(max = 250)
    @Column(name = "productId")
    private String productId;
    @Size(max = 250)
    @Column(name = "subcategory")
    private String subcategory;
    @Size(max = 250)
    @Column(name = "size")
    private String size;
    @Size(max = 250)
    @Column(name = "sizeandcut")
    private String sizeandcut;
    @Size(max = 250)
    @Column(name = "printturnaround")
    private String printturnaround;
    @Size(max = 250)
    @Column(name = "papertype")
    private String papertype;
    @Size(max = 250)
    @Column(name = "printedside")
    private String printedside;
    @Size(max = 250)
    @Column(name = "envelope")
    private String envelope;
    @Size(max = 250)
    @Column(name = "sequentialnumbering")
    private String sequentialnumbering;
    @Size(max = 250)
    @Column(name = "startingnumber")
    private String startingnumber;
    @Size(max = 250)
    @Column(name = "holedrilling")
    private String holedrilling;
    @Size(max = 250)
    @Column(name = "holelocation")
    private String holelocation;
    @Size(max = 250)
    @Column(name = "roundedcorners")
    private String roundedcorners;
    @Size(max = 250)
    @Column(name = "lamination")
    private String lamination;
    @Size(max = 250)
    @Column(name = "cardslot")
    private String cardslot;
    @Size(max = 250)
    @Column(name = "tabbing")
    private String tabbing;
    @Size(max = 250)
    @Column(name = "canvaswrapping")
    private String canvaswrapping;
    @Size(max = 250)
    @Column(name = "canvascut")
    private String canvascut;
    @Size(max = 250)
    @Column(name = "grommet")
    private String grommet;
    @Size(max = 250)
    @Column(name = "herms")
    private String herms;
    @Size(max = 250)
    @Column(name = "polepocket")
    private String polepocket;
    @Size(max = 250)
    @Column(name = "pages")
    private String pages;
    @Size(max = 250)
    @Column(name = "interiorpaper")
    private String interiorpaper;
    @Size(max = 250)
    @Column(name = "inkcolor")
    private String inkcolor;
    @Size(max = 250)
    @Column(name = "interiocolor")
    private String interiocolor;
    @Size(max = 250)
    @Column(name = "binding")
    private String binding;
    @Size(max = 250)
    @Column(name = "bpunch")
    private String bpunch;
    @Size(max = 250)
    @Column(name = "bindplacement")
    private String bindplacement;
    @Size(max = 250)
    @Column(name = "folding")
    private String folding;
    @Size(max = 250)
    @Column(name = "perforation")
    private String perforation;
    @Size(max = 250)
    @Column(name = "coverpaper")
    private String coverpaper;
    @Size(max = 250)
    @Column(name = "defaultprice")
    private String defaultprice;
    @Lob
    @Column(name = "pix")
    private byte[] pix;
    @Size(max = 250)
    @Column(name = "numberinglocation")
    private String numberinglocation;
    @Size(max = 250)
    @Column(name = "treeholedrilling")
    private String treeholedrilling;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Subcategorybean() {
    }

    public Subcategorybean(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeandcut() {
        return sizeandcut;
    }

    public void setSizeandcut(String sizeandcut) {
        this.sizeandcut = sizeandcut;
    }

    public String getPrintturnaround() {
        return printturnaround;
    }

    public void setPrintturnaround(String printturnaround) {
        this.printturnaround = printturnaround;
    }

    public String getPapertype() {
        return papertype;
    }

    public void setPapertype(String papertype) {
        this.papertype = papertype;
    }

    public String getPrintedside() {
        return printedside;
    }

    public void setPrintedside(String printedside) {
        this.printedside = printedside;
    }

    public String getEnvelope() {
        return envelope;
    }

    public void setEnvelope(String envelope) {
        this.envelope = envelope;
    }

    public String getSequentialnumbering() {
        return sequentialnumbering;
    }

    public void setSequentialnumbering(String sequentialnumbering) {
        this.sequentialnumbering = sequentialnumbering;
    }

    public String getStartingnumber() {
        return startingnumber;
    }

    public void setStartingnumber(String startingnumber) {
        this.startingnumber = startingnumber;
    }

    public String getHoledrilling() {
        return holedrilling;
    }

    public void setHoledrilling(String holedrilling) {
        this.holedrilling = holedrilling;
    }

    public String getHolelocation() {
        return holelocation;
    }

    public void setHolelocation(String holelocation) {
        this.holelocation = holelocation;
    }

    public String getRoundedcorners() {
        return roundedcorners;
    }

    public void setRoundedcorners(String roundedcorners) {
        this.roundedcorners = roundedcorners;
    }

    public String getLamination() {
        return lamination;
    }

    public void setLamination(String lamination) {
        this.lamination = lamination;
    }

    public String getCardslot() {
        return cardslot;
    }

    public void setCardslot(String cardslot) {
        this.cardslot = cardslot;
    }

    public String getTabbing() {
        return tabbing;
    }

    public void setTabbing(String tabbing) {
        this.tabbing = tabbing;
    }

    public String getCanvaswrapping() {
        return canvaswrapping;
    }

    public void setCanvaswrapping(String canvaswrapping) {
        this.canvaswrapping = canvaswrapping;
    }

    public String getCanvascut() {
        return canvascut;
    }

    public void setCanvascut(String canvascut) {
        this.canvascut = canvascut;
    }

    public String getGrommet() {
        return grommet;
    }

    public void setGrommet(String grommet) {
        this.grommet = grommet;
    }

    public String getHerms() {
        return herms;
    }

    public void setHerms(String herms) {
        this.herms = herms;
    }

    public String getPolepocket() {
        return polepocket;
    }

    public void setPolepocket(String polepocket) {
        this.polepocket = polepocket;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getInteriorpaper() {
        return interiorpaper;
    }

    public void setInteriorpaper(String interiorpaper) {
        this.interiorpaper = interiorpaper;
    }

    public String getInkcolor() {
        return inkcolor;
    }

    public void setInkcolor(String inkcolor) {
        this.inkcolor = inkcolor;
    }

    public String getInteriocolor() {
        return interiocolor;
    }

    public void setInteriocolor(String interiocolor) {
        this.interiocolor = interiocolor;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBpunch() {
        return bpunch;
    }

    public void setBpunch(String bpunch) {
        this.bpunch = bpunch;
    }

    public String getBindplacement() {
        return bindplacement;
    }

    public void setBindplacement(String bindplacement) {
        this.bindplacement = bindplacement;
    }

    public String getFolding() {
        return folding;
    }

    public void setFolding(String folding) {
        this.folding = folding;
    }

    public String getPerforation() {
        return perforation;
    }

    public void setPerforation(String perforation) {
        this.perforation = perforation;
    }

    public String getCoverpaper() {
        return coverpaper;
    }

    public void setCoverpaper(String coverpaper) {
        this.coverpaper = coverpaper;
    }

    public String getDefaultprice() {
        return defaultprice;
    }

    public void setDefaultprice(String defaultprice) {
        this.defaultprice = defaultprice;
    }

    public byte[] getPix() {
        return pix;
    }

    public void setPix(byte[] pix) {
        this.pix = pix;
    }

    public String getNumberinglocation() {
        return numberinglocation;
    }

    public void setNumberinglocation(String numberinglocation) {
        this.numberinglocation = numberinglocation;
    }

    public String getTreeholedrilling() {
        return treeholedrilling;
    }

    public void setTreeholedrilling(String treeholedrilling) {
        this.treeholedrilling = treeholedrilling;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategorybean)) {
            return false;
        }
        Subcategorybean other = (Subcategorybean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Subcategorybean[ code=" + code + " ]";
    }
    
}
