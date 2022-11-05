abstract class Animal {

    fun eat() {
        println("eat food")
    }

    open fun run() {
        println("animal running")
    }

    abstract fun drink()
}