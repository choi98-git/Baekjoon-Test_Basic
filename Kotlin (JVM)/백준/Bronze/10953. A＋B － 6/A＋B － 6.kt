fun main(){
    val testCase = readLine()!!.toInt()
    for(i in 1..testCase){
        val input = readLine()!!.split(",")
        val a = input[0].toInt()
        val b = input[1].toInt()
        println(a+b)
    }
}