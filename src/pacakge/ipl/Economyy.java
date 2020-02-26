        package pacakge.ipl;
        import java.util.*;
        import  java.sql.Statement;
        import java.sql.ResultSet;
        import  java.sql.Connection;

        public class Economyy {
            public  void EconomyBowler(){
                dbconnection conn=new dbconnection();
                Connection Con=conn.dbconnect();

                try{
                    Statement stmt =Con.createStatement();
                    ResultSet rs=stmt.executeQuery("\n" +
                            "select bowler, cast(sum(total_runs)-(sum(legbye_runs)+sum(bye_runs))as float)/(count(CASE"
                            + " WHEN noball_runs>0 AND wide_runs>0 then 0 else 1 end)/6) as bowlerEconomy from " +
                            "deliveries inner join matches on deliveries.match_id=matches.id where season='2015'" +
                            " group by bowler order by bowlerEconomy");

                    System.out.println("bowler name"+"            "+"Economy");
                    while(rs.next()){
                        System.out.printf(" %1$-20s",rs.getString(1)+ " ");
                        System.out.printf("%.2f\n",rs.getFloat(2));
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
