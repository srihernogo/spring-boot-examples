package com.example.springbootmultipledatasources.controller;

import com.example.springbootmultipledatasources.model.card.Card;
import com.example.springbootmultipledatasources.model.cardholder.CardHolder;
import com.example.springbootmultipledatasources.model.member.Member;
import com.example.springbootmultipledatasources.repository.card.CardRepository;
import com.example.springbootmultipledatasources.repository.cardholder.CardHolderRepository;
import com.example.springbootmultipledatasources.repository.member.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.55
 */

@RestController
@RequestMapping("/api/all")
public class AllController {
    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private CardHolderRepository cardHolderRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/card")
    public Card addNewCard(@RequestBody @Valid Card card) {
        return cardRepository.save(card);
    }

    @GetMapping("/card")
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @PostMapping("/cardholder")
    public CardHolder addNewCardHolder(@RequestBody @Valid CardHolder cardHolder) {
        return cardHolderRepository.save(cardHolder);
    }

    @GetMapping("/cardholder")
    public List<CardHolder> getAllCardHolders() {
        return cardHolderRepository.findAll();
    }

    @PostMapping("/member")
    public Member addNewMember(@RequestBody @Valid Member member) {
        return memberRepository.save(member);
    }

    @GetMapping("/member")
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
