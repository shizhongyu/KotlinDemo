import Utils.firstChar
import Utils.lastChar
import pack.User

fun main(args: Array<String>) {
//    singleMethod()
//    numsMethod()
//    listMethod()
//    rangeMethod()
//    println(plus(3, 5))
//    println(plusThree(3, 5))
//    staticMethod()
//    ifMethod()
//    whenMethod()
//    whileMethod()
//    constructorMethod()
//    abstracterMethod()
//    enumMethod()
//    staticClassMethod()
//    classMethod()
//    extendMethod()
//    nullStringMethod()
//    typeCheckMethod()
    javaKotlinMethod()
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


/**
 * 函数
 * https://book.kotlincn.net/text/functions.html
 */
fun plus(x: Int, y: Int) : Int {
    return x + y;
}

/**
 * 默认函数
 */
fun plusThree(x: Int, y:Int, z:Int = 8): Int {
    return x + y + z;
}

fun staticMethod() {
    println(KtSingle.honor)
    println(App.NAME)
    println(App.add(2, 6))
}

/**
 * if 表达式
 */
fun ifMethod() {
    var a = 5
    var b = 8;
    if(a > b) {
        println("a > b")
    } else{
        println("a < b")
    }
}

/**
 * when 表达式
 */
fun whenMethod() {
    var a = 5;
    when(a) {
        5 -> println("a == 5")
        8 -> println("a == 8")
        else -> {
            println("nothing")
        }
    }

    var s = "name"
    when(s) {
        "name" -> println("name")
        "age" -> println("age")
        else -> {
            println("nothing")
        }
    }
}

/**
 * while表达式
 */
fun whileMethod() {
    var a = 10;
    while (a > 0) {
        println("a = ${a}")
        a--
    }
}


/**
 * 构造函数
 */
fun constructorMethod() {
    // 主构造函数
    var student = Student("microli", 10)
    println(student.name + "/" + student.age)
    // 次构造函数
    var school = School("microli", 100)
    println("school :" + school.name + "/" + school.age)

    var school2 = School("microli", 100, "henan")
    println("school2  " + school2.age + "  " + school2.name + "  " + school2.where)
}

/**
 * 抽象类
 */
fun abstracterMethod() {
    var tiger = Tiger();
    println(tiger.eat())
    println(tiger.drink())
    println(tiger.run())
}

fun enumMethod() {
    var direction = Direction.EAST
    when(direction) {
        Direction.EAST-> println("EAST")
        else-> {
            println("other")
        }
    }
}

/**
 * 内部类
 */
fun staticClassMethod() {
    Outer.Nested().inMethod()
}

/**
 * 静态内部类
 */
fun classMethod() {
    Outer().InnerClass().innerMethod()
}


/**
 * 扩展函数和扩展属性
 */
fun extendMethod() {
    println("abc".firstChar())
    println("abc".lastChar)
}

/**
 * 可空和非空
 */
fun nullStringMethod() {
    var a: String = "abc" // 默认情况下，常规初始化意味着非空
//    a = null // 编译错误
    var b: String? = "abc" // 可以设置为空
    b = null // ok
    println(b)
    b = "cde"
    println(b?.length)
}

/**
 * 类型检查和类型转换
 */
fun typeCheckMethod() {
    var a = "abc"
    println(a is String)
    if(a is String) {
        println(a.length)
    }
}


fun javaKotlinMethod() {
    var user = User()
    println(user.name + ":" + user.age)
}
