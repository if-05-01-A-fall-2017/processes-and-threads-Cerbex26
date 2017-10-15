/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_shell;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Manuel
 */
public class Simple_Shell {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        String input = "";
        System.out.println("Shell:\n");
        Scanner s = new Scanner(System.in);
        while(!input.equals("exit"))
        {   
            System.out.println(System.getProperty("user.dir") + ":"); 
            input = s.nextLine();
            if(!input.equals("exit"))
            createNewThread(input);
        }
    }
    
    public static void createNewThread(String input) throws IOException, InterruptedException
    {
        String np = "cmd /c " + input;
        Process p = Runtime.getRuntime().exec(np);
        p.waitFor(5, TimeUnit.SECONDS);
        InputStream s = p.getInputStream();
        int b = s.read();
        while (b != -1) {
            System.out.print((char)b);
            b = s.read();
        }
    }
    
}
