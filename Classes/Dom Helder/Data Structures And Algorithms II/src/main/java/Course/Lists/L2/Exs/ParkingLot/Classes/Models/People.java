package Course.Lists.L2.Exs.ParkingLot.Classes.Models;

public class People {
    protected int cpf;
    protected String name;

    public People(int cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
