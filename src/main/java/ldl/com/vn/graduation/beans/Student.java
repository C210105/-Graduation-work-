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
    private String nameSE; //名 漢字、英語文字、ひらがな
    private String nameSK; //名 カタカナ
    private String sexS; //性別
    private String classId; //クラス名
    private String phoneS; //電話番号
    private ClassSchool classSchoolS;
    private LocalDate insD; //登録日
    private LocalDate updD; //更新日

}
