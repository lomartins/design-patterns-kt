package abstract_factory.linux

import abstract_factory.Button

class LinuxButton: Button {
    override fun paint() {
        println("LinuxButton: paint()")
    }

}