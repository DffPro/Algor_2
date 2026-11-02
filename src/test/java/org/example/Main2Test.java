package org.example;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {
    @Test
    void testMain() {
        PrintStream old = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        System.setOut(old);

        String nl = System.lineSeparator();

        String expected =
                "***"   + nl +
                        "*****" + nl +
                        "*"     + nl +
                        "****"  + nl +
                        "**"    + nl;

        assertEquals(expected, out.toString());
    }
}