import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CompositeBlockImplTests {
    private static CompositeBlockImpl compositeBlock;

    @BeforeAll
    static void init() {
        compositeBlock = new CompositeBlockImpl("green", "stone");
    }

    @Test
    void givenColor_whenGetColor_thenReturnColor() {
        Assertions.assertEquals(compositeBlock.getColor(), "green");
    }

    @Test
    void givenMaterial_whenGetMaterial_thenReturnMaterial() {
        Assertions.assertEquals(compositeBlock.getMaterial(), "stone");
    }
}
