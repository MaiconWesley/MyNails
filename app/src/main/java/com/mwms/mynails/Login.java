package com.mwms.mynails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.security.Principal;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    //abrir telas
    public void IrTelaRecuperaSenha(View view){
        Intent intent =  new Intent(this, RecuperaSenha.class);
        startActivity(intent);
    }
    public void IrTelaCriarConta(View view){
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }
    public void irTelaPrincipal(View view){
        Intent intent =  new Intent(this, PainelDeControle.class);
        startActivity(intent);

    }
}
