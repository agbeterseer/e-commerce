/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Lob;
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
@Table(name = "blogbean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blogbean.findAll", query = "SELECT b FROM Blogbean b"),
    @NamedQuery(name = "Blogbean.findByCode", query = "SELECT b FROM Blogbean b WHERE b.code = :code"),
    @NamedQuery(name = "Blogbean.findByBlogtitle", query = "SELECT b FROM Blogbean b WHERE b.blogtitle = :blogtitle"),
    @NamedQuery(name = "Blogbean.findByComment", query = "SELECT b FROM Blogbean b WHERE b.comment = :comment"),
    @NamedQuery(name = "Blogbean.findByDateofpost", query = "SELECT b FROM Blogbean b WHERE b.dateofpost = :dateofpost"),
    @NamedQuery(name = "Blogbean.findByCategory", query = "SELECT b FROM Blogbean b WHERE b.category = :category"),
    @NamedQuery(name = "Blogbean.findByProcductcode", query = "SELECT b FROM Blogbean b WHERE b.procductcode = :procductcode"),
    @NamedQuery(name = "Blogbean.findByStatus", query = "SELECT b FROM Blogbean b WHERE b.status = :status"),
    @NamedQuery(name = "Blogbean.findByOthers", query = "SELECT b FROM Blogbean b WHERE b.others = :others")})
public class Blogbean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "code")
    private String code;
    @Size(max = 250)
    @Column(name = "blogtitle")
    private String blogtitle;
    @Size(max = 250)
    @Column(name = "comment")
    private String comment;
    @Size(max = 250)
    @Column(name = "dateofpost")
    private String dateofpost;
    @Size(max = 250)
    @Column(name = "category")
    private String category;
    @Size(max = 250)
    @Column(name = "procductcode")
    private String procductcode;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "others")
    private String others;
    @Lob
    @Column(name = "pic")
    private byte[] pic;

    public Blogbean() {
    }

    public Blogbean(String code) {
        this.code = code;
    }

    public Blogbean(String code, String dateofpost) {
        this.code = code;
        this.dateofpost = dateofpost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle;
    }
    
    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDateofpost() {
        return dateofpost;
    }

    public void setDateofpost(String dateofpost) {
        this.dateofpost = dateofpost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcductcode() {
        return procductcode;
    }

    public void setProcductcode(String procductcode) {
        this.procductcode = procductcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

      public byte[] getPic() {
        return pic;
    }

    public void setPix(byte[] pic) {
        this.pic = pic;
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
        if (!(object instanceof Blogbean)) {
            return false;
        }
        Blogbean other = (Blogbean) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Blogbean[ code=" + code + " ]";
    }
    
}
