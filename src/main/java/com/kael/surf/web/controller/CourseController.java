package com.kael.surf.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	@RequestMapping(value="/view2/{courseId}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("id")int id, Map<String, Object> modelMap){
		Course course = courseService.getCourseByCid(id);
		modelMap.put("course", course);
		return "course_view";
	}
	//  /course/view3?courseId=456
	@RequestMapping(value="/view3/{courseId}",method=RequestMethod.GET)
	public String viewCourse3(HttpServletRequest request){
		Course course = courseService.getCourseByCid(Integer.parseInt(request.getParameter("courseId")));
		request.setAttribute("course", course);
		return "course_view";
	}
	
	@RequestMapping(value="/admin" ,method= RequestMethod.GET,params="add")
	public String createCourse(){
		return "edit";
		
	}
	
	@RequestMapping(value="/save" ,method= RequestMethod.POST)
	public String saveCourse(Course course){
		course.setId(new Random().nextInt(1000));
		System.out.println(ReflectionToStringBuilder.toString(course));
		return "redirect:view/id="+course.getId();
	}
	
	@RequestMapping(value="/file",method= RequestMethod.GET)
	public String upload(){
		return "file";
	}
	
	@RequestMapping(value="/doUpload",method= RequestMethod.POST)
	public String doUpload(@RequestParam("file")MultipartFile file) throws IOException{
		if(!file.isEmpty()){
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("c:\\temp\\immoc\\",System.currentTimeMillis()+file.getOriginalFilename()));
		}
		return "success";
	}
}
