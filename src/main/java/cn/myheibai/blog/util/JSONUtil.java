package cn.myheibai.blog.util;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhr on 2017/5/11.
 */

public class JSONUtil {
    /**
     * 反射原理转换object为JsonObject对象
     * @param object
     * @return
     * @throws NoSuchMethodException
     * @throws JSONException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static JSONObject objectToJSON(Object object) throws NoSuchMethodException, JSONException, InvocationTargetException, IllegalAccessException {
        JSONObject jsonObject = new JSONObject();
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            Method method = clazz.getDeclaredMethod("get"+replaceOneB(field.getName()));
            jsonObject.put(field.getName(),method.invoke(object));
        }
        return jsonObject;
    }
    public static Map objectToMap(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map map = new HashMap();
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            Method method = clazz.getDeclaredMethod("get"+replaceOneB(field.getName()));
            map.put(field.getName(),method.invoke(object));
        }
        return map;
    }
    /**
     * 替换字符串首字母大写
     * @param str 欲替换字符串
     * @return 替换后的字符串
     */
    public static String replaceOneB(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1,str.length());
    }
}
