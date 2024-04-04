fun main(){
    val testCnt = readln().toInt()
    val input = readln().split(" ")
    val arrayList = arrayListOf<Int>()
    val overlappingNum = readln().toInt()
    var overlappingCnt = 0
    
    for (i in 0 until testCnt){
        arrayList.add(input[i].toInt())
    }
    for (i in 0 until testCnt){
        if(arrayList[i] == overlappingNum) overlappingCnt++
    }
    println(overlappingCnt)
}