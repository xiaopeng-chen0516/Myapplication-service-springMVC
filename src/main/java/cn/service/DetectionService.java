package cn.service;

import cn.entity.Detection;

import java.util.List;

public interface DetectionService {
    List<Detection> queryAll();
    List<Detection> query7day();
}
