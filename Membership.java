/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlehelper2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NorahS
 */
public class Membership {
    
  private String memberStudent, memberID, memberEmail;
 
  public void setStudent(String memberStudent) {
    this.memberStudent = memberStudent;
  }

  public void setID(String memberID) {
    this.memberID = memberID;
  }

  public void setEmail(String memberEmail) {
    this.memberEmail = memberEmail;
  }

  
  public String getStudent(String memberStudent) {
    return memberStudent;
  }

  public String getID(String memberID) {
    return memberID;
  }

  public String getEmail(String memberEmail) {
    return memberEmail;
  }

 


  public void newMember() {
    Scanner var = new Scanner(System.in);
    
      System.out.print("Please Enter Your Name : ");
      memberStudent = var.nextLine();
      setStudent(memberStudent);

      System.out.print("Please Enter Your Student ID : ");
      memberID = var.next();
      setID(memberID);

      System.out.print("Please Enter Your Email : ");
      memberEmail = var.next();
      setEmail(memberEmail);
      
      System.out.println(
          "Because you are a special subscriber, we have prepared special classes for you. Do you want to review them? ");
      System.out.println("1. Yse \n" + "2. No \n");
      int choice = var.nextInt();
      if (choice == 1)
        exclusivManu();
      else
        System.out.println("Thank you for your time, study well ");

    }

   

  public void exclusivManu() {
    ArrayList<exclusivLec> chours = new ArrayList<>();
    double price = 0;
    chours.add(new exclusivLec("Math", "9:00AM - 10;00AM", "Asma Alhajri"));
    chours.add(new exclusivLec("Physics", "10:00AM - 11;00AM", "Fouz Alkhaldi"));
    chours.add(new exclusivLec("Basics of Programming", "9:00AM - 10;30", "Khloud Alhajri"));
    chours.add(new exclusivLec("History", "9:00AM - 9;30", "Norah Almutiri"));
    chours.add(new exclusivLec("Network", "9:00AM - 10;00AM", "Hind Alssayed"));
    chours.add(new exclusivLec("Chemistry", "10:00AM - 11;00AM", "Sara Alsuhli"));
    chours.add(new exclusivLec("Digital Hardwere", "9:00AM - 10;30", "Jinan Alsihati"));
    chours.add(new exclusivLec("Biology", "9:00AM - 9;30", "Danah Albakheet"));

    System.out.println(
        "--------------------******************---------------------- "); // intro
    for (int i = 0; i < chours.size(); i++) {
      price = price + (i + 1) * 100;
      System.out.println(
          "Subject: " + chours.get(i).subject + "\n" + "Timing: " + chours.get(i).time + "\n" + "Teacher: "
              + chours.get(i).teacher );
    }
    System.out.println("You can enter at any time");
    System.out.println(
        "--------------------******************---------------------- "); // intro
    
  }

}