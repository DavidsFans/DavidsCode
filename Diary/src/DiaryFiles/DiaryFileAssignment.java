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

static int x = 0;
static String titleName[] = new String[10];

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
    for(x=0;x<=9;x++){
    c.println(titleName[x]);
    }
 /*   TextInputFile tif = new TextInputFile("file.txt");
//read the line
    String line = tif.readLine();
//split the line
    String[] delimLine = line.split(",");
//interpret the line
    String fname = delimLine[0];
    String lname = delimLine[1];
    //boolean eof ();*/
break;
            case 3:
                c.clear();
                c.println("Goodbye Bud:)");
                break;
case 4:
    //makes swithc run 6 times
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

public static void write(Console c) {
    c.println("Please enter your first name here:");
    String playerName = c.readLine();
    c.println("Please enter the title of your entry:s");
    titleName[x] = c.readLine();
    c.clear();
    c.println("Awesome! Welcome " + playerName);
    c.println("                          " + titleName[x]);
    String diary = c.readLine();
    TextOutputFile tof = new TextOutputFile("file.txt", true);
    tof.print(diary + ",");
    tof.close();
    x++;
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

}
