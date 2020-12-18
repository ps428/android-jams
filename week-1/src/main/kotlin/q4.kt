import com.sun.org.apache.xpath.internal.operations.Bool

class q4 {
}

fun main() {
    print("Enter a number")
    var a: Int = readLine()!!.toInt()
    var b11: Boolean = by11(a)
    var b5: Boolean = by5(a)
    println("$a is divisible by 5 $b5")
    println("$a is divisible by 11 $b11")
}

fun by5(a: Int): Boolean{
    if(a%5==0)
        return true
    return false
}

fun by11(a: Int): Boolean{
    if(a%11==0)
        return true
    return false
}
