import java.util.Scanner

fun main(args: Array<String>) {

    println("Проектная работа 3 спринт 7")
    val archives = mutableListOf<Archive>()

    /*archives.add(Archive("Архив1"))
    archives.get(0).notes.add(Note("Заметка1", "Содержание заметки 1"))
    archives.get(0).notes.add(Note("Заметка2", "Содержание заметки 2"))
    archives.add(Archive("Архив2"))
    val note1 = Note("Заметка 1 арх2 название", "2АрхКонтент заметки 1")
    archives.get(1).notes.add(note1)*/

    ArchiveMenu(archives).start()
    println("Выход из приложения Проектная работа 3 спринт 7")
}