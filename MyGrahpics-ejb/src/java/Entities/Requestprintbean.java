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
@Table(name = "requestprintbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requestprintbean.findAll", query = "SELECT r FROM Requestprintbean r"),
    @NamedQuery(name = "Requestprintbean.findByRpId", query = "SELECT r FROM Requestprintbean r WHERE r.rpId = :rpId"),
    @NamedQuery(name = "Requestprintbean.findByName", query = "SELECT r FROM Requestprintbean r WHERE r.name = :name"),
    @NamedQuery(name = "Requestprintbean.findByCompanyName", query = "SELECT r FROM Requestprintbean r WHERE r.companyName = :companyName"),
    @NamedQuery(name = "Requestprintbean.findByPhone", query = "SELECT r FROM Requestprintbean r WHERE r.phone = :phone"),
    @NamedQuery(name = "Requestprintbean.findByEmail", query = "SELECT r FROM Requestprintbean r WHERE r.email = :email"),
    @NamedQuery(name = "Requestprintbean.findByWebsite", query = "SELECT r FROM Requestprintbean r WHERE r.website = :website"),
    @NamedQuery(name = "Requestprintbean.findByDescription", query = "SELECT r FROM Requestprintbean r WHERE r.description = :description"),
    @NamedQuery(name = "Requestprintbean.findByStatus", query = "SELECT r FROM Requestprintbean r WHERE r.status = :status"),
    @NamedQuery(name = "Requestprintbean.findByVCode", query = "SELECT r FROM Requestprintbean r WHERE r.vCode = :vCode")})
public class Requestprintbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "rpId")
    private String rpId;
    @Size(max = 250)
    @Column(name = "name")
    private String name;
    @Size(max = 250)
    @Column(name = "companyName")
    private String companyName;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "phone")
    private String phone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "email")
    private String email;
    @Size(max = 250)
    @Column(name = "website")
    private String website;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "pix")
    private byte[] pix;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "vCode")
    private String vCode;

    public Requestprintbean() {
    }

    public Requestprintbean(String rpId) {
        this.rpId = rpId;
    }

    public String getRpId() {
        return rpId;
    }

    public void setRpId(String rpId) {
        this.rpId = rpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPix() {
        return pix;
    }

    public void setPix(byte[] pix) {
        this.pix = pix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVCode() {
        return vCode;
    }

    public void setVCode(String vCode) {
        this.vCode = vCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rpId != null ? rpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requestprintbean)) {
            return false;
        }
        Requestprintbean other = (Requestprintbean) object;
        if ((this.rpId == null && other.rpId != null) || (this.rpId != null && !this.rpId.equals(other.rpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Requestprintbean[ rpId=" + rpId + " ]";
    }
    
}
