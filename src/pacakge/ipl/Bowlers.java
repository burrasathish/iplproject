    package pacakge.ipl;
    import  java.util.HashSet;
    import java.util.ListIterator;
    import java.util.Set;

//    import   pacakge.ipl.matches;
//    import   pacakge.ipl.util;
//    import   pacakge.ipl.Deliveries;
//    import   pacakge.ipl.util;

    public class Bowlers {
        public Set<String>bowlersSet=new HashSet<String>();

        public Set<String>  getBowlersdata(){
            ListIterator<Deliveries> it=util.deliveriesData.listIterator();
            while(it.hasNext()){
                bowlersSet.add(it.next().getBowler());
            }
            return  bowlersSet;
        }
    }
