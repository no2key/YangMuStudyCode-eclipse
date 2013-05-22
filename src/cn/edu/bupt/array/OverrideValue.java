package cn.edu.bupt.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OverrideValue
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "zhangsan");
        map.put("b", "lisi");
        map.put("c","wangwu");
        
        System.out.println("------before override---------");
        System.out.println(map);
        
        System.out.println("-------after override-----------");
        map.put("a", "zhaoliu");
        System.out.println(map);
    }
}