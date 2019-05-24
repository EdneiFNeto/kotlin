package com.alura.kotlin.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.alura.kotlin.R
import com.alura.kotlin.adapter.ListaTransacaoAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*


class ListaTransacaoActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        //criar lista
        //var - definida como variavel
        //val definida como constante
        val lista: List<String> = listOf("Comida-R$ 20,50", "Economia - R$ 100,00");

        //get id list view
        lista_transacoes_listview.setAdapter(ListaTransacaoAdapter(lista, this));
    }

}