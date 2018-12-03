package com.dellife.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @ManyToOne
    @JoinColumn(name="SALES_ID", referencedColumnName = "id")
    private Sales sales;

    //  (카드,휴대폰,쿠폰1,쿠폰2,포인트)
    @Enumerated(EnumType.STRING)
    @Column(name = "PAYMENT_TYPE")
    private PaymentType paymentType;
//    @Column(name = "PAYMENT_TYPE")
//    private int paymentType;

    @Column(name = "PRICE")
    private int price;

    @CreationTimestamp
    private Date createdDate;

    @UpdateTimestamp
    private Date updatedDate;

}
