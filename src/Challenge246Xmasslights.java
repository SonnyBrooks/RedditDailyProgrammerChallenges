import java.util.DoubleSummaryStatistics;

/**
 * Created by Andrew on 12/22/15.
 * Challenge # 246 [Easy] X-mass lights
 * https://www.reddit.com/r/dailyprogrammer/comments/3xpgj8/20151221_challenge_246_easy_xmass_lights/
 *
 * Given a 9V battery with capacity of 1200mAh
 * Assume Each LED will need 1.7V and cost 20mA to operate.
 *
 */
public class Challenge246Xmasslights {
    public static SBUtil util = new SBUtil();
    public static int capacityOfBattery = 1200;
    public static double ampOfBattery = 9.0;
    public static int costOfLED = 20;
    public static double ampOfLED = 1.7;
    public static Double numLEDsInSeriesDouble = ampOfBattery/ampOfLED;
    public static int numLEDsInSeriesInt = numLEDsInSeriesDouble.intValue();

    public static void main(String[] args){
        while(true){
            int hours = util.promptInt("\nEnter number of hours: ");
            if(hours == -1) {
                util.goodbye();
                System.exit(1);
            }
            int maxLEDs = maxNumberOfLEDs(hours);
            util.printl("Max Number of LEDs for " + hours + " hour(s): " + maxLEDs);

            //Keep the fields in case you want to be able to change all of them dynamically in the future.
            doCircuitCalculations(ampOfLED, costOfLED, ampOfBattery, capacityOfBattery, hours);
        }
    }

    public static int maxNumberOfLEDs(int hours){
        Double LEDsPerSerial = ampOfBattery/ampOfLED;
        return capacityOfBattery/(hours*costOfLED) * LEDsPerSerial.intValue();
    }

    public static String drawCircuit(int numLEDs){
        String circuit = "*";
        int numLedsLeft = numLEDs;

        while(numLedsLeft >= 2){
            int currentStringLEDs = (numLedsLeft > numLEDsInSeriesInt) ? numLEDsInSeriesInt : numLedsLeft;
            circuit += "-";
            for (int i = 0; i < currentStringLEDs; i++) {
                circuit += ("-|>|--");
                numLedsLeft--;
            }
            if (numLedsLeft == numLEDs - numLEDsInSeriesInt)
                circuit += "*";
            if(numLedsLeft > 0)
                circuit += "\n |";
            for (int i = 0; i <= numLEDsInSeriesInt; i++) {
                circuit += ("     ");
            }
            if (numLedsLeft > 0)
                circuit += ("|\n ");
        }
        return circuit;
    }

    public static double calculateResistance(int hours){
        double capacityToAmps = capacityOfBattery * .001;
        return (ampOfBattery % ampOfLED) / (capacityToAmps / hours);
    }

    public static void doCircuitCalculations(double ampOfLed_mA, int costOfLed_mA, double ampOfBatt_mA, int capacityOfBattery_mAh, int timespan_H){
        ampOfLED = ampOfLed_mA;
        costOfLED = costOfLed_mA;
        ampOfBattery = ampOfBatt_mA;
        capacityOfBattery = capacityOfBattery_mAh;
        util.printl("Resistor: " + calculateResistance(timespan_H) + " Ohms");
        util.printl("Scheme:\n" + drawCircuit(maxNumberOfLEDs(timespan_H)));
    }
}
