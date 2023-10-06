import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizz() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("fizz", FizzBuzz.fizzBuzz(-3));
        assertEquals("fizz", FizzBuzz.fizzBuzz(-6));
        assertEquals("fizz", FizzBuzz.fizzBuzz(-9));
    }

    void buzz() {
        assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(15));
        assertEquals("buzz", FizzBuzz.fizzBuzz(-5));
        assertEquals("buzz", FizzBuzz.fizzBuzz(-10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(-15));
    }

    void fizzBuzz() {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(45));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(-15));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(-30));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(-45));
    }

    void noFizzNoBuzz() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("1", FizzBuzz.fizzBuzz(-1));
        assertEquals("2", FizzBuzz.fizzBuzz(-2));
        assertEquals("4", FizzBuzz.fizzBuzz(-4));
    }
}