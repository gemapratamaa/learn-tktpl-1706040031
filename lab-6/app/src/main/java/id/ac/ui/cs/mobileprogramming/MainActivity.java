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

        TextView tv = findViewById(R.id.hello);

        int randomInt = randomIntFromJNI();
        Log.i("main","random int: " + randomInt);
        String text = helloWorldFromJNI(randomInt);
        tv.setText(text);

        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button clicked");
                RandomNumber rn = new RandomNumber();
                initialNumber.setText(rn.getRandomNumber());
            }
        });

         */
    }

    public native String stringFromJNI();

    public native int randomIntFromJNI();

    public native String helloWorldFromJNI(int x);


}