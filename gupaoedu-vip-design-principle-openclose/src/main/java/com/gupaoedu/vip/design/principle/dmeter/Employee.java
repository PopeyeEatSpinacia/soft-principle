package com.gupaoedu.vip.design.principle.dmeter;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public  void checkNumberOfCourse(List<Course> courseList){
        System.out.println("目前已发布的课程数量为："+courseList.size());
    }

    public  void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i =0;i<=20;i++){
            courseList.add(new Course());
        }
        System.out.println("目前已发布的课程数量为："+courseList.size());
    }

}
