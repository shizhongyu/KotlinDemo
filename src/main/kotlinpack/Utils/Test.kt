package Utils

fun String.firstChar() :String {
    if (this.length == 0) {
        return ""
    }
    return this[0].toString()
}

var String.lastChar :Char
    get() = get(length - 1)
    set(value) {
        this.lastChar = value
    }