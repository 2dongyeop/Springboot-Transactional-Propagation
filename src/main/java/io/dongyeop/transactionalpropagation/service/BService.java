package io.dongyeop.transactionalpropagation.service;

import io.dongyeop.transactionalpropagation.entity.Member;
import io.dongyeop.transactionalpropagation.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BService {

    private final MemberRepository memberRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save() {
        memberRepository.save(new Member(2L));
    }
}
