package Course.Lists.L2.Exs.ParkingLot.Classes;

import java.util.Scanner;

public class ParkingLotUI {
    private ParkingLot parkingLot;
    private Scanner scanner;

    public ParkingLotUI(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n-----------------------------------------------------------\n");
            System.out.println("Welcome to the Parking Lot System");
            System.out.println("Select an option:");

            System.out.println("1. Clients Section");
            System.out.println("2. Vehicle Entry");
            System.out.println("3. Vehicle Exit");
            System.out.println("4. Show Clients");
            System.out.println("5. Show Vehicles");
            System.out.println("6. Show Revenue");
            System.out.println("9. Clear Screen");
            System.out.println("0. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    clientMenu();
                    break;
                case "2":
                    vehicleEntryMenu();
                    break;
                case "3":
                    vehicleExitMenu();
                    break;
                case "4":
                    parkingLot.showClients();
                    break;
                case "5":
                    vehiclesShowMenu();
                    break;
                case "6":
                    revenueMenu();
                    break;
                case "9":
                    clearScreen();
                    break;
                case "0":
                    exit();
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void clientMenu() {
        System.out.println("1. Add Client");
        if (!parkingLot.getClients().isEmpty()) {
            System.out.println("2. Update Client");
            System.out.println("3. Delete Client");
            System.out.println("4. Search Client");
        }
        System.out.println("0. Back");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                addClient();
                break;
            case "2":
                updateClient();
                break;
            case "3":
                deleteClient();
                break;
            case "4":
                System.out.println(searchClient().toString());
                break;
            case "0":
                return;
            default:
                System.out.println("Invalid option");
        }
    }

    private void addClient() {
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client CPF: ");
        int cpf = Integer.parseInt(scanner.nextLine());
        if (parkingLot.getClientByCpf(cpf) != null) {
            System.out.println("Client with this CPF already exists.");
            return;
        }
        parkingLot.registerClient(name, cpf);
    }

    private void updateClient() {
        System.out.print("Enter client CPF: ");
        Client c = getCliByCpfUI();
        if (c == null) {
            return;
        }
        System.out.print("New name: ");
        c.setName(scanner.nextLine());
    }

    private Client searchClient() {
        System.out.println("Search by: 1. CPF 2. Name");
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            return getCliByCpfUI();
        } else if (choice.equals("2")) {
            return getCliByNameUI();
        } else {
            System.out.println("Invalid option");
            return null;
        }
    }

    private Client getCliByCpfUI() {
        System.out.print("Enter client CPF: ");
        int cpf = Integer.parseInt(scanner.nextLine());
        return parkingLot.getClientByCpf(cpf);
    }

    private Client getCliByNameUI() {
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        return parkingLot.getClientByName(name);
    }

    private void deleteClient() {
        System.out.print("Enter client CPF: ");
        int cpf = Integer.parseInt(scanner.nextLine());
        parkingLot.removeClientByCpf(cpf);
    }

    private void vehiclesShowMenu(){
        System.out.println("1. Show Parked Vehicles\n2. Show All Vehicles\n0. Back");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                parkingLot.showParkedVehicles();
                break;
            case "2":
                parkingLot.showAllVehicles();
                break;
            case "0":
                return;
            default:
                System.out.println("Invalid option");
        }
    }

    private void vehicleEntryMenu() {
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Plate: ");
        String plate = scanner.nextLine();

        Date entryDate;
        System.out.println("Use current date and time? (y/n)");
        String dateChoice = scanner.nextLine();

        entryDate = dateChoice.equalsIgnoreCase("y") ? new Date(true) : customDateMenu();

        System.out.println("Is there a client associated? (y/n)");
        String resp = scanner.nextLine();

        if (resp.equalsIgnoreCase("y")) {
            System.out.print("Enter client CPF: ");
            int cpf = Integer.parseInt(scanner.nextLine());
            Client c = parkingLot.getClientByCpf(cpf);
            if (c != null) {
                parkingLot.vehicleEntry(model, plate, entryDate, c);
            } else {
                System.out.println("Client not found. Registering vehicle without client.");
                parkingLot.vehicleEntry(model, plate, entryDate, null);
            }
        } else {
            parkingLot.vehicleEntry(model, plate, entryDate, null);
        }
    }

    private void vehicleExitMenu() {
        System.out.print("Enter vehicle plate: ");
        String plate = scanner.nextLine();
        System.out.println("Use current date and time? (y/n)");
        String dateChoice = scanner.nextLine();
        Date exitDate = dateChoice.equalsIgnoreCase("y") ? new Date(true) : customDateMenu();

        parkingLot.vehicleExit(plate, exitDate);
    }

    private void revenueMenu() {
        System.out.println("Enter Month (1-12):");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.printf("--- Revenue Report of %s---", Date.getMonthName(month));
        float totalRevenue = parkingLot.getRevenue(month);

        System.out.println("\n------------------------------------------------------------\n");
        System.out.println("TOTAL REVENUE IN MONTH " + month + ": R$" + totalRevenue);
        System.out.println("\n-----------------------------------------------------------\n");
    }

    private Date customDateMenu() {
        System.out.println("Enter day (1-31): ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter month (1-12): ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter year (e.g., 2024): ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter hour (0-23): ");
        int hour = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter minute (0-59): ");
        int minute = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second (0-59): ");
        int second = Integer.parseInt(scanner.nextLine());

        return new Date(hour, minute, second, day, month, year);
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void populatingData(){
        parkingLot.registerClient("Alice", 123456789);
        parkingLot.registerClient("Bob", 987654321);
        parkingLot.registerClient("Charlie", 111222333);
        parkingLot.vehicleEntry("Toyota Corolla", "ABC1234", new Date(9, 30, 0,12,1,2024), parkingLot.getClientByCpf(123456789));
        parkingLot.vehicleEntry("Honda Civic", "XYZ5678", new Date(10, 15, 0), null);
        parkingLot.vehicleEntry("Ford Focus", "LMN9101", new Date(11, 45, 0), parkingLot.getClientByCpf(987654321));
    }

    private void exit(){
        System.out.println("ahh, it over... My sun, it's setting... it's dark, so dark...");
        scanner.close();
        System.exit(0);
    }


}
