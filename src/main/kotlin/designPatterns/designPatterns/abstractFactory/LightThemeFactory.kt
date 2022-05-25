package designPatterns.designPatterns.abstractFactory

class LightThemeFactory: AbstractWidgetFactory {
    override fun createLabel(): Label {
        return LightLabel()
    }

    override fun createButton(): Button {
        return LightButton()
    }
}