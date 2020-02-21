
//1. Number of matches played per year of all the years in IPL.
//        2. Number of matches won of all teams over all the years of IPL.
//        3. For the year 2016 get the extra runs conceded per team.
//        4. For the year 2015 get the top economical bowlers.
//        5. Create your own scenario.

//           System.out.println(country[1]);

//             System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class datafound{


    public static void main(String[] args) {
        SortedMap<String,Integer> sm = new TreeMap<String,Integer>();
        String csvFile = "/media/hp/New Volume/ipl/matches.csv";
        BufferedReader br = null;
        String line = "";
          int year=0;
          String[] kk;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            kk=line.split(",");
//            System.out.println(kk);
            for(int i=0;i!=kk.length;i++){
                if(kk[i].equals("season")){
                    year=i;
                }
           }
            while ((line = br.readLine()) != null) {
               kk=line.split(",");
               if(sm.containsKey(kk[year])==true){
                   int x=sm.get(kk[year]);
                   sm.put(kk[year],Integer.valueOf(x+1));
               }
               else{
                   sm.put(kk[year],Integer.valueOf(1));
               }
            }
            System.out.println("year\tmatch");
            sm.forEach((s,t)->System.out.println(s+"\t"+t));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}

