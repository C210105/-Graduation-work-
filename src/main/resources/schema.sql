DROP TABLE IF EXISTS student_dl;
CREATE TABLE student_dl(

    idS VARCHAR(7) NOT NULL PRIMARY KEY COMMENT '学籍番号',
    nameSE VARCHAR(30) COMMENT '名, 漢字文字, ひらがな',
    nameSK VARCHAR(30) COMMENT '名, カタカナ',
    sexS VARCHAR(5) COMMENT '性別',
    classiD VARCHAR(2) COMMENT 'クラス名',
    phoneS VARCHAR(12) COMMENT '電話番号',
    insD DATETIME COMMENT '登録日',
    updD DATETIME COMMENT '変更日'
) COMMENT '卒業作品ｃ２１０１０５';

DROP TABLE IF EXISTS classS_dl;
CREATE TABLE classS_dl(

    idC VARCHAR(2) COMMENT '順番',
    classN VARCHAR(7) NOT NULL PRIMARY KEY COMMENT 'クラス名'
) COMMENT '卒業作品ｃ２１０１０５';
