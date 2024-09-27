package lotto.controller

import lotto.domain.Lotto
import lotto.domain.MakeLottoList
import lotto.view.InputView
import lotto.view.OutputView

class LottoController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val makeLottoList = MakeLottoList()
    fun runLotto() {
        InputView().inputMoneyMsg()
        val money = readln().toInt()
        outputView.purchaseQuantityMsg(money)
        val lottoList = makeLottoList.makeLottoList(money)
        outputView.outputLottoList(lottoList)
        inputView.inputWinNumbersMsg()
        val inputWinNumbers = readln()
        inputView.inputBonusNumberMsg()
        val inputBonusNumber = readln()
        outputView.winTotalMsg()


    }

}
