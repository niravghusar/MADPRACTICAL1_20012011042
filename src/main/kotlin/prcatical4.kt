fun main(){
    print("Enter number : ")
    var x:Int = readLine()!!.toInt()

    if(x % 2 == 0)
        println("Even")
    else
        println("Odd")
}