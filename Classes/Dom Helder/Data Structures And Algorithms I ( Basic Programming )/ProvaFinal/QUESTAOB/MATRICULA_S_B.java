package ProvaFinal.QUESTAOB;

public class MATRICULA_S_B {
    /*
    Autor: Enzo Rocha Leite Diniz Ribas
    Matricula ******
    QUESTÃO B CLASSE SECUNDARIA
     */

    public static String criptografa(String frase) {


        String[] wordVet = frase.split("");

        StringBuilder newFrase = new StringBuilder();

        // itera para cada palavra no vetor
        for (int i = 0; i < wordVet.length; i++) {

            // transforma todas as letras em maisculo
            wordVet[i] = wordVet[i].toUpperCase();

            // criptografa as vogais
            if (wordVet[i].equalsIgnoreCase("A")) {
                wordVet[i] = "X";
            } else if (wordVet[i].equalsIgnoreCase("E")) {
                wordVet[i] = "Y";
            } else if (wordVet[i].equalsIgnoreCase("I")) {
                wordVet[i] = "K";
            } else if (wordVet[i].equalsIgnoreCase("O")) {
                wordVet[i] = "K";
            } else if (wordVet[i].equalsIgnoreCase("U")) {
                wordVet[i] = "Z";
            }
        }


// adiciona o vetor a uma stringbiuld para impressao
        for (String s : wordVet) {
            newFrase.append(s);
        }
        return String.valueOf(newFrase);
    }
}
