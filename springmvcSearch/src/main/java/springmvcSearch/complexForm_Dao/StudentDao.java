package springmvcSearch.complexForm_Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import springmvcSearch.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveStudent(Student student)
	{
		int id=(Integer)this.hibernateTemplate.save(student);
		return id;
	}

}
