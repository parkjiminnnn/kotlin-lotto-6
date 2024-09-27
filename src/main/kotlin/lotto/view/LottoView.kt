package lotto.view

import lotto.constants.Constant.INPUT_MONEY_MSG
import lotto.constants.Constant.INPUT_WINNING_NUMBERS_MSG
import lotto.constants.Constant.PURCHASE_QUANTITY_MSG

class LottoView {
    fun inputMoneyMsg() {
        return println(INPUT_MONEY_MSG)
    }

    fun purchaseQuantityMsg(buyCount: Int) {
        println("$buyCount$PURCHASE_QUANTITY_MSG")
    }
    fun inputWinningNumbersMsg() {
        println()
        println(INPUT_WINNING_NUMBERS_MSG)
    }

}