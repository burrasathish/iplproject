        package pacakge.ipl;
        import java.util.*;
        public class Economyy {
            ArrayList<Integer>  Idof2015=new ArrayList<Integer>();
            TreeMap<String, Integer[]> ExtraRuns=new TreeMap<String, Integer[]>();
            public  TreeMap<String,Double> EconomyBowler(){
                ListIterator<matches> it = util.matchesData.listIterator();
                ListIterator<Deliveries>  list= util.deliveriesData.listIterator();
                while(it.hasNext()){
                    //System.out.println(it.next().getSeason());
                    if(it.next().getSeason()==2015){
                        Idof2015.add(it.next().getMatchId());

                    }
                }

                while (list.hasNext()){
                    int count=0;
                    if(Idof2015.contains(list.next().getMatchid())){

                        Deliveries  deli=list.next();
                        //System.out.println(list.next().getBowlingTeam());
                        String s=deli.getBowler();
                        int runs=deli.getTotalRuns();
                        int noball=deli.getNobalRuns();
                        int wide=deli.getWideruns();
                        int legbyes=deli.getLegByeRuns();
                        int bye=deli.getByeRuns();
                        //                int ballcount=deli.getBall();
                        int totalruns =runs-legbyes-bye;
                        //                System.out. println(runs);
                        Integer[] balcount=new Integer[]{0,0};

                        if(ExtraRuns.containsKey(s)) {

                            balcount =ExtraRuns.get(s);
                            balcount[0]+=totalruns;
                            if(noball==0 && wide==0){
                                balcount[1] +=1;
                            }
                            ExtraRuns.put(s,balcount);

                        }
                        else {

                            balcount[0]=totalruns;
                            if(noball==0 && wide==0){
                                balcount[1]=1;
                            }
                            ExtraRuns.put(s, balcount);
                        }
                        //               count++;
                    }
                }
                //        System.out.println(count);
                TreeMap<String,Double> value=new TreeMap<String, Double>();
                // HashMap<String,Double> value=new LinkedHashMap<String, Double>();
                ExtraRuns.forEach((l,v)-> value.put( l,(double)(v[0]/(v[1]/6.0))));

//                Double vt=Double.MAX_VALUE;
//                String Bowlerr="";

//                for(Map.Entry<String,Double> ma:value.entrySet()){
////
////                    if(vt>value.get(ma.getKey())){
////                        vt=value.get(ma.getKey());
////                        Bowlerr=ma.getKey();
//
//                    }
                return  value;
                }


            }





