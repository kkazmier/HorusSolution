import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class Wall implements Structure {
    private List<BlockImpl> blocks;

    @Override
    public Optional<BlockImpl> findBlockByColor(String color) {
        return blocks.stream()
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }

    @Override
    public List<BlockImpl> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(b -> b.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
