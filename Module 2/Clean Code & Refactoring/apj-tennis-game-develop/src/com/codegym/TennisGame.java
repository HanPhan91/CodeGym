package com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score = "";
        if (mScore1==mScore2)
        {
            score = equalScore(mScore1);
        }
        else if (mScore1>=4 || mScore2>=4)
        {
            score= winnerPlayer(mScore1, mScore2);
        }
        else
        {
            score= readScore(mScore1,mScore2);
        }
        return score;
    }

    public static String readScore(int mScore1, int mScore2){
        int tempScore=0;
        String score= "";
        for (int i=1; i<3; i++)
        {
            if (i==1)
                tempScore = mScore1;
            else {
                score+= "-";
                tempScore = mScore2;
            }
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    public static String equalScore(int mScore1){
        switch (mScore1)
        {
            case 0:
                return "Love-All";

            case 1:
                return "Fifteen-All";

            case 2:
                return "Thirty-All";

            case 3:
                return "Forty-All";

            default:
                return "Deuce";


        }
    }
    public static String winnerPlayer(int mScore1, int mScore2){
        int minusResult = mScore1-mScore2;
        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult>=2) return "Win for player1";
        else return "Win for player2";
    }
}
