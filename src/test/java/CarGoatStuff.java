package test.java;

import java.util.Random;

/**
 * Created by danielbalogh on 5/9/17.
 */
public class CarGoatStuff {

    public static Boolean[] doors = {false, false, false};
    private static Random randomGenerator = new Random();

    public static int chooser(Boolean[] bool) {
        int index = randomGenerator.nextInt(bool.length);
        //System.out.println(index);
        return index;
    }

    public static int firstOpen(Boolean[] bool) {
        int index = randomGenerator.nextInt(bool.length);
        while (bool[index] != false) {
            index = randomGenerator.nextInt(bool.length);
        }
        return index;
    }

    public static Boolean isPlayer1Win() {
        int p1FirstChoose = 0;
        doors[chooser(doors)] = true;
        doors[firstOpen(doors)] = null;
        for (int i = 1; i<doors.length; i++) {
            if (doors[i] != null) {
                p1FirstChoose = i;
            }

        }
        return doors[p1FirstChoose];
    }

    public static Boolean isPlayer2Win() {
        int p2FirstChoose = 0;
        doors[chooser(doors)] = true;
        doors[firstOpen(doors)] = null;
        return doors[p2FirstChoose];
    }

    public static void main(String[] args) {
        CarGoatStuff carOrGoat = new CarGoatStuff();
        carOrGoat.chooser(doors);
        doors[carOrGoat.chooser(doors)] = true;

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i<1000; i++) {
            isPlayer1Win();
            isPlayer2Win();
            if (isPlayer1Win()) {
                counter1 ++;
            }
            if (isPlayer2Win()) {
                counter2++;
            }
        }
        System.out.println(counter1);
        System.out.println(counter2);
    }

}
