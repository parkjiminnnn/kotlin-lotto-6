package lotto.controller

import lotto.view.Input

class LottoController {
    private val input = Input()


    fun runLotto() {
        input.inputMoneyMsg()
        val money = readln()
    }

}
