package abstract_factory.windows

import abstract_factory.Button
import abstract_factory.CheckBox
import abstract_factory.GUIFactory

class WinFactory: GUIFactory {
    override fun createButton(): Button = WinButton()

    override fun createCheckBox(): CheckBox = WinCheckBox()
}