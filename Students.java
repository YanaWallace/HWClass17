package HWClass17;

public class Students {
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Students(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
        public double calculateAverageGrade() {
            return (grade1 + grade2 + grade3) / 3.0;
        }

        public static void main(String[] args) {
            Students[] students = new Students[5];
            students[0] = new Students("Brandon", 80, 90, 70);
            students[1] = new Students("Zoya", 90, 85, 95);
            students[2] = new Students("Liza", 75, 80, 85);
            students[3] = new Students("Yana", 98, 99, 100);
            students[4] = new Students("Tamara", 60, 70, 80);

            for (Students student : students) {
                System.out.println(student.name + "'s average mark is " + student.calculateAverageGrade());
            }
        }
    }


