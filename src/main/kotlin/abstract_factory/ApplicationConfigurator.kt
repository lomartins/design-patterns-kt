package abstract_factory

import abstract_factory.linux.LinuxFactory
import abstract_factory.windows.WinFactory

class ApplicationConfigurator {
    fun main() {
        val config = OS

        val factory = when(config) {
            "Windows" -> WinFactory()
            "Linux" -> LinuxFactory()
            else -> throw Exception("Error! Unknown operating system.")
        }

        val app = Application(factory)
    }

    companion object {
        const val OS = "Linux"
    }
}