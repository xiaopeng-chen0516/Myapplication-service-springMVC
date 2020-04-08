package cn.test;

import cn.entity.Detection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinpeng_chen
 * @create 2020-04-02 下午 6:14
 **/

public class TestApp {
    public static void main(String[] args) {
        String str = "[{\"id\":10,\"date\":1585324800000,\"wd\":31.0,\"co2\":2.0,\"ph\":1.0,\"o2\":5.0,\"xi\":21.0,\"ge\":41.0}]";
//        System.out.println(str);
        Map unparse = Unparse(str);
        System.out.println(unparse);

    }


    public static Map Unparse(String mapDate){
        Map<Integer, Object> map = new HashMap<>();
        try {
            JSONArray jsonArray = new JSONArray(mapDate);
            for (int i = jsonArray.length() - 1; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);  //解析JSON数据
                map.put(1, jsonObject.getDouble("o2"));
                map.put(2, jsonObject.getDouble("co2"));
                map.put(3, jsonObject.getDouble("ph"));
                map.put(4, jsonObject.getDouble("wd"));
                map.put(5, jsonObject.getDouble("xi"));
                map.put(6, jsonObject.getDouble("ge"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }
}
/*
*       [{"O2":"5","CO2":"2","PH":"1","WD":"31","XI":"21","GE":"41"}]
        [{"O2":"5","CO2":"2","PH":"1","WD":"31","XI":"21","GE":"41"}]



           [{"id":10,"date":1585324800000,"o2":5.0,"co2":2.0,"xi":21.0,"ge":41.0,"wd":31.0,"ph":1.0}]
           [{"id":10,"date":1585324800000,"o2":5.0,"co2":2.0,"xi":21.0,"ge":41.0,"wd":31.0,"ph":1.0}]
*
*
* */