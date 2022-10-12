import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNine(){
        var grader = new Grader();
        assertEquals("F",grader.determineLetterGrade(59));
    }
    @Test
    void sixtyNine(){
        var grader = new Grader();
        assertEquals("D",grader.determineLetterGrade(69));
    }
    @Test
    void seventyNine(){
        var grader = new Grader();
        assertEquals("C",grader.determineLetterGrade(79));
    }
    @Test
    void eightyNine(){
        var grader = new Grader();
        assertEquals("B",grader.determineLetterGrade(89));
    }
    @Test
    void ninetyNine(){
        var grader = new Grader();
        assertEquals("A",grader.determineLetterGrade(99));
    }
    @Test
    void ninetyreturnA(){
        var grader = new Grader();
        assertEquals("A",grader.determineLetterGrade(90));
    }
    @Test
    void eightyreturnB(){
        var grader = new Grader();
        assertEquals("B",grader.determineLetterGrade(80));
    }
    @Test
    void seventyreturnC(){
        var grader = new Grader();
        assertEquals("C",grader.determineLetterGrade(70));
    }
    @Test
    void sixtyreturnD(){
        var grader = new Grader();
        assertEquals("D",grader.determineLetterGrade(60));
    }
    @Test
    void zeroreturnF(){
        var grader = new Grader();
        assertEquals("F",grader.determineLetterGrade(0));
    }
    @Test
    void negativereturn(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    grader.determineLetterGrade(-1);
                });
    }

}