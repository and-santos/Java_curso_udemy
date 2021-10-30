package entities;

public class Lasagna {

    public void expectedMinutesInOven() {
        System.out.println("40");
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public void remainingMinutesInOven(int number) {
        System.out.printf("%d\n", 40 - number);

    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public void preparationTimeInMinutes(int numb) {
        System.out.printf("%d\n", 2 * numb);
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public void totalTimeInMinutes(int numLayer, int numMinutes) {

    }



    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(10);
        lasagna.preparationTimeInMinutes(2);
    }
}




