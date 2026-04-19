import java.util.Scanner

class ArchiveMenu(val archives: MutableList<Archive>) : Menu() {


    private lateinit var noteMenu: NoteMenu

    override fun start() {
        while (true) {

            menuItems.clear()
            archives.forEach { menuItems.add(MenuItem(it.name)) }

            var choice = getChois(menuShow("Меню Архивы")+1)

            if (choice == 0) {
                return
            }

            if (choice == 1) {
                println("Введите имя архива:")
                archives.add(Archive(getValidText()))
                continue
            }

            println("Вы выбрали архив: " + archives[choice - 2].name)

            NoteMenu(archives[choice - 2]).start()
        }


        val i = 0

        noteMenu = NoteMenu(archives.get(i))
        noteMenu.start()

    }
}
