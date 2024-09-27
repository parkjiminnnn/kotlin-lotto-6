package lotto.domain

import camp.nextstep.edu.missionutils.Randoms
import lotto.constants.Constant.LOTTO_PRICE

class MakeLottoList {
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
}