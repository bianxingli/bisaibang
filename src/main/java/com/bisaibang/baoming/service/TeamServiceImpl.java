package com.bisaibang.baoming.service;

import com.bisaibang.baoming.domain.Member;
import com.bisaibang.baoming.domain.Team;
import com.bisaibang.baoming.repository.MemberRepository;
import com.bisaibang.baoming.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Override
    @Transactional
    public void insertInfo(Team team, List<Member> member) {
        Team team1 = teamRepository.save(team);
        Integer teamId = team1.getTeamId();
        for (Member m:member) {
            m.setTeamId(teamId);
            System.out.println(m);
            memberRepository.save(m);
        }
    }

//    @Override
//    public List<Member> getAllLeader() {
//        return memberRepository.findByIdentity("队长");
//    }
    @Override
    public List<String> getAllLeader() {
        return memberRepository.getLeader("队长");
    }
    @Override
    public List<Member> getAllMember(Integer teamId) {
        return memberRepository.findByTeamId(teamId);
    }

    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }
}
