fun main(){
    val nm = readln().split(" ")
    val basketCnt = nm[0].toInt()
    val actionCnt = nm[1].toInt()
    val basketArray = arrayListOf<Int>()

    for (i in 1 .. basketCnt){
        basketArray.add(i)
    }
    for (i in 0 until  actionCnt){
        val input = readln().split(" ")
        var startReverse = input[0].toInt()
        var endReverse = input[1].toInt()
        while (startReverse < endReverse){
            val num = basketArray[startReverse-1]
            basketArray[startReverse-1] = basketArray[endReverse-1]
            basketArray[endReverse-1] = num
            startReverse++
            endReverse--
        }
    }
    for (i in 0 until basketCnt){
        print("${basketArray[i]} ")
    }
}