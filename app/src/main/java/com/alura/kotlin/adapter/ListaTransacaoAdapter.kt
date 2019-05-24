package com.alura.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.alura.kotlin.R
import com.alura.kotlin.extensions.formatarParaBrasileiro
import com.alura.kotlin.modelo.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*

class ListaTransacaoAdapter(
    transacoes: List<Transacao>,
    context: Context?) : BaseAdapter() {

    private val context = context
    private val transacao = transacoes

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(this.context).inflate(R.layout.transacao_item, parent, false)

        view.transacao_categoria.text = transacao[position].categoria
        view.transacao_valor.text = transacao[position].valor.toString()
        view.transacao_data.text = transacao[position].data.formatarParaBrasileiro()

        return view
    }


    override fun getItem(position: Int): Transacao {
        return transacao[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacao.size
    }



}