package com.jason.demo.member.mapper;

import com.jason.demo.member.Member;
import com.jason.demo.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : yusik
 * @version : 1.0
 * @date : 2018-11-26
 * @description :
 */
@Service
public class MemberService {


    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String selectNow() {

        Member member = memberRepository.findByName("");

        return member.toString();
    }
}
