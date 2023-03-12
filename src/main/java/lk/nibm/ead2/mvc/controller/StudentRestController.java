package lk.nibm.ead2.mvc.controller;

import lk.nibm.ead2.mvc.domain.Student;
import lk.nibm.ead2.mvc.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    IStudentService service;

    @RequestMapping(value ="/student",method = RequestMethod.GET)
    @ResponseBody
    public List<Student>getStudents(){
        return service.find();
    }
}
