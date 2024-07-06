
using System;

public class Solution
{
    public int PassThePillow(int numberOfPeople, int time)
    {
        bool lastDirectionIsForward = (time / (numberOfPeople - 1)) % 2 == 0;
        int timeAfterLastChangeOfDirection = time % (numberOfPeople - 1);
        int personID = lastDirectionIsForward
                       ? (1 + timeAfterLastChangeOfDirection)
                       : (numberOfPeople - timeAfterLastChangeOfDirection);
        return personID;
    }
}
