package designPatterns.designPatterns.abstractFactory

class DarkThemeFactory: AbstractWidgetFactory {
    override fun createLabel(): Label {
        return DarkLabel()
    }

    override fun createButton(): Button {
        return DarkButton()
    }
}