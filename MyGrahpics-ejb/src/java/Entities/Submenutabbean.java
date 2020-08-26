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
@Table(name = "submenutabbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Submenutabbean.findAll", query = "SELECT s FROM Submenutabbean s"),
    @NamedQuery(name = "Submenutabbean.findById", query = "SELECT s FROM Submenutabbean s WHERE s.id = :id"),
    @NamedQuery(name = "Submenutabbean.findByMenuId", query = "SELECT s FROM Submenutabbean s WHERE s.menuId = :menuId"),
    @NamedQuery(name = "Submenutabbean.findBySubmenu", query = "SELECT s FROM Submenutabbean s WHERE s.submenu = :submenu"),
    @NamedQuery(name = "Submenutabbean.findByLink", query = "SELECT s FROM Submenutabbean s WHERE s.link = :link"),
    @NamedQuery(name = "Submenutabbean.findByStatus", query = "SELECT s FROM Submenutabbean s WHERE s.status = :status")})
public class Submenutabbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "menuId")
    private String menuId;
    @Size(max = 250)
    @Column(name = "submenu")
    private String submenu;
    @Size(max = 250)
    @Column(name = "link")
    private String link;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Submenutabbean() {
    }

    public Submenutabbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Submenutabbean)) {
            return false;
        }
        Submenutabbean other = (Submenutabbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Submenutabbean[ id=" + id + " ]";
    }
    
}
