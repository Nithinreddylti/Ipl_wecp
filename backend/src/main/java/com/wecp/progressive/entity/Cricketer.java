package com.wecp.progressive.entity;

public class Cricketer {
    private int cricketertId;
    private int teamId;
    private String cricketerName;
    private int age;
    private String nationality;
    private int experience;
    private String role;
    private int totalRuns;
    private int totalWickets;

    
    public Cricketer() {
    }
    public Cricketer(int cricketertId, int teamId, String cricketerName, int age, String nationality, int experience,
            String role, int totalRuns, int totalWickets) {
        this.cricketertId = cricketertId;
        this.teamId = teamId;
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }
    public int getCricketertId() {
        return cricketertId;
    }
    public void setCricketertId(int cricketertId) {
        this.cricketertId = cricketertId;
    }
    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public String getCricketerName() {
        return cricketerName;
    }
    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getTotalRuns() {
        return totalRuns;
    }
    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }
    public int getTotalWickets() {
        return totalWickets;
    }
    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }
}