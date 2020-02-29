import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import pacakge.ipl.matcheswon;
import pacakge.ipl.matches;
import pacakge.ipl.totalMatchesplayed;
import pacakge.ipl.util;

import  static  org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testwinner {
    List<matches> winners =new ArrayList<>();
    @BeforeEach
    void get() {
        matches match = new matches();
        match.setSeason(2008);
        match.setMatchId(2);
        match.setWinner("Rising Pune Supergiants");
        matches match1 = new matches();
        match1.setMatchId(2);
        match1.setSeason(2010);
        match1.setWinner("Chennai Super Kings");
        matches match2 = new matches();
        match2.setMatchId(3);
        match2.setSeason(2018);
        match2.setWinner("Kings XI Punjab");
        matches match3 = new matches();
        match3.setMatchId(4);
        match3.setSeason(2015);
        match3.setWinner("Rising Pune Supergiants");
        matches match4=new matches();
        match4.setMatchId(5);
        match4.setSeason(2016);
        match4.setWinner("Kochi Tuskers Kerala");


        winners.add(match);
        winners.add(match1);
        winners.add(match2);
        winners.add(match3);
        winners.add(match4);

    }


    @Test
    @DisplayName("winners list")
    public void validdata() {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("Rising Pune Supergiants", 2);
        test.put("Chennai Super Kings", 1);
        test.put("Kings XI Punjab", 1);
        test.put("Kochi Tuskers Kerala", 1);
        assertEquals(test, matcheswon.getteamdata(winners));
    }


    @Test
    @DisplayName("winners invalid list")
    public void invaliddata() {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("Rising Pune Supergiants", 3);
        test.put("Chennai Super Kings", 4);
        test.put("Kings XI Punjab", 4);
        assertNotEquals(test, matcheswon.getteamdata(winners));
    }




    @Test
    public void NullVaue () {
        assertNotNull(matcheswon.getteamdata(winners));
    }

    @Test
    public  void notEmpty(){
        assertFalse((winners).isEmpty());
    }

    @Test
    void TestArgumentNull() {
        assertThrows(NullPointerException.class, () -> matcheswon.getteamdata(null));
    }

    @Test
    void TestArgumentEmpt(){
        List<matches> Emptydata=new ArrayList<>();
        assertTrue(matcheswon.getteamdata(Emptydata).isEmpty());
    }


}
