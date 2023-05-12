package entity.enum

enum class Option(val command: String) {
    LowerCase("-l"),
    UpperCase("-u"),
    CamelCase("-c"),
    KebabCase("-k"),
    SnakeCase("-s"),
    Japanese("-ja"),
    English("-en"),
    ;
    companion object {
        fun get(list: List<String>) = list.filter { get(it) != null }.map { get(it)!! }

        fun get(str: String) = values().firstOrNull { it.command == str }
    }
}