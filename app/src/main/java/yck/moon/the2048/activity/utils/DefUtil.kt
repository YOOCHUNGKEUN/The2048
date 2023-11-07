package yck.moon.the2048.activity.utils

object DefUtil {

    /* 랜덤 숫자 값 추출 */
    fun getRandomNumForKeyPad(targetValue: Int): Set<Int> {
        var randomPadNum = mutableSetOf<Int>()
        while (randomPadNum.size < targetValue) {
            randomPadNum.add((0 until  9).random())
        }
        return randomPadNum
    }

}