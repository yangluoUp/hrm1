package com.xpu.hrm.service;

import com.xpu.hrm.bean.PPlan;

import java.util.List;

/**
 * @Date 2019/7/10 15:52
 * @Created yangluo
 */
public interface PlanService {
    PPlan getPlanById(int id);
    List<PPlan> getPlans();
}
