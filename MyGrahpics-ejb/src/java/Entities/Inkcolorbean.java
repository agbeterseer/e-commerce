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
@Table(name = "inkcolorbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inkcolorbean.findAll", query = "SELECT i FROM Inkcolorbean i"),
    @NamedQuery(name = "Inkcolorbean.findById", query = "SELECT i FROM Inkcolorbean i WHERE i.id = :id"),
    @NamedQuery(name = "Inkcolorbean.findByInkcolorname", query = "SELECT i FROM Inkcolorbean i WHERE i.inkcolorname = :inkcolorname"),
    @NamedQuery(name = "Inkcolorbean.findByProductid", query = "SELECT i FROM Inkcolorbean i WHERE i.productid = :productid"),
    @NamedQuery(name = "Inkcolorbean.findByStartingprice", query = "SELECT i FROM Inkcolorbean i WHERE i.startingprice = :startingprice"),
    @NamedQuery(name = "Inkcolorbean.findByDescription", query = "SELECT i FROM Inkcolorbean i WHERE i.description = :description"),
    @NamedQuery(name = "Inkcolorbean.findByStatus", query = "SELECT i FROM Inkcolorbean i WHERE i.status = :status")})
public class Inkcolorbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "inkcolorname")
    private String inkcolorname;
    @Size(max = 250)
    @Column(name = "productid")
    private String productid;
    @Size(max = 250)
    @Column(name = "startingprice")
    private String startingprice;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Inkcolorbean() {
    }

    public Inkcolorbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInkcolorname() {
        return inkcolorname;
    }

    public void setInkcolorname(String inkcolorname) {
        this.inkcolorname = inkcolorname;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getStartingprice() {
        return startingprice;
    }

    public void setStartingprice(String startingprice) {
        this.startingprice = startingprice;
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
        if (!(object instanceof Inkcolorbean)) {
            return false;
        }
        Inkcolorbean other = (Inkcolorbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Inkcolorbean[ id=" + id + " ]";
    }
    
}
