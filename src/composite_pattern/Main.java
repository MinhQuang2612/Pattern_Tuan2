package composite_pattern;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product coffee = new Product("Cà phê", 20000);
        Product mineralWater = new Product("Nước suối", 10000);
        Product milkTea = new Product("Trà sữa", 30000);

        // Tạo bàn 1
        Table table1 = new Table();
        table1.add(coffee);
        table1.add(mineralWater);

        // Tạo bàn 2
        Table table2 = new Table();
        table2.add(milkTea);
        table2.add(coffee);

        // Tạo quán cà phê
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        // Tính tổng doanh thu
        System.out.println("Doanh thu bàn 1: " + table1.getPrice() + " VND");
        System.out.println("Doanh thu bàn 2: " + table2.getPrice() + " VND");
        System.out.println("Tổng doanh thu quán cà phê: " + coffeeShop.getRevenue() + " VND");
    }
}
