package entity.enum

enum class Lang(private val str: String) {
    Japanese("ja"),
    English("en"),
    ;

    companion object {
        fun get(str: String): Lang? = values().firstOrNull { it.str == str }
    }
}