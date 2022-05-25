package designPatterns.designPatterns.abstractFactory

interface AbstractWidgetFactory {
    fun createLabel(): Label
    fun createButton(): Button
}