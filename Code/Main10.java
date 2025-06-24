package Code;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
        case "mango" -> System.out.println("King of Fruits");
        case "apple" -> System.out.println("King of apples");
        case "jambhul" -> System.out.println("King of jambhuls");
        default -> System.out.println("King of none");
        }
        
        sc.close();
    }
}
