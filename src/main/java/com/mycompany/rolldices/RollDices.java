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
    
       
       
       System.out.println(":::WELCOME TO ROLL DICES:::");
       System.out.println(" Enter your player name: ");
       player_name = data.nextLine();
       System.out.println("Press any key to start the game");
       player_name = data.nextLine();
       
       dice1= rollDices();
       dice2= rollDices();
        
        System.out.println("Player name: " + player_name);
        System.out.println("Player lives: " + lives);
        System.out.println("Dice1: "+dice1);
        System.out.println("Dice2: "+dice2);
        
        if (dice1 + dice2 != %2);{
        
    }
       
       
       
       
    }
}

    