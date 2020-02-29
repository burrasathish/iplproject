    package pacakge.ipl;
    import java.awt.*;
    import java.io.IOException;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.TreeMap;
    import java.util.Scanner;


    public class main {
    public static  void main(String args[]) throws IOException {


        util s = new util();
        s.fetchdeliveries();
        s.fetchmatches();

        try {

            totalMatchesplayed yeartotal = new totalMatchesplayed();
            HashMap<Integer, Integer> years = yeartotal.getyeardata(s.matchesData);
            ;
            System.out.println("years" + "     " + "matches");
            for (Map.Entry<Integer, Integer> map : years.entrySet()) {
                System.out.print(map.getKey() + "      ");
                System.out.println(map.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            matcheswon mwon = new matcheswon();
            HashMap<String, Integer> mwonn = mwon.getteamdata(s.matchesData);
            System.out.println("country" + "     " + "winnmatches");
            for (Map.Entry<String, Integer> map : mwonn.entrySet()) {
                System.out.print(map.getKey() + "      ");
                System.out.println(map.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            teamExtraruns extraruns = new teamExtraruns();
            TreeMap<String, Integer> extrarun = extraruns.getteam(s.matchesData, s.deliveriesData);
            System.out.println("country" + "     " + "Extraruns");
            for (Map.Entry<String, Integer> map : extrarun.entrySet()) {
                System.out.print(map.getKey() + "      ");
                System.out.println(map.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {

            Economyy Ec = new Economyy();
            TreeMap<String, Double> ec = Ec.EconomyBowler(s.matchesData, s.deliveriesData);
            System.out.println("Bowler" + "             " + "EConomy");
            for (Map.Entry<String, Double> map : ec.entrySet()) {
                System.out.print(map.getKey() + "      ");
                System.out.println(map.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }











































//        matcheswon mwon=new matcheswon();
//        HashMap<String,Integer>  mwonn   = mwon.getteamdata(s.matchesData);
//        System.out.println("country"+"     "+"winnmatches");
//        for(Map.Entry <String,Integer> map:mwonn.entrySet()){
//           System.out.print(map.getKey() +"      ");
//            System.out.println(map.getValue());
//        }
//        System.out.println();


//
//                teamExtraruns extraruns=new teamExtraruns();
//        TreeMap<String,Integer>  extrarun=  extraruns.getteam(s.matchesData,s.deliveriesData);
//        System.out.println("country"+"     "+"Extraruns");
//        for(Map.Entry <String,Integer> map:extrarun.entrySet()){
//            System.out.print(map.getKey() +"      ");
//            System.out.println(map.getValue());
//        }
//        System.out.println();



//                Economyy Ec=new Economyy();
//               TreeMap<String,Double>  ec= Ec.EconomyBowler(s.matchesData,s.deliveriesData);
//              System.out.println("Bowler"+"             "+"EConomy");
//               for(Map.Entry<String,Double> map :ec.entrySet()){
//                   System.out.print(map.getKey() +"      ");
//                  System.out.println(map.getValue());
//             }











































    //matchedplayed matchp=new matchedplayed();
    //matchp.Totalmatchedplayed();
    //Seasons kk=new Seasons();
    //kk.getSeasons();
    //System.out.println(kk)
//
//        Matchid mm=new Matchid();
//       mm.mapgetMatchIdandsession();

//
//       Bowlers bowl=new Bowlers();
//       bowl.getBowlersdata();
//



    //System.out.println(mm);

