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
import javax.persistence.Lob;
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
@Table(name = "customersbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customersbean.findAll", query = "SELECT c FROM Customersbean c"),
    @NamedQuery(name = "Customersbean.findByCustomerId", query = "SELECT c FROM Customersbean c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customersbean.findByFirstname", query = "SELECT c FROM Customersbean c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "Customersbean.findByLastname", query = "SELECT c FROM Customersbean c WHERE c.lastname = :lastname"),
    @NamedQuery(name = "Customersbean.findByGender", query = "SELECT c FROM Customersbean c WHERE c.gender = :gender"),
    @NamedQuery(name = "Customersbean.findByHomeaddress", query = "SELECT c FROM Customersbean c WHERE c.homeaddress = :homeaddress"),
    @NamedQuery(name = "Customersbean.findByShippingaddress", query = "SELECT c FROM Customersbean c WHERE c.shippingaddress = :shippingaddress"),
    @NamedQuery(name = "Customersbean.findByPhonenumber", query = "SELECT c FROM Customersbean c WHERE c.phonenumber = :phonenumber"),
    @NamedQuery(name = "Customersbean.findByStateoforgin", query = "SELECT c FROM Customersbean c WHERE c.stateoforgin = :stateoforgin"),
    @NamedQuery(name = "Customersbean.findByLga", query = "SELECT c FROM Customersbean c WHERE c.lga = :lga"),
    @NamedQuery(name = "Customersbean.findByLandmark", query = "SELECT c FROM Customersbean c WHERE c.landmark = :landmark"),
    @NamedQuery(name = "Customersbean.findByStatus", query = "SELECT c FROM Customersbean c WHERE c.status = :status"),
    @NamedQuery(name = "Customersbean.findByCity", query = "SELECT c FROM Customersbean c WHERE c.city = :city"),
    @NamedQuery(name = "Customersbean.findByTown", query = "SELECT c FROM Customersbean c WHERE c.town = :town")})
public class Customersbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "customerId")
    private String customerId;
    @Size(max = 250)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 250)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 250)
    @Column(name = "gender")
    private String gender;
    @Size(max = 250)
    @Column(name = "homeaddress")
    private String homeaddress;
    @Size(max = 250)
    @Column(name = "shippingaddress")
    private String shippingaddress;
    @Size(max = 250)
    @Column(name = "phonenumber")
    private String phonenumber;
    @Size(max = 250)
    @Column(name = "stateoforgin")
    private String stateoforgin;
    @Size(max = 250)
    @Column(name = "lga")
    private String lga;
    @Size(max = 250)
    @Column(name = "landmark")
    private String landmark;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "city")
    private String city;
    @Size(max = 250)
    @Column(name = "town")
    private String town;
    @Size(max = 250)
    @Column(name = "postcode")
    private String postcode;
    @Lob
    @Column(name = "passport")
    private byte[] passport;

    public Customersbean() {
    }

    public Customersbean(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getShippingaddress() {
        return shippingaddress;
    }

    public void setShippingaddress(String shippingaddress) {
        this.shippingaddress = shippingaddress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStateoforgin() {
        return stateoforgin;
    }

    public void setStateoforgin(String stateoforgin) {
        this.stateoforgin = stateoforgin;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public byte[] getPassport() {
        return passport;
    }

    public void setPassport(byte[] passport) {
        this.passport = passport;
    }
      public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customersbean)) {
            return false;
        }
        Customersbean other = (Customersbean) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Customersbean[ customerId=" + customerId + " ]";
    }

  
    
}
