package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        //created a scanner
        Scanner scanner = new Scanner(System.in);
        //call the method to run the application
        applicationRunning(scanner);


        }
        //created a method for logging
        public static void loggingAction(String search){
        //Create the formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"yyyy-MM-dd hh:mm:ss\"");
        //try catch block to write with no issues
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt",true));

            //getting the time for now in the format we specified above
            String time = LocalDateTime.now().format(formatter);

            writer.write(time + " " + search);
            writer.newLine();
            writer.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }

        // added a method that runs the application until exit option
        public static void applicationRunning(Scanner scanner){
            // boolean to track if the app continues running
            boolean appRunning = true;
            loggingAction("launch");
            while(appRunning){
                System.out.println("Enter a search term(x to exit): ");
                String search = scanner.nextLine();
                //if statement to check if they typed x so we exit the application
                if(search.equalsIgnoreCase("x")){
                    loggingAction("exit");
                    appRunning = false;
                    break;
                }
                else{
                    loggingAction("search: " + search);
                }
            }
        }


    }



