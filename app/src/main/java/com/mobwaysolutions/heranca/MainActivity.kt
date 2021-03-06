package com.mobwaysolutions.heranca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mobwaysolutions.heranca.validalogin.IAutenticacao
import com.mobwaysolutions.heranca.validalogin.Usuario


/**
 * Cardapio:
 * - Hamburguer
 *                  - Comida
 * - Batata
 *
 */
class MainActivity : AppCompatActivity(), IAutenticacao {

    var textViewMensagemRetorno : TextView? = null
    var editTextEmail : EditText? = null
    var editTextSenha : EditText? = null
    var tvSeguidores : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextEmail = findViewById(R.id.editTextEmail)
        editTextSenha = findViewById(R.id.editTextSenha)
        tvSeguidores = findViewById(R.id.tvSeguidores)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        textViewMensagemRetorno = findViewById(R.id.tvMensagemRetorno)

        buttonLogin.setOnClickListener {
            val emailDaTela = editTextEmail?.text.toString()
            val senhaDaTela = editTextSenha?.text.toString()

            MeuSingleton.atualizarSeguidores()

            val usuario = Usuario(senha = senhaDaTela, email = emailDaTela)
            usuario.validarSeEmailESenhaEstaoCorretos(this)
        }
    }

    override fun onResume() {
        super.onResume()
        tvSeguidores?.text = "Seguidores: ${MeuSingleton.quantidadeSeSeguidores}"
    }


    override fun sucesso() {
        val minhaIntencaoDeIrParaSegundaTela = Intent(this, SegundaActivity::class.java)
        startActivity(minhaIntencaoDeIrParaSegundaTela)
    }

    override fun erro() {
        textViewMensagemRetorno?.text = "Erro :( Falha no login"
    }
}

