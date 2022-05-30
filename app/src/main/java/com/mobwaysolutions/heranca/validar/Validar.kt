package com.mobwaysolutions.heranca.validar

class Validar(var buttonName: String) {

    fun validarMinhaTela(interf: InterfaceTeste) {
        if (buttonName == "meu primeiro botao") interf.chamarFunBotao01() else interf.chamarFunBotao02()
    }

}