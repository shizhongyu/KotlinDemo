class Tiger : Animal() {
    override fun drink() {
        println("Tiger drink water")
    }

    override fun run() {
        super.run()
        println("Tiger running")
    }
}