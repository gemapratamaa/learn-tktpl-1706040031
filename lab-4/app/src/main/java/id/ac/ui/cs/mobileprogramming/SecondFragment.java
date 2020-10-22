package id.ac.ui.cs.mobileprogramming;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    View view;
    Button fragmentButton;
    EditText editText;
    public TextView textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        fragmentButton = (Button) view.findViewById(R.id.fragmentButton2);
        editText = (EditText) view.findViewById(R.id.fragmentEditText2);
        textView2 = view.findViewById(R.id.textViewFragment2);

        fragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("Second fragment");
                //editText.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }
}