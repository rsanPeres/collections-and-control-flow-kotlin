package com.control.flow

class Ranges {
    fun rang(){
        for(i in 0..3) {             // 1
            print(i)
        }
        print(" ")

        for(i in 0 until 3) {        // 2
            print(i)
        }
        print(" ")

        for(i in 2..8 step 2) {      // 3
            print(i)
        }
        print(" ")

        for (i in 3 downTo 0) {      // 4
            print(i)
        }
        print(" ")

        for (c in 'a'..'d') {        // 1
            print(c)
        }
        print(" ")

        for (c in 'z' downTo 's' step 2) { // 2
            print(c)
        }
        print(" ")
    }

}