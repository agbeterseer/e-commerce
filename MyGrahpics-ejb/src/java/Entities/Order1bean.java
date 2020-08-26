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
import javax.persistence.Lob;
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
@Table(name = "order1bean")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1bean.findAll", query = "SELECT o FROM Order1bean o"),
    @NamedQuery(name = "Order1bean.findByOrdernumber", query = "SELECT o FROM Order1bean o WHERE o.ordernumber = :ordernumber"),
    @NamedQuery(name = "Order1bean.findByProductcode", query = "SELECT o FROM Order1bean o WHERE o.productcode = :productcode"),
    @NamedQuery(name = "Order1bean.findByProperties1", query = "SELECT o FROM Order1bean o WHERE o.properties1 = :properties1"),
    @NamedQuery(name = "Order1bean.findByDateoforder", query = "SELECT o FROM Order1bean o WHERE o.dateoforder = :dateoforder"),
    @NamedQuery(name = "Order1bean.findByAmount", query = "SELECT o FROM Order1bean o WHERE o.amount = :amount"),
    @NamedQuery(name = "Order1bean.findByShippingmethod", query = "SELECT o FROM Order1bean o WHERE o.shippingmethod = :shippingmethod"),
    @NamedQuery(name = "Order1bean.findByBill", query = "SELECT o FROM Order1bean o WHERE o.bill = :bill"),
    @NamedQuery(name = "Order1bean.findByDelivery", query = "SELECT o FROM Order1bean o WHERE o.delivery = :delivery"),
    @NamedQuery(name = "Order1bean.findByStatus", query = "SELECT o FROM Order1bean o WHERE o.status = :status"),
    @NamedQuery(name = "Order1bean.findByDescription", query = "SELECT o FROM Order1bean o WHERE o.description = :description"),
    @NamedQuery(name = "Order1bean.findByNeworder", query = "SELECT o FROM Order1bean o WHERE o.neworder = :neworder")})
public class Order1bean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "ordernumber")
    private String ordernumber;
    @Size(max = 250)
    @Column(name = "productcode")
    private String productcode;
    @Size(max = 250)
    @Column(name = "properties1")
    private String properties1;
    @Size(max = 250)
    @Column(name = "dateoforder")
    private String dateoforder;
    @Size(max = 250)
    @Column(name = "amount")
    private String amount;
    @Size(max = 250)
    @Column(name = "shippingmethod")
    private String shippingmethod;
    @Size(max = 250)
    @Column(name = "bill")
    private String bill;
    @Size(max = 250)
    @Column(name = "delivery")
    private String delivery;
    @Lob
    @Column(name = "pix")
    private byte[] pix;
    @Size(max = 250)
    @Column(name = "status")
    private String status;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 250)
    @Column(name = "neworder")
    private String neworder;

    public Order1bean() {
    }

    public Order1bean(String ordernumber) {
        this.ordernumber = ordernumber;
    }
 

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProperties1() {
        return properties1;
    }

    public void setProperties(String properties1) {
        this.properties1 = properties1;
    }

    public String getDateoforder() {
        return dateoforder;
    }

    public void setDateoforder(String dateoforder) {
        this.dateoforder = dateoforder;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(String shippingmethod) {
        this.shippingmethod = shippingmethod;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNeworder() {
        return neworder;
    }

    public void setNeworder(String neworder) {
        this.neworder = neworder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordernumber != null ? ordernumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1bean)) {
            return false;
        }
        Order1bean other = (Order1bean) object;
        if ((this.ordernumber == null && other.ordernumber != null) || (this.ordernumber != null && !this.ordernumber.equals(other.ordernumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Order1bean[ ordernumber=" + ordernumber + " ]";
    }
    
}
