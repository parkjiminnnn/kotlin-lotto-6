package lotto.controller

import lotto.domain.Lotto
import lotto.domain.MakeList
import lotto.view.InputView
import lotto.view.OutputView

class LottoController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val makeList = MakeList()
    fun runLotto() {
        InputView().inputMoneyMsg()
        val money = readln().toInt()
        outputView.purchaseQuantityMsg(money)
        val lottoList = makeList.makeLottoList(money)
        outputView.outputLottoList(lottoList)
        inputView.inputWinNumbersMsg()
        val inputWinNumbers = readln()
        val lotto = Lotto(makeList.makeNumberList(inputWinNumbers))
        inputView.inputBonusNumberMsg()
        val inputBonusNumber = readln()
        outputView.winTotalMsg()
    }
}
