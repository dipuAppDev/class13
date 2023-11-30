//fun main(args:Array<String>){
//    for (r in 1..5){
//        for (s in 4 downTo r){
//            print(" ")
//        }
//        for (c in 1..r){
//            print(" *")
//        }
//        println()
//    }
//    for (i in 1..5){
//        for (j in i..5){
//            print(" ")
//        }
//        for (k in 1..i){
//            print("* ")
//        }
//        println()
//    }
//}

fun main(args:Array<String>){
//for (i in 1..7){
//    for (j in i .. 7)
//    {
//        print(" ")
//    }
//    for (k in 1..i){
//        print("* ")
//    }
//    println()
//}

    /**
     * class-work : print odd number or star pattern in pyramid
     */
//    for (r in 1..7){
//     if (r%2!=0){
//         for (s in 6 downTo r){
//             print(" ")
//         }
//         for (c in 1..r){
//             print(" *")
//         }
//         println()
//     }
//    }
    fullPyramidStep2()
}
fun fullPyramidStep2(){
    for (i in 1..7 step 2)
    {
        for (j in i..7){
            print(" ")
        }
        for (k in 1..i){
            print("* ")
        }
        println()
    }
}



