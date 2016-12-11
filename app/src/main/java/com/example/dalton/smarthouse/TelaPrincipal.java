package com.example.dalton.smarthouse;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;


/**
 * Created by Dalton on 09/12/2016.
 */

public class TelaPrincipal extends ActionBarActivity {

    //Aqui eu chamo a activity tela principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);

    }
    //Função de ação do botão compra;
    public void actionButtonCompra (View view){
        //Aqui vou mostrar uma mensagem mas deve ser chamado a URL
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Compras");
        alertDialog.setMessage("Botão Compras");
        alertDialog.show();
    }


    //Função de ação do botão Ar;
    public void actionButtonAir (View view) {
        //Aqui vou mostrar uma mensagem mas deve ser chamado a URL
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Ligar Ar");
        alertDialog.setMessage("Ar ligado!");
        alertDialog.show();
    }

    //Função de ação do botão TV;
    public void actionButtonTV (View view) {
        //Aqui vou mostrar uma mensagem mas deve ser chamado a URL
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Ligar TV");
        alertDialog.setMessage("TV ligada!");
        alertDialog.show();
    }
}
