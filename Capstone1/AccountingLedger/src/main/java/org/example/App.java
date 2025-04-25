package org.example;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        boolean isRunning = true;
        while(isRunning){
            System.out.println("Welcome to the YUU Accounting Ledger");
            System.out.println("Please navigate to the Home Menu to get started");
            System.out.println("H: Home Menu");
            System.out.println("E: Exit Application");
            String userInput = sc.nextLine().toUpperCase();
            switch(userInput){
                case "H":
                    homeScreen();
                    break;
                case "E":
                    isRunning = false;
                    break;
            }
        }
    }
    public static void homeScreen(){
        System.out.println("home screen stuff!");
    }

}
