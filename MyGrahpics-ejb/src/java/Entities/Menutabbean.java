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
@Table(name = "menutabbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menutabbean.findAll", query = "SELECT m FROM Menutabbean m"),
    @NamedQuery(name = "Menutabbean.findByMenuName", query = "SELECT m FROM Menutabbean m WHERE m.menuName = :menuName"),
    @NamedQuery(name = "Menutabbean.findByLink", query = "SELECT m FROM Menutabbean m WHERE m.link = :link"),
    @NamedQuery(name = "Menutabbean.findByStatus", query = "SELECT m FROM Menutabbean m WHERE m.status = :status")})
public class Menutabbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "menuName")
    private String menuName;
    @Size(max = 250)
    @Column(name = "link")
    private String link;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Menutabbean() {
    }

    public Menutabbean(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
        hash += (menuName != null ? menuName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menutabbean)) {
            return false;
        }
        Menutabbean other = (Menutabbean) object;
        if ((this.menuName == null && other.menuName != null) || (this.menuName != null && !this.menuName.equals(other.menuName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Menutabbean[ menuName=" + menuName + " ]";
    }
    
}
