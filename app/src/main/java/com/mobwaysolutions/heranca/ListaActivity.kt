package com.mobwaysolutions.heranca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobwaysolutions.heranca.array.ListaNomesAdapter

class ListaActivity : AppCompatActivity() {

    lateinit var rvListaNomes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val minhaListaDeNomes = listOf(
            "Arthur",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria",
            "Joao",
            "Maria",
            "Arthur",
            "Joao",
            "Maria"
        )

        rvListaNomes = findViewById(R.id.rvListaNomes)
        rvListaNomes.adapter = ListaNomesAdapter(minhaListaDeNomes)
        rvListaNomes.layoutManager = LinearLayoutManager(this)

    }
}