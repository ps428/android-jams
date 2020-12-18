import kotlin.math.pow

class q12 {
}

fun main() {
    print("Enter a number")
    var a:String = readLine().toString()
    arm2(a)
}

fun arm2(a: String): Boolean{
    var sum: Double =0.0
    for(i in 1..a.length){
        print(a[i])
        sum+=a[i].toDouble().pow(a.length)
    }
    if(sum == a.toDouble()){
        return true
    }
    return false
}