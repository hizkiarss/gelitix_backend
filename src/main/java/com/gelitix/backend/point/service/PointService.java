package com.gelitix.backend.point.service;

import com.gelitix.backend.point.entity.Point;
import com.gelitix.backend.users.entity.Users;

import java.util.List;

public interface PointService {
    List<Point> getPoint(String email);
    Point recordPointHistory (Users uplineUser , Users savedUser);
}