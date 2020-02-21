
//1. Number of matches played per year of all the years in IPL.
//        2. Number of matches won of all teams over all the years of IPL.
//        3. For the year 2016 get the extra runs conceded per team.
//        4. For the year 2015 get the top economical bowlers.
//        5. Create your own scenario.

//           System.out.println(country[1]);

//             System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

import java.awt.*;
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
        SortedMap<String,Integer>  ws = new TreeMap<String,Integer>();
        SortedMap<String,Integer>  mat = new TreeMap<String,Integer>();
        SortedMap<String,Integer>   extra = new TreeMap<String,Integer>();
        String csvFile = "/media/hp/New Volume/ipl/matches.csv";
        String csvFile2 = "/media/hp/New Volume/ipl/deliveries.csv";
        BufferedReader br = null;
        String line = "";
          int year=0;
          String[] kk;
        int win=0;
        String[] matchid;
        String kkk;
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


String[] dat;
        try{
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            kk=line.split(",");
//            System.out.println(kk);
            for(int j=0;j!=kk.length;j++){
                if(kk[j].equals("winner")){
                    win=j;
                }
            }
            while((line=br.readLine())!=null){
                dat=line.split(",");
                if(ws.containsKey(dat[win])==true){
                    int k=ws.get(dat[win]);
                   // System.out.println(k);
                    ws.put(dat[win], Integer.valueOf(k+1));
                }
                else{
                    ws.put(dat[win],Integer.valueOf(1));
                }
            }
            System.out.println("teams                          \twins");
            ws.forEach((w,s)->System.out.println(w+"            \t"+s));

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         int yearr=0;
        String[]  fields;

        try{
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            kk=line.split(",");
            for(int i=0;i!=kk.length;i++){
                if(kk[i].equals("season")){
                   yearr=i;
                }
            }
            while((line=br.readLine())!=null){
                String left;
                fields=line.split(",");
              if(fields[yearr].equals("2016")){

                 mat.put(fields[0],1);
              }

//    System.out.println(fields[yearr]==201);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

     mat.forEach((x,y)->{
         String csvFile3= "/media/hp/New Volume/ipl/deliveries.csv";
         int team=0;
         int extr=0;
        try{
            BufferedReader brr = new BufferedReader(new FileReader(csvFile3));
           String linee="";
                 linee = brr.readLine();
           String[] tt=linee.split(",");
            for(int i=0;i!=tt.length;i++) {
                if (tt[i].equals("bowling_team")) {
                       team=i;
                }
                if (tt[i].equals("extra_runs")) {
                    extr=i;
                }
            }
            String  xxx;
            int sum=0;
          while((linee=brr.readLine())!=null){
              String[]  send=linee.split(",");
              if(send[0].equals(x)){
//                    System.out.println(send[team]);
                  if(extra.containsKey(send[team])==true){
                          xxx=send[extr];
//                      System.out.println(xxx);
                      sum +=Integer.valueOf(xxx);
//                    int edata=extra.get(send[extr]);
//                      System.out.println(edata);
                      extra.put(send[team],Integer.valueOf(sum));
                  }
                  else{
                      sum=0;
                      xxx=send[extr];
                     sum+=Integer.valueOf(xxx);
                      extra.put(send[team], Integer.valueOf(xxx));

                  }
              }
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(x.length());
//        if(x.length()==x.) {
//            System.out.println("year\tmatch");
//            extra.forEach((s, t) -> System.out.println(s + "\t" + t));
//        }
     });
        System.out.println();
        System.out.println("team\t                   extras");
        extra.forEach((s, t) -> System.out.println(s +"           \t" + t));

}
}

