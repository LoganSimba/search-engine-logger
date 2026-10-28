package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SearchEngineLogger {
    public static void main(String[] args) {



        }
        //created a method for logging
        public static void loggingAction(String search){
        //Create the formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"yyyy-MM-dd HH:mm:ss\"");
        //try catch block to write with no issues
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt"));

            //getting the time for now in the format we specified above
            String time = LocalDateTime.now().format(formatter);

            writer.write(time);
            writer.newLine();
            writer.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }


    }



