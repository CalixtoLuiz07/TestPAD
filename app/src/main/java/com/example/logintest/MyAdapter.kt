package com.example.logintest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.lista_romance.view.*

class MyAdapter(var lista:List<Livro>): RecyclerView.Adapter<MyAdapter.MyViewHolder>()   {

    lateinit var context : Context

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.lista_romance,parent, false)
        return MyViewHolder(view)
        context = parent.context
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, pos: Int) {
        viewHolder.titulo.text = lista[pos].titulo
        viewHolder.autor.text = lista[pos].autor
        viewHolder.avatar.setImageResource(lista[pos].imagem)

        /*viewHolder.listaRomance.setOnClickListener {
            Toast.makeText(context, "cliquei aqui " +lista[pos].titulo, Toast.LENGTH_LONG).show()
        }*/
    }


    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var titulo = itemView.txtTitulo
        var autor = itemView.txtAutor
        var avatar = itemView.imgAvatar
        var listaRomance = itemView.listaRomance

    }
}