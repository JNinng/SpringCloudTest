package top.ninng.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.ninng.domain.Student;

import java.util.List;

/**
 * student client
 */
public interface StudentApi {

    @GetMapping(path = "/student/all")
    List<Student> selectAll();

    @GetMapping(path = "/student/id/{id}")
    Student selectById(@PathVariable(value = "id") int id);
}
