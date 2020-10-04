package id.ac.ui.cs.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;


public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean isRunning;
    public Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
    }

    public void startChronometer(View view) {
        startButton = findViewById(R.id.startButton);
        if (!isRunning) {
            // Supaya start dari pas START diklik
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            isRunning = true;
            // startButton.setText("START");
            startButton.setVisibility(View.INVISIBLE);
        }

    }

    public void pauseChronometer(View view) {
        if (isRunning) {
            chronometer.stop(); // Cuma stop update text
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            isRunning = false;
            startButton.setVisibility(View.VISIBLE);
            startButton.setText("RESUME");
        } else {
            startButton.setText("START");
        }
    }

    public void resetChronometer(View view) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0L;
        startButton.setText("START");
    }


}