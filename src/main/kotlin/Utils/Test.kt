package Utils

fun String.firstChar() :String {
    if (this.length == 0) {
        return ""
    }
    return this[0].toString()
}