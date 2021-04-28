/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.*;
import java.util.*;

/**
 *
 * @author ameliablack
 */
public class user {
    ArrayList<String> character = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String wizard, archer, acrobat, barbarian;
    
      
      public void addUser() {
       System.out.print("Enter name of character: ");
       String names = scan.nextLine();
       character.add(names);
       System.out.println();
       System.out.println("What fantasy would you like to join?");
       System.out.println(" wizard etc.");
       String fant = scan.nextLine();
       character.add(fant);
       System.out.println();
}

      
      public void load() {
       character.clear();// clears the current list
       System.out.print("Enter full file location: ");
       String fileLocation = scan.nextLine();
       
       File fileToLoad = new File(fileLocation.replace("\\", "\\\\"));
       BufferedReader br = null;
       try {
           br = new BufferedReader(new FileReader(fileToLoad));
       } catch (FileNotFoundException e) {
           /* if the input file is not found an exception is thrown in above try block */
           System.out.println(e.getMessage());
           return;
       }

        String str = "";// string to store lines in a file
        try {
           while ((str = br.readLine()) != null) {
               character.add(str);
           }
           br.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           return;
       }
       System.out.println();
   }
 public void save() {
       System.out.print("Enter full file location: ");
       String fileLocation = scan.nextLine();
       File fileToSave = new File(fileLocation.replace("\\", "\\\\"));
       /* check the file if it exists or not, create a new file accordingly */
       try {
           if (!fileToSave.exists()) {
               fileToSave.createNewFile();
           }
           /* FileWriter to write the contents to the passed file object */
           FileWriter file = new FileWriter(fileToSave);
           for (String str : character) {
               file.write(str + "\r\n");
           }
           file.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           return;
       }
       System.out.println();
   }

public void displayList() {
       if (character.size() == 0) {
           System.out.println("There are not any characters now!");
       } else {
           System.out.println("Characters are: ");
           for (String str : character) {
               System.out.println(str);
           }
   }
       System.out.println();
 }

}
