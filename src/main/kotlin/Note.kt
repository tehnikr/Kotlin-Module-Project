import Menu.Companion.getValidText

data class Note(
    public var title: String,
    public val content: String
){
    companion object {
        fun getNote(): Note{
            println("Введите имя заметки:")
            val name = getValidText()
            println("Введите текст заметки:")
            val content = getValidText()
            return Note(name, content)
        }
    }
}