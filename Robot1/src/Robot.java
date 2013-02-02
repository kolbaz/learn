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
    double x=0;
    //текущая координата У
    double y=0;
    //курс
    double course=0;
    
    //печать коорбинат робота
    void printCoordinates(){
        System.out.println(x + ", "+y);
    }
    
    //передвижение на дистанцию
    void forward(int distance){
        //обращение к полю объекта Х
        x = x + distance * Math.cos(course / 180 * Math.PI);
        //обращение к полю объекта У
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }
    
}
