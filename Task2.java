/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collage;
import java.util.Scanner;
/**
 *
 * @author HETVI
 */
class SUPPLY{
    int code; 
    String foodname;
    String sticker;
    String foodtype;
    Scanner sc =  new Scanner(System.in);
    void GetType(){
        switch (sticker) {
            case "Green":
                foodtype = "Vegetarian";
                break;
            case "Yellow":
                foodtype = "Contains Egg";
                break;
            case "Red":
                foodtype = "Non Vegetarian";
                break;
            default:
                foodtype = "Unknown";
                break;
        }
    }
    
    void FoodIn(){
        System.out.println("Enter the code of the food");
        code = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the food");
        foodname = sc.nextLine();
        System.out.println("Enter the type of the food");
        sticker = sc.next();
        GetType();
    }
    void FoodOut(){
        System.out.println("Your food code is: "+ code);
        System.out.println("Your food name is: "+ foodname );
        System.out.println("Your food type is: "+ foodtype );

        
    }
    
}
public class Task2 {
    public static void main(String[] args){
       SUPPLY food = new SUPPLY();
       food.FoodIn();
       food.FoodOut();
        
    }
}
