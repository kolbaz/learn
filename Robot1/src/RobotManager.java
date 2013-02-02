/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kolbas
 */
public class RobotManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Robot r1 = new Robot();
//        Robot r2;
//        r2 = new Robot();
//        
//        //выставляем значение Х
//        r1.x=99;
//        r2.x=122;
//        
//        System.out.println(r1.x);
//        System.out.println(r2.x);
        //создаем новый экземпляр класса
        Robot robot = new Robot();
        
        //перемещаем робота на 20 метров
        robot.forward(20);
        robot.printCoordinates();
        
        //задаем курс 90 градусов
        robot.course = 90;
        
        robot.forward(20);
        robot.printCoordinates();
        
        robot.course = 45;
        
        robot.forward(20);
        robot.printCoordinates();
    }
}
