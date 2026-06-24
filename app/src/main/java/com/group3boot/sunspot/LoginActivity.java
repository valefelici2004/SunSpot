package com.group3boot.sunspot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //BOTTONE ACCESSO
        TextInputLayout emailLayout = findViewById(R.id.emailLayout);
        TextInputEditText email = findViewById(R.id.email);
        TextInputLayout pwLayout = findViewById(R.id.passwordLayout);
        TextInputEditText pw = findViewById(R.id.password);
        Button bottoneAccesso = findViewById(R.id.accesso);
        bottoneAccesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //controllo email valida
                String emailStringa = email.getText().toString().trim();
                //controllo password corretta
                String pwStringa = pw.getText().toString().trim();
                //vado alla home
            }
        });

        //BOTTONE REGISTRAZIONE
        Button bottoneRegistrazione = findViewById(R.id.registrazione);
        bottoneRegistrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //vado alla registrazione
            }
        });
    }
}