package com.example.springbootmultipledatasources.repository.card;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootmultipledatasources.model.card.Card;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.34
 */
public interface CardRepository extends JpaRepository<Card, Long> {
}