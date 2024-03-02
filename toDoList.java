/* 
Name: Edi Ramadani
Date: 02.03.2024
Project: To-Do-List 
 */




 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class toDoList {
 
     // Deklaration
     private static ArrayList<String> tasks = new ArrayList<>();
     private static Scanner scanner = new Scanner(System.in);
 
     // Eingabe
     private static int getUserChoice() {
         try {
             return scanner.nextInt();
         } catch (Exception e) {
             // Nicht-ganzzahlige Eingabe behandeln
             scanner.nextLine(); // Buffer leeren
             return -1;
         }
        }
    }

     
    
     