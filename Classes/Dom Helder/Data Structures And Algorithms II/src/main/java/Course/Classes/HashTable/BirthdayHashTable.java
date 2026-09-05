package Course.Classes.HashTable;

class Data{
    int month;
    int day;

    Data(int day, int month){
        this.month = month;
        this.day = day;
    }

    boolean validate() {
        int month = this.month;
        int day = this.day;

        if (month > 13 || month <= 0) {
            return false;
        }
        if (month == 2 && day > 29) return false;

        return day > 0 && day <= 30;
    }
}

public class BirthdayHashTable {
    int SIZE = 366;
    int OF = 3;

    String[] hashTable = new String[SIZE+OF];

    int hash (Data d){
        int image = 0;
        if (! d.validate()) throw new RuntimeException("Invalid Date");
        else {
            switch (d.month){
                case 1:{
                    image = d.day-1;
                }case 2:{
                    image = 31 + d.day-1;
                }case 3:{
                    image = 31 + 29 + d.day-1;
                }case 4:{
                    image = 31 + 29 + 30 + d.day-1;
                }case 5:{
                    image = 31 + 29 + 30 + 31 + d.day-1;
                }case 6:{
                    image = 31 + 29 + 30 + 31 + 30 + d.day-1;
                }case 7:{
                    image = 31 + 29 + 30 + 31 + 30 + 31 + d.day-1;
                }case 8:{
                    image = 31 + 29 + 30 + 31 + 30 +31 + 30 + d.day-1;
                }case 9:{
                    image = 31 + 29 + 30 + 31 + 30 + 31 + 30 + 31 + d.day-1;
                }case 10:{
                    image = 31 + 29 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + d.day-1;
                }case 11:{
                    image = 31 + 29 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + d.day-1;
                }case 12:{
                    image = 31 + 29 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + d.day-1;
                }
            }
        }
        if (image == 0 ) throw new RuntimeException("Error!");
        return image;
    }

    void insert(Data birthday, String name ){
        int index = hash(birthday);
        if (hashTable[index] == null) {
            hashTable[index] = name;
        }else System.out.println("This date is already occupied by: " + hashTable[index]);

    }

    void mostrar(){
        for (String i : this.hashTable) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    String search(int day, int month){
        Data d = new Data(day, month);
        return search(d);
    }

    String search(Data d){
        int hash = hash(d);
        return this.hashTable[hash];
    }

    public static void main(String[] args) {
        BirthdayHashTable bht = new BirthdayHashTable();
        bht.insert(new Data(23,05) , "Enzo");
        bht.insert(new Data(3,05) , "Charles");
        bht.insert(new Data(9,05) , "Péter Orleans");

        bht.mostrar();

        System.out.println(bht.search(2, 05));
    }
}
