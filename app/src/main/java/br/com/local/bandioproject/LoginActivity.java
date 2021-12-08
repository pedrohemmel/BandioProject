package br.com.local.bandioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //criar variaveis globais com base no xml
    EditText edtUsername, edtPassword;
    Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Referenciar id do xml
        edtUsername = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPass);
        btnEntrar = findViewById(R.id.btnEnt);



        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criar variaveis para armazenar a variavel xml como string
                String nome, senha;

                nome = edtUsername.getText().toString();
                senha = edtPassword.getText().toString();

                if(nome.equals("Pedrinho123") && senha.equals("1234")) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));

                    Toast.makeText(getApplicationContext(), "Bem vindo ao sistema", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Erro ao acessar o sistema", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}