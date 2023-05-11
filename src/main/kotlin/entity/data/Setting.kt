package entity.data

import entity.enum.Lang
import entity.enum.Size
import entity.enum.Split

data class Setting (
    val lang: Lang,
    val path: String,
    val split: Split,
    val size: Size
)