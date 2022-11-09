package ldl.com.vn.graduation.beans;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    
    private String idS; //学籍番号
    private String nameS; //名
    private String sexS; //性別
    private String classS; //クラス名
    private String phoneS; //携帯番号
    private ClassSchool classSchoolS;
    private LocalDate insD; //登録日
    private LocalDate updD; //更新日

}
