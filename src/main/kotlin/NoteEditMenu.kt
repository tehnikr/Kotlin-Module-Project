class NoteEditMenu(val note: Note) : Menu() {
    override fun start() {

    }

    fun startEditNote() : Note{
        while (true){
            println("Заметка: " + note.title)
            println("Текст заметки: " + note.content)
            println("1. Редактировать заметку")
            println("0. Выход")

            var choice = getChois(1)

            if (choice == 0) {
                return note
            }

            if (choice == 1) {
                return Note.getNote()
            }

        }
    }

}
