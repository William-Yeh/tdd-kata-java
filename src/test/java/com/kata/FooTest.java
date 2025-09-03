package com.kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void testSayHello() {
        Foo foo = new Foo();
        assertThat(foo.sayHello(), is("Hello"));
    }

}
