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
 *  Description:    This program will count the frequency a number occurs from a text file
 * 
 *************************************************************/

public class FrequencyCounter {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
        
    final int Max = 1000;               //Amount of numbers in array
    
    // ***** variables *****

    int count =0;                       //counter for while loop
    
    int [] Nums = new int [Max];        //array for the numbers
    
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
        
        //Importing the random number file
        BufferedReader fin = new BufferedReader(new FileReader("RandomNumbersFile.txt"));
        
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
    
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
    
    //set control variable
    strin = fin.readLine();
    
    while(strin != null){
            //System.out.println(strin);

            //Loading the array
            Nums[count] = Integer.parseInt(strin);
            
            //Incrementing counter
            count++;
            
            //update control variable
            strin = fin.readLine();
        } //end of eof  loop
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
