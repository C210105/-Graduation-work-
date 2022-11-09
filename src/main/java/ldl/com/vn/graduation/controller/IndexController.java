package ldl.com.vn.graduation.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ldl.com.vn.graduation.beans.ClassSchool;
import ldl.com.vn.graduation.beans.Student;
import ldl.com.vn.graduation.beans.Teacher;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public String showIndex(Model model){

        List <Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("1A", "斉藤"));

        List <ClassSchool> classSchools = new ArrayList<>();
        classSchools.add(new ClassSchool("1", "1A"));
        classSchools.add(new ClassSchool("2", "1B"));
        classSchools.add(new ClassSchool("3", "1C"));
        classSchools.add(new ClassSchool("4", "2A"));
        classSchools.add(new ClassSchool("5", "2B"));
        classSchools.add(new ClassSchool("6", "2C"));

        List <Student> students = new ArrayList<>();
        students.add(new Student("Cxxxxxx", "AAA BBB CCC", "男", "1A", "0123456789", new ClassSchool("1", "1A"), null, null));

        model.addAttribute("teachers", teachers);
        model.addAttribute("classSchools", classSchools);
        model.addAttribute("students", students);
        
        return "toppage/index";
    }
}
