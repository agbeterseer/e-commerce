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
@Table(name = "bindpalcementbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bindpalcementbean.findAll", query = "SELECT b FROM Bindpalcementbean b"),
    @NamedQuery(name = "Bindpalcementbean.findByBpId", query = "SELECT b FROM Bindpalcementbean b WHERE b.bpId = :bpId"),
    @NamedQuery(name = "Bindpalcementbean.findByBpName", query = "SELECT b FROM Bindpalcementbean b WHERE b.bpName = :bpName"),
    @NamedQuery(name = "Bindpalcementbean.findByDescription", query = "SELECT b FROM Bindpalcementbean b WHERE b.description = :description"),
    @NamedQuery(name = "Bindpalcementbean.findByStatus", query = "SELECT b FROM Bindpalcementbean b WHERE b.status = :status"),
    @NamedQuery(name = "Bindpalcementbean.findByDel", query = "SELECT b FROM Bindpalcementbean b WHERE b.del = :del"),
    @NamedQuery(name = "Bindpalcementbean.findByPrice", query = "SELECT b FROM Bindpalcementbean b WHERE b.price = :price"),
    @NamedQuery(name = "Bindpalcementbean.findByProductid", query = "SELECT b FROM Bindpalcementbean b WHERE b.productid = :productid")})
public class Bindpalcementbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "bpId")
    private String bpId;
    @Size(max = 250)
    @Column(name = "bpName")
    private String bpName;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "del")
    private String del;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "productid")
    private String productid;

    public Bindpalcementbean() {
    }

    public Bindpalcementbean(String bpId) {
        this.bpId = bpId;
    }

    public String getBpId() {
        return bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
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

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bpId != null ? bpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bindpalcementbean)) {
            return false;
        }
        Bindpalcementbean other = (Bindpalcementbean) object;
        if ((this.bpId == null && other.bpId != null) || (this.bpId != null && !this.bpId.equals(other.bpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Bindpalcementbean[ bpId=" + bpId + " ]";
    }
    
}
