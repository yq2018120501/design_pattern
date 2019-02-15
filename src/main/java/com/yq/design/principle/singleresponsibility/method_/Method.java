package com.yq.design.principle.singleresponsibility.method_;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "Tom";
        address = "ChengDu";
    }
    private void updateUserInfo(String userName,String... properties){
        userName = "Tom";
//        address = "ChengDu";
    }

    private void updateUserName(String userName){
        userName = "Tom";
    }
    private void updateUserAddress(String address){
        address = "ChengDu";
    }
    private void updateUserInfo(String userName,String address,boolean bool){
        if (bool){
            //todo something1
        }else {
            //todo something2
        }
        userName = "Tom";
        address = "ChengDu";
    }
}
