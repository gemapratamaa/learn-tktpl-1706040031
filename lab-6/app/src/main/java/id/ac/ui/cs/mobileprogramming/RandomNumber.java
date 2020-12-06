package id.ac.ui.cs.mobileprogramming;

import java.util.Random;

public class RandomNumber {

    public String getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(101) + 1;
        return String.valueOf(randomNumber);
    }

}
