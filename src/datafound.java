
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
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.SortedMap;
import java.util.TreeMap;

public class datafound{
    public static void main(String[] args) {
        SortedMap<String, Integer> sm = new TreeMap<String, Integer>();
        SortedMap<String, Integer> ws = new TreeMap<String, Integer>();
        SortedMap<String, Integer> mat = new TreeMap<String, Integer>();
        SortedMap<String, Integer> extra = new TreeMap<String, Integer>();
        String csvFile = "/media/hp/New Volume/ipl/matches.csv";
        String csvFile2 = "/media/hp/New Volume/ipl/deliveries.csv";
        BufferedReader br = null;
        String line = "";
        int year = 0;
        String[] kk;
        int win = 0;
        String[] matchid;
        String kkk;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            kk = line.split(",");
//            System.out.println(kk);
            for (int i = 0; i != kk.length; i++) {
                if (kk[i].equals("season")) {
                    year = i;
                }
            }
            while ((line = br.readLine()) != null) {
                kk = line.split(",");
                if (sm.containsKey(kk[year]) == true) {
                    int x = sm.get(kk[year]);
                    sm.put(kk[year], Integer.valueOf(x + 1));
                } else {
                    sm.put(kk[year], Integer.valueOf(1));
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
        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            kk = line.split(",");
//            System.out.println(kk);
            for (int j = 0; j != kk.length; j++) {
                if (kk[j].equals("winner")) {
                    win = j;
                }
            }
            while ((line = br.readLine()) != null) {
                dat = line.split(",");
                if (ws.containsKey(dat[win]) == true) {
                    int k = ws.get(dat[win]);
                    // System.out.println(k);
                    ws.put(dat[win], Integer.valueOf(k + 1));
                } else {
                    ws.put(dat[win], Integer.valueOf(1));
                }
            }
           System.out.println("teams                          \twins");
            ws.forEach((w,s)->System.out.println(w+"            \t"+s));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int yearr = 0;
        String[] fields;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            kk = line.split(",");
            for (int i = 0; i != kk.length; i++) {
                if (kk[i].equals("season")) {
                    yearr = i;
                }
            }
            while ((line = br.readLine()) != null) {
                String left;
                fields = line.split(",");
                if (fields[yearr].equals("2016")) {

                    mat.put(fields[0], 1);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mat.forEach((x, y) -> {
            String csvFile3 = "/media/hp/New Volume/ipl/deliveries.csv";
            int team = 0;
            int extr = 0;
            try {
                BufferedReader brr = new BufferedReader(new FileReader(csvFile3));
                String linee = "";
                linee = brr.readLine();
                String[] tt = linee.split(",");
                for (int i = 0; i != tt.length; i++) {
                    if (tt[i].equals("bowling_team")) {
                        team = i;
                    }
                    if (tt[i].equals("extra_runs")) {
                        extr = i;
                    }
                }
                //String[]
                String ttt;
                int sum = 0;
                while ((linee = brr.readLine()) != null) {
                    String[] send = linee.split(",");
                    if (send[0].equals(x)) {
//                    System.out.println(send[team]);
                        if (extra.containsKey(send[team]) == true) {
                            ttt = send[extr];
//                      System.out.println(xxx);
                            sum += Integer.valueOf(ttt);
//                    int edata=extra.get(send[extr]);
//                      System.out.println(edata);
                            extra.put(send[team], Integer.valueOf(sum));
                        } else {
                            sum = 0;
                            ttt = send[extr];
                            sum += Integer.valueOf(ttt);
                            extra.put(send[team], Integer.valueOf(ttt));
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

//        System.out.println();
//        System.out.println("team\t                   extras");
//        extra.forEach((s, t) -> System.out.println(s +"           \t" + t));

        List<String> totaldata = new ArrayList<>();
        String data;
        String[] kd;
        try {
            BufferedReader brf = new BufferedReader(new FileReader(csvFile));
            int i = 0;
            int yearf = 1;
            data = brf.readLine();
            kd = data.split(",");
            String linef = "";
            while (i != kd.length) {
                if (kd[i].equals("season")) {
//                     List<String> r1 = new ArrayList<>(Arrays.asList(kd[0]));
                    //totaldata.add(r1)
                    yearf = i;
                }
                i++;
            }
            while ((linef = brf.readLine()) != null) {
                String left;
                kd = linef.split(",");
                if (kd[yearf].equals("2015")) {
                    List<String> m2 = new ArrayList<>(Arrays.asList(kd[0]));
                    totaldata.addAll(m2);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        Hashtable<String, Integer[]> bowlersdata = new Hashtable<>();
      //  SortedMap<String, Integer[]> bowlersdata = new TreeMap<String, Integer[]>();
//        totaldata.forEach((x)->System.out.println(x));
String lineee="";
String [] adata;
            try {
                String csvFile4 = "/media/hp/New Volume/ipl/deliveries.csv";
                ;
                BufferedReader buffr = new BufferedReader(new FileReader(csvFile4));
                lineee = buffr.readLine();
                adata = lineee.split(",");
                int id = 0, bowler = 0, wide = 0, noball = 0, legbye = 0, bye = 0, season = 0;
                for (int i = 0; i != adata.length; i++) {
                    if (adata[i].equals("total_runs")) {
                        season = i;
                    }
                    if (adata[i].equals("match_id")) {
                        id = i;
                    }
                    if (adata[i].equals("wide_runs")) {
                        wide = i;
                    }
                    if (adata[i].equals("legbye_runs")) {
                        legbye = i;
                    }
                    if (adata[i].equals("bowler")) {
                        bowler = i;
                    }
                    if (adata[i].equals("bye_runs")) {
                        bye = i;
                    }
                    if (adata[i].equals("bye_runs")) {
                        bye = i;
                    }
                    if (adata[i].equals("noball_runs")) {
                        noball= i;
                    }
                }
                while ((lineee = buffr.readLine()) != null) {
                    adata = lineee.split(",");
                    if (totaldata.contains(adata[id])) {
                        if (bowlersdata.containsKey(adata[bowler])) {
                            Integer[] temp = bowlersdata.get(adata[bowler]);
                            if (adata[wide].equals("0") && adata[noball].equals("0"))
                                temp[1]++;
                            if (adata[legbye].equals("0") && adata[bye].equals("0"))
                                temp[0] += Integer.parseInt(adata[season]);
                            bowlersdata.put(adata[bowler], temp);
                        } else {
                            Integer[] temp = {0,0};
                            if (adata[wide].equals("0") && adata[noball].equals("0"))
                                temp[1]++;
                            if (adata[legbye].equals("0") && adata[bye].equals("0"))
                                temp[0] += Integer.parseInt(adata[season]);
                            bowlersdata.put(adata[bowler], temp);
                        }
                    }
                }
                bowlersdata.forEach((x,y)->System.out.println(x+"           \t"+y[0]+" "+y[1]));
                HashMap<String,Float> average=new LinkedHashMap<String,Float>();
                for(Map.Entry<String,Integer[]>ave:bowlersdata.entrySet()){

                }
            }
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

