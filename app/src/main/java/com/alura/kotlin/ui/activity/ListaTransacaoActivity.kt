package com.alura.kotlin.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alura.kotlin.R
import com.alura.kotlin.adapter.ListaTransacaoAdapter
import com.alura.kotlin.modelo.Tipo
import com.alura.kotlin.modelo.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*


class ListaTransacaoActivity: AppCompatActivity() {

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        //criar lista
        //var - definida como variavel
        //val definida como constante

        val lista: List<Transacao> =
            listOf(Transacao(
                //funcao named paramide[*Nao p´recisa de preocupar com ordem
                valor = BigDecimal(20.5), tipo = Tipo.DESPESA),
                Transacao(valor = BigDecimal(10.5), categoria =  "Economia",tipo = Tipo.RECEITA)
            )


        //get id list view
        lista_transacoes_listview.setAdapter(ListaTransacaoAdapter(lista, this));
    }

}