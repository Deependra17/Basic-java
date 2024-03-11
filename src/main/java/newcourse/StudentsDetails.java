package newcourse;

public class StudentsDetails {
    int id;
    String f_name;
    String l_name;
    public void student() {
        StudentsDetails s1 = new StudentsDetails();
        s1.id = 1;
        s1.f_name = "Deepen";
        s1.l_name = "Chhetri";

        StudentsDetails s2 = new StudentsDetails();
        s2.id = 2;
        s2.f_name = "Naman";
        s2.l_name = "Ojha";

        StudentsDetails s3 = new StudentsDetails();
        s3.id = 3;
        s3.f_name = "Aman";
        s3.l_name = "Sharma";

        StudentsDetails[] student = new StudentsDetails[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (StudentsDetails studentsDetails : student) { //For each loop or enhanced loop
            System.out.println(studentsDetails.id + ":" + studentsDetails.f_name + " " + studentsDetails.l_name);
        }

    }

    public static void main(String[] args) {
        StudentsDetails details = new StudentsDetails();
        details.student();
    }
}
