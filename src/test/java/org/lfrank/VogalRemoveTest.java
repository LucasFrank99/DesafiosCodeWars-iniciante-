package org.lfrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VogalRemoveTest {

    @Test
    public void vogalRemoveTest() {
        assertEquals("hll wrld", new VogalRemove().vogalRemove("hello world"));
    }
}
