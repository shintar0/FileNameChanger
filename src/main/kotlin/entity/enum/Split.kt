package entity.enum

enum class Split(val str: String) {
    CamelCase("c"),
    SnakeCase("s"),
    KebabCase("k"),
    ;

    companion object {
        fun get(str: String): Split? = values().firstOrNull { it.str == str }
    }
}