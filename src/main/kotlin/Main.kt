fun main(args: Array<String>) {
    singleMethod()
}

fun singleMethod() {
    println(KtSingle.name + "/" + KtSingle.age)
    KtSingle.age = 20;
    KtSingle.name = "kotlin test"
    println(KtSingle.name + "/" + KtSingle.age)
}