/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kolbas
 */
public class Robot {
    //текущая координата Х
    private double x=0;
    //текущая координата У
    private double y=0;
    //курс
    private double course=0;
    
    //печать коорбинат робота
   public void printCoordinates(){
        System.out.println(x + ", "+y);
    }
    
    //передвижение на дистанцию
    public void forward(int distance){
        //обращение к полю объекта Х
        x = x + distance * Math.cos(course / 180 * Math.PI);
        //обращение к полю объекта У
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }
    
    //вывод значений
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getCourse(){
        return course;
    }
    
    //изменения курса
    /**
     * Задаем направление перемещения
     * @param course
     * Градус перемещения
     */
    public void setCourse(double course){
        this.course = course;
    }
    
}
