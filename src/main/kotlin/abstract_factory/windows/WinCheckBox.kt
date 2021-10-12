package abstract_factory.windows

import abstract_factory.CheckBox

class WinCheckBox: CheckBox {
    override fun paint() {
        println("WinCheckBox: paint()")
    }
}