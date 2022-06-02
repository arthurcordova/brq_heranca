package com.mobwaysolutions.heranca

class Batata(val tipoDaBatata : String, val tamanho: String, val tipoAcompanhamento : MutableList<Int>) : Comida() {

    override fun calcularPreco(): Double {
        return when (tamanho) {
            "P" -> 10.0
            "M" -> 20.0
            "G" -> 30.0
            else -> {0.0}
        }
    }
}