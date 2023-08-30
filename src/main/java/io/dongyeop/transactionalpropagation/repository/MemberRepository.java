package io.dongyeop.transactionalpropagation.repository;

import io.dongyeop.transactionalpropagation.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
