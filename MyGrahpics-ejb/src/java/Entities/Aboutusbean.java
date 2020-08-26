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
@Table(name = "aboutusbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aboutusbean.findAll", query = "SELECT a FROM Aboutusbean a"),
    @NamedQuery(name = "Aboutusbean.findByAbtId", query = "SELECT a FROM Aboutusbean a WHERE a.abtId = :abtId"),
    @NamedQuery(name = "Aboutusbean.findByAbtUs", query = "SELECT a FROM Aboutusbean a WHERE a.abtUs = :abtUs"),
    @NamedQuery(name = "Aboutusbean.findByDescription", query = "SELECT a FROM Aboutusbean a WHERE a.description = :description"),
    @NamedQuery(name = "Aboutusbean.findByStatus", query = "SELECT a FROM Aboutusbean a WHERE a.status = :status"),
    @NamedQuery(name = "Aboutusbean.findByDel", query = "SELECT a FROM Aboutusbean a WHERE a.del = :del")})
public class Aboutusbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "abtId")
    private String abtId;
    @Size(max = 250)
    @Column(name = "abtUs")
    private String abtUs;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "del")
    private String del;

    public Aboutusbean() {
    }

    public Aboutusbean(String abtId) {
        this.abtId = abtId;
    }

    public String getAbtId() {
        return abtId;
    }

    public void setAbtId(String abtId) {
        this.abtId = abtId;
    }

    public String getAbtUs() {
        return abtUs;
    }

    public void setAbtUs(String abtUs) {
        this.abtUs = abtUs;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abtId != null ? abtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aboutusbean)) {
            return false;
        }
        Aboutusbean other = (Aboutusbean) object;
        if ((this.abtId == null && other.abtId != null) || (this.abtId != null && !this.abtId.equals(other.abtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Aboutusbean[ abtId=" + abtId + " ]";
    }
    
}
