package day10_collections_framework.arrayList;

public class EmployeeArrayList {
    private int id;
    private String name;
    private String dept;

    public EmployeeArrayList(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "One Piece of Java{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
