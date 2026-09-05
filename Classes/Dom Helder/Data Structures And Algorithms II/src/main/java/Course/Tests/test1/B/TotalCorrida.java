package Course.Tests.test1.B;

public class TotalCorrida {
    public static double calcularCustoUberBlack(int horaInicio, int minutoInicio,int horaFim, int minutoFim, double custoporsegundo){

        int hora = horaFim - horaInicio;
        int min = minutoFim - minutoInicio;

        int tempoTotal = hora * 3600 + min * 60;

        double total = tempoTotal*custoporsegundo;
        return (double) total;
    }

}
