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
@Table(name = "canvasprintingbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canvasprintingbean.findAll", query = "SELECT c FROM Canvasprintingbean c"),
    @NamedQuery(name = "Canvasprintingbean.findByCode", query = "SELECT c FROM Canvasprintingbean c WHERE c.code = :code"),
    @NamedQuery(name = "Canvasprintingbean.findByCanvasprint", query = "SELECT c FROM Canvasprintingbean c WHERE c.canvasprint = :canvasprint"),
    @NamedQuery(name = "Canvasprintingbean.findByPrice", query = "SELECT c FROM Canvasprintingbean c WHERE c.price = :price"),
    @NamedQuery(name = "Canvasprintingbean.findByDescription", query = "SELECT c FROM Canvasprintingbean c WHERE c.description = :description"),
    @NamedQuery(name = "Canvasprintingbean.findByStatus", query = "SELECT c FROM Canvasprintingbean c WHERE c.status = :status"),
    @NamedQuery(name = "Canvasprintingbean.findByProductcode", query = "SELECT c FROM Canvasprintingbean c WHERE c.productcode = :productcode")})
public class Canvasprintingbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Size(max = 250)
    @Column(name = "canvasprint")
    private String canvasprint;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;

    public Canvasprintingbean() {
    }

    public Canvasprintingbean(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCanvasprint() {
        return canvasprint;
    }

    public void setCanvasprint(String canvasprint) {
        this.canvasprint = canvasprint;
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
        if (!(object instanceof Canvasprintingbean)) {
            return false;
        }
        Canvasprintingbean other = (Canvasprintingbean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Canvasprintingbean[ code=" + code + " ]";
    }
    
}
