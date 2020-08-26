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
@Table(name = "staffbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staffbean.findAll", query = "SELECT s FROM Staffbean s"),
    @NamedQuery(name = "Staffbean.findByUsername", query = "SELECT s FROM Staffbean s WHERE s.username = :username"),
    @NamedQuery(name = "Staffbean.findByFirstName", query = "SELECT s FROM Staffbean s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "Staffbean.findByLastName", query = "SELECT s FROM Staffbean s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "Staffbean.findByGender", query = "SELECT s FROM Staffbean s WHERE s.gender = :gender"),
    @NamedQuery(name = "Staffbean.findByPosition", query = "SELECT s FROM Staffbean s WHERE s.position = :position"),
    @NamedQuery(name = "Staffbean.findByNationality", query = "SELECT s FROM Staffbean s WHERE s.nationality = :nationality"),
    @NamedQuery(name = "Staffbean.findByStateOfOrigin", query = "SELECT s FROM Staffbean s WHERE s.stateOfOrigin = :stateOfOrigin"),
    @NamedQuery(name = "Staffbean.findByLga", query = "SELECT s FROM Staffbean s WHERE s.lga = :lga"),
    @NamedQuery(name = "Staffbean.findByHomeAddress", query = "SELECT s FROM Staffbean s WHERE s.homeAddress = :homeAddress"),
    @NamedQuery(name = "Staffbean.findByPhoneNumber", query = "SELECT s FROM Staffbean s WHERE s.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Staffbean.findByDateOfAppointment", query = "SELECT s FROM Staffbean s WHERE s.dateOfAppointment = :dateOfAppointment"),
    @NamedQuery(name = "Staffbean.findByDel", query = "SELECT s FROM Staffbean s WHERE s.del = :del")})
public class Staffbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "username")
    private String username;
    @Size(max = 250)
    @Column(name = "firstName")
    private String firstName;
    @Size(max = 250)
    @Column(name = "lastName")
    private String lastName;
    @Size(max = 250)
    @Column(name = "gender")
    private String gender;
    @Size(max = 250)
    @Column(name = "position")
    private String position;
    @Size(max = 250)
    @Column(name = "nationality")
    private String nationality;
    @Size(max = 250)
    @Column(name = "stateOfOrigin")
    private String stateOfOrigin;
    @Size(max = 250)
    @Column(name = "lga")
    private String lga;
    @Size(max = 250)
    @Column(name = "homeAddress")
    private String homeAddress;
    @Size(max = 250)
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Size(max = 250)
    @Column(name = "dateOfAppointment")
    private String dateOfAppointment;
    @Lob
    @Column(name = "passport")
    private byte[] passport;
    @Size(max = 250)
    @Column(name = "del")
    private String del;

    public Staffbean() {
    }

    public Staffbean(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public byte[] getPassport() {
        return passport;
    }

    public void setPassport(byte[] passport) {
        this.passport = passport;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
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
        if (!(object instanceof Staffbean)) {
            return false;
        }
        Staffbean other = (Staffbean) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Staffbean[ username=" + username + " ]";
    }
    
}
