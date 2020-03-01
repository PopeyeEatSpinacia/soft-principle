package com.gupaoedu.vip.design.principle.dmeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public  void checkNumberOfCourse1(){
        Employee employee = new Employee();
        employee.checkNumberOfCourse();
    }

    public  void checkNumberOfCourse0(){
        Employee employee = new Employee();
        List<Course> courseList = new ArrayList<Course>();
        for (int i =0;i<=20;i++){
            courseList.add(new Course());
        }
        employee.checkNumberOfCourse(courseList);
    }
}
