package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //prompt the user to enter a student and a teacher to personlist
        Scanner keyboard = new Scanner(System.in);
        // creating a student and teacher list
//
        ArrayList<Person> personlist;
        personlist = new ArrayList<>();


        while (true) {
            System.out.println("Enter Details of a Person:");
            Students ss = new Students();

            System.out.println("Enter Id Number:");
            String idnumber = keyboard.next();
            ss.setIdnumber(idnumber);

            System.out.println("Enter FirstName:");
            String firstname = keyboard.next();
            ss.setFirstname(firstname);

            System.out.println("Enter LastName:");
            String lastname = keyboard.next();
            ss.setLastname(lastname);

            System.out.println("Enter Email-address:");
            String emailaddress = keyboard.next();
            ss.setEmailaddress(emailaddress);

            System.out.println("Enter CourseName:");
            String coursename =keyboard.next();
            ss.setCoursename(coursename);

            //clear the buffer
            keyboard.nextLine();

            //add the student to the studlist
            personlist.add(ss);

            //ask the user to enter another car
            System.out.println("Do you want to enter another person? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n"));{
                break;
            }



        }
        //print out the students
        for (Person Student: personlist){
            System.out.println(Student.display());

        }
        for (Person teachers: personlist){
            System.out.println(teachers.display());

        }System.out.println("GoodBye!!");
        }
//

    }