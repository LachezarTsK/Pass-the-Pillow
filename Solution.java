
public class Solution {

    public int passThePillow(int numberOfPeople, int time) {
        boolean lastDirectionIsForward = (time / (numberOfPeople - 1)) % 2 == 0;
        int timeAfterLastChangeOfDirection = time % (numberOfPeople - 1);
        int personID = lastDirectionIsForward
                       ? (1 + timeAfterLastChangeOfDirection)
                       : (numberOfPeople - timeAfterLastChangeOfDirection);
        return personID;
    }
}
