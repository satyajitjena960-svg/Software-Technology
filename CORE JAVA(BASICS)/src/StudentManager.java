import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setId(1);
        s1.setName("sj");
        s1.setCgpa(9.4);
        s1.setFeesPaid(true);
        s2.setId(2);
        s2.setName("Pabitra");
        s2.setCgpa(9.3);
        s2.setFeesPaid(true);
        s3.setId(3);
        s3.setName("Bana");
        s3.setCgpa(8.4);
        s3.setFeesPaid(false);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        for (Student std:s){
            if(std.getCgpa()>9.0 && std.isFeesPaid()){
                System.out.println(std.getName());
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id You want to search");
        int searchId=sc.nextInt();
        boolean found=false;
        for (Student std:s){
            if(std.getId()==searchId){
                std.setFeesPaid(true);
                System.out.println("Successfully Updated");
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("ID is not available");
        }
    }
}
