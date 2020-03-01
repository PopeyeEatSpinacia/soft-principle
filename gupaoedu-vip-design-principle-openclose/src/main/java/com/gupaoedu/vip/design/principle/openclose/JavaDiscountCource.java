package com.gupaoedu.vip.design.principle.openclose;

public class JavaDiscountCource extends JavaCource{

    public JavaDiscountCource(Integer id, String name, Double price) {
        super(id, name, price);
    }


    public Double getDiscountPrice() {
        return super.getPrice()*0.6;
    }
}
