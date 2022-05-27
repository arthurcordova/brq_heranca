package com.mobwaysolutions.heranca

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.mobwaysolutions.heranca.validalogin.IAutenticacao
import com.mobwaysolutions.heranca.validalogin.Usuario


/**
 * Cardapio:
 * - Hamburguer
 *                  - Comida
 * - Batata
 *
 */
class MainActivity : AppCompatActivity() {

    lateinit var textViewMensagemRetorno : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextSenha = findViewById<EditText>(R.id.editTextSenha)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        textViewMensagemRetorno = findViewById(R.id.tvMensagemRetorno)

        buttonLogin.setOnClickListener {
            val emailDaTela = editTextEmail.text.toString()
            val senhaDaTela = editTextSenha.text.toString()

            val usuario = Usuario(senha = senhaDaTela, email = emailDaTela)
            usuario.validarSeEmailESenhaEstaoCorretos(object : IAutenticacao {
                override fun sucesso() {
                    textViewMensagemRetorno.text = "Parabéns :) login com sucesso"
                }

                override fun erro() {
                    textViewMensagemRetorno.text = "Erro :( Falha no login"
                }
            })

        }

    }

}

