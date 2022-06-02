package com.mobwaysolutions.heranca.array

import com.mobwaysolutions.heranca.Hamburguer

fun main() {

    val nomes = listOf("Arthur", "Joao", "Maria")

    nomes.forEach {
        println(it)
    }


    val numerosNegativos = listOf(-20, -15, -1987, -76)
    val numeros = mutableListOf(10, 20, 0, -10, -5, 50)

    println("Numero de elementos na lista: ${numeros.size}")

    numeros.removeAt(3)
    numeros.add(100)
    numeros.addAll(numerosNegativos)

    numeros.forEachIndexed { index, it ->
        println("Index: $index i: $it")
    }
    println("Numero de elementos na lista apos forEach: ${numeros.size}")






//    val comidas = listOf(Hamburguer.getInstance())
//    comidas.forEach {
//
//    }


}
