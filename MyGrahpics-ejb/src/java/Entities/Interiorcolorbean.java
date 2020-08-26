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
@Table(name = "interiorcolorbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interiorcolorbean.findAll", query = "SELECT i FROM Interiorcolorbean i"),
    @NamedQuery(name = "Interiorcolorbean.findById", query = "SELECT i FROM Interiorcolorbean i WHERE i.id = :id"),
    @NamedQuery(name = "Interiorcolorbean.findByInteriorcolorname", query = "SELECT i FROM Interiorcolorbean i WHERE i.interiorcolorname = :interiorcolorname"),
    @NamedQuery(name = "Interiorcolorbean.findByProductcode", query = "SELECT i FROM Interiorcolorbean i WHERE i.productcode = :productcode"),
    @NamedQuery(name = "Interiorcolorbean.findByPrice", query = "SELECT i FROM Interiorcolorbean i WHERE i.price = :price"),
    @NamedQuery(name = "Interiorcolorbean.findByDescription", query = "SELECT i FROM Interiorcolorbean i WHERE i.description = :description"),
    @NamedQuery(name = "Interiorcolorbean.findByStatus", query = "SELECT i FROM Interiorcolorbean i WHERE i.status = :status")})
public class Interiorcolorbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "interiorcolorname")
    private String interiorcolorname;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Interiorcolorbean() {
    }

    public Interiorcolorbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInteriorcolorname() {
        return interiorcolorname;
    }

    public void setInteriorcolorname(String interiorcolorname) {
        this.interiorcolorname = interiorcolorname;
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
        if (!(object instanceof Interiorcolorbean)) {
            return false;
        }
        Interiorcolorbean other = (Interiorcolorbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Interiorcolorbean[ id=" + id + " ]";
    }
    
}
