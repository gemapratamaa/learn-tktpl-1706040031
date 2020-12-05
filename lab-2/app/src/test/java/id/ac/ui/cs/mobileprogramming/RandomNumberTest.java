package id.ac.ui.cs.mobileprogramming;

import android.widget.Button;

import org.junit.Test;

import static org.junit.Assert.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import id.ac.ui.cs.mobileprogramming.MainActivity;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class RandomNumberTest {

    MainActivity mainActivity = new MainActivity();

    @Test
    public void randomNumberTest() {

        int randomNumber = Integer.parseInt(this.mainActivity.getRandomNumber());
        assertNotEquals(0, randomNumber);
        assertTrue(randomNumber >= 1 && randomNumber <= 100);
    }

}