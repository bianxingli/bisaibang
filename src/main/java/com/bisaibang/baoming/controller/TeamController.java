package com.bisaibang.baoming.controller;

import com.bisaibang.baoming.domain.Member;
import com.bisaibang.baoming.domain.Team;

import com.bisaibang.baoming.domain.TeamVo;
import com.bisaibang.baoming.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;
    @RequestMapping("/test")
    public void test(){
        Team team = new Team();
        team.setTeamName("仙阁");
        ArrayList<Member> members = new ArrayList<Member>();
        Member member1 = new Member();
        member1.setMember("张三");
        member1.setIdentity("队长");
        Member member2 = new Member();
        member2.setMember("李四");
        member2.setIdentity("队员");
        Member member3 = new Member();
        member3.setMember("王五");
        member3.setIdentity("替补队员");
        members.add(member1);
        members.add(member2);
        members.add(member3);
        teamService.insertInfo(team,members);
    }


//    @RequestMapping("/baoming")
//    public void baoMing(@RequestBody TeamVo teamVo){
//        System.out.println("请求");
//        Team team = teamVo.getTeam();
//        List<Member> members = teamVo.getMembers();
//        teamService.insertInfo(team,members);
//    }


    @RequestMapping("/baoming")
    public void baoMing(@RequestBody List<Member> members,Team team){
        System.out.println("请求");
        teamService.insertInfo(team,members);
    }
//    @RequestMapping("/leader")
//    public List<Member> getAllLeader(){
//        return teamService.getAllLeader();
//    }
    @RequestMapping("/leader")
    public List<String> getAllLeader(){
        return teamService.getAllLeader();
    }
    @RequestMapping("/member")
    public List<Member> getAllMember(Integer teamId){
        return teamService.getAllMember(teamId);
    }
    @RequestMapping("/team")
    public List<Team> getAllTeam(){
        return teamService.getAllTeam();
    }
}
