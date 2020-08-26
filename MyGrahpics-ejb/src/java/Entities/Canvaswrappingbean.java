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
@Table(name = "canvaswrappingbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canvaswrappingbean.findAll", query = "SELECT c FROM Canvaswrappingbean c"),
    @NamedQuery(name = "Canvaswrappingbean.findById", query = "SELECT c FROM Canvaswrappingbean c WHERE c.id = :id"),
    @NamedQuery(name = "Canvaswrappingbean.findByCanvaswrappingname", query = "SELECT c FROM Canvaswrappingbean c WHERE c.canvaswrappingname = :canvaswrappingname"),
    @NamedQuery(name = "Canvaswrappingbean.findByProductcode", query = "SELECT c FROM Canvaswrappingbean c WHERE c.productcode = :productcode"),
    @NamedQuery(name = "Canvaswrappingbean.findByPrice", query = "SELECT c FROM Canvaswrappingbean c WHERE c.price = :price"),
    @NamedQuery(name = "Canvaswrappingbean.findByDescription", query = "SELECT c FROM Canvaswrappingbean c WHERE c.description = :description"),
    @NamedQuery(name = "Canvaswrappingbean.findByStatus", query = "SELECT c FROM Canvaswrappingbean c WHERE c.status = :status")})
public class Canvaswrappingbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "canvaswrappingname")
    private String canvaswrappingname;
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

    public Canvaswrappingbean() {
    }

    public Canvaswrappingbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCanvaswrappingname() {
        return canvaswrappingname;
    }

    public void setCanvaswrappingname(String canvaswrappingname) {
        this.canvaswrappingname = canvaswrappingname;
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
        if (!(object instanceof Canvaswrappingbean)) {
            return false;
        }
        Canvaswrappingbean other = (Canvaswrappingbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Canvaswrappingbean[ id=" + id + " ]";
    }
    
}
