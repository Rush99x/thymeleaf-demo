package lk.nibm.ead2.mvc.service.impl;

import lk.nibm.ead2.mvc.domain.Student;
import lk.nibm.ead2.mvc.repository.StudentRepository;
import lk.nibm.ead2.mvc.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service

public class StudentService implements IStudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void save(Student student) {
    lk.nibm.ead2.mvc.entity.Student dao = new lk.nibm.ead2.mvc.entity.Student();
    BeanUtils.copyProperties(student,dao);
    studentRepository.save(dao);
    }

    @Override
    public List<Student> find() {
        List<lk.nibm.ead2.mvc.entity.Student> students = studentRepository.findAll();
        return students.stream().map( s ->{
            Student dto = new Student();
            BeanUtils.copyProperties(s,dto);
            return dto;
        }).collect(Collectors.toList());
    }
}
