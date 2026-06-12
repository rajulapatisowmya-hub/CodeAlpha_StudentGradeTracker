import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String topperName = "";
        double highestPercentage = 0;
        double classTotal = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\n===== Student " + i + " =====");

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Maths Marks: ");
            int maths = sc.nextInt();

            System.out.print("Physics Marks: ");
            int physics = sc.nextInt();

            System.out.print("Chemistry Marks: ");
            int chemistry = sc.nextInt();

            System.out.print("English Marks: ");
            int english = sc.nextInt();

            System.out.print("Hindi Marks: ");
            int hindi = sc.nextInt();

            sc.nextLine();

            int total = maths + physics + chemistry + english + hindi;
            double percentage = total / 5.0;

            String grade;
            if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "F";

            String result;
            if (maths < 35 || physics < 35 || chemistry < 35 ||
                english < 35 || hindi < 35) {
                result = "FAIL";
            } else {
                result = "PASS";
            }

            System.out.println("\n----- REPORT CARD -----");
            System.out.println("Name        : " + name);
            System.out.println("Total Marks : " + total + "/500");
            System.out.printf("Percentage  : %.2f%%\n", percentage);
            System.out.println("Grade       : " + grade);
            System.out.println("Result      : " + result);

            classTotal += percentage;

            if (percentage > highestPercentage) {
                highestPercentage = percentage;
                topperName = name;
            }
        }

        double classAverage = classTotal / n;

        System.out.println("\n==============================");
        System.out.println("CLASS SUMMARY");
        System.out.println("==============================");
        System.out.printf("Class Average : %.2f%%\n", classAverage);
        System.out.println("Topper        : " + topperName);
        System.out.printf("Top Percentage: %.2f%%\n", highestPercentage);

        sc.close();
    }
}