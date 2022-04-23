DROP DATABASE IF EXISTS exam_system;
CREATE DATABASE exam_system;
USE exam_system;

DROP TABLE IF EXISTS `admin`;
CREATE TABLE admin(
id INT AUTO_INCREMENT, -- 管理员编号
username VARCHAR(20), -- 用户名
PASSWORD VARCHAR(20), -- 密码
PRIMARY KEY(id)
) ;

DROP TABLE IF EXISTS `stu`;
CREATE TABLE stu(
stu_id VARCHAR(20), -- 学生编号即学号
stu_name VARCHAR(20), -- 学生姓名
stu_sex VARCHAR(10), -- 学生性别
stu_grade VARCHAR(10), -- 学生年级
stu_class VARCHAR(10), -- 学生班级
PRIMARY KEY(stu_id)
) ;


DROP TABLE IF EXISTS `classes`;
CREATE TABLE classes(
classes_id INT, -- 班级编号
classes_name VARCHAR(20), -- 班级名称
professional_class VARCHAR(20), -- 专业班级
grade VARCHAR(20), -- 所属年级
PRIMARY KEY(classes_id)
) ;

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE teacher(
teacher_id VARCHAR(20), -- 教师编号
teacher_name VARCHAR(20), -- 姓名
teacher_subject VARCHAR(50), -- 所授学科
PRIMARY KEY(teacher_id)
) ;


DROP TABLE IF EXISTS `subject`;
CREATE TABLE SUBJECT(
subject_id VARCHAR(30), -- 学科编号
subject_name VARCHAR(20), -- 名称
PRIMARY KEY(subject_id)
) ;

DROP TABLE IF EXISTS `choice_question`;
CREATE TABLE choice_question(
cq_id INT, -- 选择题编号
subject_name VARCHAR(30), -- 所属学科
cq_level VARCHAR(10), -- 试题难度
cq_question VARCHAR(50), -- 选择问题
cq_achoice VARCHAR(50), -- 选择A
cq_bchoice VARCHAR(50), -- 选择B
cq_cchoice VARCHAR(50), -- 选择C
cq_dchoice VARCHAR(50), -- 选择D
cq_answer VARCHAR(50), -- 答案
PRIMARY KEY(cq_id)
) ;

DROP TABLE IF EXISTS `judge_question`;
CREATE TABLE judge_question(
judge_id INT, -- 判断题编号
judge_subject VARCHAR(30), -- 所属学科
judge_level VARCHAR(10), -- 试题难度
judge_question VARCHAR(50), -- 判断的问题
judge_answer VARCHAR(5), -- 答案
PRIMARY KEY(judge_id)
) ;

DROP TABLE IF EXISTS `test_paper`;
CREATE TABLE test_paper(
paper_id VARCHAR(30), -- 试卷编号
paper_subject VARCHAR(30), -- 所属学科
paper_time INT, -- 考试时长（分钟）
paper_type VARCHAR(30), -- 考试类型
paper_score INT, -- 分值
PRIMARY KEY(paper_id)
) ;


DROP TABLE IF EXISTS `paper_module`;
CREATE TABLE paper_module( -- 试卷组成表
module_id INT AUTO_INCREMENT, -- 模块编号
module_type VARCHAR(20), -- 题型（选择，判断）
module_number INT, -- 题型对应数量
module_score INT, -- 题型对应分值
module_subject VARCHAR(30),-- 模块对应学科
PRIMARY KEY(module_id)
) ;

DROP TABLE IF EXISTS `exam_list`;
CREATE TABLE exam_list( -- 考试信息表
exam_id VARCHAR(30), -- 考试编号
exam_paper VARCHAR(30), -- 考试试卷
exam_date VARCHAR(30), -- 考试日期
exam_publisher VARCHAR(30), -- 发布者
exam_class VARCHAR(30),-- 考试班级
PRIMARY KEY(exam_id)
) ;

DROP TABLE IF EXISTS `score_list`;
CREATE TABLE score_list( -- 成绩表
stu_id VARCHAR(30), -- 学号
stu_name VARCHAR(30), -- 学生姓名
stu_subject VARCHAR(30), -- 学科
stu_score INT, -- 成绩
PRIMARY KEY(stu_id)
) ;