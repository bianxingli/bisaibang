package com.bisaibang.baoming.domain;

import java.util.List;

public class TeamVo {
    private Team team;
    private List<Member> members;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
