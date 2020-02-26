    package pacakge.ipl;
    import java.io.IOException;
    import java.util.Scanner;


    public class main {
    public static  void main(String args[]) throws IOException {


        System.out.println("1. Number of matches played per year of all the years in IPL.");
        System.out.println("2. Number of matches won of all teams over all the years of IPL.");
        System.out.println("3. For the year 2016 get the extra runs conceded per team.");
        System.out.println("4. For the year 2015 get the top economical bowlers.");


        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();

        switch (k) {
            case 1:

       totalMatchesplayed yeartotal=new totalMatchesplayed();
       yeartotal.getyeardata();
                break;
            case 2:
                matcheswon mwon=new matcheswon();
                mwon.getteamdata();

                break;
            case 3:
                teamExtraruns extraruns=new teamExtraruns();
                extraruns.getteam();
                break;
            case 4:
                Economyy Ec=new Economyy();
                Ec.EconomyBowler();
                break;
        }

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

