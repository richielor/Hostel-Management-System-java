/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hostelmanagement;

/**
 *
 * @author KMAP
 */
import java.util.Scanner;
public class HostelManagement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String student_ID = "";
        String student_name = "";
        String gender = "";
        String hostel_name = "";
        int level = 0;
        String roomNumber = "";
        double hostel_fee = 0;
        int choice;
        do{
            System.out.println("\n================== HOSTEL MANAGEMENT SYSTEM ===========");
            System.out.println("1. Register Student");
            System.out.println("2. Display Student Information");
            System.out.println("3. Calculate Hostel Fee");
            System.out.println("4. Check Discount Eligibility");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n------------ Register Student --------------");
                    System.out.println("Enter Student ID: ");
                    student_ID = input.nextLine();
                    System.out.print("Enter Student Name: ");
                    student_name = input.nextLine();
                    System.out.print("Enter Gender (Male or Female): ");
                    gender = input.nextLine();
                    System.out.print("Enter Level (100,200,300,400): ");
                    level = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Hostel Name: ");
                    hostel_name = input.nextLine();
                    System.out.print("Enter Room Number: ");
                    roomNumber = input.nextLine();
                    System.out.println("Student Registered Successfully!");
                    break;
                case 2:

                    System.out.println("\n--- Student Information ---");
                    System.out.println("Student ID: " + student_ID);
                    System.out.println("Student Name: " + student_name);
                    System.out.println("Gender: " + gender);
                    System.out.println("Level: " + level);
                    System.out.println("Hostel Name  : " + hostel_name);
                    System.out.println("Room Number  : " + roomNumber);
                    System.out.println("Hostel Fee   : GH₵" + hostel_fee);
                    break;
                    case 3:

                    switch(level) {

                        case 100:
                            hostel_fee = 2000;
                            break;

                        case 200:
                            hostel_fee = 2500;
                            break;

                        case 300:
                            hostel_fee = 3000;
                            break;

                        case 400:
                            hostel_fee = 3500;
                            break;

                        default:
                            hostel_fee = 0;
                            System.out.println("Invalid Level!");
                    }

                    if (hostel_fee > 0) {
                        System.out.println("Hostel Fee = GH₵" + hostel_fee);
                    }

                    break;

                case 4:

                    if (level == 100 || hostel_fee > 3000) {
                        System.out.println("Student qualifies for a 10% discount.");
                    } else {
                        System.out.println("Student does not qualify for a discount.");
                    }

                    break;

                case 5:

                    System.out.println("Thank you for using Hostel Management System. BLESS UP");

                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);

        input.close();
            }
        }
