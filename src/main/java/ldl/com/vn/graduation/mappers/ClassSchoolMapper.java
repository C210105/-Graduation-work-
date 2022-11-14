package ldl.com.vn.graduation.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ldl.com.vn.graduation.beans.ClassSchool;

@Mapper
public interface ClassSchoolMapper {
    
    /**
     * 
     * @return
     */
    public List<ClassSchool> selectAll();
}
