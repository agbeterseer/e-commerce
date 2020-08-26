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
@Table(name = "bindingbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bindingbean.findAll", query = "SELECT b FROM Bindingbean b"),
    @NamedQuery(name = "Bindingbean.findByBindingId", query = "SELECT b FROM Bindingbean b WHERE b.bindingId = :bindingId"),
    @NamedQuery(name = "Bindingbean.findByBindingName", query = "SELECT b FROM Bindingbean b WHERE b.bindingName = :bindingName"),
    @NamedQuery(name = "Bindingbean.findByDescription", query = "SELECT b FROM Bindingbean b WHERE b.description = :description"),
    @NamedQuery(name = "Bindingbean.findByStatus", query = "SELECT b FROM Bindingbean b WHERE b.status = :status"),
    @NamedQuery(name = "Bindingbean.findByDel", query = "SELECT b FROM Bindingbean b WHERE b.del = :del"),
    @NamedQuery(name = "Bindingbean.findByPrice", query = "SELECT b FROM Bindingbean b WHERE b.price = :price"),
    @NamedQuery(name = "Bindingbean.findByProductid", query = "SELECT b FROM Bindingbean b WHERE b.productid = :productid")})
public class Bindingbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "bindingId")
    private String bindingId;
    @Size(max = 250)
    @Column(name = "bindingName")
    private String bindingName;
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

    public Bindingbean() {
    }

    public Bindingbean(String bindingId) {
        this.bindingId = bindingId;
    }

    public String getBindingId() {
        return bindingId;
    }

    public void setBindingId(String bindingId) {
        this.bindingId = bindingId;
    }

    public String getBindingName() {
        return bindingName;
    }

    public void setBindingName(String bindingName) {
        this.bindingName = bindingName;
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
        hash += (bindingId != null ? bindingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bindingbean)) {
            return false;
        }
        Bindingbean other = (Bindingbean) object;
        if ((this.bindingId == null && other.bindingId != null) || (this.bindingId != null && !this.bindingId.equals(other.bindingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Bindingbean[ bindingId=" + bindingId + " ]";
    }
    
}
