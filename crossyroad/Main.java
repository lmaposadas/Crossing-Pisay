/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crossyroad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main g = new Main(template);
        Player p1 = g.getPlayer();
        
        Scanner sc = new Scanner(System.in);
        while (p1.getLives() > 0) { 
            String playerMove = sc.nextLine();
            p1.move(playerMove);
        }
        
        if (p1.getLives() == 0) {
            System.exit(0);
        }
    }
    
}
