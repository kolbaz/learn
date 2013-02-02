package ru;

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
        // Создаем объекта класса Robot
        RobotEx robot = new RobotEx(20, 20, 45);
               // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Это более корректный способ менять курс. nnnnnnnn
        // Реализация внутри робота не сильно отличается, но nnnnnnnn
        // мы в любой момент сможем сделать более продвинутую версию
        // Но класс RobotManager об этом даже не узнает
        robot.setCourse(90);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.setCourse(45);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
        robot.back(30);
        robot.printCoordinates();
    }
}