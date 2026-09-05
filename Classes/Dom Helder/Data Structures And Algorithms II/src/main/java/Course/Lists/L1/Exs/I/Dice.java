package Course.Lists.L1.Exs.I;

public class Dice {
    public static void main(String[] args) {
        System.out.println("Rolling dice..");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(rollD6());
    }
    public static int rollD6(){
        return (int) (Math.random()*6 + 1);
        }
    }
