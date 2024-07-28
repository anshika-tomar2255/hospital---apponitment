package com.thinkconstrive.hospital_apponitment;

public class patient {
    //create a class for patient
    private String name;
    private String email;
    private String phone;
    private String age;

    //create a constructor
    public patient(String name, String email, String phone, String age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    //create a getter and setter method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

}
