import Note.Companion.getNote
import java.util.Scanner

class NoteMenu(val arc: Archive) : Menu() {

    override fun start() {

        println("Архив: " + arc.name)
        while (true) {

            menuItems.clear()
            arc.notes.forEach { menuItems.add(MenuItem(it.title))}

            var choice = getChois(menuShow("Меню заметки")+1)

            if (choice == 0) {
                return
            }

            if (choice == 1) {
                arc.notes.add(getNote())
                continue
            }

            arc.notes[choice - 2] = NoteEditMenu(arc.notes[choice - 2]).startEditNote()
        }
    }

}
