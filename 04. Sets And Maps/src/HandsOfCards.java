import java.util.*;

public class HandsOfCards {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        HashMap<String,ArrayList<String>> mapWithCards = new LinkedHashMap<>();
        HashMap<String,Long>  mapWithSum = new LinkedHashMap<>();
        while(!(input = scanner.nextLine()).equals("JOKER")) {

            String[] arg = input.split("[: ,]+");
                Long sum = 0L;
                mapWithCards.putIfAbsent(arg[0], new ArrayList<>());

            for (int i = 1; i < arg.length; i++) {
                String firstChar;
                String secondChar;
                if(arg[i].length() > 2) {
                    firstChar = String.valueOf(arg[i].charAt(0)) + String.valueOf(arg[i].charAt(1));
                    secondChar = String.valueOf(arg[i].charAt(2));
                }
                else {
                    firstChar = String.valueOf(arg[i].charAt(0));
                    secondChar = String.valueOf(arg[i].charAt(1));
                }
                if(mapWithCards.get(arg[0]).contains(firstChar+secondChar)) {
                    continue;
                }
                mapWithCards.get(arg[0]).add(firstChar+secondChar);
                Long firstNum = getFirstNumber(firstChar);
                Long secondNum = getSecondNumber(secondChar);
                sum+=(firstNum*secondNum);
            }
            if(mapWithSum.containsKey(arg[0])) {
                mapWithSum.put(arg[0],mapWithSum.get(arg[0])+sum);
            }
            else {
                mapWithSum.putIfAbsent(arg[0],sum);
            }
        }
        for (Map.Entry<String, Long> stringIntegerEntry : mapWithSum.entrySet()){
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }
    }

    private static Long getSecondNumber(String secondChar) {
        if(secondChar.equals("C")) {
            return 1L;
        }
        if(secondChar.equals("D")) {
            return 2L;
        }
        if(secondChar.equals("H")) {
            return 3L;
        }
        else
            return 4L;
    }

    private static long getFirstNumber(String firstChar) {
        if(firstChar.equals("J")) {
            return 11L;
        }
        if(firstChar.equals("Q")) {
            return 12L;
        }
        if(firstChar.equals("K")) {
            return 13L;
        }
        if(firstChar.equals("A")) {
            return 14L;
        }
            return Long.valueOf(String.valueOf(firstChar));
    }
}
