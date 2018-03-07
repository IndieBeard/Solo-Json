/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solojson;

/**
 *
 * @author andyr
 */
public class Student {
    private String fName;
    private String lName;
    private double GPA;
    private int currentCredits;
    private int totalCredits;
    
    public Student (String _fName, String _lName, double _GPA, int _currentCredits, int _totalCredits){
        fName = _fName;
        lName = _lName;
        GPA= _GPA;
        currentCredits = _currentCredits;
        totalCredits = _totalCredits;
    }
    
    public String getFName(){
        return fName;
    }
    
    public String getLName(){
        return lName;
    }
    
    public double getGPA(){
        return GPA;
    }
    
    public int getCCredits(){
        return currentCredits;
    }
    
    public double getTCredits(){
        return totalCredits;
    }
}
