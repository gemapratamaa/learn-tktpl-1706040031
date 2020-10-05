package id.ac.ui.cs.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean isRunning;
    public Button startButton;
    public Button exitButton;

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

    @Override
    public void onBackPressed() {
        Toast toast = Toast.makeText(
                getApplicationContext(),
                "Press EXIT to exit this app!",
                Toast.LENGTH_SHORT
        );
        toast.show();
    }


    public void exitApp(View view) {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    // Remove dari recent apps
    @Override
    public void finish() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            super.finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

}