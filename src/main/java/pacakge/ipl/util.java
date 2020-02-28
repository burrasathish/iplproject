package pacakge.ipl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import  pacakge.ipl.matches;

public class util implements  data{


    public static List<matches> matchesData = new ArrayList<matches>();

    public void fetchmatches(){
        String csvFile=constants.csvFile;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int skip = 0;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                if(skip == 0){
                    skip++;
                    continue;
                }
                String[] match = line.split(cvsSplitBy);
                this.datafind(match);
            }
        }


        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override


    public void datafind(String[] dataa) {
        matches match = new matches();
        int data0 = Integer.parseInt(dataa[constants.MATCH_ID]);
        //System.out.println(data0);
        int data1 = Integer.parseInt(dataa[constants.SEASON]);
        match.setMatchId(data0);
        match.setSeason(data1);
        match.setCity(dataa[constants.CITY]);
        match.setDate(dataa[constants.DATE]);
        match.setTeam1(dataa[constants.TEAM1]);
        match.setTeam2(dataa[constants.TEAM2]);
        match.setTossWinner(dataa[constants.TOSSWINNER]);
        match.setTossDecision(dataa[constants.TOSSDECISION]);
        match.setResult(dataa[constants.RESULT]);
        match.setWinner(dataa[constants.WINNER]);
        matchesData.add(match);

    }

    public static List<Deliveries> deliveriesData = new ArrayList<Deliveries>();

    public void fetchdeliveries(){

        String csvFile = constants.csvFil;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int skip = 0;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                if(skip == 0){
                    skip++;
                    continue;
                }
                // using comma as separator here
                String[] match = line.split(cvsSplitBy);
                datafindd(match);


            }
        }


        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void datafindd(String[] dataa){

        Deliveries deliveries = new Deliveries();

        int data0 = Integer.parseInt(dataa[constants.MATCHESID]);
        int data1 = Integer.parseInt(dataa[constants.INNINGS]);
        int data4 = Integer.parseInt(dataa[constants.OVER]);
        int data5 = Integer.parseInt(dataa[constants.BALL]);
        int data9 = Integer.parseInt(dataa[constants.SUPPEROVER]);
        //System.out.println(data9);
        int data10 = Integer.parseInt(dataa[constants.WIDERUNS]);
        int data11 = Integer.parseInt(dataa[constants.BYERUNS]);
        int data12 = Integer.parseInt(dataa[constants.LEGBYERUNS]);
        int data13 = Integer.parseInt(dataa[constants.NOBALLRUNS]);
        int data14 = Integer.parseInt(dataa[constants.PENALITYRUNS]);
        int data15 = Integer.parseInt(dataa[constants.BATSMANRUNS]);
        int data16 = Integer.parseInt(dataa[constants.EXTRARUNS]);
        int data17 = Integer.parseInt(dataa[constants.TOTALRUNS]);


        deliveries.setMatchid(data0);
        deliveries.setInnings(data1);
        deliveries.setBattingTeam(dataa[constants.BATTINGTEAM]);
        deliveries.setBowlingTeam(dataa[constants.BOWLINGEAM]);
        deliveries.setOver(data4);
        deliveries.setBall(data5);
        deliveries.setBatsman(dataa[constants.BATSMAN]);
        deliveries.setNonStriker(dataa[constants.NONSTRIKER]);
        deliveries.setBowler(dataa[constants.BOWLER]);
        deliveries.setIssupperover(data9);
        deliveries.setWideruns(data10);
        deliveries.setByeRuns(data11);
        deliveries.setLegByeRuns(data12);
        deliveries.setNobalRuns(data13);
        deliveries.setPenalityRuns(data14);
        deliveries.setBatsmanRuns(data15);
        deliveries.setExtrRuns(data16);
        deliveries.setTotalRuns(data17);

        deliveriesData.add(deliveries);

//      System.out.println("**********");
//      System.out.println(deliveriesData.get(0).getBatsmanName());
//      System.out.println("**********");
    }


}
