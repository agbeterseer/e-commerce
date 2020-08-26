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
@Table(name = "printturnarroundbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Printturnarroundbean.findAll", query = "SELECT p FROM Printturnarroundbean p"),
    @NamedQuery(name = "Printturnarroundbean.findById", query = "SELECT p FROM Printturnarroundbean p WHERE p.id = :id"),
    @NamedQuery(name = "Printturnarroundbean.findByPrintType", query = "SELECT p FROM Printturnarroundbean p WHERE p.printType = :printType"),
    @NamedQuery(name = "Printturnarroundbean.findByStatus", query = "SELECT p FROM Printturnarroundbean p WHERE p.status = :status"),
    @NamedQuery(name = "Printturnarroundbean.findByDel", query = "SELECT p FROM Printturnarroundbean p WHERE p.del = :del"),
    @NamedQuery(name = "Printturnarroundbean.findByPrice", query = "SELECT p FROM Printturnarroundbean p WHERE p.price = :price"),
    @NamedQuery(name = "Printturnarroundbean.findByProductid", query = "SELECT p FROM Printturnarroundbean p WHERE p.productid = :productid")})
public class Printturnarroundbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "printType")
    private String printType;
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

    public Printturnarroundbean() {
    }

    public Printturnarroundbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Printturnarroundbean)) {
            return false;
        }
        Printturnarroundbean other = (Printturnarroundbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Printturnarroundbean[ id=" + id + " ]";
    }
    
}
