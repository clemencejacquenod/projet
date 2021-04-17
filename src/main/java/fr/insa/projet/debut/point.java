/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.projet.debut;

import java.awt.Color;

/**
 *
 * @author cleme
 */
public class point {
    
   private double px ;
   private double py ;
   
   public point() {
        this(0.0, 0.0);
    }

    public point(double px, double py) {
      this(px,py);
     }

    public point(double px, double py) {
        
        this.px = px;
        this.py = py;
    }
}

