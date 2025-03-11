package observer_pattern;

public class ConcreteStudent implements Observer {
    private String name;

    public ConcreteStudent(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nhận được thông báo: " + message);
    }
}
