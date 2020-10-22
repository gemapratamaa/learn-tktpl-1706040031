package id.ac.ui.cs.mobileprogramming;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstFragment extends Fragment implements MyInterface {

    View view;
    Button fragmentButton;
    EditText editText;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
        fragmentButton = (Button) view.findViewById(R.id.fragmentButton1);
        textView = view.findViewById(R.id.textViewFragment1);

        editText = (EditText) view.findViewById(R.id.fragmentEditText);

        fragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("First fragment");
            }
        });

        return view;

    }

    @Override
    public void setText(String str) {

    }
}