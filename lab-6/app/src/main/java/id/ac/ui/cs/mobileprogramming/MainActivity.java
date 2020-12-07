package id.ac.ui.cs.mobileprogramming;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lab 1";

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView randomNumber = findViewById(R.id.random_number);
        TextView hello = findViewById(R.id.hello);
        int randomInt = randomIntFromJNI();
        Log.i(TAG,"random int: " + randomInt);
        String text = helloWorldFromJNI(randomInt);

        hello.setText(text);
        randomNumber.setText("Your random number is: " + randomInt);

    }

    public native int randomIntFromJNI();
    public native String helloWorldFromJNI(int x);

}