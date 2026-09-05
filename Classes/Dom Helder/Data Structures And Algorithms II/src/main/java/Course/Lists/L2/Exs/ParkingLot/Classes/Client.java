package Course.Lists.L2.Exs.ParkingLot.Classes;

import Course.Lists.L2.Exs.ParkingLot.Classes.Models.People;

public class Client extends People {
    private Date dateRegistration;

    public Client(int cpf, String name) {
        super(cpf, name);
        this.dateRegistration = new Date(true);
    }

    @Override
    public String toString() {
        return "Client \n CPF: " + cpf + "\n Name: " + name +
                "\n Date of Registration: " + dateRegistration.getDate();
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }
}
