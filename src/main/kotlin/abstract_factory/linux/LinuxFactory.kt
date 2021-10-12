package abstract_factory.linux

import abstract_factory.Button
import abstract_factory.CheckBox
import abstract_factory.GUIFactory

class LinuxFactory: GUIFactory {
    override fun createButton(): Button = LinuxButton()

    override fun createCheckBox(): CheckBox = LinuxCheckBox()
}