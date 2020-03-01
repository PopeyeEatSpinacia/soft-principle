package com.gupaoedu.vip.design.principle.dependenceInversion;

public class Tom {

    public  void studyJavaCourse(){
        System.out.println("Tom正在学习Java课程!");
    }

    public void studyPythonCource(){
        System.out.println("Tom正在学习Python课程!");
    }

    public void study(ICource iCource){
        iCource.study();
    }

    private ICource iCource;

    public Tom(ICource iCource) {
        this.iCource = iCource;
    }

    public void study2(){
        iCource.study();
    }

    public Tom() {
    }

    public void setiCource(ICource iCource) {
        this.iCource = iCource;
    }
}
