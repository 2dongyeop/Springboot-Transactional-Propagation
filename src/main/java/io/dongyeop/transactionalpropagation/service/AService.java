package io.dongyeop.transactionalpropagation.service;

import io.dongyeop.transactionalpropagation.entity.Member;
import io.dongyeop.transactionalpropagation.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AService {

    private final MemberRepository memberRepository;
    private final BService bService;

    @Transactional
    public void save() {
        memberRepository.save(new Member(1L));
        bService.save();
        memberRepository.save(new Member(3L));

        throw new RuntimeException();
    }
}
