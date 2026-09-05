/*
import java.util.*;


public class AjudaProva {
}

//Vetor
//Tipo Nome[] = new Tipo[Tamanho]
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nomeVetor[] = new String[10];

    // for usando numero definido ou tamanho do vetor
    //i< 10
    for (int i = 0; i < nomeVetor.length; i++) {
        //preencher
        nomeVetor[i] = teclado.nextLine();
    }
    //Outro modelo For p/ leitura
    for (String i : nomeVetor) {
        System.out.println(i);
    }


    // Para impressão inversa
    for (int i = nomeVetor.length - 1; i >= 0; i--) {
        System.out.println(i);
    }


    //Para pesquisa um valor dentro do vetor, declarar uma variavel tipo int com um valor negativo ou que não será utilizado
    int numero[] = new int[10];
    int valor, pos = 0;
    System.out.println("Informe o valor");
    valor = teclado.nextInt();
    do {
        pos++;
    } while (pos < numero.length && valor != numero[pos]);
    if (pos == numero.length)
        System.out.print("Valor NÃO encontrado");
    else
        System.out.print("Valor encontrado");


    // caso de String, utiliza-se equalsToIgnoreCase
    String nome = "";
    while (pos < nomeVetor.length && nome.equalsIgnoreCase(nomeVetor[pos])) {
        pos++;
    }
    ;
    if (pos == numero.length)
        System.out.print("Valor NÃO encontrado");
    else
        System.out.print("Valor encontrado");


    //Metodo bolha

    int vet[] = new int[6];
    int temp1;
    int cont= vet.length-1;
    for (int aux = 0; aux < vet.length - 1; aux++) {
        for (int x = 0; x < cont - 1; x++) {
            if (vet[x] > vet[x + 1]) {
                //vet[x] > vet[x + 1] Crescente
                //vet[x] > vet[x + 1] Decrescente
                temp1 = vet[x];
                vet[x] = vet[x + 1];
                vet[x + 1] = temp1;
            }
        }
        cont--;
    }

    //String
    String temp;
    for (int aux = 0; aux < nomeVetor.length - 1; aux++) {
        for (int x = 0; x < nomeVetor.length - 1; x++) {
            if (nomeVetor[x].compareToIgnoreCase(nomeVetor[x + 1]) > 0) {
                temp = nomeVetor[x];
                nomeVetor[x] = nomeVetor[x + 1];
                nomeVetor[x + 1] = temp;
            }
        }
    }
    //em caso de dois vetores, juntar os dois IF dos exemplos

    //Em caso de ordernação de arrays unicos pode utilizar o Arrays.sort(), fazendo a importação com Alt + enter;
    Arrays.sort(vet);
    //Caso de Ordem decrescente, importar Collections juntamente;
    Arrays.sort(nomeVetor, Collections.reverseOrder());


    //Método split da classe String Dividir uma string em vários substrings, separados por um caracter, atribuindo cada substring às posições de um vetor
    String nomeSplit = "RICARDO LUIZ DE FREITAS";
    String palavras[] = nomeSplit.split(" ");
    //Utilizar for com nome do vetor criador como tamanho; palavras.length



    //LISTA DINAMICA
    //ALT + enter para importar
    List<String> LISTA = new ArrayList<String>();
    //Para Adicionar
    LISTA.add(nome);
    LISTA.add("Ricardo");
    LISTA.add(teclado.nextLine());
    //com posição
    LISTA.add(0,teclado.nextLine());
    //Atualizar
    LISTA.set(0,teclado.nextLine());//teclado.nextLine/ nome de uma variavel String ou o conteudo com ""
    //Para Remover
    LISTA.remove(2);
    LISTA.remove(LISTA.size()-1);//Ultimo Item
    //Para Limpar
    LISTA.clear();

    //Para recuperar um valor
    LISTA.get(1);
    //Para pesquisar um item
    LISTA.indexOf("Ricardo");
    //Ou nome da variavel LISTA.indexOf(nome) // tecladonextLine

    //Para Imprimir
    for (int aux=0; aux < LISTA.size(); aux++)
        System.out.println(LISTA.get(aux));
    // IMPRIMIR O CONTEÚDO DE UMA LISTA DINÂMICA – Forma 2
    for (String nomes : LISTA)
        System.out.println(nomes);

    //Ordernação Lista Dinamica
    //Crescente
    for (int aux = 0; aux < LISTA.size()-1; aux++) {
        for (int x = 0; x < LISTA.size() - 1; x++) {
            if (LISTA.get(x).compareToIgnoreCase(LISTA.get(x + 1)) > 0) {
                temp = LISTA.get(x);
                LISTA.set(x, LISTA.get(x + 1));
                LISTA.set(x + 1, temp);
            }
        }
    }
    //Decrescente LISTA.get(x).compareToIgnoreCase(LISTA.get(x + 1)) < 0
}

//METODOS

//public: poderá ser chamado por qualquer classe ou programa;
//static: poderá ser executado mesmo sem nenhum objeto criado;
//void: não retornará nenhum valor.

//public static void nome1 (tipo parâmetro, tipo parâmetro, ...) {
//    comandos;
//}
//static void nome2 (tipo parâmetro, tipo parâmetro, ...) {
//    comandos;
//}


//METODOS COM RETORNO

//public static long nome1 (TIPO parâmetro, TIPO parâmetro, ...) {
//    comandos;
//    return <variável ou expressão do método do tipo long;
//}
//static int nome2 (TIPO parâmetro, TIPO parâmetro, ...) {
//    comandos;
//    return variável ou expressão do método do tipo int;
//}


public class CalculaRaizQuadrada_ComMetodoSemParametro {
    static double raiz;
    static int numero;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        numero = teclado.nextInt();
        RaizQuadrada();
        System.out.print("Raiz quadrada = "+raiz);
        teclado.close();
    }
    static void RaizQuadrada() {
        if (numero > 0)
            raiz = Math.sqrt(numero);
        else
            raiz = 0;
    }
}


public class CalculaRaizQuadrada_ComMetodoComParametroA {
    public static void main(String[] args) {
        double raiz;
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        numero = teclado.nextInt();
        raiz = RaizQuadrada(numero);
        System.out.print("Raiz quadrada = "+raiz);
        teclado.close();
    }
    static double RaizQuadrada(int num) {
        if (num > 0)
            return Math.sqrt(num);
        else
            return 0;
    }
}

public class CalculaRaizQuadrada_ComMetodoComParametroB {
    public static void main(String[] args) {
        double raiz;
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        numero = teclado.nextInt();
        raiz = RaizQuadrada(numero);
        System.out.print("Raiz quadrada = "+raiz);
        teclado.close();
    }
    static double RaizQuadrada(int num) {
        double raiz = 0;
        if (num > 0)
            raiz = Math.sqrt(num);
        return raiz;
    }
}

public class CalculaRaizQuadrada_ComMetodoComParametroC {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        numero = teclado.nextInt();
        System.out.print("Raiz quadrada = "+RaizQuadrada(numero));
        teclado.close();
    }
    static double RaizQuadrada(int num) {
        if (num > 0)
            return Math.sqrt(num);
        else
            return 0;
    }
}

//Chamando um metodo
//Chamada interna
public class TesteFuncao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor: ");
        valor = teclado.nextInt();
        System.out.println("Resultado = "+funcao(valor));
        teclado.close();
    }
    public static int funcao(int numero) {
        int resultado;
        resultado = numero * 1000;
        return resultado;
    }
}
//Chamada Externa
public class TesteFuncaoChamadaExterna {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor: ");
        valor = teclado.nextInt();
        System.out.println("Resultado = "+TesteFuncao.funcao(valor));
        teclado.close();
    }
}

//Math.pow(x,y)	Calcula a potência de X elevado a Y
//Math.sqrt(x)	Calcula a raiz quadrada de X
//Math.cbrt(x)	Calcula a raiz cúbica de X
//Math.round(x)	Arredonda o número real X para cima ou para baixo transformando-o num inteiro
// Math.ceil(x)	Arredonda o número real X para cima
//Math.floor(x)	Arredonda o número real X para baixo
//Math.abs(x)	Retorna o valor absoluto de X
//Math.PI	 Retorna o valor de 
// Math.exp(x)	Obtém e elevado a X (e – neperiano)
// Math.random()	Retorna um número aleatório entre 0 e 1
// Math.log(x)	Obtém o logaritmo natural de X
// Math.log10(x)	Obtém o logaritmo na base 10 de X
//Math.sin(x)	Calcula o seno de X (X deve estar representado em radianos)
// Math.cos(x)	Calcula o cosseno de X (X deve estar representado em radianos)
// Math.tan(x)	Calcula a tangente de X (X deve estar representado em radianos)
// Math.toDegrees(x)	Converte a medida de X de radianos para graus
//Math.toRadians(x)	Converte a medida de X de graus para radianos


//STR1.equals(STR2) 	Retorna true se as strings (STR1 e STR2) forem iguais
//Retorna false se as strings (STR1 e STR2) forem diferentes
//STR1.equalsIgnoreCase(STR2) 	Idem porém ignora maiúsculo/minúsculo
//STR1.compareTo(STR2) 	Retorna 0 se STR1 for igual a STR2
//Retorna valor > 0 se STR1 for maior que STR2
//Retorna valor < 0 se STR1 for menor que STR2
//STR1.compareToIgnoreCase(STR2) 	Idem porém ignora maiúsculo/minúsculo


//(int)CARACTER	Retorna o código ASCII referente a CARACTER
// (char)NUMERO Retorna o caracter referente ao código ASCII de NUMERO
//Integer.parseInt(STR)
//Float.parseFloat(STR)
//Double.parseDouble(STR)	Converte a string STR para um valor numérico
//String.valueof(NUMERO)	Converte a variável inteira NUMERO para uma string
//STR.length()	Retorna o tamanho da string STR (incluindo espaços em branco)
// STR.substring(pi, pf)	Retorna o substring entre pi e pf-1 de STR. Se pf não for informado será retornado de pi até o fim da STR.
//O primeiro caracter de uma string está no índice 0.
// STR.toUpperCase()	Converte todos os caracteres da string STR para maiúsculo
//STR.toLowerCase()	Converte todos os caracteres da string STR para minúsculo
//STR1.indexOf(STR2) 	Retorna a posição da string STR2 na string STR1. Se não encontrar retorna -1
// STR.charAt(pos)	Retorna o caracter presente na posição pos da string STR
//STR.split(CARACTER)	Divida a string STR em vários substrings, separados por CARACTER, e atribui cada substring às posições de um vetor
//STR.replace(STR1,STR2)
//STR.replaceAll(STR1,STR2)	replace troca substring STR1 pela substring STR2 em STR.
//replaceAll troca todas as ocorrências de STR1 por STR2
//STR.trim()	Retira espaços em branco ao final e início da string STR

//Impressão do ultimo nome
public class C13EX07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Informe um nome completo");
        nome = sc.nextLine();

        System.out.println("O nome da familia é : " + nome.substring(nome.lastIndexOf(" ")+1));
        sc.close();
    }
}

//Exemplos:
//Ricardo Luiz Freitas
//=> FREITAS, R. L.
//Anacelia Maria Graças Nery
//=> NERY, A. M. G.

public class C13EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Informe seu nome completo:");
        nome = teclado.nextLine();

        System.out.print(nome.substring(nome.lastIndexOf(" ")+1)+",");
        for (int i = 0; i < nome.split(" ").length-1; i++) {
            System.out.print(" "+nome.split(" ")[i].substring(0,1)+".");
        }
    }
}

//Inicias maiusculas
public class C13EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Informe uma frase:");
        frase = teclado.nextLine();

        for (int i = 0; i < frase.split(" ").length; i++) {

            System.out.print(frase.split(" ")[i].substring(0,1).toUpperCase() + frase.split(" ")[i].substring(1).toLowerCase() + " ");
        }
        teclado.close();

    }
}


//Impressão vertical
public class C13EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Informe uma frase:");
        frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {

            System.out.println(frase.split("")[i].toUpperCase());
        }
        teclado.close();
    }
}

//Impoetando classes
public class Menu2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario=0, inss=0;
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Calcula INSS com alíquota única");
            System.out.println("2 - Calcula INSS com duas alíquotas");
            System.out.println("3 - Calcula INSS com três alíquotas");
            System.out.println("9 - Sair");
            System.out.print(">>> ");
            opcao = teclado.nextInt();
            if (opcao>=1 && opcao<=3) {
                System.out.print("Informe valor do seu salário: ");
                salario = teclado.nextDouble();
            }
            switch (opcao) {
                case 1:inss=ClasseCalculaINSSGeral.MetodoCalculaINSSGeral1(salario); break;
                case 2:inss=ClasseCalculaINSSGeral.MetodoCalculaINSSGeral2(salario); break;
                case 3:inss=ClasseCalculaINSSGeral.MetodoCalculaINSSGeral3(salario); break;
                case 9: break;
                default: System.out.println("OPÇÃO INVÁLIDA"); break;
            }
            if (opcao>=1 && opcao<=3)
                System.out.printf("Valor do INSS = %1.2f\n\n",inss);
        }
        System.out.println("FIM DO PROGRAMA");
        teclado.close();
    }
}
//Metodo 1
public class ClasseCalculaINSSGeral {
    public static double MetodoCalculaINSSGeral1(double salario) {
        double inss;
        inss = salario * 0.08;
        return inss;
    }
    public static double MetodoCalculaINSSGeral2(double salario) {
        double inss;
        if (salario <= 300)
            inss = salario * 0.08;
        else
            inss = salario * 0.1;
        return inss;
    }
    public static double MetodoCalculaINSSGeral3(double salario) {
        double inss;
        if (salario <= 300)
            inss = salario * 0.08;
        else
        if (salario <= 1000)
            inss = salario * 0.09;
        else
            inss = salario * 0.1;
        return inss;
    }
}
//Metodo 2
public class ClasseCalculaINSSGeralAparte {
    public static double MetodoCalculaINSSGeral1(double salario) {
        return salario * 0.08;
    }
    public static double MetodoCalculaINSSGeral2(double salario) {
        if (salario <= 300)
            return salario * 0.08;
        else
            return salario * 0.1;
    }
    public static double MetodoCalculaINSSGeral3(double salario) {
        if (salario <= 300)
            return salario * 0.08;
        else
        if (salario <= 1000)
            return salario * 0.09;
        else
            return salario * 0.1;
    }
}



//CONTEUDO 15, NÃO NECESSARIO USAR NA PROVA
//iNSTANCIANDO CLASSES
//public class UtilizaPessoa {
//    public static void main(String[] args) {
//        // Instanciando (criando) objetos de Pessoa
//        Pessoa exemplo1 = new Pessoa();
//        exemplo1.nome = "Maria das Dores Silva";
//        exemplo1.anoNasc = 1980;
//        Pessoa exemplo2 = new Pessoa();
//        exemplo2.nome = "João Luiz Soares";
//        exemplo2.anoNasc = 1967;
//        // Acessando diretamente os atributos da classe
//        System.out.println("Nome: " + exemplo1.nome);
//        System.out.println("Ano Nascimento: " + exemplo1.anoNasc);
//        // Chamando o método da classe
//        exemplo1.ImprimePessoa();
//        exemplo2.ImprimePessoa();
//    }
//}

public static class Pessoa {
    // Atributos da classe
    private String nome;
    private int anoNasc;

    // Construtor padrão (sem parâmetros) (fica oculto)
    public Pessoa() {
    }
    // Construtor com parâmetros
    public Pessoa(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
    // Métodos da classe
    public void ImprimePessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano Nascimento: " + this.anoNasc);
    }
}
public class UtilizaPessoa {
    public static void main(String[] args) {
        // Instanciando objetos de Pessoa
        Pessoa exemplo1 = new Pessoa("Maria das Dores Silva",1980);
        Pessoa exemplo2 = new Pessoa("João Luiz Soares",1967);
        // Acessando diretamente os atributos da classe
        System.out.println("Nome: " + exemplo1.nome);
        System.out.println("Ano Nascimento: " + exemplo1.anoNasc);
        // Chamando o método da classe
        exemplo1.ImprimePessoa();
        exemplo1.ImprimePessoa();
    }


}

public class  maior {

    public static class Pessoa1 {
        // Atributos da classe
        private String nome1;
        private int anoNasc1;
        // Métodos da classe
        public String getNome1() {
            return this.nome1;
        }
        public int getAnoNasc1() {
            return this.anoNasc1;
        }
        public void setNome1(String nome) {
            this.nome1 = nome;
        }
        public void setAnoNasc1(int anoNasc) {
            this.anoNasc1 = anoNasc;
        }
    }

    public class UtilizaPessoa1 {
        public static void main(String[] args) {
            // Instanciando objetos de Pessoa
            Pessoa1 exemplo1 = new Pessoa1();
            // Acessando diretamente os atributos da classe => NÃO PODE MAIS
            exemplo1.nome1 = "Maria das Dores Silva";
            exemplo1.anoNasc1 = 1980;
            System.out.println("Nome: " + exemplo1.nome1);
            System.out.println("Ano Nascimento: " + exemplo1.anoNasc1);
            // Chamando os métodos da classe que acessam os atributos

            exemplo1.setNome1("Maria das Dores Silva");
            exemplo1.setAnoNasc1(1980);
            System.out.println("Nome: " + exemplo1.getNome1());
            System.out.println("Ano Nascimento: " + exemplo1.getAnoNasc1());
        }
    }
}



public  class Polimorfismo{
    public class Pessoa {
        // Atributos da classe
        String nome;
        int anoNasc;
        // Métodos da classe
        public Pessoa(String nome, int anoNasc) {
            this.nome = nome;
            this.anoNasc = anoNasc;
        }
        public void ImprimePessoa() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Ano Nascimento: " + this.anoNasc);
        }
    }

    public class Aluno extends Pessoa {
        // Atributos da classe
        private String ra;
        private String curso;
        // Métodos da classe
        public Aluno(String nome, int anoNasc, String ra, String curso) {
            super(nome, anoNasc);
            this.ra = ra;
            this.curso = curso;
        }
        // Substituição de método da classe pai (Pessoa)
        public void ImprimePessoa() {
            System.out.println("Aluno: " + this.nome);
            System.out.println("Registro Acadêmico: " + this.ra);
        }
    }

}


//utilizando em Lista Dinamica
//Para não declarar como static é necessario que a classe pessoa esteja em uma classe a parte
public class ListaDinamica{
    public class Pessoa{
//        // Atributos da classe
//        private String nome;
//        private int anoNasc;
//        private float altura;
//        private String sexo;
//
//        // Métodos da classe
//        public Pessoa(String nome, int anoNasc, float altura, String sexo) {
//            this.nome = nome;
//            this.anoNasc = anoNasc;
//            this.altura = altura;
//            this.sexo = sexo;
//        }
//        public String getNome() {
//            return this.nome;
//        }
//
//        public int getAnoNasc() {
//            return this.anoNasc;
//        }
//
//        public float getAltura() {
//            return this.altura;
//        }
//
//        public String getSexo() {
//            return this.sexo;
//        }
//        public void setNome(String nome) {
//            this.nome = nome;
//        }
//
//        public void setAnoNasc(int anoNasc) {
//            this.anoNasc = anoNasc;
//        }
//
//        public void setAltura(float altura) {
//            this.altura = altura;
//        }
//
//        public void setSexo(String sexo) {
//            this.sexo = sexo;
//        }
//        public void ImprimePessoa() {
//            System.out.println("Nome: " + this.nome);
//            System.out.println("Ano Nascimento: " + this.anoNasc);
//            System.out.println("Altura: " + this.altura);
//            System.out.println("Sexo: " + this.sexo);
//        }
//
//        public int IdadePessoa(int anoBase) {
//            int idade;
//            idade = anoBase - this.anoNasc;
//            return idade;
//        }

        public class ListaPessoa{


            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                String nome, sexo;
                int anoNasc;
                float altura;

                // DECLARAÇÃO DE UMA LISTA DE PESSOAS
                List<Pessoa3> Pessoas = new ArrayList<Pessoa3>();

                // ADICIONA PESSOAS A LISTA
                do {
                    System.out.print("Informe o nome de uma pessoa (X para fim): ");
                    nome = teclado.nextLine();
                    if (nome.equalsIgnoreCase("X"))
                        break;
                    System.out.print("Informe o ano de nascimento desta pessoa: ");
                    anoNasc = teclado.nextInt();
                    System.out.print("Informe a altura desta pessoa: ");
                    altura = teclado.nextFloat();
                    teclado.nextLine();
                    System.out.print("Informe o sexo desta pessoa: ");
                    sexo = teclado.nextLine();
                    // ADICIONA A PESSOA NA LISTA
                    Pessoas.add(new Pessoa3(nome,anoNasc,altura,sexo));
                } while (true);
                imprimirPessoas(Pessoas);
                System.out.print("Informe o nome de uma pessoa para pesquisar: ");
                nome = teclado.nextLine();

                // PESQUISA NOME DA PESSOA NA LISTA
                int pos = -1;
                boolean achou = false;
                for (Pessoa3 P : Pessoas) {
                    pos++;
                    if (P.getNome().equalsIgnoreCase(nome)) {
                        System.out.println("--------------------------------------------");
                        System.out.println(">>> Pessoa encontrada:");
                        P.ImprimePessoa();
                        System.out.println("--------------------------------------------");
                        achou = true;
                        break;
                    }
                }
                if (achou) {
                    System.out.println("Quer removê-la da lista (S/N)?");
                    String resp = teclado.nextLine();
                    if (resp.equalsIgnoreCase("S"))
                        Pessoas.remove(pos);
                }
                else
                    System.out.println("Pessoa não encontrada!");

                // ORDENA LISTA DE PESSOAS PELO MÉTODO DA BOLHA
                ordenarPessoas(Pessoas);

                imprimirPessoas(Pessoas);

                teclado.close();
            }

            private static void imprimirPessoas(List<Pessoa3> Pessoas) {
                System.out.println();
                System.out.println("------------------------------------------------");
                System.out.println("Lista de Pessoas");
                System.out.println("------------------------------------------------");
                int pos = 0;
                for (Pessoa3 P : Pessoas) {
                    pos++;
                    System.out.println(">>>> Pessoa " + pos);
                    P.ImprimePessoa();
                    System.out.println("----------------------------------------------");
                }
                System.out.println("Número de pessoas na lista: " + Pessoas.size());
                System.out.println("------------------------------------------------");
                System.out.println();
            }

            private static void ordenarPessoas(List<Pessoa3> Pessoas) {
                Pessoa3 temp;
                for (int aux = 0; aux < Pessoas.size()-1; aux++)
                    for (int x = 0; x < Pessoas.size()-1; x++)
                        if (Pessoas.get(x).getNome().compareToIgnoreCase(Pessoas.get(x+1).getNome()) > 0) {
                            temp = Pessoas.get(x);
                            Pessoas.set(x,Pessoas.get(x+1));
                            Pessoas.set(x+1,temp);
                        }
            }
        }


    }
}
 */
