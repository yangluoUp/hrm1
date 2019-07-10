package com.yueqian.personnel.service;

import com.yueqian.personnel.domain.PPlan;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/7/10 15:52
 * @Created yangluo
 */
public interface PlanService {
    PPlan getPlanById(int id);
    List<PPlan> getPlans();
}
