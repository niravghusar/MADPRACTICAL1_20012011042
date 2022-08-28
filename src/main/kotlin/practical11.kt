class Matrix(arrs: Array<IntArray>, noOfRow: Int, noOfCol: Int) {
    var r:Int = noOfRow
    var c:Int = noOfCol
    var m = arrs

    fun displayMat(final: Array<IntArray>){
        for (row in final) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }

    operator fun plus(b: Matrix) {
        // Adding Two matrices
        val sum = Array(r) { IntArray(c) }
        for (i in 0..r - 1) {
            for (j in 0..c - 1) {
                sum[i][j] = m[i][j] + b.m[i][j]
            }
        }
        return displayMat(sum)
    }

    operator fun minus(b: Matrix) {
        // Subtracting Two matrices
        val sub = Array(r) { IntArray(c) }
        for (i in 0..r - 1) {
            for (j in 0..c - 1) {
                sub[i][j] = m[i][j] - b.m[i][j]
            }
        }
        return displayMat(sub)
    }

    operator fun times(b: Matrix) {
        // Subtracting Two matrices
        val t = Array(r) { IntArray(b.c) }
        for (i in 0..r - 1) {
            for (j in 0..b.c - 1) {
                for (k in 0 .. c - 1){
                    t[i][j] += m[i][k] * b.m[k][j]
                }
            }
        }
        return displayMat(t)
    }
}

fun displayarray(a: Array<IntArray>){
    for (row in a) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
    println()
}

fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("****Addition****")
    println("Matrix:1 (3x2 Matrix)")
    displayarray(secondMatrix1.m)
    println("Matrix:2 (3x2 Matrix)")
    displayarray(secondMatrix.m)
    println("Addition: (3x2 Matrix)")
    val add = secondMatrix1 + secondMatrix


    println("******Subtraction****")
    println("Matrix:1 (3x2 Matrix)")
    displayarray(secondMatrix1.m)
    println("Matrix:2 (3x2 Matrix)")
    displayarray(secondMatrix.m)
    println("Subtraction: (3x2 Matrix)")
    val sub = secondMatrix1 - secondMatrix

    println("******Multiplication*****")
    println("Matrix:1 (2x3 Matrix)")
    displayarray(firstMatrix.m)
    println("Matrix:2 (3x2 Matrix)")
    displayarray(secondMatrix.m)
    println("Multiplication: (2x2 Matrix) ")
    val multiplication = firstMatrix * secondMatrix
}