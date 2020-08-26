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
@Table(name = "quantitybean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quantitybean.findAll", query = "SELECT q FROM Quantitybean q"),
    @NamedQuery(name = "Quantitybean.findByQytId", query = "SELECT q FROM Quantitybean q WHERE q.qytId = :qytId"),
    @NamedQuery(name = "Quantitybean.findByQty", query = "SELECT q FROM Quantitybean q WHERE q.qty = :qty"),
    @NamedQuery(name = "Quantitybean.findByDescription", query = "SELECT q FROM Quantitybean q WHERE q.description = :description"),
    @NamedQuery(name = "Quantitybean.findByStatus", query = "SELECT q FROM Quantitybean q WHERE q.status = :status"),
    @NamedQuery(name = "Quantitybean.findByDel", query = "SELECT q FROM Quantitybean q WHERE q.del = :del"),
    @NamedQuery(name = "Quantitybean.findByProductcode", query = "SELECT q FROM Quantitybean q WHERE q.productcode = :productcode")})
public class Quantitybean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "qytId")
    private String qytId;
    @Size(max = 250)
    @Column(name = "qty")
    private String qty;
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
    @Column(name = "productcode")
    private String productcode;

    public Quantitybean() {
    }

    public Quantitybean(String qytId) {
        this.qytId = qytId;
    }

    public String getQytId() {
        return qytId;
    }

    public void setQytId(String qytId) {
        this.qytId = qytId;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
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

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qytId != null ? qytId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quantitybean)) {
            return false;
        }
        Quantitybean other = (Quantitybean) object;
        if ((this.qytId == null && other.qytId != null) || (this.qytId != null && !this.qytId.equals(other.qytId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Quantitybean[ qytId=" + qytId + " ]";
    }
    
}
