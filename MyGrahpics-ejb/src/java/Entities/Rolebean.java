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
@Table(name = "rolebean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolebean.findAll", query = "SELECT r FROM Rolebean r"),
    @NamedQuery(name = "Rolebean.findByRoleName", query = "SELECT r FROM Rolebean r WHERE r.roleName = :roleName"),
    @NamedQuery(name = "Rolebean.findByDefaultName", query = "SELECT r FROM Rolebean r WHERE r.defaultName = :defaultName"),
    @NamedQuery(name = "Rolebean.findByStatus", query = "SELECT r FROM Rolebean r WHERE r.status = :status")})
public class Rolebean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "roleName")
    private String roleName;
    @Size(max = 250)
    @Column(name = "defaultName")
    private String defaultName;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Rolebean() {
    }

    public Rolebean(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleName != null ? roleName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolebean)) {
            return false;
        }
        Rolebean other = (Rolebean) object;
        if ((this.roleName == null && other.roleName != null) || (this.roleName != null && !this.roleName.equals(other.roleName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Rolebean[ roleName=" + roleName + " ]";
    }
    
}
