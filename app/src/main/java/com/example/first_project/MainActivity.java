package com.example.first_project;

import static android.graphics.Color.CYAN;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvFirstLabel;
    Button btnChangeTextColorClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvFirstLabel = findViewById(R.id.tvFirstLabel);
        btnChangeTextColorClick = findViewById(R.id.btnChangeTextColorClick);

        btnChangeTextColorClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvFirstLabel != null) {
                    tvFirstLabel.setTextColor(CYAN);
                }
            }
        });

    }

    @SuppressLint("SetTextI18n")
    public void changeTextClick(View view) {
        tvFirstLabel.setText("Hello World! Changed");
    }
    // commenting changes
}