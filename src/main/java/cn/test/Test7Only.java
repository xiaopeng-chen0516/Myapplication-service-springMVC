package cn.test;

import cn.dao.DetectionMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test7Only {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");;
        DetectionMapper bean = ctx.getBean(DetectionMapper.class);
        List list = bean.query7O2();
        System.out.println(list);

    }
}
