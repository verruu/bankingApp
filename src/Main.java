import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Ron");

        Integer newInteger = Integer.valueOf(123);

        ArrayList<Integer> newIntList = new ArrayList<Integer>();
        for (int i = 0; i <=10; i++) {
            newIntList.add(Integer.valueOf(i)); //Autoboxing
        }

        for (int i = 0; i <=newIntList.size(); i++) {
            System.out.println(i + " -> " + newIntList.get(i).intValue()); //Unboxing
        }

        Integer myIntValue = 123; // Integer.valueOf(123);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleVls = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleVls.add(dbl); //.add(Double.valueOf(dbl));
        }

        for (int i = 0; i <= myDoubleVls.size(); i++) {
            double val = myDoubleVls.get(i); // .get(i).doubleValue();
            System.out.println(i + " -> " + val);
        }

    }
}
