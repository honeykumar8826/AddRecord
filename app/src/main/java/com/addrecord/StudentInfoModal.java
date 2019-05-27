package com.addrecord;

public class StudentInfoModal {
    private String userName;

    public StudentInfoModal(String userName, String userAge, String userGender) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGender = userGender;
    }

    private String userAge;
    private String userGender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

}
