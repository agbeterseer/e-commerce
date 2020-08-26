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
@Table(name = "numberinglocationbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Numberinglocationbean.findAll", query = "SELECT n FROM Numberinglocationbean n"),
    @NamedQuery(name = "Numberinglocationbean.findByCode", query = "SELECT n FROM Numberinglocationbean n WHERE n.code = :code"),
    @NamedQuery(name = "Numberinglocationbean.findByNlocation", query = "SELECT n FROM Numberinglocationbean n WHERE n.nlocation = :nlocation"),
    @NamedQuery(name = "Numberinglocationbean.findByProductcode", query = "SELECT n FROM Numberinglocationbean n WHERE n.productcode = :productcode"),
    @NamedQuery(name = "Numberinglocationbean.findByStartingprice", query = "SELECT n FROM Numberinglocationbean n WHERE n.startingprice = :startingprice"),
    @NamedQuery(name = "Numberinglocationbean.findByDescription", query = "SELECT n FROM Numberinglocationbean n WHERE n.description = :description"),
    @NamedQuery(name = "Numberinglocationbean.findByStatus", query = "SELECT n FROM Numberinglocationbean n WHERE n.status = :status")})
public class Numberinglocationbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Size(max = 250)
    @Column(name = "nlocation")
    private String nlocation;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "startingprice")
    private String startingprice;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "status")
    private String status;

    public Numberinglocationbean() {
    }

    public Numberinglocationbean(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNlocation() {
        return nlocation;
    }

    public void setNlocation(String nlocation) {
        this.nlocation = nlocation;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getStartingprice() {
        return startingprice;
    }

    public void setStartingprice(String startingprice) {
        this.startingprice = startingprice;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numberinglocationbean)) {
            return false;
        }
        Numberinglocationbean other = (Numberinglocationbean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Numberinglocationbean[ code=" + code + " ]";
    }
    
}
