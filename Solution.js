
/**
 * @param {number} numberOfPeople
 * @param {number} time
 * @return {number}
 */
var passThePillow = function (numberOfPeople, time) {
    const lastDirectionIsForward = (Math.floor(time / (numberOfPeople - 1))) % 2 === 0;
    const timeAfterLastChangeOfDirection = time % (numberOfPeople - 1);
    const personID = lastDirectionIsForward
                     ? (1 + timeAfterLastChangeOfDirection)
                     : (numberOfPeople - timeAfterLastChangeOfDirection);
    return personID;
};
