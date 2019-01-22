package com.spring4all.designpattern.pattern.creational.builder.v2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-21 21:48
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseArticle = courseBuilder.courseArticle;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseQA = courseBuilder.courseQA;
        this.courseVideo = courseBuilder.courseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseArticle;
        private String courseVideo;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}