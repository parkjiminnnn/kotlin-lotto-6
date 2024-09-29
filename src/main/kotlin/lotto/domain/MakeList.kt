package lotto.domain

import camp.nextstep.edu.missionutils.Randoms
import lotto.constants.Constant.LOTTO_PRICE

class MakeList {
    fun makeLottoList(money: Int): List<List<Int>> {
        val lottoNumberList = mutableListOf<List<Int>>()
        repeat(money / LOTTO_PRICE) {
            val lottoNumbers = mutableSetOf<Int>()
            while (lottoNumbers.size < 6) {
                lottoNumbers.add(Randoms.pickNumberInRange(1, 45))
            }
            lottoNumberList.add(lottoNumbers.toList().sorted())
        }
        return lottoNumberList
    }
    fun makeNumberList(inputWinNumbers: String):List<Int> {
        val numbers = mutableListOf<Int>()
        for (i in 0 until 6) {
            numbers.add(inputWinNumbers.split(',')[i].toInt())
            println(inputWinNumbers.split(',')[i].toInt())
        }
        return numbers
    }
}