package day10_collections_framework.hashmap;

public class EmployeeHashmap {
    private int id;
    private String name;
    private String dept;

    public EmployeeHashmap(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "EmployeeTreemap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
