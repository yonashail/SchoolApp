package com.company;

public class Person extends Courses{

        private String firstname;
        private String lastname;
        private String emailaddress;
        private String idnumber;
        private Courses courses;

        public String display(){

            return  "Id number:               " + getIdnumber() + "\n" +
                    "First Name:              " + getFirstname() + "\n" +
                    "Last Name:               " + getLastname()+ "\n" +
                    "E-mail address:          " + getEmailaddress()+"\n"+
                    "Takes:                    " + getCoursename() +"\n";            }

        public Person() {

            idnumber = "";
            firstname = "";
            lastname = "";
            emailaddress = "";

        }



        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmailaddress() {
            return emailaddress;
        }

        public void setEmailaddress(String emailaddress) {
            this.emailaddress = emailaddress;
        }

        public String getIdnumber() {
            return idnumber;
        }

        public void setIdnumber(String idnumber) {
            this.idnumber = idnumber;
        }
    }

