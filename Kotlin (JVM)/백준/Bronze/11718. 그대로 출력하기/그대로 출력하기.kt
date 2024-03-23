fun main(){
    while (true){
        val input = readLine()?.trim() ?: break
        if (input.isNotBlank()) println(input) else break
    }
}