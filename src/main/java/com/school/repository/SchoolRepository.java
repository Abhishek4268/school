package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.school.entity.StudentEntity;
import com.school.response.Response;
@Repository
public interface SchoolRepository extends JpaRepository< StudentEntity , Integer >{

	
/*@Query("select s.name as name ,s.gender as gender ,s.age as age ,sa.city as city ,sa.state as state ,sa.zip as zip from StudentEntity as s inner join StudentAdressEntity as sa on s.studentId=sa.studentId")
 public List<Response> commonData();*/

	
@Query(value=" select s.name as name,s.gender as gender ,s.age as age ,sa.city as city ,sa.state as state ,sa.zip as zip from student as s inner join student_adress as sa on s.studentid=sa.studentid" ,nativeQuery=true)
public List<Response> commonData();


}
