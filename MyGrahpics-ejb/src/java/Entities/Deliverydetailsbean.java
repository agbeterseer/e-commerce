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
@Table(name = "deliverydetailsbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deliverydetailsbean.findAll", query = "SELECT d FROM Deliverydetailsbean d"),
    @NamedQuery(name = "Deliverydetailsbean.findByUsername", query = "SELECT d FROM Deliverydetailsbean d WHERE d.username = :username"),
    @NamedQuery(name = "Deliverydetailsbean.findByFirstname", query = "SELECT d FROM Deliverydetailsbean d WHERE d.firstname = :firstname"),
    @NamedQuery(name = "Deliverydetailsbean.findByLastname", query = "SELECT d FROM Deliverydetailsbean d WHERE d.lastname = :lastname"),
    @NamedQuery(name = "Deliverydetailsbean.findByEmail", query = "SELECT d FROM Deliverydetailsbean d WHERE d.email = :email"),
    @NamedQuery(name = "Deliverydetailsbean.findByTelephone", query = "SELECT d FROM Deliverydetailsbean d WHERE d.telephone = :telephone"),
    @NamedQuery(name = "Deliverydetailsbean.findByFax", query = "SELECT d FROM Deliverydetailsbean d WHERE d.fax = :fax"),
    @NamedQuery(name = "Deliverydetailsbean.findByCompany", query = "SELECT d FROM Deliverydetailsbean d WHERE d.company = :company"),
    @NamedQuery(name = "Deliverydetailsbean.findByAddress1", query = "SELECT d FROM Deliverydetailsbean d WHERE d.address1 = :address1"),
    @NamedQuery(name = "Deliverydetailsbean.findByAddress2", query = "SELECT d FROM Deliverydetailsbean d WHERE d.address2 = :address2"),
    @NamedQuery(name = "Deliverydetailsbean.findByCity", query = "SELECT d FROM Deliverydetailsbean d WHERE d.city = :city"),
    @NamedQuery(name = "Deliverydetailsbean.findByPostcode", query = "SELECT d FROM Deliverydetailsbean d WHERE d.postcode = :postcode"),
    @NamedQuery(name = "Deliverydetailsbean.findByCountry", query = "SELECT d FROM Deliverydetailsbean d WHERE d.country = :country"),
    @NamedQuery(name = "Deliverydetailsbean.findByRegion", query = "SELECT d FROM Deliverydetailsbean d WHERE d.region = :region"),
    @NamedQuery(name = "Deliverydetailsbean.findByDeliverymethod", query = "SELECT d FROM Deliverydetailsbean d WHERE d.deliverymethod = :deliverymethod"),
    @NamedQuery(name = "Deliverydetailsbean.findByPaymentmethod", query = "SELECT d FROM Deliverydetailsbean d WHERE d.paymentmethod = :paymentmethod"),
    @NamedQuery(name = "Deliverydetailsbean.findByDeliverycomment", query = "SELECT d FROM Deliverydetailsbean d WHERE d.deliverycomment = :deliverycomment"),
    @NamedQuery(name = "Deliverydetailsbean.findByPaymentcomment", query = "SELECT d FROM Deliverydetailsbean d WHERE d.paymentcomment = :paymentcomment"),
    @NamedQuery(name = "Deliverydetailsbean.findByShippment", query = "SELECT d FROM Deliverydetailsbean d WHERE d.shippment = :shippment")})
public class Deliverydetailsbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "username")
    private String username;
    @Size(max = 250)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 250)
    @Column(name = "lastname")
    private String lastname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "email")
    private String email;
    @Size(max = 250)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "fax")
    private String fax;
    @Size(max = 250)
    @Column(name = "company")
    private String company;
    @Size(max = 250)
    @Column(name = "address1")
    private String address1;
    @Size(max = 250)
    @Column(name = "address2")
    private String address2;
    @Size(max = 250)
    @Column(name = "city")
    private String city;
    @Size(max = 250)
    @Column(name = "postcode")
    private String postcode;
    @Size(max = 250)
    @Column(name = "country")
    private String country;
    @Size(max = 250)
    @Column(name = "region")
    private String region;
    @Size(max = 250)
    @Column(name = "deliverymethod")
    private String deliverymethod;
    @Size(max = 250)
    @Column(name = "paymentmethod")
    private String paymentmethod;
    @Size(max = 250)
    @Column(name = "deliverycomment")
    private String deliverycomment;
    @Size(max = 250)
    @Column(name = "paymentcomment")
    private String paymentcomment;
    @Size(max = 250)
    @Column(name = "shippment")
    private String shippment;

    public Deliverydetailsbean() {
    }

    public Deliverydetailsbean(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDeliverymethod() {
        return deliverymethod;
    }

    public void setDeliverymethod(String deliverymethod) {
        this.deliverymethod = deliverymethod;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getDeliverycomment() {
        return deliverycomment;
    }

    public void setDeliverycomment(String deliverycomment) {
        this.deliverycomment = deliverycomment;
    }

    public String getPaymentcomment() {
        return paymentcomment;
    }

    public void setPaymentcomment(String paymentcomment) {
        this.paymentcomment = paymentcomment;
    }

    public String getShippment() {
        return shippment;
    }

    public void setShippment(String shippment) {
        this.shippment = shippment;
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
        if (!(object instanceof Deliverydetailsbean)) {
            return false;
        }
        Deliverydetailsbean other = (Deliverydetailsbean) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Deliverydetailsbean[ username=" + username + " ]";
    }
    
}
