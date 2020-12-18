class q8 {
}

fun main() {
    print("Enter a number")
    var a :Int = readLine()!!.toInt()
    addFac(a)
}

fun addFac(a: Int): Int{

    var sum =0
    for(i in 1..a){
        sum+=fact(i)
    }
    return sum
}
/*
fun fact(a: Int): Int{

    var result: Int = 1
    for(i in 1..a){
        result*=i
    }
    return result
}*/
