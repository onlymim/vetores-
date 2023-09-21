/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorvendas;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class VetorVendas{
    

    public static void main(String[] args) {
        Vetores vendasArea1 = new Vetores();
        Vetores vendasArea2 = new Vetores();
        Scanner scan = new Scanner(System.in);
        
        //lendo conteúdo do array 1
        System.out.println("Quantos produtos foram vendidos na area 1?");
        vendasArea1.l = scan.nextInt();
        int[] vetorArea1 = new int[vendasArea1.l];
        vendasArea1.iteratingIdBySection(vetorArea1);
        
        //lendo conteúdo do array 2
        System.out.println("Quantos produtos foram vendidos na area 2?");
        vendasArea2.l = scan.nextInt();
        int[] vetorArea2 = new int[vendasArea2.l];
        vendasArea2.iteratingIdBySection(vetorArea2);
        
        //escrevendo conteúdo dos arrays
        for(int i = 0; i< vendasArea1.l; i++){
        System.out.println("venda area 1 de cod:\n "+ vetorArea1[i]);
        }
         for(int i = 0; i< vendasArea2.l; i++){
        System.out.println("venda area 2 de cod:\n "+ vetorArea2[i]);
        }
        
        //contabilizando intersecções
        
        
       int quntVendaMesmoProduto = 0;
       int[] codProdutoVendido = new int[Math.min(vendasArea1.l, vendasArea2.l)];
       for (int i = 0; i < vendasArea1.l && i < vendasArea2.l; i++) {
         if (vetorArea1[i] == vetorArea2[i]) {
        codProdutoVendido[quntVendaMesmoProduto] = vetorArea1[i];
        quntVendaMesmoProduto++;
            } 
            }
       
       System.out.println("Produtos vendidos em ambas as áreas: ");
       for (int i = 0; i < quntVendaMesmoProduto; i++) {
       System.out.println(codProdutoVendido[i]);
            }
         } 
         }
       
       
        
    

