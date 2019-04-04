package hello;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {
    
    RomanNumberConverter romanNumberConverter;

    @Before
    public void setup() {
        romanNumberConverter = new RomanNumberConverter();
    }

    @Test
    public void check() {
        assertThat(romanNumberConverter.convert("I"))
            .isEqualTo(1);
        assertThat(romanNumberConverter.convert("V"))
            .isEqualTo(5);
        assertThat(romanNumberConverter.convert("X"))
            .isEqualTo(10);
        assertThat(romanNumberConverter.convert("L"))
            .isEqualTo(50);
        assertThat(romanNumberConverter.convert("C"))
            .isEqualTo(100);
        assertThat(romanNumberConverter.convert("D"))
            .isEqualTo(500);
        assertThat(romanNumberConverter.convert("M"))
            .isEqualTo(1000);
    }

    /*@Test
    public void check2() {
        assertThat(romanNumberConverter.convert2("XX"))
            .isEqualTo(20);
    }*/
}