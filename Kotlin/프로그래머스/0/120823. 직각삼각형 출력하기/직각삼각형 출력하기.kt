fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    var x = n
    while(x>0) {
        for(i in x..n) {
            print("*")
        }
        println("")
        x--
    }
}