class q10 {
}

fun main() {
    print("Enter a number")
    var a: Int = readLine()!!.toInt()
    printPy(a)
}

fun printPy(a: Int){
    for(i in 1..a){
        for (j in 1..i){
            print("#")
        }
        print("\n")
    }
}