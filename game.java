/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author ameliablack
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        user characters = new user();
        Scanner scan = new Scanner(System.in);
        
       System.out.print("Please enter a choice (0 to quit):\n1. Display Current List\n2. Add an Animal\n3. Save to file\n4. Load from file\n");
       int choice = scan.nextInt();
       
       scan.nextLine();
       while (!(choice == 0)) {
           switch (choice) {
           case 1:
               characters.displayList();
               break;
           case 2:
               characters.addUser();
               break;
           case 3:
               characters.save();
               break;
           case 4:
               characters.load();
               break;
           }
           System.out.print(
                   "Please enter a choice (0 to quit):\n1. Display Current List\n2. Add a Character\n3. Save to file\n4. Load from file\n");
           choice = scan.nextInt();
           scan.nextLine();
        
    }
           scan.close();
}

}
    
    
