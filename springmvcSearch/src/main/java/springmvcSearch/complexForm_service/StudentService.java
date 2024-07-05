package springmvcSearch.complexForm_service;

import org.springframework.beans.factory.annotation.Autowired;

import springmvcSearch.complexForm_Dao.StudentDao;
import springmvcSearch.entity.Student;

@org.springframework.stereotype.Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public int createStudent(Student student)
	{
		return this.studentDao.saveStudent(student);
	}

}
