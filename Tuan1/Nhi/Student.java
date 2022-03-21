package oopthaylong.Tuan1.Nhi;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private double score;
    private String rank;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:");
        id = scanner.next();
        
        System.out.println("Name:");
        name = scanner.next();

        System.out.println("Score:");
        score = scanner.nextDouble();
    }

    public void updateStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("New name:");
        name = scanner.next();
    }

    public void outputStudentInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(rank);
    }


    public void rankingStudent() {
        if (score >= 8.0) {
            rank = "Excellent";
        }
        else if (score >= 6.0){
            rank = "Good";
        }
        else {
            rank = "Week";
        }
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        if (score == o.score)
            return 0;
        else if (score > o.score)
            return 1;
        else
            return -1;
    }
}
