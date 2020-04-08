package cn.service.impl;

import cn.dao.DetectionMapper;
import cn.entity.Detection;
import cn.service.DetectionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author jinpeng_chen
 * @create 2020-03-31 下午 9:14
 **/
@Service
public class DetectionServiceImpl implements DetectionService {
@Autowired
private DetectionMapper detectionMapper;

    @Override
    public List<Detection> queryAll() {
        return detectionMapper.query();
    }

    @Override
    public List<Detection> query7day() {
        return detectionMapper.query7day();
    }
}
