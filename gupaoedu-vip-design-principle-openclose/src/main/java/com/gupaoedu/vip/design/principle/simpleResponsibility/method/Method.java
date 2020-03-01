package com.gupaoedu.vip.design.principle.simpleResponsibility.method;

public class Method {
    private void modifyUserInfo(String userName,String address){
        userName = "Tom";
        address="beijing";
    }

    private void modifyUserInfo(String userName,String ... filed){

    }

    private void modifyUserInfo(String userName,String address, boolean bool){
        if(bool){

        }else{

        }
    }

    private void modfifyUserName(String userName){

    }

    private void modfifyAddress(String address){

    }
}
