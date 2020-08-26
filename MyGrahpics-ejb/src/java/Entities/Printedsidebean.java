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
@Table(name = "printedsidebean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Printedsidebean.findAll", query = "SELECT p FROM Printedsidebean p"),
    @NamedQuery(name = "Printedsidebean.findById", query = "SELECT p FROM Printedsidebean p WHERE p.id = :id"),
    @NamedQuery(name = "Printedsidebean.findByPrintedsidename", query = "SELECT p FROM Printedsidebean p WHERE p.printedsidename = :printedsidename"),
    @NamedQuery(name = "Printedsidebean.findByProductid", query = "SELECT p FROM Printedsidebean p WHERE p.productid = :productid"),
    @NamedQuery(name = "Printedsidebean.findByPrice", query = "SELECT p FROM Printedsidebean p WHERE p.price = :price"),
    @NamedQuery(name = "Printedsidebean.findByDescription", query = "SELECT p FROM Printedsidebean p WHERE p.description = :description"),
    @NamedQuery(name = "Printedsidebean.findByStatus", query = "SELECT p FROM Printedsidebean p WHERE p.status = :status")})
public class Printedsidebean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "printedsidename")
    private String printedsidename;
    @Size(max = 250)
    @Column(name = "productid")
    private String productid;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Printedsidebean() {
    }

    public Printedsidebean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrintedsidename() {
        return printedsidename;
    }

    public void setPrintedsidename(String printedsidename) {
        this.printedsidename = printedsidename;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Printedsidebean)) {
            return false;
        }
        Printedsidebean other = (Printedsidebean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Printedsidebean[ id=" + id + " ]";
    }
    
}
