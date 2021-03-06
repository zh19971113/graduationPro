package com.gp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.mapper.CoursePlanMapper;
import com.gp.model.pojo.CoursePlan;
import com.gp.model.pojo.Teacher;
import com.gp.service.CoursePlanService;

@Service
public class CoursePlanServiceImpl implements CoursePlanService {
	@Autowired
	CoursePlanMapper coursePlanMapper;
	
	public int add(CoursePlan coursePlan) {
		return coursePlanMapper.add(coursePlan);
	}
	public int addMany(List<CoursePlan> coursePlans) {
		int flag = 0;
		for(CoursePlan coursePlan : coursePlans) {
			flag = coursePlanMapper.add(coursePlan);
			if(flag == 0) return flag;
		}
		return flag;
	}
	public int getCountByAll(CoursePlan coursePlan) {
		return coursePlanMapper.getCountByAll(coursePlan);
	}
	public int getCountById(long id) {
		return coursePlanMapper.getCountById(id);
	}
	public int getCountByTid(long tid) {
		return coursePlanMapper.getCountByTid(tid);
	}
}
