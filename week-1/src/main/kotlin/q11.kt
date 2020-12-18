import kotlin.math.pow

class q11 {
}

fun main() {
    print("Enter a number")
    var a:String = readLine().toString()
    arm(a)
}

fun arm(a: String): Boolean{
    var sum: Double =0.0
    for(i in 1..3){
        print(a[i])
        sum+=a[i].toDouble().pow(3)
    }
    if(sum == a.toDouble()){
        return true
    }
    return false
}