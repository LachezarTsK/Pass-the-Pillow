
package main

import "fmt"

func passThePillow(numberOfPeople int, time int) int {
    lastDirectionIsForward := (time / (numberOfPeople-1)) % 2 == 0
    timeAfterLastChangeOfDirection := time % (numberOfPeople - 1)
    personID := Ternary(lastDirectionIsForward,
                1 + timeAfterLastChangeOfDirection,
                numberOfPeople - timeAfterLastChangeOfDirection)
    return personID
}

func Ternary[T any](condition bool, first T, second T) T {
    if condition {
        return first
    }
    return second
}
