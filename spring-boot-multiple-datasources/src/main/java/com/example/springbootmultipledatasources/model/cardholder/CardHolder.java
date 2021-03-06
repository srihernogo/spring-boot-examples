package com.example.springbootmultipledatasources.model.cardholder;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.33
 */
@Entity
@Data
public class CardHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String memberId;
    private String cardNumber;
}