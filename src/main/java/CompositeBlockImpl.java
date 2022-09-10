import lombok.Setter;

@Setter
public class CompositeBlockImpl implements CompositeBlock {

    @Override
    public String getColor() {
        return this.getColor();
    }

    @Override
    public String getMaterial() {
        return this.getMaterial();
    }
}
