package com.Springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Entity.Student;
import com.Springboot.Repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentrepository;
	@PostMapping("/addstudent")
	public String saveStudent(@RequestBody Student Stu)	
	{
		studentrepository.save(Stu);
		return "User added successfully::"+Stu.getId();
	}
	@GetMapping("/Students")
	public List<Student>getStudents()
	{
		return studentrepository.findAll();
	}
	@GetMapping("/findStudent/{id}")
	public Optional<Student>getStudent(@PathVariable Integer id)
	{
		return studentrepository.findById(id);
	}
	@GetMapping("/deleteStudent/{id}")
	public String deletestudent(@PathVariable Integer id)
	{
		return "Deleted Customer Successfully";
	}	

}
