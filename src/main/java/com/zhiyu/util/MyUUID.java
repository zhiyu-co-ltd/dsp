package com.zhiyu.util;

import java.util.UUID;
/**
 * Created by zhaojianfan on 17/1/19.
 */
public class MyUUID {

    public MyUUID(){

    }

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        // 去掉"-"符号
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
        return temp;
    }
}
