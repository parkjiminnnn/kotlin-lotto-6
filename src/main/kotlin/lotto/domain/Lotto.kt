package lotto.domain

import camp.nextstep.edu.missionutils.Randoms

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6)
    }

    fun makeLottoList(money: Int): List<List<Int>> {
        val lottoNumbers = mutableSetOf<Int>()
        val lottoNumberList = mutableListOf<List<Int>>()
        repeat(money / 1000) {
            while (lottoNumbers.size < 6) {
                val generateRandomNumber = Randoms.pickNumberInRange(1, 45)
                lottoNumbers.add(generateRandomNumber)
            }
            lottoNumberList.add(lottoNumbers.toList().sorted())
        }
        return lottoNumberList
    }
}
