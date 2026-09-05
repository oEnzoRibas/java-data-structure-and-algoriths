package Course.Lists.L2.Exs.ParkingLot.Classes;

import Course.Lists.L2.Exs.ParkingLot.Interfaces.Payable;

public class Vehicle implements Payable {
    private static int vehicleCont = 0;
    private int code;
    private String model;
    private String plate;
    private Date entry;
    private Date exit = null;
    private float cost = 0;
    private Client client = null;
    private boolean isParked = true;
    private boolean paid = false;


    Vehicle(String model, String plate, Date entry){
        this.code = ++vehicleCont;
        this.model = model;
        this.plate = plate;
        this.entry = entry;
    }

    Vehicle(String Model, String Plate, Date entry, Client client){
        this(Model, Plate, entry);
        this.client = client;
    }


    public int getCode() {
        return code;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public Date getEntry() {
        return entry;
    }
    public void setEntry(Date entry) {
        this.entry = entry;
    }
    public Date getExit() {
        return exit;
    }
    public void setExit(Date exit) {
        this.exit = exit;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void setParked(boolean isParked) {
        this.isParked = isParked;
    }
    public boolean isParked() {
        return isParked;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + code +
                ", Model: " + model +
                ", Plate: " + plate +
                ", Entry: " + entry.getDate() +
                (exit != null ? ", Exit: " + exit.getDate() : "") +
                ", Cost: $" + cost +
                (isParked ? ", Status: Parked" : ", Status: Exited") +
                (client != null ? "\n Client: " + client.getName() + " (CPF: " + client.getCpf() + ")" : "\n No client associated.");
    }

    @Override
    public void pay() {
        if (!paid) {
            paid = true;
            System.out.println("Vehicle " + plate + " payment completed. Amount: R$" + cost);
        } else {
            System.out.println("Vehicle " + plate + " already paid.");
        }
    }

    @Override
    public boolean isPaid() {
        return paid;
    }

}
