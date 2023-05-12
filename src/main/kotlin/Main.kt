import utility.CommandUtility

fun main() {
    println("*** start program ***")
    while (true) {
        val str = read(readln()) ?: break
        val command = CommandUtility.getCommand(str)
        if (command == null) {
            println("不正な値を検知しました")
            continue
        }
        println("success!! : $command")
        CommandUtility.executeCommand(command)
    }
}

/**
 * 標準入力を行う際、["q"]が入力されたかの判定のため、
 * ["q"]が入力された場合はnullを返す
 */
fun read(str: String): String? {
    return if (Const.quiet(str)) {
        println("You Select [q], See You Later")
        println("*** exit program ***")
        null
    } else {
        str
    }
}