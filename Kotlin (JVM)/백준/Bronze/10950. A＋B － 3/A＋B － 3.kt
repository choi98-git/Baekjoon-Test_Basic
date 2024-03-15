fun main(){
    val testCase = readLine()!!.toInt()
    var sumList: MutableList<Int> = mutableListOf()
    
    for(i in 1..testCase){
        val input = readLine()!!.split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        sumList.add(i-1,a+b)
    }
    for(i in 1..sumList.size){
        println(sumList[i-1])
    }
}