fun main(){
    while (true){
        val input = readLine()?.split(" ") ?: break
        val a = input[0].toInt()
        val b = input[1].toInt()
        println(a+b)
    }
}