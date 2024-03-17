package top.ninng.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import top.ninng.domain.Student;

import java.util.List;

/**
 * 表 student
 */
@Repository("studentDao")
@Mapper
public interface IStudentDao {

    @Select(value = "select * from student")
    List<Student> selectAll();

    @Select(value = "select * from student where id=#{id}")
    Student selectById(int id);

    @Update("update student set name=#{name},sex=#{sex},address=#{address} where id=#{id}")
    int updateById(Student student);
}
