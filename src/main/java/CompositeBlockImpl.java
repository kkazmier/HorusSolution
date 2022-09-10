import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompositeBlockImpl implements CompositeBlock {
    private String color;
    private String material;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
