package scoringSystem;

import java.util.Scanner;
public class Main {
   static NameSaver nameSaver = new NameSaver();

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            boolean Notquit = true;
            while (Notquit) {

                System.out.println("Main Menu. Make a choise, ");
                System.out.println("Press:");
                System.out.println("1: Start a new contest");
                System.out.println("2: Load old scoreboard");
                System.out.println("3: Quit");

                int valMeny1 = scan.nextInt();
                scan.nextLine();
                if (valMeny1 == 1) {

                    System.out.println("start new contest");
                    System.out.println("Make a choise:");
                    System.out.println("Press");
                    System.out.println("1: Decathlon");
                    System.out.println("2: Hepathlon");
                    System.out.println("3: Back to main menu");

                    int valMeny2 = scan.nextInt();
                    scan.nextLine();
                    if (valMeny2 == 1) {
                        //Namn på tävling
                        System.out.println("Name your contest");
                        String Contest=scan.nextLine();
                        nameSaver.SetContest(Contest);

                        //välj antal deltagare
                        System.out.println("Write the numbers of participants you want in your scoreboard ");
                        int Deltagare = scan.nextInt();
                        scan.nextLine();
                        nameSaver.setAthlets(Deltagare);

                        // deltagarnas namn
                        for (int i = 0; i < nameSaver.getNames().length; i++) {
                            System.out.println("write the participants name:" + (i + 1));
                            String name = scan.nextLine();
                            nameSaver.setName(i, name);

                            //poäng  för alla deltagare
                            //System.out.println("Write scores for your participants");

                        }
                        SetScore.setScore();
                    } else if (valMeny2 == 2) {

                        System.out.println("Name your contest");
                        String Contest=scan.nextLine();
                        nameSaver.SetContest(Contest);

                        //välj antal deltagare
                        System.out.println("Write the numbers of participants you want in your scoreboard ");
                        int Deltagare2 = scan.nextInt();
                        nameSaver.setAthlets(Deltagare2);

                        // deltagarnas namn

                        for (int i = 0; i < nameSaver.getNames().length; i++) {
                            System.out.println("write the participants name:" + (i + 1));
                            String name2 = scan.nextLine();
                            nameSaver.setName(i, name2);}

                        //poäng för alla deltagare
                    }
                    else  if(valMeny2==3){
                        System.out.println("back to main menu"); }




                }
                else if (valMeny1==2){
                    System.out.println("Load old contest");
                    System.out.println("make a choise");
                    //Här kommer sparade tävlingar

                }
                else if (valMeny1 ==3) {
                    System.out.println("Quit, GoodBye!");
                    Notquit=false;
                }
            }
        }

    public static void setscore() {


        /*  String [] names = nameSaver.getNames();
            String [] event = new String []{"100m","Long jump","Shot put","High jump","400m","110m hurdles","Discus throw","Pole vault","Javelin throw","1500m"};
            int[][] score = new int[event.length][names.length];
            for(int i  = 0; i < event.length; i++) {
            for (var j = 0; j < names.length; j++) {
                score[i][j] = 10000;
            }
        }
        */
    }
}

