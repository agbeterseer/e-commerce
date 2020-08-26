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
@Table(name = "cardslotbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cardslotbean.findAll", query = "SELECT c FROM Cardslotbean c"),
    @NamedQuery(name = "Cardslotbean.findById", query = "SELECT c FROM Cardslotbean c WHERE c.id = :id"),
    @NamedQuery(name = "Cardslotbean.findByCardslotname", query = "SELECT c FROM Cardslotbean c WHERE c.cardslotname = :cardslotname"),
    @NamedQuery(name = "Cardslotbean.findByProductcode", query = "SELECT c FROM Cardslotbean c WHERE c.productcode = :productcode"),
    @NamedQuery(name = "Cardslotbean.findByPrice", query = "SELECT c FROM Cardslotbean c WHERE c.price = :price"),
    @NamedQuery(name = "Cardslotbean.findByDescription", query = "SELECT c FROM Cardslotbean c WHERE c.description = :description"),
    @NamedQuery(name = "Cardslotbean.findByStatus", query = "SELECT c FROM Cardslotbean c WHERE c.status = :status"),
    @NamedQuery(name = "Cardslotbean.findByVision", query = "SELECT c FROM Cardslotbean c WHERE c.vision = :vision")})
public class Cardslotbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "id")
    private String id;
    @Size(max = 1250)
    @Column(name = "cardslotname")
    private String cardslotname;
    @Size(max = 1250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 1250)
    @Column(name = "price")
    private String price;
    @Size(max = 1250)
    @Column(name = "description")
    private String description;
    @Size(max = 1250)
    @Column(name = "status")
    private String status;
    @Size(max = 1250)
    @Column(name = "vision")
    private String vision;

    public Cardslotbean() {
    }

    public Cardslotbean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardslotname() {
        return cardslotname;
    }

    public void setCardslotname(String cardslotname) {
        this.cardslotname = cardslotname;
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

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
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
        if (!(object instanceof Cardslotbean)) {
            return false;
        }
        Cardslotbean other = (Cardslotbean) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cardslotbean[ id=" + id + " ]";
    }
    
}
