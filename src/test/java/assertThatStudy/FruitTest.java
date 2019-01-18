package assertThatStudy;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitTest {
    private Fruit strawberry;
    private Fruit apple;

    @Rule
    public JUnitSoftAssertions softly = new JUnitSoftAssertions();

    @Before
    public void setUp() throws Exception {
        strawberry = new Fruit("strawberry", "red", 1000);
        apple = new Fruit("banana", "red", 2000);
    }

    @Test
    public void JUnitSoftAssertions() {
        softly.assertThat(strawberry.getName()).isEqualTo(apple.getName());
        softly.assertThat(strawberry.getColor()).isEqualTo(apple.getColor());
        softly.assertThat(strawberry.getPrice()).isEqualTo(apple.getPrice());

    }

    @Test
    public void AssertThat() {
        assertThat(strawberry.getName()).isEqualTo(apple.getName());
        assertThat(strawberry.getColor()).isEqualTo(apple.getColor());
        assertThat(strawberry.getPrice()).isEqualTo(apple.getPrice());
    }
}