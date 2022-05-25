package designPatterns.designPatterns.abstractFactory

class View (private val abstractWidgetFactory: AbstractWidgetFactory) {
    var button: Button = abstractWidgetFactory.createButton()
    var label: Label = abstractWidgetFactory.createLabel()
}