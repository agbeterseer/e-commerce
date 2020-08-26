/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JPT TERSOO AGBE
 */
@Entity
@Table(name = "productsservicesbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productsservicesbean.findAll", query = "SELECT p FROM Productsservicesbean p"),
    @NamedQuery(name = "Productsservicesbean.findByProductsId", query = "SELECT p FROM Productsservicesbean p WHERE p.productsId = :productsId"),
    @NamedQuery(name = "Productsservicesbean.findByProductsName", query = "SELECT p FROM Productsservicesbean p WHERE p.productsName = :productsName"),
    @NamedQuery(name = "Productsservicesbean.findByDescription", query = "SELECT p FROM Productsservicesbean p WHERE p.description = :description"),
    @NamedQuery(name = "Productsservicesbean.findByStatus", query = "SELECT p FROM Productsservicesbean p WHERE p.status = :status"),
    @NamedQuery(name = "Productsservicesbean.findByProductType", query = "SELECT p FROM Productsservicesbean p WHERE p.productType = :productType"),
    @NamedQuery(name = "Productsservicesbean.findByDateCreated", query = "SELECT p FROM Productsservicesbean p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "Productsservicesbean.findByFolding", query = "SELECT p FROM Productsservicesbean p WHERE p.folding = :folding"),
    @NamedQuery(name = "Productsservicesbean.findByPrintedside", query = "SELECT p FROM Productsservicesbean p WHERE p.printedside = :printedside"),
    @NamedQuery(name = "Productsservicesbean.findByPerforation", query = "SELECT p FROM Productsservicesbean p WHERE p.perforation = :perforation"),
    @NamedQuery(name = "Productsservicesbean.findBySizeCut", query = "SELECT p FROM Productsservicesbean p WHERE p.sizeCut = :sizeCut"),
    @NamedQuery(name = "Productsservicesbean.findByInkcolor", query = "SELECT p FROM Productsservicesbean p WHERE p.inkcolor = :inkcolor"),
    @NamedQuery(name = "Productsservicesbean.findByEnvelops", query = "SELECT p FROM Productsservicesbean p WHERE p.envelops = :envelops"),
    @NamedQuery(name = "Productsservicesbean.findByNumberinglocation", query = "SELECT p FROM Productsservicesbean p WHERE p.numberinglocation = :numberinglocation"),
    @NamedQuery(name = "Productsservicesbean.findBySeqentialnumbering", query = "SELECT p FROM Productsservicesbean p WHERE p.seqentialnumbering = :seqentialnumbering"),
    @NamedQuery(name = "Productsservicesbean.findByStartingnumber", query = "SELECT p FROM Productsservicesbean p WHERE p.startingnumber = :startingnumber"),
    @NamedQuery(name = "Productsservicesbean.findByRoundedcorners", query = "SELECT p FROM Productsservicesbean p WHERE p.roundedcorners = :roundedcorners"),
    @NamedQuery(name = "Productsservicesbean.findByCardslot", query = "SELECT p FROM Productsservicesbean p WHERE p.cardslot = :cardslot"),
    @NamedQuery(name = "Productsservicesbean.findByTreeholedrilling", query = "SELECT p FROM Productsservicesbean p WHERE p.treeholedrilling = :treeholedrilling"),
    @NamedQuery(name = "Productsservicesbean.findByCanvaswrapping", query = "SELECT p FROM Productsservicesbean p WHERE p.canvaswrapping = :canvaswrapping"),
    @NamedQuery(name = "Productsservicesbean.findByGromements", query = "SELECT p FROM Productsservicesbean p WHERE p.gromements = :gromements"),
    @NamedQuery(name = "Productsservicesbean.findByHerms", query = "SELECT p FROM Productsservicesbean p WHERE p.herms = :herms"),
    @NamedQuery(name = "Productsservicesbean.findByPolepucket", query = "SELECT p FROM Productsservicesbean p WHERE p.polepucket = :polepucket"),
    @NamedQuery(name = "Productsservicesbean.findByBindplacement", query = "SELECT p FROM Productsservicesbean p WHERE p.bindplacement = :bindplacement"),
    @NamedQuery(name = "Productsservicesbean.findByBinding", query = "SELECT p FROM Productsservicesbean p WHERE p.binding = :binding"),
    @NamedQuery(name = "Productsservicesbean.findByCoverpapers", query = "SELECT p FROM Productsservicesbean p WHERE p.coverpapers = :coverpapers"),
    @NamedQuery(name = "Productsservicesbean.findByPages", query = "SELECT p FROM Productsservicesbean p WHERE p.pages = :pages"),
    @NamedQuery(name = "Productsservicesbean.findByPapertype", query = "SELECT p FROM Productsservicesbean p WHERE p.papertype = :papertype"),
    @NamedQuery(name = "Productsservicesbean.findByPrintturnaround", query = "SELECT p FROM Productsservicesbean p WHERE p.printturnaround = :printturnaround"),
    @NamedQuery(name = "Productsservicesbean.findByQuantity", query = "SELECT p FROM Productsservicesbean p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Productsservicesbean.findByStartingprice", query = "SELECT p FROM Productsservicesbean p WHERE p.startingprice = :startingprice")})
public class Productsservicesbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "productsId")
    private String productsId;
    @Size(max = 250)
    @Column(name = "productsName")
    private String productsName;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "productType")
    private String productType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Lob
    @Column(name = "pix")
    private byte[] pix;
    @Size(max = 250)
    @Column(name = "folding")
    private String folding;
    @Size(max = 250)
    @Column(name = "printedside")
    private String printedside;
    @Size(max = 250)
    @Column(name = "perforation")
    private String perforation;
    @Size(max = 250)
    @Column(name = "size_cut")
    private String sizeCut;
    @Size(max = 250)
    @Column(name = "inkcolor")
    private String inkcolor;
    @Size(max = 250)
    @Column(name = "envelops")
    private String envelops;
    @Size(max = 250)
    @Column(name = "numberinglocation")
    private String numberinglocation;
    @Size(max = 250)
    @Column(name = "seqentialnumbering")
    private String seqentialnumbering;
    @Size(max = 250)
    @Column(name = "startingnumber")
    private String startingnumber;
    @Size(max = 250)
    @Column(name = "roundedcorners")
    private String roundedcorners;
    @Size(max = 250)
    @Column(name = "cardslot")
    private String cardslot;
    @Size(max = 250)
    @Column(name = "treeholedrilling")
    private String treeholedrilling;
    @Size(max = 250)
    @Column(name = "canvaswrapping")
    private String canvaswrapping;
    @Size(max = 250)
    @Column(name = "gromements")
    private String gromements;
    @Size(max = 250)
    @Column(name = "herms")
    private String herms;
    @Size(max = 250)
    @Column(name = "polepucket")
    private String polepucket;
    @Lob
    @Column(name = "pix2")
    private byte[] pix2;
    @Size(max = 250)
    @Column(name = "bindplacement")
    private String bindplacement;
    @Size(max = 250)
    @Column(name = "binding")
    private String binding;
    @Size(max = 250)
    @Column(name = "coverpapers")
    private String coverpapers;
    @Size(max = 250)
    @Column(name = "pages")
    private String pages;
    @Size(max = 250)
    @Column(name = "papertype")
    private String papertype;
    @Size(max = 250)
    @Column(name = "printturnaround")
    private String printturnaround;
    @Column(name = "quantity")
    private Integer quantity;
    @Size(max = 250)
    @Column(name = "startingprice")
    private String startingprice;

    public Productsservicesbean() {
    }

    public Productsservicesbean(String productsId) {
        this.productsId = productsId;
    }

    public Productsservicesbean(String productsId, Date dateCreated) {
        this.productsId = productsId;
        this.dateCreated = dateCreated;
    }

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public byte[] getPix() {
        return pix;
    }

    public void setPix(byte[] pix) {
        this.pix = pix;
    }

    public String getFolding() {
        return folding;
    }

    public void setFolding(String folding) {
        this.folding = folding;
    }

    public String getPrintedside() {
        return printedside;
    }

    public void setPrintedside(String printedside) {
        this.printedside = printedside;
    }

    public String getPerforation() {
        return perforation;
    }

    public void setPerforation(String perforation) {
        this.perforation = perforation;
    }

    public String getSizeCut() {
        return sizeCut;
    }

    public void setSizeCut(String sizeCut) {
        this.sizeCut = sizeCut;
    }

    public String getInkcolor() {
        return inkcolor;
    }

    public void setInkcolor(String inkcolor) {
        this.inkcolor = inkcolor;
    }

    public String getEnvelops() {
        return envelops;
    }

    public void setEnvelops(String envelops) {
        this.envelops = envelops;
    }

    public String getNumberinglocation() {
        return numberinglocation;
    }

    public void setNumberinglocation(String numberinglocation) {
        this.numberinglocation = numberinglocation;
    }

    public String getSeqentialnumbering() {
        return seqentialnumbering;
    }

    public void setSeqentialnumbering(String seqentialnumbering) {
        this.seqentialnumbering = seqentialnumbering;
    }

    public String getStartingnumber() {
        return startingnumber;
    }

    public void setStartingnumber(String startingnumber) {
        this.startingnumber = startingnumber;
    }

    public String getRoundedcorners() {
        return roundedcorners;
    }

    public void setRoundedcorners(String roundedcorners) {
        this.roundedcorners = roundedcorners;
    }

    public String getCardslot() {
        return cardslot;
    }

    public void setCardslot(String cardslot) {
        this.cardslot = cardslot;
    }

    public String getTreeholedrilling() {
        return treeholedrilling;
    }

    public void setTreeholedrilling(String treeholedrilling) {
        this.treeholedrilling = treeholedrilling;
    }

    public String getCanvaswrapping() {
        return canvaswrapping;
    }

    public void setCanvaswrapping(String canvaswrapping) {
        this.canvaswrapping = canvaswrapping;
    }

    public String getGromements() {
        return gromements;
    }

    public void setGromements(String gromements) {
        this.gromements = gromements;
    }

    public String getHerms() {
        return herms;
    }

    public void setHerms(String herms) {
        this.herms = herms;
    }

    public String getPolepucket() {
        return polepucket;
    }

    public void setPolepucket(String polepucket) {
        this.polepucket = polepucket;
    }

    public byte[] getPix2() {
        return pix2;
    }

    public void setPix2(byte[] pix2) {
        this.pix2 = pix2;
    }

    public String getBindplacement() {
        return bindplacement;
    }

    public void setBindplacement(String bindplacement) {
        this.bindplacement = bindplacement;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getCoverpapers() {
        return coverpapers;
    }

    public void setCoverpapers(String coverpapers) {
        this.coverpapers = coverpapers;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPapertype() {
        return papertype;
    }

    public void setPapertype(String papertype) {
        this.papertype = papertype;
    }

    public String getPrintturnaround() {
        return printturnaround;
    }

    public void setPrintturnaround(String printturnaround) {
        this.printturnaround = printturnaround;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStartingprice() {
        return startingprice;
    }

    public void setStartingprice(String startingprice) {
        this.startingprice = startingprice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productsId != null ? productsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productsservicesbean)) {
            return false;
        }
        Productsservicesbean other = (Productsservicesbean) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Productsservicesbean[ productsId=" + productsId + " ]";
    }
    
}
