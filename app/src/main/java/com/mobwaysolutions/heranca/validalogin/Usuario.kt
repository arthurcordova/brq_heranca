package com.mobwaysolutions.heranca.validalogin

class Usuario( val email: String, val senha : String) {

    fun validarSeEmailESenhaEstaoCorretos(evento: IAutenticacao) {
        if (email.contains("@") && senha.isNotEmpty()) {
            evento.sucesso()
        } else {
            evento.erro()
        }
    }

}