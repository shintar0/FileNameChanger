import entity.data.Setting
import entity.enum.*

fun main() {
    println("*** start program ***")
    val lang = readLang() ?: return
    val (path, split, size) = readCommand() ?: return
    val info = Setting(lang, path, split, size)
    println("success!! $info")
}

/**
 * commandの取得、validationまで行う。
 * ["q"]が入力された場合はnullを返し、main関数でプログラムを終了する
 * @return Triple( first = "path", second = "Split", third = "Size")
 */
fun readCommand(): Triple<String, Split, Size>? {
    fun announce(): String? {
        println("Enter command")
        return read(readln())
    }
    var path: String?
    var split: Split?
    var size: Size?

    while (true) {
        val commands = announce()?.split(" ") ?: return null
        val exceptions = arrayListOf<Exception>()
        if (commands.size != Const.COMMAND_SIZE) {
            Exception.IllegalCommandSize.log()
            continue
        }
        val (_, pathStr, splitStr, sizeStr) = commands

        if (pathStr.isEmpty()) {
            Exception.IllegalPath.log()
            continue
        }
        path = pathStr
        split = Split.get(str = splitStr)
        if (split == null) {
            exceptions.add(Exception.IllegalSplit)
        }
        size = Size.get(str = sizeStr)
        if (size == null) {
            exceptions.add(Exception.IllegalSize)
        }
        if (exceptions.isNotEmpty()) {
            exceptions.forEach { e ->
                e.log()
            }
            continue
        }
        break
    }
    return  Triple(path!!, split!!, size!!)
}

/**
 * 言語の取得、validationまで行う
 * ["q"]が入力された場合はnullを返し、main関数でプログラムを終了する
 *
 */
fun readLang(): Lang? {
    fun announce(): String? {
        println("select language(ja/en/q(Exit Program))")
        return read(readln())
    }
    var lang: Lang? = null
    while (true) {
        val str = announce()?: break
        lang = Lang.get(str = str)
        if (lang == null) {
            Exception.IllegalLang.log()
            continue
        } else {
            break
        }
    }
    return lang
}

/**
 * 標準入力を行う際、["q"]が入力されたかの判定のため、
 * ["q"]が入力された場合はnullを返す
 */
fun read(str: String): String? {
    return if (Const.quiet(str)) {
        println("Exit Program : you select [q] , See you again")
        null
    } else {
        str
    }
}