/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import view.DashboardView;


/**
 *
 * @author fahadxhussain
 */
public class Course {
    String courseCode;
    String courseName;
    int creditHours;
    String difficultyLevel;
    double GPA;
    
    
    public User user = new User();
    private DashboardView dashboard;
    
    
    
        
    
    public Course(String courseCode, String courseName, int creditHours, double GPA, String difficultyLevel){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.difficultyLevel = difficultyLevel;
        this.GPA = GPA;
        
        
        user.addCourse(this);
    }
    
    
    
    
}
