package br.com.local.bandioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {

    Button btnComprarAlgo, btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        btnCadastro = findViewById(R.id.btnCadastrar);
        btnComprarAlgo = findViewById(R.id.btnCompreAlgo);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
                finish();
            }
        });

    }
}