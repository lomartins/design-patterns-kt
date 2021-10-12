package abstract_factory.windows

import abstract_factory.Button

class WinButton: Button {
    override fun paint() {
        println("WinButton: paint()")
    }

}