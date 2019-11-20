package com.bisaibang.baoming.repository;


import com.bisaibang.baoming.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team,Integer>, JpaSpecificationExecutor<Team> {

    List<Team> findAll();

}
