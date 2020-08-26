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
import javax.persistence.Lob;
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
@Table(name = "initializeprodutsbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Initializeprodutsbean.findAll", query = "SELECT i FROM Initializeprodutsbean i"),
    @NamedQuery(name = "Initializeprodutsbean.findByProductName", query = "SELECT i FROM Initializeprodutsbean i WHERE i.productName = :productName"),
    @NamedQuery(name = "Initializeprodutsbean.findByProductStatus", query = "SELECT i FROM Initializeprodutsbean i WHERE i.productStatus = :productStatus"),
    @NamedQuery(name = "Initializeprodutsbean.findByProductDefaultPrice", query = "SELECT i FROM Initializeprodutsbean i WHERE i.productDefaultPrice = :productDefaultPrice"),
    @NamedQuery(name = "Initializeprodutsbean.findByDefaultpage", query = "SELECT i FROM Initializeprodutsbean i WHERE i.defaultpage = :defaultpage")})
public class Initializeprodutsbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "productName")
    private String productName;
    @Size(max = 250)
    @Column(name = "productStatus")
    private String productStatus;
    @Size(max = 250)
    @Column(name = "productDefaultPrice")
    private String productDefaultPrice;
    @Size(max = 250)
    @Column(name = "defaultpage")
    private String defaultpage;
    @Lob
    @Column(name = "pix")
    private byte[] pix;

    public Initializeprodutsbean() {
    }

    public Initializeprodutsbean(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductDefaultPrice() {
        return productDefaultPrice;
    }

    public void setProductDefaultPrice(String productDefaultPrice) {
        this.productDefaultPrice = productDefaultPrice;
    }

    public String getDefaultpage() {
        return defaultpage;
    }

    public void setDefaultpage(String defaultpage) {
        this.defaultpage = defaultpage;
    }

    public byte[] getPix() {
        return pix;
    }

    public void setPix(byte[] pix) {
        this.pix = pix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productName != null ? productName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Initializeprodutsbean)) {
            return false;
        }
        Initializeprodutsbean other = (Initializeprodutsbean) object;
        if ((this.productName == null && other.productName != null) || (this.productName != null && !this.productName.equals(other.productName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Initializeprodutsbean[ productName=" + productName + " ]";
    }
    
}
