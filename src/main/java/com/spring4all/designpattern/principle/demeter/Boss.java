package com.spring4all.designpattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 10:39
 **/
public class Boss {
    /**
     * boos 给teamLeader下指令，查课程数量
     * @param teamLeader
     */
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
