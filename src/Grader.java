public class Grader {
    public String determineLetterGrade (int number)  {
        if(number<0){
            throw new IllegalArgumentException("Number grade cannot = 0");
        }
        else if (number < 60) {
            return "F";
        }
        else if (number < 70) {
            return "D";
            
        }
        else if (number < 80) {
            return "C";

        }
        else if (number < 90) {
            return "B";

        }else{
            return "A";
        }

    }
}
