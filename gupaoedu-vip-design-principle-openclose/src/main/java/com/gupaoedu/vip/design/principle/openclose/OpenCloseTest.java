package com.gupaoedu.vip.design.principle.openclose;

public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCource(1,"JAava架构",11800.0);
        JavaDiscountCource discountCource = (JavaDiscountCource)iCourse;
        System.out.println("课程ID:"+discountCource.getId()+
                "\n课程标题：《"+discountCource.getName()
                +"\n原价："+discountCource.getPrice()
        +"\n售价"+discountCource.getDiscountPrice());

    }
}
