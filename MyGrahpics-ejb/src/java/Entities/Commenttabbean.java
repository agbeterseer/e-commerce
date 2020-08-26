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
@Table(name = "commenttabbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commenttabbean.findAll", query = "SELECT c FROM Commenttabbean c"),
    @NamedQuery(name = "Commenttabbean.findById", query = "SELECT c FROM Commenttabbean c WHERE c.id = :id"),
    @NamedQuery(name = "Commenttabbean.findByName", query = "SELECT c FROM Commenttabbean c WHERE c.name = :name"),
    @NamedQuery(name = "Commenttabbean.findByEmail", query = "SELECT c FROM Commenttabbean c WHERE c.email = :email"),
    @NamedQuery(name = "Commenttabbean.findByMessages", query = "SELECT c FROM Commenttabbean c WHERE c.messages = :messages"),
    @NamedQuery(name = "Commenttabbean.findByStatus", query = "SELECT c FROM Commenttabbean c WHERE c.status = :status"),
    @NamedQuery(name = "Commenttabbean.findByPostcode", query = "SELECT c FROM Commenttabbean c WHERE c.postcode = :postcode"),
    @NamedQuery(name = "Commenttabbean.findBySubcommentcode", query = "SELECT c FROM Commenttabbean c WHERE c.subcommentcode = :subcommentcode"),
    @NamedQuery(name = "Commenttabbean.findByPostdate", query = "SELECT c FROM Commenttabbean c WHERE c.postdate = :postdate")})
public class Commenttabbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 250)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 250)
    @Column(name = "email")
    private String email;
    @Size(max = 250)
    @Column(name = "messages")
    private String messages;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "postcode")
    private String postcode;
    @Size(max = 250)
    @Column(name = "subcommentcode")
    private String subcommentcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "postdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postdate;

    public Commenttabbean() {
    }

    public Commenttabbean(Integer id) {
        this.id = id;
    }

    public Commenttabbean(Integer id, Date postdate) {
        this.id = id;
        this.postdate = postdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSubcommentcode() {
        return subcommentcode;
    }

    public void setSubcommentcode(String subcommentcode) {
        this.subcommentcode = subcommentcode;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
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
        if (!(object instanceof Commenttabbean)) {
            return false;
        }
        Commenttabbean other = (Commenttabbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Commenttabbean[ id=" + id + " ]";
    }
    
}
