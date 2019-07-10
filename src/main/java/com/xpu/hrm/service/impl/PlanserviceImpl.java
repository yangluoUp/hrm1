package com.xpu.hrm.service.impl;

import com.xpu.hrm.dao.PPlanMapper;
import com.xpu.hrm.bean.PPlan;
import com.xpu.hrm.bean.PPlanExample;
import com.xpu.hrm.service.PlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
