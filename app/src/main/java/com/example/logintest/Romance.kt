package com.example.logintest

import android.os.Bundle


import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_romance.*

class Romance : AppCompatActivity() {


    private lateinit var viewAdapter : RecyclerView.Adapter<*>
    private lateinit var viewManager : RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance)

        var lista1  = mutableListOf<Livro>()
        var avatar = (R.drawable.imagem_romance)

        for(i in 1..100){
            lista1.add(Livro(" A Culpa das Estrelas $i", "Pedro $i", avatar))
        }

        viewAdapter = MyAdapter(lista1)
        viewManager = LinearLayoutManager(this)
        rvlista_romance.adapter = viewAdapter
        rvlista_romance.layoutManager = viewManager

    }

}
