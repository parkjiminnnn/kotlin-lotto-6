package lotto.view

import lotto.constants.Constant.INPUT_BONUS_NUMBER_MSG
import lotto.constants.Constant.INPUT_MONEY_MSG
import lotto.constants.Constant.INPUT_WINNING_NUMBERS_MSG

class InputView {
    fun inputMoneyMsg() {
        return println(INPUT_MONEY_MSG)
    }

    fun inputWinNumbersMsg() {
        println()
        println(INPUT_WINNING_NUMBERS_MSG)
    }

    fun inputBonusNumberMsg() {
        println()
        println(INPUT_BONUS_NUMBER_MSG)
    }
}