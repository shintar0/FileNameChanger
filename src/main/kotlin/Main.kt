import entity.data.Setting
import entity.enum.*

fun main() {
    println("*** start program ***")
    while (true) {
        val str = announce()?: break
        lang = Lang.get(str = str)
        if (lang == null) {
            Exception.IllegalLang.log()
            continue
        }
    }
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