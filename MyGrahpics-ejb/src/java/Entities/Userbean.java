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
@Table(name = "userbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userbean.findAll", query = "SELECT u FROM Userbean u"),
    @NamedQuery(name = "Userbean.findByUsername", query = "SELECT u FROM Userbean u WHERE u.username = :username"),
    @NamedQuery(name = "Userbean.authenticate", query = "SELECT u FROM Userbean u WHERE u.username = :username AND u.password = :password"),
    @NamedQuery(name = "Userbean.findByPassword", query = "SELECT u FROM Userbean u WHERE u.password = :password"),
    @NamedQuery(name = "Userbean.findByRole", query = "SELECT u FROM Userbean u WHERE u.role = :role"),
    @NamedQuery(name = "Userbean.findByStatus", query = "SELECT u FROM Userbean u WHERE u.status = :status")})
public class Userbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "username")
    private String username;
    @Size(max = 250)
    @Column(name = "password")
    private String password;
    @Size(max = 250)
    @Column(name = "role")
    private String role;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Userbean() {
    }

    public Userbean(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userbean)) {
            return false;
        }
        Userbean other = (Userbean) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Userbean[ username=" + username + " ]";
    }
    
}
