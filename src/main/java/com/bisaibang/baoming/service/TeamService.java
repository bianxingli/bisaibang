package com.bisaibang.baoming.service;

import com.bisaibang.baoming.domain.Member;
import com.bisaibang.baoming.domain.Team;

import java.util.List;


public interface TeamService {
    void insertInfo(Team team, List<Member> member);
//    List<Member> getAllLeader();
    List<String> getAllLeader();
    List<Member> getAllMember(Integer teamName);
    List<Team> getAllTeam();

}
