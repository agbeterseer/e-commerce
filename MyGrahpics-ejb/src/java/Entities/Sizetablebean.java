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
@Table(name = "sizetablebean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sizetablebean.findAll", query = "SELECT s FROM Sizetablebean s"),
    @NamedQuery(name = "Sizetablebean.findByCode", query = "SELECT s FROM Sizetablebean s WHERE s.code = :code"),
    @NamedQuery(name = "Sizetablebean.findBySizetab", query = "SELECT s FROM Sizetablebean s WHERE s.sizetab = :sizetab"),
    @NamedQuery(name = "Sizetablebean.findByDescription", query = "SELECT s FROM Sizetablebean s WHERE s.description = :description"),
    @NamedQuery(name = "Sizetablebean.findByStatus", query = "SELECT s FROM Sizetablebean s WHERE s.status = :status"),
    @NamedQuery(name = "Sizetablebean.findByProductcode", query = "SELECT s FROM Sizetablebean s WHERE s.productcode = :productcode"),
    @NamedQuery(name = "Sizetablebean.findByPrice", query = "SELECT s FROM Sizetablebean s WHERE s.price = :price"),
    @NamedQuery(name = "Sizetablebean.findByPagecost", query = "SELECT s FROM Sizetablebean s WHERE s.pagecost = :pagecost"),
    @NamedQuery(name = "Sizetablebean.findByMinpages", query = "SELECT s FROM Sizetablebean s WHERE s.minpages = :minpages"),
    @NamedQuery(name = "Sizetablebean.findByMinorder", query = "SELECT s FROM Sizetablebean s WHERE s.minorder = :minorder")})
public class Sizetablebean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Size(max = 250)
    @Column(name = "sizetab")
    private String sizetab;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "pagecost")
    private String pagecost;
    @Size(max = 250)
    @Column(name = "minpages")
    private String minpages;
    @Size(max = 250)
    @Column(name = "minorder")
    private String minorder;

    public Sizetablebean() {
    }

    public Sizetablebean(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSizetab() {
        return sizetab;
    }

    public void setSizetab(String sizetab) {
        this.sizetab = sizetab;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPagecost() {
        return pagecost;
    }

    public void setPagecost(String pagecost) {
        this.pagecost = pagecost;
    }

    public String getMinpages() {
        return minpages;
    }

    public void setMinpages(String minpages) {
        this.minpages = minpages;
    }

    public String getMinorder() {
        return minorder;
    }

    public void setMinorder(String minorder) {
        this.minorder = minorder;
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
        if (!(object instanceof Sizetablebean)) {
            return false;
        }
        Sizetablebean other = (Sizetablebean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Sizetablebean[ code=" + code + " ]";
    }
    
}
