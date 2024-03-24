fun main(){
    val caseCnt = readLine()!!.toInt()
    var sum = 0
    val input = readLine()!!
    
    for (i in 1..caseCnt){
        sum += input[i-1].digitToInt()
    }
    println(sum)
}