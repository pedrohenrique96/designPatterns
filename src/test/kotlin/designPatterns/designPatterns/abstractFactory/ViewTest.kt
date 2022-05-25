package designPatterns.designPatterns.abstractFactory

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.amshove.kluent.shouldBeEqualTo

@SpringBootTest
class ViewTest {
    @Test
    fun view_theme_light() {
        val view = View(LightThemeFactory())
        view.label.color shouldBeEqualTo "black"
        view.button.color shouldBeEqualTo "white"
        view.button.backgroundColor shouldBeEqualTo "blue"
    }

    fun view_theme_dark() {
        val view = View(DarkThemeFactory())
        view.label.color shouldBeEqualTo "white"
        view.button.color shouldBeEqualTo "black"
        view.button.backgroundColor shouldBeEqualTo "white"
    }
}