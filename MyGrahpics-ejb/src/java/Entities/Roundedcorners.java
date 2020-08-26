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
@Table(name = "roundedcorners")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roundedcorners.findAll", query = "SELECT r FROM Roundedcorners r"),
    @NamedQuery(name = "Roundedcorners.findById", query = "SELECT r FROM Roundedcorners r WHERE r.id = :id"),
    @NamedQuery(name = "Roundedcorners.findByRdcorners", query = "SELECT r FROM Roundedcorners r WHERE r.rdcorners = :rdcorners"),
    @NamedQuery(name = "Roundedcorners.findByProductcode", query = "SELECT r FROM Roundedcorners r WHERE r.productcode = :productcode"),
    @NamedQuery(name = "Roundedcorners.findByPrice", query = "SELECT r FROM Roundedcorners r WHERE r.price = :price"),
    @NamedQuery(name = "Roundedcorners.findByDescription", query = "SELECT r FROM Roundedcorners r WHERE r.description = :description"),
    @NamedQuery(name = "Roundedcorners.findByStatus", query = "SELECT r FROM Roundedcorners r WHERE r.status = :status")})
public class Roundedcorners implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "rdcorners")
    private String rdcorners;
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

    public Roundedcorners() {
    }

    public Roundedcorners(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRdcorners() {
        return rdcorners;
    }

    public void setRdcorners(String rdcorners) {
        this.rdcorners = rdcorners;
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
        if (!(object instanceof Roundedcorners)) {
            return false;
        }
        Roundedcorners other = (Roundedcorners) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Roundedcorners[ id=" + id + " ]";
    }
    
}
