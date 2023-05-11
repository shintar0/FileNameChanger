package entity.enum

enum class Exception(private val cause: String) {
    IllegalCommandSize("commandの長さが足りていません。"),
    IllegalLang("正しいコマンドを入力してください"),
    IllegalPath("正しいコマンドを入力してください"),
    IllegalSplit("正しいコマンドを入力してください"),
    IllegalSize("正しいコマンドを入力してください"),
    ;
    fun log() {
        println(this.name)
        println("Cause : " + this.cause)
        println()
    }
}