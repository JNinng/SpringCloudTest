package top.ninng.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.ninng.domain.Student;
import top.ninng.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * student 控制器
 */
@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Resource(name = "studentService")
    StudentService studentService;

    @RequestMapping(path = "/all")
    public List<Student> selectAll() {
        return studentService.selectAll();
    }

    @RequestMapping(path = "/id/{id}", method = RequestMethod.GET)
    Student selectById(@PathVariable(value = "id") int id) {
        return studentService.selectById(id);
    }
}
