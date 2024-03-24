fun main(){
    val input = readLine()!!
    val printTen = input.chunked(10)
    for(i in 1..printTen.size){
        println(printTen[i-1])
    }
}