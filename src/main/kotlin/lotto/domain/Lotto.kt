package lotto.domain

import camp.nextstep.edu.missionutils.Randoms

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6)
    }

    fun makeLottoList(money: Int): List<List<Int>> {
        val lottoNumberList = mutableListOf<List<Int>>()
        repeat(money / 1000) {
            val lottoNumbers = mutableSetOf<Int>()
            while (lottoNumbers.size < 6) {
                lottoNumbers.add(Randoms.pickNumberInRange(1, 45))
            }
            lottoNumberList.add(lottoNumbers.toList().sorted())
        }
        return lottoNumberList
    }
}
