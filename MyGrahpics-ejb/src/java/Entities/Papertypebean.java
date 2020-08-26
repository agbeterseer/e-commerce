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
@Table(name = "papertypebean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Papertypebean.findAll", query = "SELECT p FROM Papertypebean p"),
    @NamedQuery(name = "Papertypebean.findByPaperTypeId", query = "SELECT p FROM Papertypebean p WHERE p.paperTypeId = :paperTypeId"),
    @NamedQuery(name = "Papertypebean.findByPaperName", query = "SELECT p FROM Papertypebean p WHERE p.paperName = :paperName"),
    @NamedQuery(name = "Papertypebean.findByDescription", query = "SELECT p FROM Papertypebean p WHERE p.description = :description"),
    @NamedQuery(name = "Papertypebean.findByStatus", query = "SELECT p FROM Papertypebean p WHERE p.status = :status"),
    @NamedQuery(name = "Papertypebean.findByDel", query = "SELECT p FROM Papertypebean p WHERE p.del = :del"),
    @NamedQuery(name = "Papertypebean.findByProductName", query = "SELECT p FROM Papertypebean p WHERE p.productName = :productName"),
    @NamedQuery(name = "Papertypebean.findByPrice", query = "SELECT p FROM Papertypebean p WHERE p.price = :price")})
public class Papertypebean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "paperTypeId")
    private String paperTypeId;
    @Size(max = 250)
    @Column(name = "paperName")
    private String paperName;
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
    @Column(name = "productName")
    private String productName;
    @Size(max = 250)
    @Column(name = "price")
    private String price;

    public Papertypebean() {
    }

    public Papertypebean(String paperTypeId) {
        this.paperTypeId = paperTypeId;
    }

    public String getPaperTypeId() {
        return paperTypeId;
    }

    public void setPaperTypeId(String paperTypeId) {
        this.paperTypeId = paperTypeId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paperTypeId != null ? paperTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Papertypebean)) {
            return false;
        }
        Papertypebean other = (Papertypebean) object;
        if ((this.paperTypeId == null && other.paperTypeId != null) || (this.paperTypeId != null && !this.paperTypeId.equals(other.paperTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Papertypebean[ paperTypeId=" + paperTypeId + " ]";
    }
    
}
