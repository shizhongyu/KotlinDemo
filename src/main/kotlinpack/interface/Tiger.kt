package `interface`

class Tiger:Animal<String> {
    override fun name(): String {
        return "Tiger"
    }

    override fun food(): String {
        return "Grass"
    }
}