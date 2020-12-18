class q6 {
}

fun main() {
    print("Enter a charecter")
    var a = readLine()!!.toUpperCase()

    if(a.toInt() in 65..91){
        print("Alphabet")
    }
    else{
        print("Not an alphabet")
    }
}