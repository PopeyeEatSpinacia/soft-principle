package com.gupaoedu.vip.design.principle.simpleResponsibility;

public class Cource {
    public void study(String courseName){
         if("直播课".equals(courseName)){
             System.out.println("不能快进");
         }else{
             System.out.println("可以任意的来回播放");
         }
    }
}
