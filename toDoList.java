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
             scanner.nextLine();
             return -1;
         }
        }
     // Verarbeitung
     public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.out.println("ToDo-Liste-App wird beendet. Auf Wiedersehen!");
                    System.exit(0);
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
            }
        }
    }
   
   
   
    }

     
    
     