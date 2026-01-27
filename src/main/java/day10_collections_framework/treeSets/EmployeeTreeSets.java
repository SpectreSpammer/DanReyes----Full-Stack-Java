package day10_collections_framework.treeSets;

import java.util.Objects;

public class EmployeeTreeSets implements Comparable<EmployeeTreeSets>{
    private int id;
    private String name;
    private String dept;

    public EmployeeTreeSets(int id, String name, String dept) {
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
        return "One Piece of Java{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }


    @Override
    public int compareTo(EmployeeTreeSets o) {
        return Integer.compare(this.id,o.id);
    }
}
