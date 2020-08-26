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
@Table(name = "pagestabbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagestabbean.findAll", query = "SELECT p FROM Pagestabbean p"),
    @NamedQuery(name = "Pagestabbean.findByPageId", query = "SELECT p FROM Pagestabbean p WHERE p.pageId = :pageId"),
    @NamedQuery(name = "Pagestabbean.findByPageNumber", query = "SELECT p FROM Pagestabbean p WHERE p.pageNumber = :pageNumber"),
    @NamedQuery(name = "Pagestabbean.findByStatus", query = "SELECT p FROM Pagestabbean p WHERE p.status = :status"),
    @NamedQuery(name = "Pagestabbean.findByDel", query = "SELECT p FROM Pagestabbean p WHERE p.del = :del"),
    @NamedQuery(name = "Pagestabbean.findByPrice", query = "SELECT p FROM Pagestabbean p WHERE p.price = :price"),
    @NamedQuery(name = "Pagestabbean.findByProductid", query = "SELECT p FROM Pagestabbean p WHERE p.productid = :productid"),
    @NamedQuery(name = "Pagestabbean.findByPagename", query = "SELECT p FROM Pagestabbean p WHERE p.pagename = :pagename")})
public class Pagestabbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "pageId")
    private String pageId;
    @Size(max = 250)
    @Column(name = "pageNumber")
    private String pageNumber;
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
    @Size(max = 250)
    @Column(name = "pagename")
    private String pagename;

    public Pagestabbean() {
    }

    public Pagestabbean(String pageId) {
        this.pageId = pageId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
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

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageId != null ? pageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagestabbean)) {
            return false;
        }
        Pagestabbean other = (Pagestabbean) object;
        if ((this.pageId == null && other.pageId != null) || (this.pageId != null && !this.pageId.equals(other.pageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Pagestabbean[ pageId=" + pageId + " ]";
    }
    
}
