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
@Table(name = "coverpaperbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coverpaperbean.findAll", query = "SELECT c FROM Coverpaperbean c"),
    @NamedQuery(name = "Coverpaperbean.findByCpId", query = "SELECT c FROM Coverpaperbean c WHERE c.cpId = :cpId"),
    @NamedQuery(name = "Coverpaperbean.findByCpName", query = "SELECT c FROM Coverpaperbean c WHERE c.cpName = :cpName"),
    @NamedQuery(name = "Coverpaperbean.findByDescription", query = "SELECT c FROM Coverpaperbean c WHERE c.description = :description"),
    @NamedQuery(name = "Coverpaperbean.findByStatus", query = "SELECT c FROM Coverpaperbean c WHERE c.status = :status"),
    @NamedQuery(name = "Coverpaperbean.findByDel", query = "SELECT c FROM Coverpaperbean c WHERE c.del = :del"),
    @NamedQuery(name = "Coverpaperbean.findByProductid", query = "SELECT c FROM Coverpaperbean c WHERE c.productid = :productid")})
public class Coverpaperbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "cpId")
    private String cpId;
    @Size(max = 250)
    @Column(name = "cpName")
    private String cpName;
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
    @Column(name = "productid")
    private String productid;

    public Coverpaperbean() {
    }

    public Coverpaperbean(String cpId) {
        this.cpId = cpId;
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
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

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpId != null ? cpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coverpaperbean)) {
            return false;
        }
        Coverpaperbean other = (Coverpaperbean) object;
        if ((this.cpId == null && other.cpId != null) || (this.cpId != null && !this.cpId.equals(other.cpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Coverpaperbean[ cpId=" + cpId + " ]";
    }
    
}
