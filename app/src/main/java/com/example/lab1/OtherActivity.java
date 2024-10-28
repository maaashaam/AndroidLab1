package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    private EditText editText;
    private Button backButton;
    private String receivedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        editText = findViewById(R.id.editText);
        backButton = findViewById(R.id.backButton);

        receivedText = getIntent().getStringExtra("greeting");

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                String backText = receivedText + " " + name + "!";

                Intent res_i = new Intent();
                res_i.putExtra("greetingAndName", backText);
                setResult(RESULT_OK, res_i);
                finish();
            }
        });

    }
}