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
@Table(name = "hermsbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hermsbean.findAll", query = "SELECT h FROM Hermsbean h"),
    @NamedQuery(name = "Hermsbean.findById", query = "SELECT h FROM Hermsbean h WHERE h.id = :id"),
    @NamedQuery(name = "Hermsbean.findByHermsname", query = "SELECT h FROM Hermsbean h WHERE h.hermsname = :hermsname"),
    @NamedQuery(name = "Hermsbean.findByProductcode", query = "SELECT h FROM Hermsbean h WHERE h.productcode = :productcode"),
    @NamedQuery(name = "Hermsbean.findByPrice", query = "SELECT h FROM Hermsbean h WHERE h.price = :price"),
    @NamedQuery(name = "Hermsbean.findByDesceiption", query = "SELECT h FROM Hermsbean h WHERE h.desceiption = :desceiption"),
    @NamedQuery(name = "Hermsbean.findByStatus", query = "SELECT h FROM Hermsbean h WHERE h.status = :status"),
    @NamedQuery(name = "Hermsbean.findByEmail", query = "SELECT h FROM Hermsbean h WHERE h.email = :email"),
    @NamedQuery(name = "Hermsbean.findByFax", query = "SELECT h FROM Hermsbean h WHERE h.fax = :fax"),
    @NamedQuery(name = "Hermsbean.findByOfficeaddress", query = "SELECT h FROM Hermsbean h WHERE h.officeaddress = :officeaddress"),
    @NamedQuery(name = "Hermsbean.findBySkype", query = "SELECT h FROM Hermsbean h WHERE h.skype = :skype")})
public class Hermsbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "hermsname")
    private String hermsname;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "price")
    private String price;
    @Size(max = 250)
    @Column(name = "desceiption")
    private String desceiption;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "email")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "fax")
    private String fax;
    @Size(max = 250)
    @Column(name = "officeaddress")
    private String officeaddress;
    @Size(max = 250)
    @Column(name = "skype")
    private String skype;

    public Hermsbean() {
    }

    public Hermsbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHermsname() {
        return hermsname;
    }

    public void setHermsname(String hermsname) {
        this.hermsname = hermsname;
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

    public String getDesceiption() {
        return desceiption;
    }

    public void setDesceiption(String desceiption) {
        this.desceiption = desceiption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOfficeaddress() {
        return officeaddress;
    }

    public void setOfficeaddress(String officeaddress) {
        this.officeaddress = officeaddress;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
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
        if (!(object instanceof Hermsbean)) {
            return false;
        }
        Hermsbean other = (Hermsbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Hermsbean[ id=" + id + " ]";
    }
    
}
