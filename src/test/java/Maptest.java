

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.discovery.SelectorResolver;
import pacakge.ipl.matcheswon;
import pacakge.ipl.matches;
import pacakge.ipl.totalMatchesplayed;
import pacakge.ipl.util;

import  static  org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Maptest {


    List<matches> years =new ArrayList<>();
       @BeforeEach
        void get() {
            matches match = new matches();
            match.setSeason(2010);
            match.setMatchId(1);
            match.setWinner("Mumbai Indians");
            matches match1 = new matches();
            match1.setMatchId(2);
            match1.setSeason(2010);
            match1.setWinner("Sunrisers Hyderabad");
            matches match2 = new matches();
            match2.setMatchId(3);
            match2.setSeason(2018);
            match2.setWinner("Mumbai Indians");
            matches match3 = new matches();
            match3.setMatchId(4);
            match3.setSeason(2015);
            match3.setWinner("Pune Warriors");
            years.add(match);
            years.add(match1);
            years.add(match2);
            years.add(match3);

        }

    @DisplayName("valid details")
    class validTest {
           @Test
           @DisplayName("years count")
        public void ValidValue() {
            HashMap<Integer, Integer> test = new HashMap<>();
            test.put(2010, 2);
            test.put(2015, 1);
            test.put(2018, 1);
            assertEquals(test, totalMatchesplayed.getyeardata(years));
        }

    }

        @Test
        @DisplayName("years count")
        public void inValid(){
            HashMap<Integer, Integer> test = new HashMap<>();
            test.put(2010,4);
            test.put(2015,1);
            test.put(2018,1);
            assertNotEquals(test,totalMatchesplayed.getyeardata(years));
        }

    @Test
    public void NullVaue () {
           assertNotNull(totalMatchesplayed.getyeardata(years));
    }

    @Test
    public  void notEmpty(){
        assertFalse((years).isEmpty());
    }


           @Test
        void TestArgumentNull() {
               assertThrows(NullPointerException.class, () -> totalMatchesplayed.getyeardata(null));
           }

           @Test
        void TestArgumentEmpt(){
               List<matches> Emptydata=new ArrayList<>();
               assertTrue(totalMatchesplayed.getyeardata(Emptydata).isEmpty());
            }

    }



