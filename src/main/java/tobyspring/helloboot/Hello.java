package tobyspring.helloboot;

import lombok.Getter;

@Getter
public class Hello {
    private String name;
    private int count;

    public Hello(String name, int count) {
        this.name = name;
        this.count = count;
    }
}
