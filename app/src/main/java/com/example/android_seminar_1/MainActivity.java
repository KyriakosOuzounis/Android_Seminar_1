package com.example.android_seminar_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtV_1 = findViewById(R.id.txtV_1);
        TextView txtV_2 = findViewById(R.id.txtV_2);
        txtV_1.setText("Kyriakos");
        txtV_2.setText("Ouzounis");
    }
}
