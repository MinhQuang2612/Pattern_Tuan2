package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements Component {
    private List<Component> products = new ArrayList<>();

    public void add(Component component) {
        products.add(component);
    }

    public void remove(Component component) {
        products.remove(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component component : products) {
            total += component.getPrice();
        }
        return total;
    }
}
