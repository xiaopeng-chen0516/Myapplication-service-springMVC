package cn.test;

import cn.dao.DetectionMapper;
import cn.entity.Detection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinpeng_chen
 * @create 2020-03-31 下午 9:20
 **/

public class TestDao {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DetectionMapper bean = ctx.getBean(DetectionMapper.class);
        List<Detection> detections = bean.query();
        List<Detection> query7day = bean.query7day();
        System.out.println(detections);
        System.out.println("===========================");
        System.out.println(query7day);
        System.out.println("===========================");
        String str="";

        Map<String,List<String>> O2all7Day=new HashMap<>();
        Map<String,List<String>> CO2all7Day=new HashMap<>();
        Map<String,List<String>> PHall7Day=new HashMap<>();
        Map<String,List<String>> WDall7Day=new HashMap<>();
        Map<String,List<String>> XIall7Day=new HashMap<>();
        Map<String,List<String>> GEall7Day=new HashMap<>();
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<String> list3=new ArrayList<>();
        List<String> list4=new ArrayList<>();
        List<String> list5=new ArrayList<>();
        List<String> list6=new ArrayList<>();

        for (int i = 0; i < query7day.size(); i++) {
            System.out.println(query7day.get(i));
            System.out.print("氧气-->"+query7day.get(i).getO2());
            System.out.print("，  二氧化碳-->"+query7day.get(i).getCO2());
            System.out.print("，  酸碱度-->"+query7day.get(i).getPH());
            System.out.print("，  温度-->"+query7day.get(i).getWD());
            System.out.print("，  硒-->"+query7day.get(i).getXI());
            System.out.print("，  铬-->"+query7day.get(i).getGE());
            System.out.println(" ");

            str+="氧气"+query7day.get(i).getO2()+
                    "二氧化碳"+query7day.get(i).getCO2()+
                    "酸碱度"+query7day.get(i).getPH()+
                    "温度"+query7day.get(i).getWD()+
                    "硒"+query7day.get(i).getXI()+
                    "铬"+query7day.get(i).getGE();

            list1.add(query7day.get(i).getO2().toString());
            list2.add(query7day.get(i).getCO2().toString());
            list3.add(query7day.get(i).getPH().toString());
            list4.add(query7day.get(i).getWD().toString());
            list5.add(query7day.get(i).getXI().toString());
            list6.add(query7day.get(i).getGE().toString());


            O2all7Day.put("O2",list1);
            CO2all7Day.put("CO2",list2);
            PHall7Day.put("PH",list3);
            WDall7Day.put("WD",list4);
            XIall7Day.put("XI",list5);
            GEall7Day.put("GE",list6);


        }
        System.out.println(str);
        System.out.println(list1);
        System.out.println(O2all7Day);
    }
}
