package lotto.domain

import camp.nextstep.edu.missionutils.Randoms
import lotto.constants.Constant.LOTTO_PRICE

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6)
    }

    fun matchingNumbers(lottoList: List<List<Int>>, bonusNumber: Int): Pair<Int, Boolean> {
        var matchingCount = 0
        var isBonusNumber = false
        for (i in lottoList.indices) {
            for (j in numbers.indices) {
                when {
                    lottoList[i].contains(numbers[j]) -> matchingCount++
                }
            }
            if (lottoList[i].contains(bonusNumber)) isBonusNumber = true
        }
        return Pair(matchingCount, isBonusNumber)
    }
}
