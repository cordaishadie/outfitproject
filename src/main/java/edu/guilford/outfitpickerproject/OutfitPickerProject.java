/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.guilford.outfitpickerproject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author cshad
 */
public class OutfitPickerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Fitcheck> outfits = new ArrayList<Fitcheck>();

        //File dataFile = new File("allTheLives.txt"); 
        //ArrayList<outfits> lives = new ArrayList<Fitcheck>();
        Fitcheck fit1 = new Fitcheck();
        System.out.println(fit1.toString());
        outfits.add(fit1);

        Fitcheck fit2 = new Fitcheck();
      //  System.out.println(fit2.toString());
        outfits.add(fit2);
        
        //System.out.println(outfits.get(0).getBottom());
        

        
        JFrame fitWindow = new JFrame("Outfits");
        fitWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FitcheckPanel fitPanel = new FitcheckPanel(outfits);
        fitWindow.add(fitPanel);

        fitWindow.pack();
        fitWindow.setVisible(true);
    }

}
