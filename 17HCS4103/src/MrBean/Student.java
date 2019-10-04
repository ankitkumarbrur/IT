package MrBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author c3
 */
public class Student implements Serializable{
    private String name;
    private int roll;
    private int classs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getClasss() {
        return classs;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }
    
}
