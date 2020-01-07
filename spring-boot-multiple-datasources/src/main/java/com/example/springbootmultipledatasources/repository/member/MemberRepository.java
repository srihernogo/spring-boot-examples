package com.example.springbootmultipledatasources.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootmultipledatasources.model.member.Member;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.37
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}