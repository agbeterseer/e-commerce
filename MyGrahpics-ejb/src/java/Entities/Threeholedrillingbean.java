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
@Table(name = "threeholedrillingbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Threeholedrillingbean.findAll", query = "SELECT t FROM Threeholedrillingbean t"),
    @NamedQuery(name = "Threeholedrillingbean.findById", query = "SELECT t FROM Threeholedrillingbean t WHERE t.id = :id"),
    @NamedQuery(name = "Threeholedrillingbean.findByThdrilling", query = "SELECT t FROM Threeholedrillingbean t WHERE t.thdrilling = :thdrilling"),
    @NamedQuery(name = "Threeholedrillingbean.findByProductcode", query = "SELECT t FROM Threeholedrillingbean t WHERE t.productcode = :productcode"),
    @NamedQuery(name = "Threeholedrillingbean.findByPrice", query = "SELECT t FROM Threeholedrillingbean t WHERE t.price = :price"),
    @NamedQuery(name = "Threeholedrillingbean.findByDescriptiion", query = "SELECT t FROM Threeholedrillingbean t WHERE t.descriptiion = :descriptiion"),
    @NamedQuery(name = "Threeholedrillingbean.findByStatus", query = "SELECT t FROM Threeholedrillingbean t WHERE t.status = :status")})
public class Threeholedrillingbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "thdrilling")
    private String thdrilling;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "descriptiion")
    private String descriptiion;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Threeholedrillingbean() {
    }

    public Threeholedrillingbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThdrilling() {
        return thdrilling;
    }

    public void setThdrilling(String thdrilling) {
        this.thdrilling = thdrilling;
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

    public String getDescriptiion() {
        return descriptiion;
    }

    public void setDescriptiion(String descriptiion) {
        this.descriptiion = descriptiion;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Threeholedrillingbean)) {
            return false;
        }
        Threeholedrillingbean other = (Threeholedrillingbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Threeholedrillingbean[ id=" + id + " ]";
    }
    
}
