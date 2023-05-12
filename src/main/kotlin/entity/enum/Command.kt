package entity.enum

enum class Command(val command: String) {
    Language("language"),
    Change("change"),
    ;

    companion object {
        fun get(str: String) = values().firstOrNull { it.command == str }
    }
}