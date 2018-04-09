package com.example.gbohling.muttoncounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView textView;
//    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.editText);
        Button button = findViewById(R.id.mutton);
        textView = findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = userInput.getText().toString();
                result = result + " bugs\n";
                textView.append(result);
//                numTimesClicked = numTimesClicked + 1;
//                String result = "The mutton got slapped " + numTimesClicked + " time";
//                if (numTimesClicked != 1) {
//                    result += "s";
//                }
//                result += "\n";
//                textView.append(result);
            }
        };
        button.setOnClickListener(ourOnClickListener);
    }
}
