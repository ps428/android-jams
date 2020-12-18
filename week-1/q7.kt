class q7 {
}

fun main() {
    print("Enter a number")
    var a :Int = readLine()!!.toInt()
    fact(a)
}

fun fact(a: Int): Int{

    var result: Int = 1
    for(i in 1..a){
        result*=i
    }
    return result
}