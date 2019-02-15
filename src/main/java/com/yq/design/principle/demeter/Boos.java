package com.yq.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Boos {
    public void commandCheckNumer(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
