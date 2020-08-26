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
@Table(name = "grommetbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grommetbean.findAll", query = "SELECT g FROM Grommetbean g"),
    @NamedQuery(name = "Grommetbean.findById", query = "SELECT g FROM Grommetbean g WHERE g.id = :id"),
    @NamedQuery(name = "Grommetbean.findByGrommetname", query = "SELECT g FROM Grommetbean g WHERE g.grommetname = :grommetname"),
    @NamedQuery(name = "Grommetbean.findByProductcode", query = "SELECT g FROM Grommetbean g WHERE g.productcode = :productcode"),
    @NamedQuery(name = "Grommetbean.findByPrice", query = "SELECT g FROM Grommetbean g WHERE g.price = :price"),
    @NamedQuery(name = "Grommetbean.findByDesceiption", query = "SELECT g FROM Grommetbean g WHERE g.desceiption = :desceiption"),
    @NamedQuery(name = "Grommetbean.findByStatus", query = "SELECT g FROM Grommetbean g WHERE g.status = :status"),
    @NamedQuery(name = "Grommetbean.findBySizes", query = "SELECT g FROM Grommetbean g WHERE g.sizes = :sizes"),
    @NamedQuery(name = "Grommetbean.findByPrice2", query = "SELECT g FROM Grommetbean g WHERE g.price2 = :price2"),
    @NamedQuery(name = "Grommetbean.findByPrice3", query = "SELECT g FROM Grommetbean g WHERE g.price3 = :price3"),
    @NamedQuery(name = "Grommetbean.findBySize", query = "SELECT g FROM Grommetbean g WHERE g.size1 = :size1"),
    @NamedQuery(name = "Grommetbean.findByGPDS", query = "SELECT g FROM Grommetbean g WHERE g.grommetname = :grommetname AND g.productcode = :productcode AND g.desceiption = :desceiption AND g.status = :status"),
    @NamedQuery(name = "Grommetbean.findByGromPSS", query = "SELECT g FROM Grommetbean g WHERE g.grommetname = :grommetname AND g.productcode = :productcode AND g.status = :status AND g.size1 = :size1"),
    @NamedQuery(name = "Grommetbean.findByGromPSSo", query = "SELECT g FROM Grommetbean g WHERE g.grommetname = :grommetname AND g.productcode = :productcode AND g.status = :status AND g.sizes = :sizes"),
    @NamedQuery(name = "Grommetbean.findByQS2P", query = "SELECT g FROM Grommetbean g WHERE g.status = :status AND g.sizes = :sizes AND g.productcode = :productcode"),
    @NamedQuery(name = "Grommetbean.findByPSDS", query = "SELECT g FROM Grommetbean g WHERE g.productcode = :productcode AND g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status"),
    @NamedQuery(name = "Grommetbean.findByProSDS", query = "SELECT g FROM Grommetbean g WHERE g.productcode = :productcode AND g.sizes = :sizes AND g.desceiption = :desceiption AND g.status = :status"),
    @NamedQuery(name = "Grommetbean.findBySizeProductcode", query = "SELECT g FROM Grommetbean g WHERE g.size1 = :size1 AND g.productcode = :productcode"),
    @NamedQuery(name = "Grommetbean.findBySProSP", query = "SELECT g FROM Grommetbean g WHERE g.size1 = :size1 AND g.desceiption = :desceiption AND g.status = :status AND g.productcode = :productcode"),
    @NamedQuery(name = "Grommetbean.findByPPQPS", query = "SELECT g FROM Grommetbean g WHERE g.productcode = :productcode AND g.grommetname = :grommetname AND g.status = :status AND g.desceiption = :desceiption  AND g.size1 = :size1"),
    @NamedQuery(name = "Grommetbean.findBySSPD", query = "SELECT g FROM Grommetbean g WHERE g.size1 = :size1 AND g.status = :status AND g.productcode = :productcode AND g.desceiption = :desceiption"),
    @NamedQuery(name = "Grommetbean.findBySSPDd", query = "SELECT g FROM Grommetbean g WHERE g.sizes = :sizes AND g.status = :status AND g.productcode = :productcode AND g.desceiption = :desceiption"),
    @NamedQuery(name = "Grommetbean.findByproductcodeAndStatus", query = "SELECT g FROM Grommetbean g WHERE g.productcode = :productcode AND g.status = :status"),
    @NamedQuery(name = "Grommetbean.findByPQS", query = "SELECT g FROM Grommetbean g WHERE g.productcode = :productcode AND g.status = :status AND g.size1 = :size1"),
    @NamedQuery(name = "Grommetbean.findByQSP", query = "SELECT g FROM Grommetbean g WHERE g.status = :status AND g.size1 = :size1  AND g.productcode = :productcode"),
    @NamedQuery(name = "Grommetbean.findBySQP", query = "SELECT g FROM Grommetbean g WHERE g.size1 = :size1 AND g.status = :status AND g.productcode = :productcode")})
    
// Grommetbean gl = (Grommetbean)em.createNamedQuery("Grommetbean.findByQSP").setParameter("status", qty).setParameter("size1", size).setParameter("productcode", productcode).getSingleResult();
   //
//findByproductcodeAndStatus g.size = ?1 and g.status = ?2 and g.productcode = ?3 and g.desceiption = ?4 findByQSP
                                                        // productcode pages qty  papertype size1 .computeLuagageTag(hsc.getCode(), Quantity, sizes );
public class Grommetbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "grommetname")
    private String grommetname;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "desceiption")
    private String desceiption;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "sizes")
    private String sizes;
    @Size(max = 250)
    @Column(name = "price2")
    private String price2;
    @Size(max = 250)
    @Column(name = "price3")
    private String price3;
    @Size(max = 250)
    @Column(name = "size1")
    private String size1;

    public Grommetbean() {
    }

    public Grommetbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrommetname() {
        return grommetname;
    }

    public void setGrommetname(String grommetname) {
        this.grommetname = grommetname;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesceiption() {
        return desceiption;
    }

    public void setDesceiption(String desceiption) {
        this.desceiption = desceiption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getPrice3() {
        return price3;
    }

    public void setPrice3(String price3) {
        this.price3 = price3;
    }

    public String getSize1() {
        return size1;
    }

    public void setSize1(String size1) {
        this.size1 = size1;
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
        if (!(object instanceof Grommetbean)) {
            return false;
        }
        Grommetbean other = (Grommetbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Grommetbean[ id=" + id + " ]";
    }
    
}
