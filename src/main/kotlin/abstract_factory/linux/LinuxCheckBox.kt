package abstract_factory.linux

import abstract_factory.CheckBox

class LinuxCheckBox: CheckBox {
    override fun paint() {
        println("LinuxCheckBox: paint()")
    }

}