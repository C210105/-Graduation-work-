package ldl.com.vn.graduation.services;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import ldl.com.vn.graduation.beans.Student;

@SpringBootTest
public class GraduationServiceTest {
    
    @Autowired
    GraduationService graduationService;

    @DisplayName("全件")
    @Test
    void test0(){
        
        List <Student> students = graduationService.getGraduation();
        assertThat(students.size()).isEqualTo(2);
        assertThat(students).isNotNull();

        Student student = students.get(0);

        assertThat(student).isNotNull();
        assertThat(student.getIdS()).isEqualTo("C100001");
        assertThat(student.getNameSE()).isEqualTo("斉藤");
        assertThat(student.getNameSK()).isEqualTo("サイトウ");
        assertThat(student.getSexS()).isEqualTo("男");
        assertThat(student.getClassId()).isEqualTo("1");
        assertThat(student.getPhoneS()).isEqualTo("0899992222");
        assertThat(student.getClassSchoolS().getClassN()).isEqualTo("1A");
    }

}
