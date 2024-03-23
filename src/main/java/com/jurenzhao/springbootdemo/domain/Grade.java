package com.jurenzhao.springbootdemo.domain;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/23 20 53
 * @Description:
 **/
public class Grade {
    private String subject;
    private Double score;


    public Grade() {
    }

    public Grade(String subject, Double score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
