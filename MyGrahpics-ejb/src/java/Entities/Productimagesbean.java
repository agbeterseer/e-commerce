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
@Table(name = "productimagesbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productimagesbean.findAll", query = "SELECT p FROM Productimagesbean p"),
    @NamedQuery(name = "Productimagesbean.findByCode", query = "SELECT p FROM Productimagesbean p WHERE p.code = :code"),
    @NamedQuery(name = "Productimagesbean.findByStartPrice", query = "SELECT p FROM Productimagesbean p WHERE p.startprice = :startprice"),
@NamedQuery(name = "Productimagesbean.findByProductCode", query = "SELECT p FROM Productimagesbean p WHERE p.productcode = :productcode")})
public class Productimagesbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Lob
    @Column(name = "pix")
    private byte[] pix;
    
     @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    
    @Size(max = 250)
    @Column(name = "startprice")
    private String startprice;

    public Productimagesbean() {
    }

    public Productimagesbean(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public byte[] getPix() {
        return pix;
    }

    public void setPix(byte[] pix) {
        this.pix = pix;
    }
    
     public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productimagesbean)) {
            return false;
        }
        Productimagesbean other = (Productimagesbean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Productimagesbean[ code=" + code + " ]";
    }

    public String getStartprice() {
        return startprice;
    }

    public void setStartprice(String startprice) {
        this.startprice = startprice;
    }

   
    
}
