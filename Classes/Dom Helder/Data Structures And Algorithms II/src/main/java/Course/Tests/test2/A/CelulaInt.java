package Course.Tests.test2.A;

public class CelulaInt {
    private int elemento;
    private CelulaInt prox;

    public CelulaInt(int valor){
        this.elemento = valor;
        this.prox = null;
    }

    public int getElemento() {
        return elemento;
    }

    public CelulaInt getProx() {
        return prox;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setProx(CelulaInt prox) {
        this.prox = prox;
    }
}
