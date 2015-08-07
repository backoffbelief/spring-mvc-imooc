package com.kael.surf.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kael.surf.web.model.Course;
import com.kael.surf.web.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewCourse(@RequestParam("id")int id, Model model){
		Course course = courseService.getCourseByCid(id);
		model.addAttribute(course);
		return "course_view";
	}
	// restful /course/view2/{courseId}
	@RequestMapping(value="/view2{courseId}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("id")int id, Map<String, Object> modelMap){
		Course course = courseService.getCourseByCid(id);
		modelMap.put("course", course);
		return "course_view";
	}
	
	public String viewCourse3(Httpse)
}
