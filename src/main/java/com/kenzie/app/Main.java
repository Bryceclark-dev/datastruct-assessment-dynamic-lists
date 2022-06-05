package com.kenzie.app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Main {

    public static String formatAttendeeList(ArrayList<String> names){
        StringBuilder nameList = new StringBuilder("You have invited: ");

            if(names.size()==1) {
                nameList.append(names.get(0));
                return nameList.toString();
            }

            if(names.size()==2) {
                for (int i = 0; i < 2; i++) {
                    nameList.append(names.get(i));
                    if (i < 1) {
                        nameList.append(" and ");
                    }
                }
                return nameList.toString();
            }

            for (int i = 0; i < names.size(); i++) {
                nameList.append(names.get(i));
                if (i < names.size() - 1) {
                    nameList.append(", ");
                }
                if (i == names.size() - 2) {
                    nameList.append("and ");
                }
            }

        return nameList.toString();
    }

    public static void main(String[] args) {
        // Step 1 - Print out a welcome message and instructions
        // Step 2 - In a loop, collect each attendee name and store it in a list
        // Step 3 - when they enter a blank name, then stop looping
        // Step 4 - Then iterate over the attendee list to create the output string (using StringBuilder!)
        //
        // Note that there are three distinct formats for the output string depending on the number of attendees
        // More than 2 attendees:
        // You have invited: Leslie Knope, April Ludgate, and Ron Swanson
        //
        // Exactly 2 attendees:
        // You have invited: Leslie Knope and Ron Swanson
        // 
        // Only 1 attendee:
        // You have invited: Leslie Knope
        // 
        // Your output should exactly match the way these are formatted with spaces, commas, and the "and"

        // Your Code Here
        ArrayList<String> attendees = new ArrayList<String>();
        String names = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!  Who would you like to invite to the party?\n" +
                            "Enter an attendee name and press Enter.\n" +
                            "Leave the name blank and press enter when you are done.");

        while(true){
            names = scan.nextLine();
            if(names.equals("")){
                break;
            }
            attendees.add(names);
        }
        System.out.println(formatAttendeeList(attendees));

    }
}
