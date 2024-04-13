package ContactMenegar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Manager> managers = new LinkedList<>();
    public static void main(String[] args) {
        boolean b=true;
        while (b) {
            menu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter action:");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    add();
                    break;
                case 2:
                    contactList();
                    break;
                case 3:
                    Search();
                    break;
                case 4:
                    Delete();
                break;
                case 0:
                    System.out.println("program fnished.");
                    b = false;
                    break;
                default:
                    System.out.println("Mazgi!!!");
                    b = false;
                    break;
            }

        }
    }

    private static void Delete() {
        for (Manager manager : managers) {
            System.out.println(managers.remove(manager));
        }
    }

    private static void Search() {
        System.out.println("Enter Query: ");
        Scanner scanner = new Scanner(System.in);
        String query = scanner.next();
        for (Manager manager : managers) {
            if (manager != null && (manager.getName().toLowerCase().startsWith(query.toLowerCase())
                    || manager.getSurname().toLowerCase().startsWith(query.toLowerCase())
                    || manager.getPhone().contains(query))) {
                manager.print();
            }
        }
    }

    private static void contactList() {
        for (Manager manager : managers) {
            if (manager != null) {
                System.out.println(manager.getName() + " " + manager.getSurname() + " " + manager.getPhone());
            }
        }
    }

    public static Manager add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter surname: ");
        String surname = scanner.next();
        System.out.print("Enter phone (+998): ");
        String phone = scanner.next();
        Manager manager = new Manager();
        manager.setName(name);
        manager.setSurname(surname);
        manager.setPhone(phone);
        managers.add(manager);
        return manager;
    }

    public static void menu() {
        System.out.println("-- Contact Menu --");
        System.out.println("** Menu **");
        System.out.println("1. Add Contact");
        System.out.println("2. All");
        System.out.println("3. Search ");
        System.out.println("4. Delete ");
        System.out.println("0. Ext");
    }
}