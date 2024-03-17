package top.ninng.service;

import org.springframework.stereotype.Service;
import top.ninng.dao.IStudentDao;
import top.ninng.domain.Student;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentService {

    @Resource(name = "studentDao")
    private IStudentDao studentDao;

    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    public Student selectById(int id) {
        return studentDao.selectById(id);
    }
}
