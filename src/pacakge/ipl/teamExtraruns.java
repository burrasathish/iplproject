            package pacakge.ipl;

            import java.awt.*;
            import java.sql.Connection;
            import java.sql.ResultSet;
            import java.sql.Statement;
            import java.util.ListIterator;
            import java.util.*;

            public class teamExtraruns {
                ArrayList<Integer>  Idof2016=new ArrayList<Integer>();
                TreeMap<String,Integer> ExtraRuns=new TreeMap<String,Integer>();
                public  void getteam(){
                    ListIterator<matches> it = util.matchesData.listIterator();
                    ListIterator<Deliveries>  list= util.deliveriesData.listIterator();
                    while(it.hasNext()){
                        //System.out.println(it.next().getSeason());
                        if(it.next().getSeason()==2016){
                            Idof2016.add(it.next().getMatchId());

                        }
                    }

                    while (list.hasNext()){
                        if(Idof2016.contains(list.next().getMatchid())){
                            Deliveries  deli=list.next();
                            //System.out.println(list.next().getBowlingTeam());
                            String s=deli.getBowlingTeam();
                            int runs=deli.getExtrRuns();
                            //                System.out.println(runs);
                            if(ExtraRuns.containsKey(s))
                                ExtraRuns.put(s,ExtraRuns.get(s)+runs);
                            ExtraRuns.putIfAbsent(s,runs);

                        }
                    }
                    System.out.print(ExtraRuns);

                }

            }