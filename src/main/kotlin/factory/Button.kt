package factory

interface Button {
    fun render()
    fun setOnClickListener(f: () -> Unit)
    fun click()
}