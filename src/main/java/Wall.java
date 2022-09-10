import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class Wall implements Structure {
    private List<Block> blocks;

    @Override
    public Optional findBlockByColor(String color) {
        return blocks.stream()
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(b -> b.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
