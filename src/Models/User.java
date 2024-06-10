/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Database.DatabaseConnection;
import view.DashboardView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.*;


/**
 *
 * @author fahadxhussain
 */
public class User {
    String name;
    String userName;
    String password;
    Course course;
    Goal goal;
    Grade grade;
    
    private Connection connection;
    private DashboardView dashboard;
    CoursesView courseView = new CoursesView();
    
    public User() {
        
        
        
    try {
            this.connection = DatabaseConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }
    
    
    
    public boolean isUsernameTaken(String username){
        String query = "SELECT COUNT(*) FROM \"User\" WHERE username = ?";
        
        try(PreparedStatement pstmt = connection.prepareStatement(query))
        {
            pstmt.setString(1, username);
            
            try(ResultSet rs = pstmt.executeQuery())
            {
                if(rs.next() && rs.getInt(1)>0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        }
    
    public void registerUser(String name, String username, String password)
    {
        String query = "INSERT INTO \"User\" (name, username, password) VALUES (?, ?, ?)";
    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setString(1, name);
        pstmt.setString(2, username);
        pstmt.setString(3, password);
        pstmt.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public boolean loginUser(String username, String password)
    {
        String query = "SELECT Count(*) FROM \"User\" WHERE username = ? AND password = ?";
        try(PreparedStatement pstmt = connection.prepareStatement(query))
        {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            try(ResultSet rs = pstmt.executeQuery())
            {
                if(rs.next())
                {
                    int count = rs.getInt(1);
                    return count>0;
                }
            }
        }
            catch(SQLException ex)
            {
                
            }
        return false;
    }
    
    public void addCourse(Course course) {
        this.course = course;
        this.userName = CurrentUser.getUsername();
        addCourseToDatabase(this.course, userName);
    }
    
    public void addCourseToDatabase(Course course,String username)
    {
        String courseCode = course.courseCode;
        String courseName = course.courseName;
        int creditHours = course.creditHours;
        String difficultyLevel = course.difficultyLevel;
        double GPA = course.GPA;
        String query = "INSERT INTO \"Course\" (coursecode, coursename, credithours, difficulty, gpa, username) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setString(1, courseCode);
        pstmt.setString(2, courseName);
        pstmt.setInt(3, creditHours);
        pstmt.setString(4, difficultyLevel);
        pstmt.setDouble(5, GPA);
        pstmt.setString(6, username);
        
        pstmt.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void addGoal(Goal goal) {
        String goalInput = goal.goalInput;
        String deadline = goal.deadline;
        String username = CurrentUser.getUsername();
        
        String query = "INSERT INTO \"Goal\" (goal, deadline, username) VALUES (?, ?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setString(1, goalInput);
        pstmt.setString(2, deadline);
        pstmt.setString(3, username);
        
        pstmt.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        
    
    public void addGrade(Grade grade) {
        
        int semester = grade.semester;
        double gpa = grade.GPA;
        String grades = grade.grades;
        String username = CurrentUser.getUsername();
        
        String query = "INSERT INTO \"Grade\" (semester, gpa, grade, username) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setInt(1, semester);
        pstmt.setDouble(2, gpa);
        pstmt.setString(3, grades);
        pstmt.setString(4, username);
        
        pstmt.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void changeName(String newName)
    {
        
        String userName = CurrentUser.getUsername();
        String query = "UPDATE \"User\" SET name = ? WHERE username = ?";
        
        try(PreparedStatement pstmt = connection.prepareStatement(query))
        {
            pstmt.setString(1, newName);
            pstmt.setString(2, userName);
            int rowsUpdated = pstmt.executeUpdate();
            
            if(rowsUpdated > 0)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Name updated successfully", "", JOptionPane.OK_OPTION);
            }
            
        }
        
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public void changePssword(String newPassword)
    {
        String userName = CurrentUser.getUsername();
        String query = "UPDATE \"User\" SET password = ? WHERE username = ?";
        
        try(PreparedStatement pstmt = connection.prepareStatement(query))
        {
            pstmt.setString(1, newPassword);
            pstmt.setString(2, userName);
            int rowsUpdated = pstmt.executeUpdate();
            
            if (rowsUpdated > 0)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Password Updated Successfully", "", JOptionPane.OK_OPTION);
            }
            
            
        }
        
        catch(SQLException ex)
        {
            ex.printStackTrace();
             JOptionPane.showMessageDialog(null, "Error updating password: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void deleteCourse(String courseCode)
    {
        String userName = CurrentUser.getUsername();
        String query = "DELETE FROM \"Course\" WHERE username= ? AND coursecode= ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, courseCode);
            
            int rowsUpdated = pstmt.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Course Deleted Successfully", "", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No course found for deletion", "", JOptionPane.OK_OPTION);
            }
        } catch (SQLException ex) {
            // Properly handle the exception
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Error deleting course: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteGrade(String semesterInput)
    {
        String userName = CurrentUser.getUsername();
        String query = "DELETE FROM \"Grade\" WHERE username= ? AND semester= ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, semesterInput);
            
            int rowsUpdated = pstmt.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Grade Deleted Successfully", "", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No grade found for deletion", "", JOptionPane.OK_OPTION);
            }
        } catch (SQLException ex) {
            // Properly handle the exception
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Error deleting grade: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void deleteGoal(String goalInput)
    {
        String userName = CurrentUser.getUsername();
        String query = "DELETE FROM \"Goal\" WHERE username= ? AND goal= ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, goalInput);
            
            int rowsUpdated = pstmt.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Goal Deleted Successfully", "", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No goal found for deletion", "", JOptionPane.OK_OPTION);
            }
        } catch (SQLException ex) {
            // Properly handle the exception
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Error deleting goal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    
        
    }
    
    
    

