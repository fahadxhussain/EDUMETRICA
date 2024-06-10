/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author fahadxhussain
 */

public class Goal {
    String goalInput;
    String deadline;
    User user = new User();
    
    
    public Goal(){
        
    }
    
    public Goal(String goal, String deadline){
        this.goalInput = goal;
        this.deadline = deadline;
        
        user.addGoal(this);
    }
    
}
