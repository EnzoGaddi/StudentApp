package ie.atu.week4;
import java.util.Scanner;

 public class Student {
    private String name;
    private String email;
    private String course;

   Student(String n, String e, String c)
   {
       this.name = n;
       this.email = e;
       this.course = c;
   }

     public String getName()
     {
         return name;
     }

     public String getEmail()
     {
         return email;
     }

     public String getCourse()
     {
         return course;
     }

         public void setName(String name)
         {
             this.name = name;
         }

         public void setEmail(String email)
         {
             this.email = email;
         }

         public void setCourse(String course)
         {
             this.course = course;
         }

     Student(String name)
    {
        this.name = name;
    }

}
