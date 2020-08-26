/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JPT TERSOO AGBE
 */
@Entity
@Table(name = "billingbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billingbean.findAll", query = "SELECT b FROM Billingbean b"),
    @NamedQuery(name = "Billingbean.findByUsername", query = "SELECT b FROM Billingbean b WHERE b.username = :username"),
    @NamedQuery(name = "Billingbean.findByFirstname", query = "SELECT b FROM Billingbean b WHERE b.firstname = :firstname"),
    @NamedQuery(name = "Billingbean.findByLastname", query = "SELECT b FROM Billingbean b WHERE b.lastname = :lastname"),
    @NamedQuery(name = "Billingbean.findByEmail", query = "SELECT b FROM Billingbean b WHERE b.email = :email"),
    @NamedQuery(name = "Billingbean.findByTelephone", query = "SELECT b FROM Billingbean b WHERE b.telephone = :telephone"),
    @NamedQuery(name = "Billingbean.findByFax", query = "SELECT b FROM Billingbean b WHERE b.fax = :fax"),
    @NamedQuery(name = "Billingbean.findByCompany", query = "SELECT b FROM Billingbean b WHERE b.company = :company"),
    @NamedQuery(name = "Billingbean.findByAddress1", query = "SELECT b FROM Billingbean b WHERE b.address1 = :address1"),
    @NamedQuery(name = "Billingbean.findByAddress2", query = "SELECT b FROM Billingbean b WHERE b.address2 = :address2"),
    @NamedQuery(name = "Billingbean.findByCity", query = "SELECT b FROM Billingbean b WHERE b.city = :city"),
    @NamedQuery(name = "Billingbean.findByPostcode", query = "SELECT b FROM Billingbean b WHERE b.postcode = :postcode"),
    @NamedQuery(name = "Billingbean.findByCountry", query = "SELECT b FROM Billingbean b WHERE b.country = :country"),
    @NamedQuery(name = "Billingbean.findByRegion", query = "SELECT b FROM Billingbean b WHERE b.region = :region"),
    @NamedQuery(name = "Billingbean.findByProductid", query = "SELECT b FROM Billingbean b WHERE b.productid = :productid"),
    @NamedQuery(name = "Billingbean.findByPaymentmethod", query = "SELECT b FROM Billingbean b WHERE b.paymentmethod = :paymentmethod"),
    @NamedQuery(name = "Billingbean.findByDateoftransaction", query = "SELECT b FROM Billingbean b WHERE b.dateoftransaction = :dateoftransaction"),
    @NamedQuery(name = "Billingbean.findByInvoice", query = "SELECT b FROM Billingbean b WHERE b.invoice = :invoice"),
    @NamedQuery(name = "Billingbean.findByProperties1", query = "SELECT b FROM Billingbean b WHERE b.properties1 = :properties1")})
public class Billingbean implements Serializable {
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
    @Column(name = "productid")
    private String productid;
    @Size(max = 250)
    @Column(name = "paymentmethod")
    private String paymentmethod;
    @Size(max = 250)
    @Column(name = "dateoftransaction")
    private String dateoftransaction;
    @Size(max = 250)
    @Column(name = "invoice")
    private String invoice;
    @Size(max = 250)
    @Column(name = "properties1")
    private String properties1;

    public Billingbean() {
    }

    public Billingbean(String username) {
        this.username = username;
    }

    public Billingbean(String username, String dateoftransaction) {
        this.username = username;
        this.dateoftransaction = dateoftransaction;
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

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getDateoftransaction() {
        return dateoftransaction;
    }

    public void setDateoftransaction(String dateoftransaction) {
        this.dateoftransaction = dateoftransaction;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getProperties1() {
        return properties1;
    }

    public void setProperties1(String properties1) {
        this.properties1 = properties1;
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
        if (!(object instanceof Billingbean)) {
            return false;
        }
        Billingbean other = (Billingbean) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Billingbean[ username=" + username + " ]";
    }
    
}
