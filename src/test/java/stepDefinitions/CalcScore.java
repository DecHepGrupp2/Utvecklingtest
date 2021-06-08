package stepDefinitions;

public class CalcScore {

    private static int score;
    private static double p;
    private static double d;
    private static double e;
    double a = 0;
    double b = 0;
    double c = 0;
    int result = 0;


    public static int scoreDeca(String event, double result) {

        switch (event) {
            case "100m" -> {
                score = calculateRun(result, 25.4347, 18, 1.81);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
            }
            case "400m" -> {
                score = calculateRun(result, 1.53775, 82, 1.81);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
            }
            case "110m hurdles" -> {
                score = calculateRun(result, 5.74352, 28.5, 1.92);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
            }
            case "1500m" -> {
                score = calculateRun(result, 0.03768, 480, 204.87);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
            }
            case "Long jump" -> {
                score = calculateJump(result, 0.14354, 220, 1.4);
                System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got " + score + " points");
            }
            case "High jump" -> {
                score = calculateJump(result, 0.8465, 75, 1.42);
                System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got " + score + " points");
            }
            case "Pole vault" -> {
                score = calculateJump(result, 0.2797, 100, 1.35);
                System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got " + score + " points");
            }
            case "Shot put" -> {
                score = calculateThrow(result, 51.39, 1.5, 1.05);
                System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got " + score + " points");
            }
            case "Discus throw" -> {
                score = calculateThrow(result, 12.91, 4, 41.51);
                System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got " + score + " points");
            }
            case "Javelin throw" -> {
                score = calculateThrow(result, 10.14, 7, 1.08);
                System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got " + score + " points");
            }
        }
        return score;
    }

    public static int scoreHepta(String event, double result){

            switch (event) {
                case "200m" -> {
                    score = calculateRun(result, 4.99087, 42.5, 1.81);
                    System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
                }
                case "800m" -> {
                    score = calculateRun(result, 0.11193, 254, 1.88);
                    System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
                }
                case "100m hurdles" -> {
                    score = calculateRun(result, 9.23076, 26.7, 12.93);
                    System.out.println("The event is " + event + " and your time is " + result + " Sec and you got " + score + " points");
                }
                case "Long jump" -> {
                    score = calculateJump(result, 0.188807, 210, 1.41);
                    System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got " + score + " points");
                }
                case "High jump" -> {
                    score = calculateJump(result, 1.84523, 75, 1.348);
                    System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got " + score + " points");
                }
                case "Shot put" -> {
                    score = calculateThrow(result, 56.02111, 1.5, 1.05);
                    System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got " + score + " points");
                }
                case "Javelin throw" -> {
                    score = calculateThrow(result, 15.9803, 3.8, 1.04);
                    System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got " + score + " points");
                }
            }
        return score;
    }


    public static int calculateJump(double result, double a, double b, double c) {             //  (a(p-b)^c)
        p = result;
        d = p-b;
        e = Math.pow(d, c)*a;
        return (int) e;
    }

    public static int calculateThrow(double result, double a, double b, double c) {        //  (a(p-b)^c)
        p = result;
        d = p - b;
        e = Math.pow(d, c)*a;
        return (int) e;
    }

    public static int calculateRun(double result, double a, double b, double c) {            //  (a(b-p)^c)
        p = result;
        d = b - p;
        e = Math.pow(d, c)*a;
        return (int) e;
    }
}
