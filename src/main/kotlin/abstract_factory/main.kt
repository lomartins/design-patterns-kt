package abstract_factory

import abstract_factory.linux.LinuxFactory
import abstract_factory.windows.WinFactory

fun main() {
    val winApp = Application(WinFactory())
    winApp.createUI()
    winApp.paint()

    val linuxApp = Application(LinuxFactory())
    linuxApp.createUI()
    linuxApp.paint()
}