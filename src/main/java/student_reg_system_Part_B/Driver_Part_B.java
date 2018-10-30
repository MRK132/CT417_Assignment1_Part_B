/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_reg_system_Part_B;


import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import student_Reg_System_Assignment_1.Student;
import student_Reg_System_Assignment_1.Module;
import student_Reg_System_Assignment_1.Course_Programme;
/**
 *
 * @author Mark
 */
public class Driver_Part_B {
    
    public static void main(String [] args){
        
        Student MarkGarvey = new Student("Mark Garvey", 21);
        Student SeanGolden = new Student("Sean Golden", 21);
        Student SeanGayer = new Student("Sean Gayer", 22);
        Student JackMoreton = new Student("Jack Moreton", 21);
        
        
        Module EE445 = new Module("DSP", "EE445");
        Module EE451 = new Module("System on Chip Design I", "EE451");
        Module CT475 = new Module("Machine Learning and Data Mining", "CT475");
        Module CT417 = new Module("Software Engineering III", "CT417");
        
        
        Course_Programme ECE4BP = new Course_Programme("Electronic and Computer Engineering");
        Course_Programme CSIT4CS = new Course_Programme("Computer Science and Information Technology");
        
         
        MarkGarvey.setCourse(new ArrayList());
        MarkGarvey.getCourse().add(ECE4BP);
        MarkGarvey.setModules(new ArrayList());
        MarkGarvey.getModules().add(EE445);
        MarkGarvey.getModules().add(EE451);
        MarkGarvey.getModules().add(CT475);        
        MarkGarvey.getModules().add(CT417);
        
         
        SeanGolden.setCourse(new ArrayList());
        SeanGolden.getCourse().add(ECE4BP);
        SeanGolden.setModules(new ArrayList());
        SeanGolden.getModules().add(EE445);
        SeanGolden.getModules().add(EE451);
        SeanGolden.getModules().add(CT475);        
        SeanGolden.getModules().add(CT417);
        
             
        SeanGayer.setCourse(new ArrayList());
        SeanGayer.getCourse().add(CSIT4CS);
        SeanGayer.setModules(new ArrayList());
        SeanGayer.getModules().add(CT417);
        SeanGayer.getModules().add(CT475);
        
         
        JackMoreton.setCourse(new ArrayList());
        JackMoreton.getCourse().add(CSIT4CS);
        JackMoreton.setModules(new ArrayList());
        JackMoreton.getModules().add(CT417);
        JackMoreton.getModules().add(CT475);
        
        
        EE445.getStudents().add(MarkGarvey);
        EE451.getStudents().add(MarkGarvey);
        EE445.getStudents().add(SeanGolden);
        EE451.getStudents().add(SeanGolden);
        
        CT475.getStudents().add(MarkGarvey);
        CT417.getStudents().add(MarkGarvey);
        CT475.getStudents().add(SeanGolden);
        CT417.getStudents().add(SeanGolden);
        CT475.getStudents().add(SeanGayer);
        CT417.getStudents().add(SeanGayer);
        CT475.getStudents().add(JackMoreton);
        CT417.getStudents().add(JackMoreton);
        
        
        EE445.getCourses().add(ECE4BP);
        EE451.getCourses().add(ECE4BP);
        CT475.getCourses().add(ECE4BP);
        CT417.getCourses().add(ECE4BP);
        CT475.getCourses().add(CSIT4CS);
        CT417.getCourses().add(CSIT4CS);
        
        ECE4BP.getModuleList().add(EE445);
        ECE4BP.getModuleList().add(EE451);
        ECE4BP.getModuleList().add(CT475);
        ECE4BP.getModuleList().add(CT417);
        
        CSIT4CS.getModuleList().add(CT417);
        CSIT4CS.getModuleList().add(CT475);
        
        
        
        System.out.println("University Courses : " + ECE4BP.getCourseName() + ", " + CSIT4CS.getCourseName()+ "\n ");
        
        System.out.println("******Modules taken by ECE and CS&IT students, with each registered student listed, along with which course they belong to: ******* ");
        System.out.println(" \n");
        
        ECE4BP.getModuleList().stream().map((mod) -> {
            System.out.println("-------Module------ : " + mod.getModuleName());
            return mod;
        }).map((mod) -> {
            System.out.println("Registered Students for this Module: ");
            return mod;            
        }).forEachOrdered((mod) -> {
            mod.getStudents().stream().map((stud) -> {
                System.out.println(stud.getName() + ", Username: " + stud.getUsername());
                return stud;
            }).map((stud) -> {
                System.out.println("Registered Modules for this Student: ");
                return stud;
            }).map((stud) -> {
                stud.getModules().forEach((modules) -> {
                    System.out.println(modules.getModuleName());
                });
                return stud;
            }).map((stud) -> {
                stud.getCourse().forEach((course) -> {
                    System.out.println("Course this student belongs to: " + course.getCourseName());
                });
                return stud;
            }).forEachOrdered((_item) -> {
                System.out.println();
                
            });
            
        });
         
         System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
         
}
}
