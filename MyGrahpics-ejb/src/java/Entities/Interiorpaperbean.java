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
@Table(name = "interiorpaperbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interiorpaperbean.findAll", query = "SELECT i FROM Interiorpaperbean i"),
    @NamedQuery(name = "Interiorpaperbean.findById", query = "SELECT i FROM Interiorpaperbean i WHERE i.id = :id"),
    @NamedQuery(name = "Interiorpaperbean.findByInteriorpapername", query = "SELECT i FROM Interiorpaperbean i WHERE i.interiorpapername = :interiorpapername"),
    @NamedQuery(name = "Interiorpaperbean.findByProdcutcode", query = "SELECT i FROM Interiorpaperbean i WHERE i.prodcutcode = :prodcutcode"),
    @NamedQuery(name = "Interiorpaperbean.findByPrice", query = "SELECT i FROM Interiorpaperbean i WHERE i.price = :price"),
    @NamedQuery(name = "Interiorpaperbean.findByDescription", query = "SELECT i FROM Interiorpaperbean i WHERE i.description = :description"),
    @NamedQuery(name = "Interiorpaperbean.findByStatus", query = "SELECT i FROM Interiorpaperbean i WHERE i.status = :status")})
public class Interiorpaperbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "interiorpapername")
    private String interiorpapername;
    @Size(max = 250)
    @Column(name = "prodcutcode")
    private String prodcutcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Interiorpaperbean() {
    }

    public Interiorpaperbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInteriorpapername() {
        return interiorpapername;
    }

    public void setInteriorpapername(String interiorpapername) {
        this.interiorpapername = interiorpapername;
    }

    public String getProdcutcode() {
        return prodcutcode;
    }

    public void setProdcutcode(String prodcutcode) {
        this.prodcutcode = prodcutcode;
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
        if (!(object instanceof Interiorpaperbean)) {
            return false;
        }
        Interiorpaperbean other = (Interiorpaperbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Interiorpaperbean[ id=" + id + " ]";
    }
    
}
