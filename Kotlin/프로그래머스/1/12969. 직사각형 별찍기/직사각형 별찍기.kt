fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var answer = StringBuilder()
    
    (1..b).forEach{
        (1..a).forEach{
            answer.append("*")
        }
        answer.append("\n")
    }
    print(answer)
}