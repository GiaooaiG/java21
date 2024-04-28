public class E11_2 {
    public static void main(String[] args) {
        Person a = new Person("gyh", "scut", 114514, "10000@mail.qq.com");
        Student b = new Student("gyh", "scut", 114514, "10000@mail.qq.com", 1);
        Employee c = new Employee("gyh", "scut", 114514, "10000@mail.qq.com", 99999, "office");
        Faculty d = new Faculty("gyh", "scut", 114514, "10000@mail.qq.com", 99999, "office", "8:00-18:00", 9);
        Stuff e = new Stuff("gyh", "scut", 114514, "10000@mail.qq.com", 99999, "office", "title");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.print(e);
    }
}
