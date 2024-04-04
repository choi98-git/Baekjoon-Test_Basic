fun main(){
    val arrayList = arrayListOf<Int>()
    val noneArrayList = arrayListOf<Int>()
    val testCnt = 28

    for (i in 0 until 30){
        noneArrayList.add(i+1)
    }

    for (i in 0 until testCnt){
        val input = readln().toInt()
        arrayList.add(input)
        noneArrayList.remove(arrayList[i])
    }

    for (i in 0 until noneArrayList.size){
        println(noneArrayList[i])
    }
}