package yck.moon.the2048.activity.utils

object DefUtil {

    var mRanNum = arrayListOf(2,4,8,16)

    /* 랜덤 숫자 값 추출 */
//    fun getRandomNumForKeyPad(targetValue: Int): Set<Int> {
//        var randomPadNum = mutableSetOf<Int>()
//        while (randomPadNum.size < targetValue) {
//            randomPadNum.add((0 until  targetValue).random())
//        }
//        return randomPadNum
//    }

    /* 랜덤 숫자 값 추출 */
    fun getRandomNumForKeyPad(targetValue: Int): Set<Int> {
        var randomPadNum = mutableSetOf<Int>()

        while (randomPadNum.size < targetValue) {
            randomPadNum.add((0 until  mRanNum.size).random())
        }

        return randomPadNum
    }

}