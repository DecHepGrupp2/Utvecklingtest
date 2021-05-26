package scoringSystem;

import java.util.Scanner;

import static scoringSystem.Main.nameSaver;

public class SetScore {
    static Scanner scan = new Scanner(System.in);
    static String event;
    static double result;

    public static void setScore(String game) {
        String[] names = nameSaver.getNames();
        String[][] Scorecard = new String[names.length + 1][22];
        Scorecard[0][0] = "Participants";                //Scorecard [1][0]  Name of first participants
        Scorecard[0][1] = "100m Result";                //Scorecard [1][1]  for adding 100m result for participants number 1
        Scorecard[0][2] = "100m Points";
        Scorecard[0][3] = "Long jump Result";           //Scorecard [1][3]  for adding Long jump result for participants number 1
        Scorecard[0][4] = "Long jump Points";
        Scorecard[0][5] = "Shot put Result";            //Scorecard [1][5]  for adding Shot put result for participants number 1
        Scorecard[0][6] = "Shot put Points";
        Scorecard[0][7] = "High jump Result";           //Scorecard [1][7]  for adding Shot put result for participants number 1
        Scorecard[0][8] = "High jump Points";
        Scorecard[0][9] = "400m Result";
        Scorecard[0][10] = "400m Points";
        Scorecard[0][11] = "110m hurdles Result";
        Scorecard[0][12] = "110m hurdles Points";
        Scorecard[0][13] = "Discus throw Result";
        Scorecard[0][14] = "Discus throw Points";
        Scorecard[0][15] = "Pole vault Result";
        Scorecard[0][16] = "Pole vault Points";
        Scorecard[0][17] = "Javelin throw Result";
        Scorecard[0][18] = "Javelin throw Points";
        Scorecard[0][19] = "1500m Result";
        Scorecard[0][20] = "1500m Points";
        Scorecard[0][21] = "Total Points";
        System.err.println("Your contest " + nameSaver.getContest());

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            Scorecard[i + 1][0] = names[i];
        }

        // Hämta uträkning 100m och Längd ändra j<2 för antal grenar
        for (int j = 0; j < 2; j++) {
            int k = j + 1;
            for (int i = 0; i < names.length; i++) {

                switch (j) {
                    case 0 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in seconds for " + names[i]);
                        result = scan.nextDouble();
                        event = "100m";
                    }
                    case 1 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in centimeters for " + names[i]);
                        result = scan.nextDouble();
                        event = "Long jump";
                    }
                    case 2 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in meters for " + names[i]);
                        result = scan.nextDouble();
                        event = "Shot put";
                    }
                    case 3 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in centimeters for " + names[i]);
                        result = scan.nextDouble();
                        event = "High jump";
                    }
                    case 4 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in seconds for " + names[i]);
                        result = scan.nextDouble();
                        event = "400m";
                    }
                    case 5 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in seconds for " + names[i]);
                        result = scan.nextDouble();
                        event = "110m hurdles";
                    }
                    case 6 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in meters for " + names[i]);
                        result = scan.nextDouble();
                        event = "Discus throw";
                    }
                    case 7 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in centimeters for " + names[i]);
                        result = scan.nextDouble();
                        event = "Pole vault";
                    }
                    case 8 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in meters for " + names[i]);
                        result = scan.nextDouble();
                        event = "Javelin throw";
                    }
                    case 9 -> {
                        System.out.println(Scorecard[0][j + k] + " Write the result in seconds for " + names[i]);
                        result = scan.nextDouble();
                        event = "1500m";
                    }
                }
                                                                                // Lagrar beräkning av poäng i matrisen
                DecaCount ScoreDeca = new DecaCount();
                Scorecard[i + 1][j + k] = String.valueOf(result);
                Scorecard[i + 1][j + k + 1] = String.valueOf(ScoreDeca.decaCount(event, result,game));
            }
        }

       for (int l = 0; l < 22; l++) {
            System.out.print("| " + Scorecard[0][l] + " |");                           // Skriver ut rubrikerna!
        }
        System.out.println();
        for (int k = 1; k < names.length + 1; k++) {                                   // Skriver ut scorecard
            for (int j = 0; j < 22; j++) {
                if (Scorecard[k][j] == null) {
                } else {
                    System.out.print("  | " + Scorecard[k][j] +"     | ");
                }
            }
            System.out.println("   ");
        }
    }

}
