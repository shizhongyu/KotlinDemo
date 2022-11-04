fun main(args: Array<String>) {
//    singleMethod()
//    numsMethod()
//    listMethod()
//    rangeMethod()
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

/**
 * 集合
 * https://juejin.cn/post/6957922140767125517#heading-3
 */
fun listMethod() {
    var mList2 = mutableListOf<Int>()
    mList2.add(1)
    mList2.add(2)
    mList2.add(6)
    mList2.add(4)
    mList2.add(5)

    println("---------------------")

    mList2.forEach {
        println(it)
    }
    println("---------------------")

    mList2.forEachIndexed { index, i ->
        println("list index : ${index} + ${i}")
    }

    mList2.set(3, 9)

    println("---------------------")

    mList2.forEachIndexed { index, i ->
        println("${i}")
    }


}

/**
 * 区间
 * https://blog.csdn.net/qq_34285557/article/details/125299864
 */
fun rangeMethod() {
    var intRange = 1..10
    println(intRange.joinToString())
    var charRange = 'a'..'z'
    println(charRange.joinToString())
}