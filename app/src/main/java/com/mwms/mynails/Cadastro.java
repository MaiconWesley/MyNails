package com.mwms.mynails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    //abrir telas
    public void IrTelaRecuperaSenha(View view){
        Intent intent = new Intent(this, RecuperaSenha.class);
        startActivity(intent);
    }
    public void irTelaAtualizaDados(View view){
        Intent intent = new Intent(this, AtualizaDadosPessoais.class);
        startActivity(intent);
    }
}
