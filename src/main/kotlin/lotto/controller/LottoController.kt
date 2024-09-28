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
        inputView.inputMoneyMsg()
        val money = readln().toInt()

        outputView.purchaseQuantityMsg(money)
        val lottoList = makeList.makeLottoList(money)
        outputView.outputLottoList(lottoList)

        inputView.inputWinNumbersMsg()
        val inputWinNumbers = readln()

        inputView.inputBonusNumberMsg()
        val inputBonusNumber = readln().toInt()
        resultLotto(inputWinNumbers, lottoList, inputBonusNumber)
    }

    private fun resultLotto(inputWinNumbers: String, lottoList: List<List<Int>>, inputBonusNumber: Int) {
        outputView.winTotalMsg()//resultLotto에 파라미터 추가해서 구현후에 런로또에 넣기
        val lotto = Lotto(makeList.makeNumberList(inputWinNumbers))
        lotto.matchingNumbers(lottoList, inputBonusNumber)

    }
}
