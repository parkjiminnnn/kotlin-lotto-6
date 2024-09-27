package lotto.domain

import camp.nextstep.edu.missionutils.Randoms
import lotto.constants.Constant.LOTTO_PRICE

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6)
    }

    fun matchingNumbers(lottoList: List<List<Int>>): Int {
        var matchingCount = 0
        for (i in lottoList.indices) {
            for (j in numbers.indices)
                if (lottoList[i].contains(numbers[j])) {
                    matchingCount++
                }
        }
        return matchingCount
    }
}
