package pacakge.ipl;
import java.util.*;
 import  java.sql.Statement;
 import java.sql.ResultSet;
 import  java.sql.Connection;

public class totalMatchesplayed {
//    private Set<Integer> seasonSet = new HashSet<Integer>();
//    private int season;
    HashMap<Integer,Integer> matchesPlayedPerYear = new HashMap<>();



    public void getyeardata(){
  dbconnection conn=new dbconnection();
 Connection Con=conn.dbconnect();

        try{
            Statement stmt =Con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT winner, count(winner) from matches group by winner order by winner");

        System.out.println("teamname"+"                 "+"playedmatches");
            while(rs.next()){
                System.out.printf(" %1$-30s",rs.getString(1)+ " ");
                System.out.printf("%1$-20s\n",rs.getString(2));
            }
            System.out.print(matchesPlayedPerYear);
        }
        catch (Exception e){
            e.printStackTrace();
        }
//        ListIterator<matches> it = util.matchesData.listIterator();


    }
}
