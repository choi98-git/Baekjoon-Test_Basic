fun main(){
    val arrayList: ArrayList<Int> = arrayListOf()
    val arrayCnt = 9
    var maxValueIdx = 0
    var maxValue = 0
    
    for (i in 0 until arrayCnt){
        val num = readln().toInt()
        arrayList.add(i,num)
    }
    for (i in 0 until arrayList.size){
        if(arrayList[i]>maxValue){
            maxValue = arrayList[i]
            maxValueIdx = i + 1
        }
    }
    println(maxValue)
    println(maxValueIdx)
}