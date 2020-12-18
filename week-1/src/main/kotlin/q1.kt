fun positive(a: Int): Int {
    if(a>0){
    	return 1
    }
    else{
    return 0
    }
}

fun main() {
    println(positive(2))
    println(positive(1231))
    println(positive(-23))
    println(positive(0))
}