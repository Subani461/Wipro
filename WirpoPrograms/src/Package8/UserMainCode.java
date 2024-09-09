package Package8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserMainCode {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        HashMap<String, String> idToDOR = new HashMap<>();
        HashMap<String, Integer> idToAmount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String empId = scanner.nextLine();
            String dor = scanner.nextLine();
            int amount = Integer.parseInt(scanner.nextLine());

            idToDOR.put(empId, dor);
            idToAmount.put(empId, amount);
        }

        TreeMap<String, Integer> result = UserMainCode.calculateDiscount(idToDOR, idToAmount);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public static TreeMap<String, Integer> calculateDiscount(HashMap<String, String> dorMap, HashMap<String, Integer> amountMap) {
        TreeMap<String, Integer> discountMap = new TreeMap<>();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        Date currentDate;
        try {
            currentDate = sdf1.parse("01-01-2015");
        } catch (Exception e) {
            e.printStackTrace();
            return discountMap;
        }

        for (String id : dorMap.keySet()) {
            try {
                Date registrationDate;
                String dor = dorMap.get(id);
                if (dor.contains("-")) {
                    registrationDate = sdf1.parse(dor);
                } else {
                    registrationDate = sdf2.parse(dor);
                }
                
                long diffInMillies = Math.abs(currentDate.getTime() - registrationDate.getTime());
                long diffInYears = diffInMillies / (1000L * 60 * 60 * 24 * 365);
                int amount = amountMap.get(id);
                int discount = 0;

                if (amount >= 20000 && diffInYears >= 5) {
                    discount = (int) (0.2 * amount);
                } else if (amount >= 20000 && diffInYears < 5) {
                    discount = (int) (0.1 * amount);
                } else if (amount < 20000 && diffInYears >= 5) {
                    discount = (int) (0.15 * amount);
                } else if (amount < 20000 && diffInYears < 5) {
                    discount = (int) (0.05 * amount);
                }
                discountMap.put(id, discount);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return discountMap;
    }
}