package com.blxz.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String phonenumber;
    private String email;
    private String realname;
    private String sex;
    private int age;

    public User() {
    }

    public User(String username, String password, String phonenumber) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public User(Integer id, String username, String password, String phonenumber, String email, String realname, String sex, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.email = email;
        this.realname = realname;
        this.sex = sex;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
