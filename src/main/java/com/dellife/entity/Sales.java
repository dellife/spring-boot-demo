package com.dellife.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="SALES")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="OWNER_ID", referencedColumnName = "id")
    private Owner owner;

//    @Column(name = "SALES_PRICE")
    private int salesPrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PAYMENT_DATE")
    private Date paymentDate;

    @CreationTimestamp
    private Date createdDate;

    @UpdateTimestamp
    private Date updatedDate;

}
