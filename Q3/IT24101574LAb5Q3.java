import java.util.Scanner;

public class IT24101574Lab5Q3 {
    public static void main(String[] args) {
	int startDate, endDate, daysReserved;
        double discountRate, totalCharge, finalCharge;         

	Scanner scanner = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_RATE_NONE = 0;
        final double DISCOUNT_RATE_10_PERCENT = 0.10;
        final double DISCOUNT_RATE_20_PERCENT = 0.20;

        System.out.print("Enter Start date (1-31): ");
        startDate = scanner.nextInt();

        System.out.print("Enter End date (1-31): ");
        endDate = scanner.nextInt();

	if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
	    System.out.println("Error: Days must be between 1 and 31");
	    System.exit(0);
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End date.");
            System.exit(0);
        }

        daysReserved = endDate - startDate;

        if (daysReserved < 3) {
    		 discountRate = DISCOUNT_RATE_NONE;
	} else if (daysReserved >= 3 && daysReserved <= 4) {
   		 discountRate = DISCOUNT_RATE_10_PERCENT;
	} else {
    		 discountRate = DISCOUNT_RATE_20_PERCENT;
	}

        totalCharge = daysReserved * ROOM_CHARGE_PER_DAY;
        finalCharge = totalCharge - (totalCharge * discountRate);

	System.out.println("Room Charge Per Day: Rs." + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + finalCharge);
    }
}