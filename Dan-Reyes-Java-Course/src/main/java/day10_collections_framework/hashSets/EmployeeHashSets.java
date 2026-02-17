package day10_collections_framework.hashSets;

import java.util.Objects;

public class EmployeeHashSets {
    private int id;
    private String name;
    private String dept;

    public EmployeeHashSets(int id, String name, String dept) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeHashSets that = (EmployeeHashSets) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept);
    }
}
