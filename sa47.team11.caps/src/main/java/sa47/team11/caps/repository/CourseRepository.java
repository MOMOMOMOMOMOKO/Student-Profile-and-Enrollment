package sa47.team11.caps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sa47.team11.caps.model.Course;

/*@Repository
@Transactional*/
public interface CourseRepository extends JpaRepository<Course,Integer> {
	@Query("SELECT r.courseName FROM Course r")
	List<String> getCourseName();
	
	@Modifying
	@Query(value="delete s FROM student_enrolment s WHERE s.courseid=:cid and s.studentid=:sid",nativeQuery=true)
//	@Query("Delete s from student_enrolment s where ")  delete s FROM student_enrolment s WHERE s.courseid=4 and s.studentid=44
	void deleteCourseEnrolled(@Param("cid")Integer cid,@Param("sid")Integer sid);
	
	@Modifying
	@Query(value="INSERT INTO `student_enrolment`(`COURSEID`,`STUDENTID`,`DATE_REGISTERED`,`STATUS_ENROLL`)VALUES (:cid, :sid, now(),:sta)", nativeQuery=true)
	void createEnrollment(@Param("cid") Integer cid, 
			@Param("sid") Integer sid, @Param("sta") String sta);
	
}
