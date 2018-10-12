package com.company;


public class Students extends Person {
    public String display() {

        return  "Id number:               " + getIdnumber() + "\n" +
                "First Name:              " + getFirstname() + "\n" +
                "Last Name:               " + getLastname() + "\n" +
                "E-mail address:          " + getEmailaddress() + "\n"+
                "Takes:                   " + getCoursename()  +"\n";
    }
}

