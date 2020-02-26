package pacakge.ipl;

import java.util.HashMap;
import java.util.ListIterator;
import  java.sql.Statement;
import java.sql.ResultSet;
import  java.sql.Connection;
import pacakge.ipl.dbconnection;

public class matcheswon {
    HashMap<String,Integer> matchesWon = new HashMap<>();

    public void getteamdata(){


        dbconnection conn=new dbconnection();
        Connection Con=conn.dbconnect();

        try{
            Statement stmt =Con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT season, count(season) from matches group by season order by season");
            while(rs.next()){
                System.out.print(rs.getString(1)+ " ");
                System.out.println(rs.getString(2));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
