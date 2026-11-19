
import java.util.Scanner;
public class QuizGrader {
    public static void main (String args[]) {

        char[] answerKey = {
                'A', 'C', 'B', 'D', 'A',
                'C', 'C', 'B', 'A', 'D'
        }; //Dito nilalagay ang mga tamang sagot

        char[] studentAnswers = {
                'A', 'B', 'B', 'D', 'C',
                'C', 'C', 'B', 'A', 'A'
        };//Dito naman nilalagay ang mga sagot ng estudyante

        int correctCount = 0; //Nagsisimula sa 0 ang value ng tamang sagot

        System.out.println("=== Quiz Results ==="); //Pinapakita dito and pamagat na Quiz Result

        for (int i = 0; i < answerKey.length; i++) { //Gumamit ng for loop para icheck ang bawat sagot ng estudyante

            if (Character.toUpperCase(studentAnswers[i]) == answerKey[i]) { //Dito kinukumpara ang sagot ng estudyante sa tamang sagot
                // Ginagawang malaking letra ang sagot dito para matanggap parin kahit naka lowercase.
                correctCount++; //Ginagamit ito para idagdag ang bawat tamang sagot ng estudyante

            } else {//Ginagawa lang ito kapag mali ang sagot ng estudyante.

                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'.");//Dito pinapakita ang number ng tanong, sagot ng estudyante, at ang tamang sagot
            }
        }
        double scorePercentage =
                (double) correctCount / answerKey.length * 100;//Dito kinukuha ang porsyento ng nakuhang tamang sagot sa pamamagitan ng paghahati ng tamang sagot sa kabuuang bilang ng tanong at ipag-multiply ito sa 100.

        System.out.println("\n=== Final Score ==="); //Pinapakita dito and pamagat na Final Score

        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);//Pinapakita dito ang bilang ng mga tamang sagot na nakuha ng estudyante sa kabuuang tanong.

        System.out.println("Score Percentage: " + scorePercentage + "%");//Dito pinapakita ang kabuuang porsyento na marka ng estudyante

        if (scorePercentage >= 70.0) {//Chinecheck naman dito kung ang marka ay 70% pataas

            System.out.println("Result: PASS");//Dito pinapakita ang PASS kung umabot sa 70% o higit pa ang porsyento na nakuha ng estudyante

        } else {//Ginagawa lang ito kung mas mababa sa 70% ang marka na nakuha ng estudyante

            System.out.println("Result: FAIL");//Dito pinapakita ang FAIL kung hindi umabot sa 70% ang porsyento na nakuha ng estudyante
        }
    }
}