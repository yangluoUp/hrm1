package com.yueqian.personnel.service.impl;

import com.yueqian.personnel.dao.PPlanMapper;
import com.yueqian.personnel.domain.PPlan;
import com.yueqian.personnel.domain.PPlanExample;
import com.yueqian.personnel.service.PlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/7/10 15:55
 * @Created yangluo
 */
@Service("planService")
public class PlanserviceImpl implements PlanService {

    @Resource
    PPlanMapper pPlanMapper;


    @Override
    public PPlan getPlanById(int id) {
        PPlan pPlan = pPlanMapper.selectByPrimaryKey(id);
        return pPlan;
    }

    @Override
    public List<PPlan> getPlans() {
        PPlanExample example = new PPlanExample();
        PPlanExample.Criteria criteria = example.createCriteria();
        List<PPlan> plans = pPlanMapper.selectByExample(example);
        return plans;
    }
}
