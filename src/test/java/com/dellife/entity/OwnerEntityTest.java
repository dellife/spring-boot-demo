package com.dellife.entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@Slf4j
public class OwnerEntityTest {

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testMember() {

        Owner owner = new Owner();
        owner.setName("ksh");

        entityManager.persist(owner);
        log.error("owner id : {}", owner.getId());

        owner.setName("kys");


//        Optional<Member> result = Optional.ofNullable(memberRepository.findById(85L).get());
        
//        result.ifPresent(member -> log.info("member >> {}", member.toString()));
    }
}