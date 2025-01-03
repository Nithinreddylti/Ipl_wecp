package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService {
    public List<Team> teams;
    

    public TeamServiceImplArraylist(List<Team> teams) {
        this.teams = new ArrayList<>();
    }

    @Override
    public List<Team> getAllTeams() {
        return teams;
    }

    @Override
    public int addTeam(Team team) {
        teams.add(team);
        return teams.size();

    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedTeams=new ArrayList<>(teams);
        sortedTeams.sort(Comparator.comparing(Team::getTeamName));
        return sortedTeams;

    }
    @Override
    public void emptyArrayList(){
        teams=new ArrayList<>();
    }

}