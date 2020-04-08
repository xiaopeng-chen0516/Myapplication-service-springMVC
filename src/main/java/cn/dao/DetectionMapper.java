package cn.dao;

import cn.entity.Detection;

import java.util.List;

public interface DetectionMapper {
    List<Detection> query();
    List<Detection> query7day();
}
