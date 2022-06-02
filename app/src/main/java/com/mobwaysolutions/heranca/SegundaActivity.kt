package com.mobwaysolutions.heranca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mobwaysolutions.heranca.validar.InterfaceTeste
import com.mobwaysolutions.heranca.validar.Validar

class SegundaActivity : AppCompatActivity(), InterfaceTeste {

    private var buttonParaLista : Button? = null
    private var button01 : Button? = null
    private var button02 : Button? = null
    private var tvResult : TextView? = null
    private var tvSeguidores : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        buttonParaLista = findViewById(R.id.bParaLista)
        button01 = findViewById(R.id.b1)
        button02 = findViewById(R.id.b2)
        tvResult = findViewById(R.id.tvResult)
        tvSeguidores = findViewById(R.id.tvSeguidores)


        button02?.setOnClickListener {
            Validar(button02?.text.toString()).validarMinhaTela(this)
        }

        formatarCorBotao(button01)

        tvSeguidores?.text = "Seguidores: ${MeuSingleton.quantidadeSeSeguidores}"

        buttonParaLista?.setOnClickListener {
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }
    }

    override fun chamarFunBotao01() {
        tvResult?.text = "Click no botao 01"
    }

    override fun chamarFunBotao02() {
        tvResult?.text = "Click no botao 02"
    }

    fun formatarCorBotao(button: Button?) {
        button01 = button ?: findViewById(R.id.b1)
        button?.let { btn ->

        }

    }


}