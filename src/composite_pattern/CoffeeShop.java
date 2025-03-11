package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements Component {
    private List<Component> tables = new ArrayList<>();

    public void addTable(Component table) {
        tables.add(table);
    }

    public void removeTable(Component table) {
        tables.remove(table);
    }

    @Override
    public double getPrice() {
        double revenue = 0;
        for (Component table : tables) {
            revenue += table.getPrice();
        }
        return revenue;
    }

    public double getRevenue() {
        return getPrice();
    }
}
