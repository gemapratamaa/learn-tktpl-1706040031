package id.ac.ui.cs.mobileprogramming;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SecondFragment extends Fragment {

    View view;
    Button fragmentButton2;
    EditText editText2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        fragmentButton2 = (Button) view.findViewById(R.id.fragmentButton2);
        editText2 = (EditText) view.findViewById(R.id.fragmentEditText2);

        fragmentButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText("Second fragment");
            }
        });

        return view;
    }
}