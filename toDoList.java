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
   
    private static void addTask() {
        scanner.nextLine(); // Buffer leeren
        System.out.print("Geben Sie die Aufgabe ein, die hinzugefügt werden soll: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Aufgabe erfolgreich hinzugefügt!");
    }

    private static void deleteTask() {
        scanner.nextLine(); // Buffer leeren
        System.out.print("Geben Sie die Aufgabe ein, die gelöscht werden soll: ");
        String task = scanner.nextLine();
        if (tasks.remove(task)) {
            System.out.println("Aufgabe erfolgreich gelöscht!");
        } else {
            System.out.println("Aufgabe nicht gefunden!");
        }
    }

    private static void viewTasks() {
        System.out.println("\n----- Aufgaben -----");
        if (tasks.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    // Ausgabe
    private static void printMenu() {
        System.out.println("\n----- ToDo-Liste-App -----");
        System.out.println("1. Aufgabe hinzufügen");
        System.out.println("2. Aufgabe löschen");
        System.out.println("3. Aufgaben anzeigen");
        System.out.println("4. Beenden");
        System.out.print("Geben Sie Ihre Auswahl ein: ");
    }

    }

     
    
     