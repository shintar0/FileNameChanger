package entity.enum

enum class Size(val str: String) {
    LowerCase("l"),
    UpperCase("u"),
    ;

    companion object {
        fun get(str: String): Size? = values().firstOrNull { it.str == str }
    }
}