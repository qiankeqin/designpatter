package com.spring4all.designpattern.pattern.creational.singleton.container;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-28 12:58
 */
public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new Hashtable<>();

    private ContainerSingleton(){

    }

    public static void putInstance(String key,Object instance){
        if(!StringUtils.isEmpty(key) && instance!=null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}