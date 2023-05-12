package utility

import entity.data.Commands
import entity.enum.Command
import entity.enum.Option

class CommandUtility {
    companion object {
        fun getCommand(str: String?): Commands? {
            val comStr = str?: return null
            val list = comStr.split(" ")
            if (list.size < 2) {
                return null
            }
            val command = Command.get(list[1]) ?: return null
            if (list.filterIndexed { index, s -> index >= 2 }.any { Option.get(it) == null }) {
                return null
            }
            val options = Option.get(list.filterIndexed { index, _ -> index >= 2 })
            return Commands(
                str = comStr,
                command = command,
                options = options
            )
        }

        fun executeCommand(command: Commands) {
            when (val com = command.command) {
                Command.Change -> {
                    // TODO
                    println()
                }
                Command.Language -> {
                    // TODO
                    println()
                }
            }
        }
    }
}