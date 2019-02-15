package com.yq.design.principle.demeter;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Test {
    public static void main(String[] args) {
        Boos boos = new Boos();
        TeamLeader teamLeader = new TeamLeader();
        boos.commandCheckNumer(teamLeader);
    }
}
