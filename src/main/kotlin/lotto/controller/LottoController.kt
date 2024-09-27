package lotto.controller

import lotto.domain.Lotto
import lotto.view.LottoView

class LottoController {
    private val lottoView = LottoView()
    private val lotto = Lotto()

    fun runLotto() {
        lottoView.inputMoneyMsg()
        val money = readln().toInt()
        lottoView.purchaseQuantityMsg(money)
        val lottoList = lotto.makeLottoList(money)
        for (i in lottoList.indices) {
            println(lottoList[i])
        }
        lottoView.inputWinNumbersMsg()
        val inputWinNumbers = readln()
        lottoView.inputBonusNumberMsg()
        val inputBonusNumber = readln()



    }

}
