package tobyspring.helloboot;

import org.junit.jupiter.api.Test;
import tobyspring.helloboot.controller.HelloController;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class HelloControllerTest {

    @Test
    void helloController() {
        HelloController helloController = new HelloController(name -> name);

        String ret = helloController.hello("Test");

        assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failHelloController() {
        HelloController helloController = new HelloController(name -> name); // 수동 DI

        assertThatThrownBy(() -> {
            helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

}