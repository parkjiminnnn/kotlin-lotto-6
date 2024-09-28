package lotto.domain

enum class TotalRanking(count: Int,bous: Boolean,prizeMoney: Int) {
    equalThree(3,false,5000),
    equalFour(4,false,50000),
    equalFive(5,false,15000000),
    equalBonus(5,true,30000000),
    equalSix(6,false,2000000000);

//    fun printRanking(value: TotalRanking) {
//        when(value) {
//            equalThree -> TODO()
//            equalFour -> TODO()
//            equalFive -> TODO()
//            equalBonus -> TODO()
//            equalSix -> TODO()
//        }
//    }
}

