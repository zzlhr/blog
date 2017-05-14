package cn.myheibai.blog.service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhr on 2017/4/20.
 */
public class ReqMap {
    private static String STATIC0 = "OK";
    public static Map getReqMap(int s) throws NoSuchFieldException, IllegalAccessException {
        Class<?> map = ReqMap.class;
        Field field = map.getDeclaredField("STATIC"+s);
        String st = field.get(map)+"";
        Map map1 = new HashMap();
        map1.put("static", s);
        map1.put("msg",st);
        System.out.print(map1);
        return map1;
    }
}
