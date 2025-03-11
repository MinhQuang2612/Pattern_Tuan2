package observer_pattern;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng lớp trưởng (ConcreteSubject)
        Subject classLeader = new ClassLeader();

        // Tạo các sinh viên (ConcreteObserver)
        Observer student1 = new ConcreteStudent("Trần Minh Quang");
        Observer student2 = new ConcreteStudent("Trương Hữu Trí");
        Observer student3 = new ConcreteStudent("Nguyễn Thị Như Ý");

        // Đăng ký sinh viên theo dõi lớp trưởng
        classLeader.attach(student1);
        classLeader.attach(student2);
        classLeader.attach(student3);

        // Lớp trưởng gửi thông báo
        classLeader.setMessage("Ngày mai nghỉ học!");

        // Một sinh viên rút khỏi danh sách nhận thông báo
        classLeader.detach(student1);

        // Gửi thông báo mới
        classLeader.setMessage("Sinh viên bị đuổi học!");
    }
}
