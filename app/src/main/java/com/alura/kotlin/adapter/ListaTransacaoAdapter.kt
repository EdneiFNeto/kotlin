package com.alura.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.alura.kotlin.R

class ListaTransacaoAdapter(lista: List<String>,
                            context: Context?): BaseAdapter() {

    private val context = context
    private val lista = lista

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(this.context).inflate(R.layout.transacao_item, parent, false)

        val categoria = view.findViewById<TextView>(R.id.transacao_categoria)
        val valor = view.findViewById<TextView>(R.id.transacao_valor)
        return view
    }

    override fun getItem(position: Int): String{
        return lista[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return lista.size
    }
}