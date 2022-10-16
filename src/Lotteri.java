import java.io.*;
import java.util.*;
class Lotteri{
    public static void main(String[] arg) throws IOException{
        var v =new LottWin[1000]; //create arraylist of lottwin
        int n=0;
        var scan = new Scanner(new File("vinster.txt"));
        while (scan.hasNext()) {
            v[n] = new LottWin(); //create object
            v[n].nr = scan.nextInt();
            v[n++].vinst = scan.nextLine();
        }
        for(int i=0; i<n;i++)
            System.out.println(v[i].nr+v[i].vinst);

        Arrays.sort(v , 0, n); //sortera den inlästa delen
        //skriv den sorterade arrayen till filen
        var utstrom= new PrintWriter(new BufferedWriter(new FileWriter("dragningslista.txt")));
        for (int i=0; i<n;i++)
            utstrom.println(v[i].nr+ v[i].vinst);
        utstrom.close();


        }



    }

