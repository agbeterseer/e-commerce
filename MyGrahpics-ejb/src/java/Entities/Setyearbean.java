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
@Table(name = "setyearbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Setyearbean.findAll", query = "SELECT s FROM Setyearbean s"),
    @NamedQuery(name = "Setyearbean.findByCode", query = "SELECT s FROM Setyearbean s WHERE s.code = :code"),
    @NamedQuery(name = "Setyearbean.findByStatus", query = "SELECT s FROM Setyearbean s WHERE s.status = :status"),
    @NamedQuery(name = "Setyearbean.findByCoypwirte", query = "SELECT s FROM Setyearbean s WHERE s.coypwirte = :coypwirte")})
public class Setyearbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Lob
    @Column(name = "banner")
    private byte[] banner;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @Size(max = 250)
    @Column(name = "coypwirte")
    private String coypwirte;

    public Setyearbean() {
    }

    public Setyearbean(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getBanner() {
        return banner;
    }

    public void setBanner(byte[] banner) {
        this.banner = banner;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getCoypwirte() {
        return coypwirte;
    }

    public void setCoypwirte(String coypwirte) {
        this.coypwirte = coypwirte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setyearbean)) {
            return false;
        }
        Setyearbean other = (Setyearbean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Setyearbean[ code=" + code + " ]";
    }
    
}
