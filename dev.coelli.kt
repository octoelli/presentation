data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {

    val coelli = Person()                                     // 1
    val stringDescription = coelli.apply {                    // 2
        name = "Rodrigo"                                       // 3
        age = 45
        about = "Android developer"
    }.toString()                                            // 4

    println(stringDescription)
}

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

Open: https://pl.kotl.in/cHN1tLbEv?readOnly=true
