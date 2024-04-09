fun main(){
    val nm = readln().split(" ")
    val basketCnt = nm[0].toInt()
    val actionCnt = nm[1].toInt()
    val basketArray = Array(basketCnt){0}
    
    for(i in 0 until actionCnt){
        val input = readln().split(" ")
        val startBasket = input[0].toInt()
        val endBasket = input[1].toInt()
        val ballNum = input[2].toInt()
        for(i in startBasket..endBasket){
            basketArray[i-1] = ballNum
        }
    }
    for (i in 0 until basketCnt){
        print("${basketArray[i]} ")
    }
}