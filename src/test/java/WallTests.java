import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WallTests {
    private static Wall wall;

    @BeforeAll
    static void init() {
        List<BlockImpl> blocks = new ArrayList<>();
        blocks.add(new BlockImpl("green", "stone"));
        blocks.add(new BlockImpl("red", "glass"));
        blocks.add(new BlockImpl("blue", "steel"));
        blocks.add(new BlockImpl("green", "stone"));
        wall = new Wall(blocks);
    }

    @Test
    void givenColor_whenFindBlockByColor_thenReturnAnyBlockContainsGivenColor() {
        Assertions.assertEquals(wall.findBlockByColor("green").get().getColor(), "green");
        Assertions.assertEquals(wall.findBlockByColor("green").get().getMaterial(), "stone");
    }

    @Test
    void givenMaterial_whenFindBlocksByMaterial_thenReturnAllBlocksContainGivenMaterial() {
        Assertions.assertEquals(
                wall.findBlocksByMaterial("stone").stream()
                        .filter(b -> b.getMaterial().equals("stone"))
                        .count(), 
                2);
    }

    @Test
    void givenWall_whenCount_thenReturnBlocksQuantity() {
        Assertions.assertEquals(wall.count(), 4);
    }
}
