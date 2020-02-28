    package pacakge.ipl;
    import java.awt.*;
    import java.io.IOException;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.TreeMap;


    public class main {
    public static  void main(String args[]) throws IOException {
                    util s=new util();
                    s.fetchdeliveries();
                    s.fetchmatches();

        totalMatchesplayed yeartotal=new totalMatchesplayed();
        HashMap<Integer,Integer>  years =  yeartotal.getyeardata();;
           System.out.println("years"+"     "+"matches");
        for(Map.Entry <Integer,Integer> map:years.entrySet()){
           System.out.print(map.getKey() +"      ");
            System.out.println(map.getValue());
        }
        System.out.println();


//        matcheswon mwon=new matcheswon();
//        HashMap<String,Integer>  mwonn   = mwon.getteamdata();
//        System.out.println("country"+"     "+"winnmatches");
//        for(Map.Entry <String,Integer> map:mwonn.entrySet()){
//           System.out.print(map.getKey() +"      ");
//            System.out.println(map.getValue());
//        }
//        System.out.println();
//
//
//                teamExtraruns extraruns=new teamExtraruns();
//        TreeMap<String,Integer>  extrarun=  extraruns.getteam();
//        System.out.println("country"+"     "+"Extraruns");
//        for(Map.Entry <String,Integer> map:extrarun.entrySet()){
//            System.out.print(map.getKey() +"      ");
//            System.out.println(map.getValue());
//        }
//        System.out.println();
//
//                Economyy Ec=new Economyy();
//               TreeMap<String,Double>  ec= Ec.EconomyBowler();
//              System.out.println("Bowler"+"             "+"EConomy");
//               for(Map.Entry<String,Double> map :ec.entrySet()){
//                   System.out.print(map.getKey() +"      ");
//                  System.out.println(map.getValue());
//               }

        }

}











































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

