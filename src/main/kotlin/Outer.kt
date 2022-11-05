class Outer {
    var name = javaClass.name

    class Nested {
        fun inMethod() {
            println("静态内部类")
        }
    }
}