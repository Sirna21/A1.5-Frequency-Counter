import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sirna 
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5
 * 
 *  Description:    1000 random numbers will be generated between 1-50 and will be outputed to a text file.
 * 
 *************************************************************/

public class FrequencyCounter {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    final int Max = 1000;               //amount of times for loop will run
    
    // ***** variables *****
    
      Random  RandomGenerator = new Random();     //This is the random number generator
      int RandomNumber = 0;                      // This is where random numbers will be stored

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        
        //Placing random numbers into this text file created
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("RandomNumbersFile.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sirna Tafese" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    //For loop that will run 1000 times to generate 1000 different numbers
    for(int i = 0; i < Max; i++) {
        //Making random numbers between 1 and 50
        RandomNumber = (int)(Math.random()*((50-1)+1))+1;
        
        //Printing random numbers to the terminal window
        System.out.println(RandomNumber);
        
        //Printing numbres to a text file
        fout.println(RandomNumber);
    }//end of for loop
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
