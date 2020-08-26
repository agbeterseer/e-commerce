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
@Table(name = "cartbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartbean.findAll", query = "SELECT c FROM Cartbean c"),
    @NamedQuery(name = "Cartbean.findById", query = "SELECT c FROM Cartbean c WHERE c.id = :id"),
    @NamedQuery(name = "Cartbean.findBySize", query = "SELECT c FROM Cartbean c WHERE c.size = :size"),
    @NamedQuery(name = "Cartbean.findByPages", query = "SELECT c FROM Cartbean c WHERE c.pages = :pages"),
    @NamedQuery(name = "Cartbean.findByCoverpages", query = "SELECT c FROM Cartbean c WHERE c.coverpages = :coverpages"),
    @NamedQuery(name = "Cartbean.findByInteriorpaper", query = "SELECT c FROM Cartbean c WHERE c.interiorpaper = :interiorpaper"),
    @NamedQuery(name = "Cartbean.findByInteriorcolor", query = "SELECT c FROM Cartbean c WHERE c.interiorcolor = :interiorcolor"),
    @NamedQuery(name = "Cartbean.findByBinding", query = "SELECT c FROM Cartbean c WHERE c.binding = :binding"),
    @NamedQuery(name = "Cartbean.findByThreeholepunch", query = "SELECT c FROM Cartbean c WHERE c.threeholepunch = :threeholepunch"),
    @NamedQuery(name = "Cartbean.findByQty", query = "SELECT c FROM Cartbean c WHERE c.qty = :qty"),
    @NamedQuery(name = "Cartbean.findByProductiontime", query = "SELECT c FROM Cartbean c WHERE c.productiontime = :productiontime"),
    @NamedQuery(name = "Cartbean.findByDeliverymethod", query = "SELECT c FROM Cartbean c WHERE c.deliverymethod = :deliverymethod"),
    @NamedQuery(name = "Cartbean.findByZipcode", query = "SELECT c FROM Cartbean c WHERE c.zipcode = :zipcode"),
    @NamedQuery(name = "Cartbean.findByPrice", query = "SELECT c FROM Cartbean c WHERE c.price = :price"),
    @NamedQuery(name = "Cartbean.findByUserid", query = "SELECT c FROM Cartbean c WHERE c.userid = :userid"),
    @NamedQuery(name = "Cartbean.findByDateoftranscaction", query = "SELECT c FROM Cartbean c WHERE c.dateoftranscaction = :dateoftranscaction"),
    @NamedQuery(name = "Cartbean.findByBindplacement", query = "SELECT c FROM Cartbean c WHERE c.bindplacement = :bindplacement"),
    @NamedQuery(name = "Cartbean.findByProductid", query = "SELECT c FROM Cartbean c WHERE c.productid = :productid"),
    @NamedQuery(name = "Cartbean.findByDescription", query = "SELECT c FROM Cartbean c WHERE c.description = :description"),
    @NamedQuery(name = "Cartbean.findByStatus", query = "SELECT c FROM Cartbean c WHERE c.status = :status"),
    @NamedQuery(name = "Cartbean.findByCustomerid", query = "SELECT c FROM Cartbean c WHERE c.customerid = :customerid")})
public class Cartbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "size")
    private String size;
    @Size(max = 250)
    @Column(name = "pages")
    private String pages;
    @Size(max = 250)
    @Column(name = "coverpages")
    private String coverpages;
    @Size(max = 250)
    @Column(name = "interiorpaper")
    private String interiorpaper;
    @Size(max = 250)
    @Column(name = "interiorcolor")
    private String interiorcolor;
    @Size(max = 250)
    @Column(name = "binding")
    private String binding;
    @Size(max = 250)
    @Column(name = "threeholepunch")
    private String threeholepunch;
    @Size(max = 250)
    @Column(name = "qty")
    private String qty;
    @Lob
    @Column(name = "pix")
    private byte[] pix;
    @Size(max = 250)
    @Column(name = "productiontime")
    private String productiontime;
    @Size(max = 250)
    @Column(name = "deliverymethod")
    private String deliverymethod;
    @Size(max = 250)
    @Column(name = "zipcode")
    private String zipcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "userid")
    private String userid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateoftranscaction")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateoftranscaction;
    @Size(max = 250)
    @Column(name = "bindplacement")
    private String bindplacement;
    @Size(max = 250)
    @Column(name = "productid")
    private String productid;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "customerid")
    private String customerid;

    public Cartbean() {
    }

    public Cartbean(String id) {
        this.id = id;
    }

    public Cartbean(String id, Date dateoftranscaction) {
        this.id = id;
        this.dateoftranscaction = dateoftranscaction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCoverpages() {
        return coverpages;
    }

    public void setCoverpages(String coverpages) {
        this.coverpages = coverpages;
    }

    public String getInteriorpaper() {
        return interiorpaper;
    }

    public void setInteriorpaper(String interiorpaper) {
        this.interiorpaper = interiorpaper;
    }

    public String getInteriorcolor() {
        return interiorcolor;
    }

    public void setInteriorcolor(String interiorcolor) {
        this.interiorcolor = interiorcolor;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getThreeholepunch() {
        return threeholepunch;
    }

    public void setThreeholepunch(String threeholepunch) {
        this.threeholepunch = threeholepunch;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public byte[] getPix() {
        return pix;
    }

    public void setPix(byte[] pix) {
        this.pix = pix;
    }

    public String getProductiontime() {
        return productiontime;
    }

    public void setProductiontime(String productiontime) {
        this.productiontime = productiontime;
    }

    public String getDeliverymethod() {
        return deliverymethod;
    }

    public void setDeliverymethod(String deliverymethod) {
        this.deliverymethod = deliverymethod;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getDateoftranscaction() {
        return dateoftranscaction;
    }

    public void setDateoftranscaction(Date dateoftranscaction) {
        this.dateoftranscaction = dateoftranscaction;
    }

    public String getBindplacement() {
        return bindplacement;
    }

    public void setBindplacement(String bindplacement) {
        this.bindplacement = bindplacement;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartbean)) {
            return false;
        }
        Cartbean other = (Cartbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cartbean[ id=" + id + " ]";
    }
    
}
