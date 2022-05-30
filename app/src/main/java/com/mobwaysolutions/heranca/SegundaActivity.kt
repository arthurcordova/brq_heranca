package com.mobwaysolutions.heranca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mobwaysolutions.heranca.validar.InterfaceTeste
import com.mobwaysolutions.heranca.validar.Validar

class SegundaActivity : AppCompatActivity(), InterfaceTeste {

    private lateinit var button01 : Button
    private lateinit var button02 : Button
    private lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        button01 = findViewById(R.id.b1)
        button02 = findViewById(R.id.b2)
        tvResult = findViewById(R.id.tvResult)


        button01.setOnClickListener {
            Validar(button01.text.toString()).validarMinhaTela(this)
        }

        button02.setOnClickListener {
            Validar(button02.text.toString()).validarMinhaTela(this)
        }
    }

    override fun chamarFunBotao01() {
        tvResult.text = "Click no botao 01"
    }

    override fun chamarFunBotao02() {
        tvResult.text = "Click no botao 02"
    }
}