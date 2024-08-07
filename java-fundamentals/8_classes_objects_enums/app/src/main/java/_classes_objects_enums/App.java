/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _classes_objects_enums;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    Guest[] guestList = new Guest[99];
    Pokemon[] pokemonList = new Pokemon[99];
    Employee[] employeeList = new Employee[99];

    public static void main(String[] args) {
        App app = new App();
        app.start();

    }

    public void start() {
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                managePokemon();
                break;
            case 2:
                manageEmployees();
                break;
            case 3:
                manageTickets();
                break;
            case 4:
                checkParkStatus();
                break;
            case 5:
                handleEvent();
                break;
            case 6:
                ExitPark();
                System.exit(0);
        }
    }

    private void manageEmployees() {
        Print("SELECTED:  Managing Employees");
    }

    private void manageTickets() {
        Print("SELECTED: Managing Tickets");
    }

    private void checkParkStatus() {
        Print("SELECTED: Checking Park Status");
    }

    private void handleEvent() {
        Print("SELECTED: Handling Event");
    }

    private void ExitPark() {
        Print("SELECTED: Exiting Park!");
    }

    private void managePokemon() {
        Print("SELECTED: Managing Pokemon");
    }

    public void displayMainMenu() {
        String[] menuOptions = {
                "Welcome to my Pokemon Park!",
                "1. Manage Pokemon",
                "2. Manage Park Employees",
                "3. Manage Tickets",
                "4. Check Park Status",
                "5. Handle Special Events",
                "6. Exit"
        };

        PrintMenu(menuOptions);
    }

    static void Print(Object obj) {
        System.out.println(obj);
    }

    static void PrintMenu(String[] menuOptions) {
        for (String menuDescription : menuOptions) {
            Print(menuDescription);
        }
    }

    private record Pokemon2(PokeType type, int level, String name) {
        Pokemon2(PokeType type, int level, String name) {
            this.type = type;
            this.level = level;
            this.name = name;
        }
    }

    private class Pokemon {
        private PokeType type;
        private int level;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Pokemon(PokeType type, int level, String name) {
            this.type = type;
            this.level = level;
            this.name = name;
        }

        public PokeType getType() {
            return type;
        }

        public void setType(PokeType type) {
            this.type = type;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }

    private enum PokeType {
        FIRE, WATER, GRASS
    }

    private class Guest {
        private String name;
        private PokeType favourite;

        Guest(String name, PokeType favourite) {
            this.name = name;
            this.favourite = favourite;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PokeType getFavourite() {
            return favourite;
        }

        public void setFavourite(PokeType favourite) {
            this.favourite = favourite;
        }

    }

    private class Employee {
        private String name;
        PokeType speciality;
        private int wage;

        Employee(String name, PokeType speciality, int wage) {
            this.name = name;
            this.speciality = speciality;
            this.wage = wage;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PokeType getSpeciality() {
            return speciality;
        }

        public void setSpeciality(PokeType typeSpeciality) {
            this.speciality = typeSpeciality;
        }

        public int getWage() {
            return wage;
        }

        public void setWage(int wage) {
            this.wage = wage;
        }

    }
}
