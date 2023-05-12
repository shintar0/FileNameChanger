package entity.data

import entity.enum.Command
import entity.enum.Option

data class Commands(
    val str: String,
    val command: Command,
    val options: List<Option>
)