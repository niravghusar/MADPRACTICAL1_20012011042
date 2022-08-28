fun main(){
    print("Student Enrollment No.: ")
    var sn:Long = readLine()!!.toLong()
    print("Student Name: ")
    var sname = readLine()
    print("Student Branch: ")
    var sb = readLine()
    print("Student College Name: ")
    var scn = readLine()
    print("Student University Name: ")
    var sun = readLine()
    print("Student Age: ")
    var sa:Int = readLine()!!.toInt()

    println("***************************************")

    println("Student Enrollment No.: $sn")
    println("Student Name: $sname")
    println("Student Branch: $sb")
    println("Student College Name: $scn")
    println("Student University Name: $sun")
    println("Student Age: $sa")
}