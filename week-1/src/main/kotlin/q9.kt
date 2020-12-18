class q9 {
}

fun main() {
    print("Enter a number")
    var a : Int = readLine()!!.toInt()
    getsum(a)
}

fun getsum(a: Int): Int{
    var sum:Int =0
    for(i in 1..a){
        if(i%2==0){
            sum+=i
        }
    }
    return sum
}