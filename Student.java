package HWClass17;

public class Student {


        private String name;
        private double grade1;
        private double grade2;
        private double grade3;

        public Student(String name, double grade1, double grade2, double grade3) {
            this.name = name;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
        }

        public double calculateAverageGrade() {
            return (grade1 + grade2 + grade3) / 3;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGrade1() {
            return grade1;
        }

        public void setGrade1(double grade1) {
            this.grade1 = grade1;
        }

        public double getGrade2() {
            return grade2;
        }

        public void setGrade2(double grade2) {
            this.grade2 = grade2;
        }

        public double getGrade3() {
            return grade3;
        }

        public void setGrade3(double grade3) {
            this.grade3 = grade3;
        }



        public static void main(String[] args) {
            Student student1 = new Student("Hichem", 90, 80, 70);
            Student student2 = new Student("Ouma", 85, 75, 65);
            Student student3 = new Student("Omar", 80, 70, 60);
            Student student4 = new Student("Ons", 75, 65, 55);
            Student student5 = new Student("Malek", 70, 60, 50);

            Student[] students = { student1, student2, student3, student4, student5 };

            for (Student student : students) {
                System.out.println(student.getName() + "'s average grade is " + student.calculateAverageGrade());
            }
        }
    }

