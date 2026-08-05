package com.example.a7elements;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    RadioButton radioButton;
    RatingBar ratingBar;
    Switch switchButton;
    ProgressBar progressBar;
    Button btnShow;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);

        radioButton = findViewById(R.id.radioButton);

        ratingBar = findViewById(R.id.ratingBar);

        switchButton = findViewById(R.id.switchButton);

        progressBar = findViewById(R.id.progressBar);

        btnShow = findViewById(R.id.btnShow);

        textViewResult = findViewById(
                R.id.textViewResult
        );

        btnShow.setOnClickListener(v -> {

            String name =
                    editTextName.getText()
                            .toString();

            boolean selected =
                    radioButton.isChecked();

            float rating =
                    ratingBar.getRating();

            boolean notification =
                    switchButton.isChecked();

            progressBar.setProgress(100);

            String result =
                    "Name: " + name +
                            "\nRadio selected: " + selected +
                            "\nRating: " + rating +
                            "\nNotification: " + notification +
                            "\nProgress: 100%";

            textViewResult.setText(result);
        });
    }
}