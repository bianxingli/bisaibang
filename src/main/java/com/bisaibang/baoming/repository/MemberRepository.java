package com.bisaibang.baoming.repository;

import com.bisaibang.baoming.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Integer>, JpaSpecificationExecutor<Member> {

//    List<Member> findByIdentity(String identity);

    List<Member> findByTeamId(Integer teamId);
    @Query(value = "select member from member where identity = ?1",nativeQuery = true)
    List<String> getLeader(String identity);
    
}
