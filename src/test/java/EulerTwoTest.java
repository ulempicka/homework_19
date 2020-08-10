import euler2.EulerTwo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerTwoTest {
    private EulerTwo eulerTwo;

    @BeforeEach
    void setUp() {
        eulerTwo = new EulerTwo();
    }

    @Test
    void shouldReturn10ForLimit9(){
        //given
        int limit = 9;

        //when
        int actualSum = eulerTwo.sumFibonacciEvenNumbers(limit);

        //then
        int expectedSum = 10;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldNotReturn10ForLimit8(){
        //given
        int limit = 8;

        //when
        int actualSum = eulerTwo.sumFibonacciEvenNumbers(limit);

        //then
        int expectedSum = 10;
        assertThat(actualSum, is(not(equalTo(expectedSum))));
        assertThat(actualSum, is(equalTo(2)));
    }

    @Test
    void shouldReturn0ForLimit1(){
        //given
        int limit = 1;

        //when
        int actualSum = eulerTwo.sumFibonacciEvenNumbers(limit);

        //then
        int expectedSum = 0;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturn44ForLimit35(){
        //given
        int limit = 35;

        //when
        int actualSum = eulerTwo.sumFibonacciEvenNumbers(limit);

        //then
        int expectedSum = 44;
        assertThat(actualSum, is(equalTo(expectedSum)));
    }

    @Test
    void shouldReturn798ForLimit611(){
        //given
        int limit = 611;

        //when
        int actualSum = eulerTwo.sumFibonacciEvenNumbers(limit);

        //then
        int expectedSum = 798;
        Assertions.assertThat(actualSum)
                .isEqualTo(expectedSum);

    }
}
