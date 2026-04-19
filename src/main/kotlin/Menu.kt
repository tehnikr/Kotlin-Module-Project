import java.util.Scanner
import javax.lang.model.type.NoType

abstract class Menu() {

    class MenuItem(val name: String) {
    }

    val menuItems = mutableListOf<MenuItem>()

    fun show(string: String) {

    }

    abstract fun start()

    fun menuShow(menuType: String): Int {
        println(menuType)
        println()
        println("1. Добавить")
        menuItems.forEachIndexed { index, item ->
            println("${index + 2}. ${item.name}")
        }

        println("0. Выход")
        return menuItems.size
    }

    fun getChois(maxChoisZn: Int): Int {
        val scanner = Scanner(System.`in`)
        var choise: Int? = null

        while (true) {
            println("Введите цифру от 0 до " + maxChoisZn)
            while (!scanner.hasNextInt()) {
                println("Это не целое число. Введите цифру от 0 до " + maxChoisZn + ":")
                scanner.next() // Считываем и отбрасываем неверный ввод
            }
            choise = scanner.nextInt()
            if (choise <= maxChoisZn)
                return choise
        }
    }



    companion object {
        fun getValidText(): String {
            val scanner = Scanner(System.`in`)
            while (true) {
                val text: String= scanner.nextLine()
                if (text.isNotBlank()) {
                    return text
                }
                println("Строка не может быть пустой")
            }
        }
    }
}