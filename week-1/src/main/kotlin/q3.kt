class q3 {
}

fun main() {
    print("Enter a number")
    val a: Int = readLine()!!.toInt()
    abs(a)
}
fun abs( a: Int ): Int{
    if(a>0){
        return a
    }
    return  -a
}