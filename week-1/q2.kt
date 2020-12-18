class q2 {
}

fun main() {
    print("Enter 3 numbers")
    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    val c:Int = readLine()!!.toInt()

    print(max(a, b, c))
}

fun max(a: Int, b: Int, c: Int): Int {
    if(a>b){
        if(a>c){
            return a
        }
        else{
            return c
        }
    }
    if(b>a){
        if(b>c){
            return b
        }
        else{
            return c
        }
    }
    if(c>b){
        if(c>a){
            return c
        }
        else{
            return a
        }
    }
    return 0
}