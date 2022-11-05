class School {
    var name = ""
    var age = 100
    var where = ""
    constructor(name: String, age: Int) {
        println("School created ${name} +  ${age}")
        this.name = name;
        this.age = age;
    }

    constructor(name: String, age: Int, where: String):this(name,age) {
        println("three member created")
        this.where = where
    }
}