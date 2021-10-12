package factory_method

import java.lang.Exception

const val OS = "Windows"

class Application {
    lateinit var dialog: Dialog

    private fun initialize() {
        val config = OS

        dialog = when (config) {
            "Windows" -> WindowsDialog()
            "Web" -> HTMLDialog()
            else -> throw Exception("Error! Unknown operating system.")
        }
    }

    fun main () {
        initialize()
        dialog.render()
    }
}

fun main() {
    val application = Application()

    application.main()

    // Simulating a button click
    application.dialog.button?.click()
}