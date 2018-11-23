import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class SimpleTextEditor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countOfCommands = Integer.parseInt(reader.readLine());

        ArrayDeque queueElements = new ArrayDeque<>();
        ArrayDeque queue = new ArrayDeque<>();

        for (int i = 0; i < countOfCommands; i++) {

            String[] commands = reader.readLine().split(" ");

            switch (commands[0]) {
                case "1":
                    appendElements(queue,queueElements,commands[1]);
                    break;
                case"2":
                    eraseLastCount(queue,queueElements,commands[1]);
                    break;
                case "3":
                    System.out.println(printAtGivenIndex(queueElements,commands[1]));
                    break;
                case "4":
                        lastCommand(queue);
                    break;

            }
        }
    }

    private static ArrayDeque lastCommand(ArrayDeque queue) {
        ArrayDeque elements = new ArrayDeque();
        elements.addAll(queue);
        queue.remove();
        return elements;
    }

    private static char printAtGivenIndex(ArrayDeque queueElements, String command) {
        ArrayList<Character> list = new ArrayList<>(queueElements);
        return list.get(Integer.parseInt(command) - 1);
    }

    private static void eraseLastCount(ArrayDeque queue, ArrayDeque queueElements, String command) {

        queue.addAll(queueElements);

        for (int i = 0; i < Integer.parseInt(command); i++) {
            queueElements.remove();
        }

    }

    private static void appendElements(ArrayDeque queue, ArrayDeque queueElements, String command) {
        char[] array = command.toCharArray();

        queue.addAll(queueElements);

        for (char c : array) {
            queueElements.add(c);
        }
    }
}
