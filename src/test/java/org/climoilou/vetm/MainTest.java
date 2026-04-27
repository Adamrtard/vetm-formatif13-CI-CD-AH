package org.climoilou.vetm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainTest() {
        assertTrue(true);
    }

    @Test
    void testQuiPassePas() {
        assertTrue(true);
    }

    @Test
    void testCesarCipherSimple() {
        String result = Main.cesarCipher("abc", 1);
        assertEquals("bcd", result);
    }

    @Test
    void testCesarCipherWithWrapAround() {
        String result = Main.cesarCipher("xyz", 3);
        assertEquals("abc", result);
    }

    @Test
    void testCesarCipherWithSpaces() {
        String result = Main.cesarCipher("a b c", 1);
        assertEquals("b c d", result);
    }

    @Test
    void testCesarDecipherSimple() {
        String encrypted = Main.cesarCipher("bonjour", 5);
        String decrypted = Main.cesarDecipher(encrypted, 5);
        assertEquals("bonjour", decrypted);
    }

    @Test
    void testCesarCipherOffsetZero() {
        String result = Main.cesarCipher("test", 0);
        assertEquals("test", result);
    }

    @Test
    void testCesarCipherLargeOffset() {
        String result = Main.cesarCipher("abc", 27); // 27 ≡ 1 mod 26
        assertEquals("bcd", result);
    }
}