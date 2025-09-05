package com.kata;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void testSayHello() {
        Foo foo = new Foo();
        assertThat(foo.sayHello()).isEqualTo("Hello");
    }

}
