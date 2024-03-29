fun main(){
    val subjectCnt = readln().toInt()
    val grade = readln().split(" ")
    var maxGrade = 0
    var newGradeTotal = 0.0

    for (i in 0 until subjectCnt){
        if(grade[i].toInt() > maxGrade) maxGrade = grade[i].toInt()
    }

    for (i in 0 until subjectCnt){
        newGradeTotal += (grade[i].toDouble()/maxGrade) * 100
    }
    println("${newGradeTotal/subjectCnt}")
}