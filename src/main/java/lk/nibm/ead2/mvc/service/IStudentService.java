package lk.nibm.ead2.mvc.service;

import lk.nibm.ead2.mvc.domain.Student;

import java.util.List;

public interface IStudentService {
    void save(Student student);
    List<Student> find();
}
