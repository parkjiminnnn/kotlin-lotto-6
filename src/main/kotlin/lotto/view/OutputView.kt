package lotto.view

import lotto.constants.Constant.PURCHASE_QUANTITY_MSG
import lotto.constants.Constant.WIN_TOTAL_MSG

class OutputView {

    fun purchaseQuantityMsg(money: Int) {
        val buyCount = money/1000
        println("$buyCount$PURCHASE_QUANTITY_MSG")
    }

    fun outputLottoList(lottoList: List<List<Int>>) {
        for (i in lottoList.indices) {
            println(lottoList[i])
        }
    }

    fun winTotalMsg() {
        println(WIN_TOTAL_MSG)
        println("---")
    }
}