package ldl.com.vn.graduation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ldl.com.vn.graduation.beans.ClassSchool;
import ldl.com.vn.graduation.beans.Student;
import ldl.com.vn.graduation.mappers.ClassSchoolMapper;
import ldl.com.vn.graduation.mappers.StudentMapper;

@Service
public class GraduationService {
    
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ClassSchoolMapper classSchoolMapper;

    public List<Student> getGraduation(){
        return studentMapper.selectAll();
    }

    public List<ClassSchool> geClassSchools(){
        return classSchoolMapper.selectAll();
    }
}
