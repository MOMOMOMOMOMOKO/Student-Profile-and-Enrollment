package sa47.team11.caps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sa47.team11.caps.model.*;

public interface StudentEnrolmentRepository extends JpaRepository<StudentEnrolment,Integer> {
	
//	@Query("SELECT u FROM User u WHERE u.email=:un AND u.password=:pwd")
//	abstract User AuthorizeUser(@Param("un") String uName,@Param("pwd") String pwd);
	
	@Query("SELECT c from StudentEnrolment c WHERE c.user.userid= :userid")
	ArrayList<StudentEnrolment> findAllCourses(@Param("userid") Integer userid);

	/*@Modifying(clearAutomatically=true)
	@Query("UPDATE StudentEnrolment c set c.statusEnroll = :status where c.studentEnrolId= :studentEnrolId")
	void CancelCourse(@Param("studentEnrolId") Integer studentEnrolId,@Param("status") String status); */
	
	@Modifying
	@Query(value = "UPDATE STUDENT_ENROLMENT set STATUS_ENROLL = :status where STUDENT_ENROL_ID = :studentEnrolId", nativeQuery=true)
	void CancelCourse(@Param("studentEnrolId") Integer studentEnrolId,@Param("status") String status);
//	
//	@Query("SELECT SCORE from student_enrolment c WHERE c.user.userid :eid")
//	ArrayList<StudentEnrolment> ViewGrade(@Param("uid") String userid);
//	
}

