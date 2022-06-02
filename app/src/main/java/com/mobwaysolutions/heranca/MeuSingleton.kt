package com.mobwaysolutions.heranca

object MeuSingleton {

    var quantidadeSeSeguidores = 1000

    fun atualizarSeguidores() : Int {
        quantidadeSeSeguidores += 1
        return quantidadeSeSeguidores
    }

}