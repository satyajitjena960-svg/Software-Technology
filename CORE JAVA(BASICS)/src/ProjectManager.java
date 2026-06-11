import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
//Practicing collection
public class ProjectManager {
    public static void main(String[] args) {
        List<Project> p=new ArrayList<>();
        Project p1=new Project();
        p1.setId(1);
        p1.setTitle("Project1");
        p1.setDaysRemaining(10);
        p1.setStatus("pending");
        Project p2=new Project();
        p2.setId(2);
        p2.setTitle("Project2");
        p2.setDaysRemaining(5);
        p2.setStatus("complete");
        Project p3=new Project();
        p3.setId(3);
        p3.setTitle("Project3");
        p3.setDaysRemaining(7);
        p3.setStatus("pending");
        p.add(p1); p.add(p2); p.add(p3);

        for (Project pr:p){
            if(Objects.equals(pr.getStatus(), "pending")){
                System.out.println(pr.getTitle());
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id u want to search");
        int id=sc.nextInt();
        boolean found=false;
        for (Project pr:p){
            if(id== pr.getId()){
                found=true;
                if(Objects.equals(pr.getStatus(), "complete")){
                    System.out.println("No update is needed");
                }
                else {
                    pr.setStatus("complete");
                    System.out.println("Successfully completed");
                }
            }
        }
        if(!found){
            System.out.println("Id not found");
        }
    }
}
