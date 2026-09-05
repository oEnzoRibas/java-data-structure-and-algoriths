package Course.Lists.L3.Exs.D;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Triangulo> triangulos = new ArrayList<>();

        Triangulo escaleno = null;
        Triangulo isoceles = null;
        Triangulo equilatero = null;
        Triangulo notTriangulo = null;
        Triangulo ladosInvalidos = null;

        try {
            escaleno = new Triangulo(4, 5, 3);
        } catch (TrianguloInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            isoceles = new Triangulo(1, 3, 3);
        } catch (TrianguloInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            equilatero = new Triangulo(1, 1, 1);
        } catch (TrianguloInvalidoException ex) {
            System.out.println(ex.getMessage());
        } try{
            notTriangulo = new Triangulo(1, 1, 3);
        } catch (TrianguloInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            ladosInvalidos = new Triangulo(1, -1, 3);
        } catch (TrianguloInvalidoException ex) {
            System.out.println(ex.getMessage());
        }

        triangulos.add(escaleno);
        triangulos.add(isoceles);
        triangulos.add(equilatero);
        triangulos.add(notTriangulo);
        triangulos.add(ladosInvalidos);

        for (Triangulo i : triangulos) {
            if (i != null) System.out.println("Tipo de Triangulo: " + Triangulo.typeList.get(i.determinarTipo()));
        }

    }
}
