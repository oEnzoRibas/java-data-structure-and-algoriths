package Course.Lists.L2.Exs.ParkingLot.Classes;

import Course.Lists.L2.Exs.ParkingLot.Services.BillingService;

import java.util.ArrayList;

public class ParkingLot {

    private float hourlyRate = 1.0f;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private BillingService billingService = new BillingService(hourlyRate);

    public ParkingLot(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void vehicleEntry(String model, String plate, Date entryDate, Client client) {
        Vehicle v = new Vehicle(model, plate, entryDate, client);
        v.setParked(true);
        vehicles.add(v);
        System.out.println("Vehicle registered successfully with ID: " + v.getCode());
    }

    public void vehicleExit(String plate, Date exitDate) {
        Vehicle v = findVehicleByPlate(plate);
        if (v == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        v.setExit(exitDate);
        v.setParked(false);
        billingService.processPayment(v);
    }

    private Vehicle findVehicleByPlate(String plate) {
        for (Vehicle v : vehicles) {
            if (v.getPlate().equalsIgnoreCase(plate) && v.isParked()) {
                return v;
            }
        }
        return null;
    }

    public void registerClient(String name, int cpf) {
        Client c = new Client(cpf, name);
        clients.add(c);
        System.out.println("Client registered successfully with CPF: " + c.getCpf());
    }

    void showParkedVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("No vehicles registered.");
            return;
        }
        System.out.println("\n------------------------------------------------------------\n");
        System.out.println("PARKED VEHICLES: \n");
        for(Vehicle v : vehicles){
            if (v.isParked()) System.out.println(v.toString());
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }

    void showAllVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("No vehicles registered.");
            return;
        }
        System.out.println("\n------------------------------------------------------------\n");
        System.out.println("ALL VEHICLES: \n");
        for(Vehicle v : vehicles){
            System.out.println(v.toString());
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }

    Client getClientByCpf(int cpf){
        if(clients.isEmpty()){
            return null;
        }
        for(Client c : clients){
            if(c.getCpf() == cpf){
                return c;
            }
        }
        return null;
    }

    Client getClientByName(String name){
        if(clients.isEmpty()){
            return null;
        }
        for(Client c : clients){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }

    void removeClientByCpf(int cpf){
        if(clients.isEmpty()){
            System.out.println("No clients registered.");
            return;
        }
        Client c = null;
        for(Client client : clients){
            if(client.getCpf() == cpf){
                c = client;
                break;
            }
        }
        if(c == null){
            System.out.println("Client not found.");
            return;
        }
        clients.remove(c);
        System.out.println("Client removed successfully.");
    }

    void showClients(){
        if(clients.isEmpty()){
            System.out.println("No clients registered.");
            return;
        }
        System.out.println("\n------------------------------------------------------------\n");
        System.out.println("REGISTERED CLIENTS: \n");
        for(Client c : clients){
            System.out.println(c.toString());
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }

    float getRevenue(int month){

        return billingService.totalMonthRevenue(vehicles, month);

    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
