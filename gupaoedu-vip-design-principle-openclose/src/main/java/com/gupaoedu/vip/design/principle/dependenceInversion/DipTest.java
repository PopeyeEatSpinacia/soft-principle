package com.gupaoedu.vip.design.principle.dependenceInversion;

public class DipTest {
    public static void main(String[] args) {
//        v1
//        Tom tom= new Tom();
//        tom.studyJavaCourse();
//        tom.studyPythonCource();
        //v2
//        Tom tom= new Tom();
//        JavaCource javaCource = new JavaCource();
//        tom.study(javaCource);

        //v3
//        JavaCource javaCource = new JavaCource();
//        Tom tom= new Tom(javaCource);
//        tom.study2();

        //v4
          Tom tom= new Tom();
          JavaCource javaCource = new JavaCource();
          tom.setiCource(javaCource);
          tom.study2();
    }
}
