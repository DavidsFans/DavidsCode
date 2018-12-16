/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package DiaryFiles;

import hsa.Console;
import hsa.TextInputFile;
import hsa.TextOutputFile;
import java.util.Random;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/*
* @author 349414599
*/
public class DiaryFileAssignment {
    //Title array
static String Name[] = new String[10];
static String playerName;

public static void main(String[] args) {
    Console c = new Console();
    c.println("Whats the password");
    String pass;
    String Pass = "secret";
    pass = c.readString();//input for password
    pass = pass.toLowerCase();
    
    if (pass.compareTo(Pass) == 0) {
        c.println(" Press 1 to write diary");
        c.println(" Press 2 to view diary");
        c.println(" Press 3 to exit");
        c.println(" Press 4 to change password for diary(random)");
        int x;
        x = c.readInt();
        switch (x) {
            case 1:
                //Decision structure to select method in menu
                //Transfers console to next method   
                write(c);
                break;
case 2:
    c.clear();
     c.println("Please enter your first name here:");
    playerName = c.readLine();
   TextInputFile tif = new TextInputFile("Titles.txt");
    String line = tif.readLine();
//split the line
// counter used to count commas. this will track how help with the restriction below and prevent array out of bounds
    int counter = countChar(line,',');
    String[] delimLine = line.split(",");
//interpret the line
 for(int i = 0; i<counter; i++){
c.println(delimLine[i]);
 }
 tif.close();
 
c.println("Choose a entry to open");
String z = c.readLine();
for(int i = 0; i<counter; i++){
    //check for null
if(z == null ? delimLine[i] == null : z.equals(delimLine[i])){
TextInputFile file = new TextInputFile("file.txt");
//read the line
    String line1 = file.readLine();
//split the line
    String[] delimLine1 = line1.split(",");
    c.clear();
    c.println("Awesome! Welcome " + playerName);
    c.println("                          " + delimLine[i]);
    c.println(delimLine1[i]);
    file.close();
}
}
break;
            case 3:
                c.clear();
                c.println("Goodbye Bud:)");
                break;
case 4:
    //makes switch run 6 times
    for (int t = 1; t < 7; t++) {
        //generate random number of 0 , 1 , 2
        Random boi = new Random();
        int r = boi.nextInt(3);
        switch (r) {
            case 0:
                char l = '0';
                //send to method and return
                l = number(l);
                c.print(l);
                break;
            case 1:
                char u = 0;
                u = Lower(u);
                c.print(u);
                break;
            case 2:
                char o = 0;
                o = Upper(o);
                c.print(o);
                break;
        }
    }
    break;
}
    }

}
//
public static void write(Console c) {
    c.println("Please enter your first name here:");
    playerName = c.readLine();
    c.println("Please enter the title of your entry:s");
    String title = c.readLine();
    //open titles file
    TextOutputFile Title = new TextOutputFile("Titles.txt", true);
    //place title name and comma
    Title.print(title+",");
    Title.close();
    c.clear();
    c.println("Awesome! Welcome " + playerName);
    c.println("                          " + title);
    String diary = c.readLine();
    //open diary entry file
    TextOutputFile tof = new TextOutputFile("file.txt", true);
    tof.print(diary + ",");
    tof.close();
}

public static char number(char l) {
    //Random int between 47 and 57 and convert to ASCII char
    Random rdm = new Random();
    l = ((char) (rdm.nextInt(10) + 47));
    //System.out.print(l);
    return l;
}

public static char Lower(char u) {
    Random rdm = new Random();
    u = (char) (rdm.nextInt(26) + 65);
    //System.out.print(u);
    return u;
}

public static char Upper(char o) {
    Random rdm = new Random();
    o = (char) (rdm.nextInt(26) + 97);
    //System.out.print(o);
    return o;
}

public static int countChar(String str, char c)
{ //method used to counter commas
    int count = 0;

    for(int i=0; i < str.length(); i++)
    {    if(str.charAt(i) == c)
            count++;
    }

    return count;
}

}
