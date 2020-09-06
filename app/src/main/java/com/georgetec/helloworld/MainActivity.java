package com.georgetec.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greetingTV;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTV = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
    }

    public void changeExpression(View view) {
        if (greetingTV.getText().equals(getResources().getString(R.string.hello)))
        {
            greetingTV.setText(R.string.goodbye);
        }
        else
        {
            greetingTV.setText(R.string.hello);
        }
    }
}