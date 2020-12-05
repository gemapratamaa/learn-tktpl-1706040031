package id.ac.ui.cs.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lab 2";

    public String getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(101) + 1;
        return String.valueOf(randomNumber);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.random_button);
        final TextView initialNumber = findViewById(R.id.screen_number);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button clicked");

                initialNumber.setText(getRandomNumber());

            }
        });
    }


}