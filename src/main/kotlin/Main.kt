fun main(args: Array<String>) {
//    singleMethod()
    numsMethod()
}

fun singleMethod() {
    println(KtSingle.name + "/" + KtSingle.age)
    KtSingle.age = 20;
    KtSingle.name = "kotlin test"
    println(KtSingle.name + "/" + KtSingle.age)
}

/**
 * 数组
 * https://www.jianshu.com/p/e75795be48c8
 */
fun numsMethod() {
    var intArray = intArrayOf(1,2, 3)
    // 访问数组
    for (item in intArray) {
        println(item)
    }
    println("------------------------")
    // 修改数组
    for (index in  intArray.indices) {
        if(intArray[index] == 2) {
            intArray[index] = 5;
        }
    }
    for (item in intArray) {
        println(item)
    }

    println("------------------------")

    //创建空数组
    val emptyArray = arrayOfNulls<Int>(10)
    for (item in emptyArray) {
        println(item)
    }
    println("------------------------")

    val emptyArray2 = IntArray(5)
    for (item in emptyArray2) {
        println(item)
    }

    println("------------------------")

    var stringArray = arrayOfNulls<String>(5)
    for (item in stringArray) {
        println(item)
    }

    println("------------------------")

    for (index in stringArray.indices) {
        stringArray[3] = "kotlin"
    }

    for (item in stringArray) {
        println(item)
    }

    stringArray[3] = null

    for (item in stringArray) {
        println(item)
    }

}