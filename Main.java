package com;
import java.util.HashSet;
import java.util.Objects;

class Main {
    int id;
    String name;
    int marks;

    public Main(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Override equals() to compare based on marks
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Main student = (Main) obj;
        return marks == student.marks; // Compare only marks
    }

    // Override hashCode() to ensure consistent hashing
    @Override
    public int hashCode() {
        return Objects.hash(marks); // Hash based on marks
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Main> students = new HashSet<>();

        students.add(new Main(1, "Alice", 85));
        students.add(new Main(2, "Bob", 90));
        students.add(new Main(3, "Charlie", 85)); // Duplicate based on marks, won't be added
        students.add(new Main(4, "David", 95));

        // Print students (Charlie won't be in the set)
        for (Main student : students) {
            System.out.println(student);
        }
    }
}
