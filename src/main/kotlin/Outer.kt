class Outer {
    var name = javaClass.name

    class Nested {
        fun inMethod() {
            println("静态内部类")
        }
    }

    inner class InnerClass {
        fun innerMethod() {
            println("内部类 + ${name}")
        }
    }
}