package Course.Lists.L3.Exs.D;

import java.util.Map;

public class Triangulo {
    final private double sideA;
    final private double sideB;
    final private double sideC;

    static final public Map<Integer, String> typeList = Map.of(
            0, "Equilatero",
            1, "Isoceles",
            2, "Escaleno"
    );


    public Triangulo (double a, double b, double c) throws TrianguloInvalidoException{
        if (a <= 0 || b <= 0 || c <= 0){
            throw new TrianguloInvalidoException ("Lados invalidos");
        }

        if ((a+b) <= c || (a+c) < b || (b+c) <= a ){
            throw new TrianguloInvalidoException("Lados nao formam um triangulo");
        }

        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public int determinarTipo(){
        int i = 1;
        if (checkEquilatero()){
            i = 0;
        } else if (checkEscaleno()) {
            i = 2;
        }
        return i;
    }

    private boolean checkEquilatero(){
        return (this.sideA == this.sideB && this.sideA == this.sideC);
    }

    private boolean checkEscaleno(){
        return (this.sideA != this.sideB && this.sideA != this.sideC && this.sideB != this.sideC);
    }

}
