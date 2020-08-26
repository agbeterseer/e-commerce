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
@Table(name = "contactusbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactusbean.findAll", query = "SELECT c FROM Contactusbean c"),
    @NamedQuery(name = "Contactusbean.findByCuId", query = "SELECT c FROM Contactusbean c WHERE c.cuId = :cuId"),
    @NamedQuery(name = "Contactusbean.findByCus", query = "SELECT c FROM Contactusbean c WHERE c.cus = :cus"),
    @NamedQuery(name = "Contactusbean.findByDescription", query = "SELECT c FROM Contactusbean c WHERE c.description = :description"),
    @NamedQuery(name = "Contactusbean.findByStatus", query = "SELECT c FROM Contactusbean c WHERE c.status = :status"),
    @NamedQuery(name = "Contactusbean.findByDel", query = "SELECT c FROM Contactusbean c WHERE c.del = :del"),
    @NamedQuery(name = "Contactusbean.findByStreet", query = "SELECT c FROM Contactusbean c WHERE c.street = :street"),
    @NamedQuery(name = "Contactusbean.findByStates", query = "SELECT c FROM Contactusbean c WHERE c.states = :states"),
    @NamedQuery(name = "Contactusbean.findByCity", query = "SELECT c FROM Contactusbean c WHERE c.city = :city"),
    @NamedQuery(name = "Contactusbean.findByCountry", query = "SELECT c FROM Contactusbean c WHERE c.country = :country")})
public class Contactusbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "cuId")
    private String cuId;
    @Size(max = 250)
    @Column(name = "cus")
    private String cus;
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
    @Column(name = "street")
    private String street;
    @Size(max = 250)
    @Column(name = "states")
    private String states;
    @Size(max = 250)
    @Column(name = "city")
    private String city;
    @Size(max = 250)
    @Column(name = "country")
    private String country;

    public Contactusbean() {
    }

    public Contactusbean(String cuId) {
        this.cuId = cuId;
    }

    public String getCuId() {
        return cuId;
    }

    public void setCuId(String cuId) {
        this.cuId = cuId;
    }

    public String getCus() {
        return cus;
    }

    public void setCus(String cus) {
        this.cus = cus;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuId != null ? cuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactusbean)) {
            return false;
        }
        Contactusbean other = (Contactusbean) object;
        if ((this.cuId == null && other.cuId != null) || (this.cuId != null && !this.cuId.equals(other.cuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Contactusbean[ cuId=" + cuId + " ]";
    }
    
}
