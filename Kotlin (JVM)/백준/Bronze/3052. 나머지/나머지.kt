fun main(){
    val testCnt = 10
    val arrayList: ArrayList<Int> = arrayListOf()
    
    for(i in 0 until testCnt){
        val input = readln().toInt() % 42
        arrayList.add(i,input)
    }
    
    println(arrayList.distinct().size)
}