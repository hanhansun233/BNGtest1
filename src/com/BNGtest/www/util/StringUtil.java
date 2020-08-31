package com.BNGtest.www.util;

/**
 * 字符串工具类
 * @author sunhaohang
 * @date 2020/8/31
 */
public class StringUtil {
    /**
     * 判断是否为空
     * @param s 要判断的字符串儿
     * @return
     */
    public static boolean isEmpty(String s){
        if(s == null || "".equals(s.trim())){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 判断是否不为空
     * @param s 要判断的字符串儿
     * @return
     */
    public static boolean isNotEmpty(String s){
        if(s != null && !"".equals(s.trim())){
            return true;
        }
        else {
            return false;
        }
    }
}
