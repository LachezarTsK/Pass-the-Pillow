
class Solution {
    fun passThePillow(numberOfPeople: Int, time: Int): Int {
        val lastDirectionIsForward = (time / (numberOfPeople - 1)) % 2 == 0
        val timeAfterLastChangeOfDirection = time % (numberOfPeople - 1)
        val personID = when (lastDirectionIsForward) {
                       true -> (1 + timeAfterLastChangeOfDirection)
                       false -> (numberOfPeople - timeAfterLastChangeOfDirection)
                       }
        return personID
    }
}
