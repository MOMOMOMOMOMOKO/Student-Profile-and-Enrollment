package sa47.team11.caps.service;

import java.util.List;

import sa47.team11.caps.model.Course;

public interface CourseService {
	List<Course> getAllCourses();
	List<String> getCourseNames();
	Course findCourse(Integer courseid);
	int removeEnrollment(int cid,int sid);
	void createEnrollment(Integer cid, Integer sid, String sta);
}
