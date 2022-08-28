fun main() {
    val arr1 = arrayOf(1, 2, 3, 4, 5)
    println("Created array using arrayOf() method: ")
    printArray(arr1)
    println()

    val arr2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Created array using Array<> method")
    printArray(arr2)
    println()

    println("Created array using Array<> method and lambda function")
    val arr3 = Array(5) { i: Int -> i }
    printArray(arr3)
    println()

    println("Created array using IntArray<> method")
    val arr4 = IntArray(5)
    printArray(arr4.toTypedArray())
    println()

    println("Created array using intArrayOf() method")
    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
    printArray(arr5.toTypedArray())
    println()

    println("Created array using arrayOf() and intArrayOf() method")
    val arr6 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
    printArray(arr6)
    println()

    println("Enter numbers for array")
    val a = ArrayList<Int>()
    for (i in 0..4) {
        print("a[$i] = ")
        val temp: Int = readLine()!!.toInt()
        a.add(temp)
    }
    println(a)

    println("*************** Sorting Using Built-in module *********")
    var c = ArrayList<Int>()
    c = a.clone() as ArrayList<Int>
    c.sort()
    println(c)
    println()

    println("*************** Sorting Using User Defined Function *********")
    println("Before sorting")
    printArray(a.toTypedArray())
    var b = ArrayList<Int>()
    b = sortArray(a)
    println()
    println("After sorting")
    printArray(b.toTypedArray())
}

fun printArray(arr: Array<Int>) {
    for (element in arr) {
        print(" $element")
    }
}

fun printArray(arr: Array<IntArray>) {
    for (row in arr) {
        print(row.contentToString())
    }
}

fun sortArray(arr: ArrayList<Int>): ArrayList<Int> {
    var i: Int
    var tmp: Int
    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[i]) {
                tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
            }
        }
    }
    return arr
}