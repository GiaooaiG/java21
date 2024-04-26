public class Person {
    private String name;
    private String location;
    private long phoneNumber;
    private String email;

    public Person(String name, String location, long phoneNumber, String email) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person:" + this.getName();
    }
}

class Student extends Person {
    private final int grade;

    public Student(String name, String location, long phoneNumber, String email, int grade) {
        super(name, location, phoneNumber, email);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student:" + this.getName();
    }
}

class Employee extends Person {
    private final MyDate date = new MyDate();
    private int salary;
    private String office;

    public Employee(String name, String location, long phoneNumber, String email, int salary, String office) {
        super(name, location, phoneNumber, email);
        this.salary = salary;
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public MyDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Employee:" + this.getName();
    }
}

class Faculty extends Employee {
    private String workTime;
    private int level;

    public Faculty(String name, String location, long phoneNumber, String email, int salary, String office, String workTime, int level) {
        super(name, location, phoneNumber, email, salary, office);
        this.workTime = workTime;
        this.level = level;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Faculty:" + this.getName();
    }

}

class Stuff extends Employee {
    private String title;

    public Stuff(String name, String location, long phoneNumber, String email, int salary, String office, String title) {
        super(name, location, phoneNumber, email, salary, office);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Stuff:" + this.getName();
    }
}