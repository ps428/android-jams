import kotlin.math.*
class q5 {
}

fun main() {
    print("Enter points")

    var ax: Int = readLine()!!.toInt()
    var ay: Int = readLine()!!.toInt()
    var bx: Int = readLine()!!.toInt()
    var by: Int = readLine()!!.toInt()
    var cx: Int = readLine()!!.toInt()
    var cy: Int = readLine()!!.toInt()

    val numbers: IntArray = intArrayOf(ax,ay,bx,by,cx,cy)
    var ab = dis(ax,bx,ay,by)
    var ac = dis(ax,cx,ay,cy)
    var cb = dis(cx,bx,cy,by)

    if(ab==ac&&ab==cb){
        print("Equilateral")
    }
    else if(ab==ac || ab==cb ||ac==cb){
        print("Isosceles")
    }
    else{
        print("Scalene")
    }

}

fun dis(ax: Int, bx:Int, ay:Int, by:Int): Double{
    var x = (ax-by)
    var y = (bx-by)
    var dis: Double = (x*x + y*y).toDouble()

    return dis.pow(0.5)
}

