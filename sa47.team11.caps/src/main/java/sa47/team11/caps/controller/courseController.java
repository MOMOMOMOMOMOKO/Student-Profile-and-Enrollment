package sa47.team11.caps.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sa47.team11.caps.model.Course;
import sa47.team11.caps.service.CourseService;
import sa47.team11.caps.service.UserService;


@Controller
@RequestMapping(value = "/course")
public class courseController {
	@Autowired
	private CourseService cService;
	
	@Autowired
	private UserService UService;
	
	/*@Autowired
	private UserService uService;*/
	
	@RequestMapping(value = "/enroll", method = RequestMethod.GET)
	public ModelAndView logic1() {
		ModelAndView mav = new ModelAndView("enrollment");
		//User u = uService.authenticate("Jade@gmail.com", "Password1");
		ArrayList<Course> courselst = (ArrayList<Course>)cService.getAllCourses();
		
	//	List<String> courselst = cService.getCourseNames();
		mav.addObject("courselst", courselst);
		return mav;
	}
	
	@RequestMapping(value="/test/{id}", method = RequestMethod.GET)
	public ModelAndView test(@PathVariable Integer id) {
	//	User user = UService.findUser(3);
	//	Course course=cService.findCourse(id);
		cService.createEnrollment(id, 4, "successful");
//		ModelAndView mav = new ModelAndView("UserEditForm", "user", user);
		ModelAndView mav = new ModelAndView("test");
		//mav.addObject("user",user);
		return mav;
}
}
