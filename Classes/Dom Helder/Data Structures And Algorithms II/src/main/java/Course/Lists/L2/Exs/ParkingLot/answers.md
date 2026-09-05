# L2 Parking Lot

## Instructions

1) Crie um programa em linguagem JAVA, usando orientação a objetos, para registro de
veículos em um estacionamento. Os registros deverão implementados como Classe que
deverá ter os seguintes campos/atributos:

    - Código (int) – Auto numerável contador
    - Placa (string)
    - Modelo (string)
    - Entrada (>> Classe Data (dia, mes, ano, hora, minuto)
    - Saída (>> Classe Data (dia, mes, ano, hora, minuto)
    - Valor pago (float) - Preenchido automaticamente (R$1 por hora estacionada)
    - Cliente. Caso o cliente e identifique e seja fidelizado/cadastrado, deverá ser aplicado um
    desconto de 10%). Caso o cliente não deseje ser identificado, então não receberá
    desconto. Cliente também deverá ser uma classe com atributos (cpf, nome, data de
    cadastro)
    - O sistema deverá apresentar opções para:
        - a) CRUD para cliente
        - b) Registro de entrada de veículo
        - c) Registro de saída de veículo (a partir da placa, pesquisa e atualizar a data de saída
        - e valor pago)
        - d) Mostrar no console os veículos que ainda estão no estacionamento
        - e) Geração no console com o valor total pago pelos clientes durante um determinado
    mês informado pelo usuário.

    A Sigla CRUD significa (Create, Read, Update, Delete), ou seja, você terá que oferecer
    opções de Inserção, Pesquisa por código/nome, atualização e exclusão.

2) Pelo menos 7 conceitos de programação orientada a objetos deverão ser implementados
em seu projeto. Os principais conceitos são:

- Classe
- Objeto
- Atributos/Propriedade
- Método
- Encapsulamento
- Herança
- Abstração
- Polimorfismo
- Sobrecarga
- Métodos de Acesso (public, private, protected)
- Relacionamento de classes (associação,agregação e composição)
Centro Universitário Dom Helder Câmara
Disciplina: Algoritmos e Estruturas de Dados II
Professor: Diego Silva Caldeira Rocha
Descreva os conceitos de programação orientada a objetos utilizados em seu projeto e
mostre um trecho de código que o ilustra.

## Conceitos de POO

1. Classes: No projeto, existem diversas Classes, como `Vehicle`, `Client`, `Date`, `ParkingLot` e `BillingService`.

2. Objeto: Um objeto é uma instância de uma classe. No projeto, por exemplo, cada veículo registrado é um objeto da classe `Vehicle`.
Estes objetos Veículos são armazenados em um outro objeto, uma lista de veículos, que também é um objeto da classe `ArrayList`.

    ```java
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    Vehicle v = new Vehicle(model, plate, entryDate, client);
    vehicles.add(v);
    ```

3. Atributos/Propriedade: Os atributos da classe `Vehicle` incluem a plate, modelo, data de entrada, data de saída e valor pago.

    ```java
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
    ```

4. Método: A classe `BillingService` possui métodos para calcular o valor a ser pago com base no tempo de estacionamento.

    ```java
    /**
     * The cost is calculated based on the difference between entry and exit times in hour multiplied by the hourly rate.
     * If the vehicle is still parked, the current time is used as the exit time.
     * @param v vehicle
     * @return cost
     */
    float calculateCost(Vehicle v) {
        Date entry = v.getEntry();
        Date exit = v.getExit() != null ? v.getExit() : new Date(true);

        int diffSeconds = entry.difference(exit);

        if (v.getClient() != null) {
            diffSeconds = (int) (diffSeconds * 0.9);
        }

        return ((float) diffSeconds / 3600) * hourlyRate;
    }
    ```

5. Encapsulamento: Os atributos da classe `Vehicle` são privados e só podem ser acessados por meio de métodos públicos.

    ```java
    private String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    ```

6. Herança: A classe `Client` pode herdar atributos da classe `People`, que contém informações comuns a todos os clientes.

    ```java
    public class Client extends People {
    private Date dateRegistration;

    public Client() {
        super();
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
    ```

7. Abstração: A classe `Date` abstrai os detalhes de implementação de uma data, permitindo que o estacionamento trabalhe com datas sem se preocupar com sua representação interna.

8. Polimorfismo: A interface `Payable` permite que diferentes classes implementem o método `calculateCost`, possibilitando o cálculo do custo de diferentes tipos de veículos.

    ```java
    public interface Payable {
        void pay();
        boolean isPaid();
    }
    ```

9. Sobrecarga: A classe `Data` pode ter vários construtores para permitir a criação de objetos de data de diferentes maneiras.

    ````java
    public class Date {
    private final Calendar calendar = Calendar.getInstance();

    protected int day, month, year, hour, minute, second;

    public Date(){
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public Date(int hour, int minute, int second) {
        this();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Date(int hour, int minute, int second, int day, int month, int year) {
        this(hour, minute, second);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(boolean realDate) {
        this();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
    ```

10. Métodos de Acesso (public, private, protected): Alguns métodos do projeto são públicos, permitindo que outras classes interajam com os objetos de veículo e outros são privados garantindo a segurança. E os atributos são privados, garantindo o encapsulamento.

11. Relacionamento de classes (associação, agregação e composição):

- A classe `Estacionamento` possui uma associação com a classe `Veiculo`, pois um estacionamento pode ter vários veículos registrados.
- A classe `Cliente` possui uma associação com a classe `Veiculo`, pois um cliente pode ter vários veículos registrados.
- A classe `Pagamento` possui uma associação com a classe `Veiculo`, pois um pagamento está relacionado a um veículo específico.
- Composição: A classe `Estacionamento` possui uma composição com a classe `Veiculo`, pois um veículo não pode existir sem estar associado a um estacionamento (Neste Sistema).
