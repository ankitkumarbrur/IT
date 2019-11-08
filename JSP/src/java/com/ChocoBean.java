/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;

/**
 *
 * @author c3
 */
public class ChocoBean implements Serializable{

    private String[] strarr = new String[2];
    private String texture;
    
    public String[] getStrarr() {
        return strarr;
    }

    public void setStrarr(String[] strarr) {
        this.strarr = strarr;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
        if (texture.equals("Chewy")) {
            strarr[0] = "FiveStar";
            strarr[1] = "BarOne";
        } else if (texture.equals("Crunchy")) {
            strarr[0] = "Munch";
            strarr[1] = "KitKat";
        }
    }
    
}
