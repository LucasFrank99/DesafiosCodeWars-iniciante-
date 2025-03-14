package org.lfrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSpinTest {

    @Test
    public void spinner() {


        assertEquals("emoclew my dneirf", new WordSpin().wordSpin("welcome my friend"));
    }
}
