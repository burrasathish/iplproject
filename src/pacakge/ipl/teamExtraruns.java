            package pacakge.ipl;

            import java.awt.*;
            import java.sql.Connection;
            import java.sql.ResultSet;
            import java.sql.Statement;
            import java.util.ListIterator;
            import java.util.*;

            public class teamExtraruns {
                public  void getteam(){
                    dbconnection conn=new dbconnection();
                    Connection Con=conn.dbconnect();

                    try{
                        Statement stmt =Con.createStatement();
                        ResultSet rs=stmt.executeQuery("Select bowling_team, sum(extra_runs) from deliveries inner join matches on deliveries.match_id=matches.id where season='2016' group by bowling_team");

                        System.out.println("teamname"+"                     "+ "extraruns");
                        while(rs.next()){
                            System.out.printf(" %1$-30s",rs.getString(1));
                            System.out.printf("%1$-20s\n",rs.getString(2));
                        }
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }

                }
                    }