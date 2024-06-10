/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fahadxhussain
 */
public class Grade {
    int semester;
    double GPA;
    String grades;
    public User user = new User();
    
    public Grade(){
        
    }
    
    public Grade(int semester, double GPA, String grades){
        this.semester = semester;
        this.GPA = GPA;
        this.grades = grades;
        
        user.addGrade(this);
    }
    
}
