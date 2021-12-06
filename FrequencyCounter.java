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
        final int FI50 = 50;               //final int for 50

        // ***** variables *****

        int count =0;                       //counter for while loop

        int [] nums = new int [Max];        //array for the numbers
        int [] fq = new int [FI50]; 

        String prompt1 = "";       // asking for any frequneces

        int SpecificRangeNum = 0;     // The variable that stores input prompt 1
        int sn = 0;                   // specific number user would like to find the fq on

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        Scanner scanner = new Scanner(System.in);                     // connecting to keyboard
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

        // Set strin (control variable) to the next item in the buffer; this is run only once
        // check that strin is not null; our stopping condition
        // update the control variable with the next item in the buffer
        for (strin = fin.readLine();strin != null;strin = fin.readLine()) {
            //Loading the array
            nums[count] = Integer.parseInt(strin);

            //Incrementing counter
            count++;
        }

        for(int i = 0; i < count; i++){
            fq[nums[i] - 1]++;
        }//end of for loop

        for(int i = 0; i < FI50; i++){

            System.out.println(i+1+ ":"+fq[i]);

        }//end of for loop

        
        //asking user for any ranges to see
        prompt1 = "Would you like to see any fq of any number specifically, N for next question "; 

        System.out.println(prompt1 + nl + nl);
        SpecificRangeNum = scanner.nextInt();

        for(int i = 0; i < FI50; i++){
            sn = fq[SpecificRangeNum - 1];
        }
        //printing out specific range number
        System.out.println(SpecificRangeNum + " had a freq of " + sn + nl + nl);

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end A1.5
