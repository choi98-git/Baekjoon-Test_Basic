fun main(){
    val input = readln().split(" ")
    val testCnt = input[0].toInt()
    val testNum = input[1].toInt()
    val numberArray = arrayListOf<Int>()
    val testNumbers = readln().split(" ")
    
    for (i in 0 until testCnt){
        numberArray.add(testNumbers[i].toInt())
    }
    for (i in 0 until numberArray.filter{it < testNum}.size){
        print("${numberArray.filter{it < testNum}[i]} ")
    }
}