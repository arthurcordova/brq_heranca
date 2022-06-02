package com.mobwaysolutions.heranca

class Hamburguer(var nome: String? = null) {

    private constructor() : this(null) {

    }

    companion object {

        var INSTANCIADOHAMBURGUER: Hamburguer? = null

        fun getInstance(): Hamburguer? {
            if (INSTANCIADOHAMBURGUER == null) {
                INSTANCIADOHAMBURGUER = Hamburguer()
            }
            return INSTANCIADOHAMBURGUER
        }

    }


//    override fun calcularPreco(peso: Int): Double {
//        if (peso <= 180) {
//            return 10.0
//        } else if (peso > 180 && peso < 300) {
//            return 20.00
//        } else {
//            return 30.00
//        }
//    }

}