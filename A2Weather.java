import java.util.Scanner;

public class A2Weather {
    public static void main(String args[]) {
        weather w[] = new weather[31];
        int choice, num_days = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter choice you want");
            System.out.println("1.Accept ");
            System.out.println("2.Display ");
            System.out.println("3.Average ");
            System.out.println("4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of days you want to enter data for: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        int a, b, c, d, e;
                        System.out.print("Enter the day of month: ");
                        a = sc.nextInt();
                        System.out.print("Enter high temperature: ");
                        b = sc.nextInt();
                        System.out.print("Enter low temperature: ");
                        c = sc.nextInt();
                        System.out.print("Enter amount of rain of the day:");
                        d = sc.nextInt();
                        System.out.print("Enter amount of snow of the day: ");
                        e = sc.nextInt();
                        weather temp = new weather(a, b, c, d, e);
                        w[num_days] = temp;
                        num_days++;
                    }
                    break;
                case 2:

                    System.out.println("\nDay\tHighT\tLowT\tRain\tSnow");
                    for (int i = 0; i < num_days; i++) {
                        w[i].display();
                    }
                    break;
                case 3:
                    weather temp = new weather();
                    temp.average(w, num_days);
                    break;
                case 4:
                    System.out.println("Bye!!!!!!!");
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        } while (choice != 4);
        sc.close();
    }
}

class weather {
    int day_of_month;
    int hightemp, lowtemp;
    int amount_rain, amount_snow;

    public weather() {
        day_of_month = 0;
        hightemp = 0;
        lowtemp = 0;
        amount_rain = 0;
        amount_snow = 0;
    }

    weather(int a, int b, int c, int d, int e) {
        day_of_month = a;
        hightemp = b;
        lowtemp = c;
        amount_rain = d;
        amount_snow = e;
    }

    void display() {
        System.out.println(
                "\n" + day_of_month + "\t" + hightemp + "\t" + lowtemp
                        + "\t" + amount_rain + "\t" + amount_snow);
    }

    void average(weather w[], int n) {
        int sumht = 0, sumlt = 0, sumrain = 0, sumsnow = 0;
        int alt, aht, arain, asnow;
        for (int i = 0; i < n; i++) {
            sumht = sumht + w[i].hightemp;
            sumlt = sumlt + w[i].lowtemp;
            sumrain = sumrain + w[i].amount_rain;
            sumsnow = sumsnow + w[i].amount_snow;
        }
        alt = sumlt / n;
        aht = sumht / n;
        arain = sumrain / n;
        asnow = sumsnow / n;
        System.out.println("Average of high temp: " + aht);
        System.out.println("Average of low temp: " + alt);
        System.out.println("Average of amount of rain: " + arain);
        System.out.println("Average of amount of snow: " + asnow);
    }
}