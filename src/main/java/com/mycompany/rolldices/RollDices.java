/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ferrs
 */
public class RollDices {
public static int rollDices(){
        Random random =new Random();
        return random.nextInt(6)+1;
        
    }

    public static void main(String[] args) {
       Scanner data= new Scanner(System.in);
       
       int lives = 5, dice1, dice2 ;
       
       String player_name, key;
       int Throw =0, par=0, impar=0, equalDice=0, inARow=0 ; 
    
       
       
       System.out.println(":::WELCOME TO ROLL DICES:::");
       System.out.println(" Enter your player name: ");
       player_name = data.nextLine();
       
       System.out.println("Press any key to start the game");
       data.nextLine();
       
       System.out.println("Player name: " + player_name);
       System.out.println("Player lives: " + lives);
        
        while (lives>0){
            System.out.println("\nDo you want to roll the dice? (Y/N)");
            String option = data.nextLine();

            if (option.equalsIgnoreCase("N")) {
            System.out.println("Game end.");
             break;
            }
            Throw ++;
            
        
            dice1= rollDices();
            dice2= rollDices();
        
        
         System.out.println("your lives: " + lives);
         System.out.println("Dice1: "+dice1);
         System.out.println("Dice2: "+dice2);
         int sum = dice1 + dice2; 
         System.out.println("The sum dices is: "+ sum);
        
         if (sum % 2==0){
            par ++;
            System.out.println("is a even sum, continue : ");
        }
         else{
            impar++;
            lives--;
            System.out.println("Is a odd sum, you LOSE [1] life!!!");
            
        }
         // Esto para cuando salga doble 6
         if (dice1==6 && dice2==6){
             lives++;
             System.out.println("You obtain a double six, you WIN [1] extra life!!!");
         }
         //Eto es para los dados iguales :D
         if (dice1 == dice2){
            
            equalDice++;
            inARow++;
            
            System.out.println("You rolled the same dice!!!");
            
            if (inARow==3){
                
             System.out.println("######################");
             System.out.println("||| ¡¡YOU WIN!! :D |||");
             System.out.println("######################");
             
             break;
             
         }
            
        }   
         else{
             inARow = 0;
         }
        System.out.println("Current lives: " + lives);
        if (lives == 0 ){
            System.out.println("######################");
            System.out.println("|||| GAME OVER ||||");
            System.out.println("######################");
            }
        }
       
        System.out.println(" \n ======== YOUR RESULTS ARE ========");
        System.out.println("Player: "+ player_name);
        System.out.println("Total launches " + Throw);
        System.out.println("Total launches with pair sum: " + par);
        System.out.println("Total launches with odd sum: " + impar);
        System.out.println("Total rolling doubles:"+ equalDice);
        
    }
}

    