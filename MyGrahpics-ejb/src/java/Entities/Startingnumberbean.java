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
@Table(name = "startingnumberbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Startingnumberbean.findAll", query = "SELECT s FROM Startingnumberbean s"),
    @NamedQuery(name = "Startingnumberbean.findById", query = "SELECT s FROM Startingnumberbean s WHERE s.id = :id"),
    @NamedQuery(name = "Startingnumberbean.findByStartingnub", query = "SELECT s FROM Startingnumberbean s WHERE s.startingnub = :startingnub"),
    @NamedQuery(name = "Startingnumberbean.findByProductcode", query = "SELECT s FROM Startingnumberbean s WHERE s.productcode = :productcode"),
    @NamedQuery(name = "Startingnumberbean.findByPrice", query = "SELECT s FROM Startingnumberbean s WHERE s.price = :price"),
    @NamedQuery(name = "Startingnumberbean.findByDescription", query = "SELECT s FROM Startingnumberbean s WHERE s.description = :description"),
    @NamedQuery(name = "Startingnumberbean.findByStatus", query = "SELECT s FROM Startingnumberbean s WHERE s.status = :status")})
public class Startingnumberbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "startingnub")
    private String startingnub;
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

    public Startingnumberbean() {
    }

    public Startingnumberbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartingnub() {
        return startingnub;
    }

    public void setStartingnub(String startingnub) {
        this.startingnub = startingnub;
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
        if (!(object instanceof Startingnumberbean)) {
            return false;
        }
        Startingnumberbean other = (Startingnumberbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Startingnumberbean[ id=" + id + " ]";
    }
    
}
