package com.mwms.mynails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AtualizaDadosPessoais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualiza_dados_pessoais);
    }
    public void irTelaPrincipal(View view){
        Intent intent =  new Intent(this, PainelDeControle.class);
        startActivity(intent);
    }
}
