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

        String csvFile = "matches.csv";
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
        int data0 = Integer.parseInt(dataa[0]);
        //System.out.println(data0);
        int data1 = Integer.parseInt(dataa[1]);
        match.setMatchId(data0);
        match.setSeason(data1);
        match.setCity(dataa[2]);
        match.setDate(dataa[3]);
        match.setTeam1(dataa[4]);
        match.setTeam2(dataa[5]);
        match.setTossWinner(dataa[7]);
        match.setTossDecision(dataa[8]);
        match.setResult(dataa[9]);
        match.setWinner(dataa[10]);
        matchesData.add(match);

    }

    public static List<Deliveries> deliveriesData = new ArrayList<Deliveries>();

    public void fetchdeliveries(){

        String csvFile = "deliveries.csv";
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

        int data0 = Integer.parseInt(dataa[0]);
        int data1 = Integer.parseInt(dataa[1]);
        int data4 = Integer.parseInt(dataa[4]);
        int data5 = Integer.parseInt(dataa[5]);
        int data9 = Integer.parseInt(dataa[9]);
        //System.out.println(data9);
        int data10 = Integer.parseInt(dataa[10]);
        int data11 = Integer.parseInt(dataa[11]);
        int data12 = Integer.parseInt(dataa[12]);
        int data13 = Integer.parseInt(dataa[13]);
        int data14 = Integer.parseInt(dataa[14]);
        int data15 = Integer.parseInt(dataa[15]);
        int data16 = Integer.parseInt(dataa[16]);
        int data17 = Integer.parseInt(dataa[17]);


        deliveries.setMatchid(data0);
        deliveries.setInnings(data1);
        deliveries.setBattingTeam(dataa[2]);
        deliveries.setBowlingTeam(dataa[3]);
        deliveries.setOver(data4);
        deliveries.setBall(data5);
        deliveries.setBatsman(dataa[6]);
        deliveries.setNonStriker(dataa[7]);
        deliveries.setBowler(dataa[8]);
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
