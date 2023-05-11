
class Const {
    companion object {

        const val COMMAND_SIZE = 4

        // Mark: Exit Program
        private const val QUIET = "q"
        fun quiet(str: String): Boolean = QUIET == str
    }
}