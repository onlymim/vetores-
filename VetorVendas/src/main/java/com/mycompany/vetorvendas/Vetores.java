/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorvendas;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Vetores {
   public int l; 
   public void iteratingIdBySection(int[] vetor){
   Scanner scan = new Scanner(System.in);
   l= vetor.length;
   for(int i= 0; i < l; i++){
       System.out.println("digite o código do produto vendido:");
       vetor[i]= scan.nextInt();
   }
   
    }
    
}