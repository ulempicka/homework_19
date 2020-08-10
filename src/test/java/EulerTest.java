import euler1.Euler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EulerTest {

    private Euler euler;

    @BeforeEach
    void setUp() {
        euler = new Euler();
    }

    @Test
    void shouldReturn23ForLimit10(){
        //given
        int limit = 10;

        //when
        int actualSum = euler.sumMultipleThreeAndFive(limit);

        //then
        int expectedSum = 23;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturn33ForLimit11(){
        //given
        int limit = 11;

        //when
        int actualSum = euler.sumMultipleThreeAndFive(limit);

        //then
        int expectedSum = 33;
        assertThat(actualSum, is(equalTo(expectedSum)));
    }

    @Test
    void shouldReturn33ForLimit12(){
        //given
        int limit = 12;

        //when
        int actualSum = euler.sumMultipleThreeAndFive(limit);

        //then
        int expectedSum = 33;
        Assertions.assertThat(actualSum)
                .isEqualTo(expectedSum);

    }

    @Test
    void shouldReturn45ForLimit13(){
        //given
        int limit = 13;

        //when
        int actualSum = euler.sumMultipleThreeAndFive(limit);

        //then
        int expectedSum = 45;
        Assertions.assertThat(actualSum)
                .isEqualTo(expectedSum);
    }

    @Test
    void shouldReturn60ForLimit16(){
        //given
        int limit = 16;

        //when
        int actualSum = euler.sumMultipleThreeAndFive(limit);

        //then
        int expectedSum = 60;
        Assertions.assertThat(actualSum)
                .isEqualTo(expectedSum);

    }
}
