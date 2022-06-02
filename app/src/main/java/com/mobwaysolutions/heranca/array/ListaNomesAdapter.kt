package com.mobwaysolutions.heranca.array

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mobwaysolutions.heranca.R

class ListaNomesAdapter(val listaDeNomes : List<String>)  : RecyclerView.Adapter<ListaNomesAdapter.ListaNomesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaNomesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista_nomes, parent, false)
        return ListaNomesViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaNomesViewHolder, position: Int) {
        val nome = listaDeNomes.get(position)
        holder.mostrarOsDadosNaTela(nome)
    }

    override fun getItemCount(): Int {
        return listaDeNomes.size
    }

    inner class ListaNomesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun mostrarOsDadosNaTela(nome: String) {
            val textViewTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
            textViewTitulo.text = nome
        }

    }

}