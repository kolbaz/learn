/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru;

/**
 *
 * @author kolbas
 */
public class RobotEx extends Robot {
    public RobotEx(double x, double y, double course){
        super(x,y);
        this.course = course;
    }
    
    public void back(int distance){
        forward(-distance);
    }
}