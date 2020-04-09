package cn.controller;

import cn.entity.Detection;
import cn.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jinpeng_chen
 * @create 2020-03-31 下午 9:16
 **/
@RestController
public class DetectionController {
    @Autowired
    private DetectionService detectionService;

    @RequestMapping("/queryAll")
    public List<Detection> queryAll(){
        System.out.println(detectionService.queryAll());
        return detectionService.queryAll();
    }

    @RequestMapping("/query7day")
    public List<Detection> query7day(){
        System.out.println(detectionService.query7day());
        return detectionService.query7day();
    }

    @RequestMapping("/query7O2")
    public List<Detection> query7O2(){
        System.out.println("query7O2"+detectionService.query7day());
        return detectionService.query7O2();
    }

}
