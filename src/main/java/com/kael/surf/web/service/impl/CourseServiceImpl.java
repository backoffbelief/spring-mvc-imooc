package com.kael.surf.web.service.impl;

import org.springframework.stereotype.Service;

import com.kael.surf.web.model.Course;
import com.kael.surf.web.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

	@Override
	public Course getCourseByCid(Integer id) {
		Course c = new Course();
		c.setId(id);
		c.setImgPath("static/imgs/course-img.jpg");
		c.setLearningNum(10000);
		c.setLevel(2);
		c.setLevelDesc("中级");
		c.setTitle("Java多线程");
		c.setDecsr("Java多线程-------");
		return c;
	}

}
