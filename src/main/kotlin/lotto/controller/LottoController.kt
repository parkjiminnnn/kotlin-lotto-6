package lotto.controller

import lotto.domain.Lotto
import lotto.view.InputView
import lotto.view.OutputView

class LottoController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val lotto = Lotto(listOf(1,2,3,4,5,6))

    fun runLotto() {
        InputView().inputMoneyMsg()
        val money = readln().toInt()
        outputView.purchaseQuantityMsg(money)
        val lottoList = lotto.makeLottoList(money)
        outputView.outputLottoList(lottoList)
        inputView.inputWinNumbersMsg()
        val inputWinNumbers = readln()
        inputView.inputBonusNumberMsg()
        val inputBonusNumber = readln()
        outputView.winTotalMsg()


    }

}
