package ldl.com.vn.graduation.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ldl.com.vn.graduation.beans.Student;

@Mapper
public interface StudentMapper {   

    /**
     * 学生情報全件検索する。
     * @return　学生情報リスト。
     */
    public List <Student> selectAll();
}
