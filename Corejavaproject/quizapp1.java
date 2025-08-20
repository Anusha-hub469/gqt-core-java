package Corejavaproject;

import java.util.*;

public class quizapp1 {
    static Scanner scanner = new Scanner(System.in);
    static boolean audiencePollUsed = false;
    static boolean fiftyFiftyUsed = false;
    static int prize = 0;

    // ANSI Colors
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";
    static final String PURPLE = "\u001B[35m";
    static final String RESET = "\u001B[0m";

    static class Question {
        String question;
        String[] options;
        int correctIndex;

        Question(String question, String[] options, int correctIndex) {
            this.question = question;
            this.options = options;
            this.correctIndex = correctIndex;
        }
    }

    static Question[] questions = {
        new Question("What is the capital of France?", new String[]{"Berlin", "Paris", "Rome", "Madrid"}, 1),
        new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Venus", "Mars", "Jupiter"}, 2),
        new Question("Who wrote 'Romeo and Juliet'?", new String[]{"Shakespeare", "Hemingway", "Twain", "Dickens"}, 0),
        new Question("What is the boiling point of water?", new String[]{"90°C", "80°C", "100°C", "120°C"}, 2),
        new Question("Which is the largest mammal?", new String[]{"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"}, 1),
        new Question("What is the hardest substance?", new String[]{"Gold", "Iron", "Diamond", "Silver"}, 2),
        new Question("Which gas do plants absorb?", new String[]{"Oxygen", "Carbon Dioxide", "Hydrogen", "Nitrogen"}, 1),
        new Question("What is the smallest prime number?", new String[]{"0", "1", "2", "3"}, 2),
        new Question("Who painted the Mona Lisa?", new String[]{"Van Gogh", "Picasso", "Da Vinci", "Rembrandt"}, 2),
        new Question("What is the currency of Japan?", new String[]{"Won", "Yuan", "Dollar", "Yen"}, 3)
    };

    static int[] prizeLevels = {
        1000, 2000, 3000, 5000, 10000,
        20000, 40000, 80000, 160000, 320000
    };

    static int safePrizeQ5 = 10000;
    static int safePrizeQ7 = 40000;

    public static void main(String[] args) {
        System.out.println("🎮 Welcome to the Quiz Game!");
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            boolean lifelineAvailable = !audiencePollUsed || !fiftyFiftyUsed;
            boolean answered = false;

            while (!answered) {
                System.out.print("Choose option (1-4), type 'lifeline', or 'quit': ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("🏁 You chose to quit. Total Prize: ₹" + prize);
                    return;
                }

                if (input.equalsIgnoreCase("lifeline")) {
                    if (!lifelineAvailable) {
                        System.out.println("⚠️ No lifelines left. Choose an option (1-4).");
                        continue;
                    }

                    System.out.print("Choose lifeline ('audience' or '5050'): ");
                    String lifeline = scanner.nextLine().trim();

                    if (lifeline.equalsIgnoreCase("audience") && !audiencePollUsed) {
                        audiencePollUsed = true;
                        useAudiencePoll(q);
                    } else if (lifeline.equalsIgnoreCase("5050") && !fiftyFiftyUsed) {
                        fiftyFiftyUsed = true;
                        useFiftyFifty(q);
                    } else {
                        System.out.println("⚠️ Invalid or already used lifeline.");
                    }
                    continue;
                }

                try {
                    int answer = Integer.parseInt(input) - 1;
                    if (answer == q.correctIndex) {
                        prize = prizeLevels[i];
                        System.out.println(GREEN + "Congratulations! You won ₹" + prize + RESET);
                        answered = true;
                    } else {
                        System.out.println(RED + "Sorry!" + RESET);
                        int finalPrize = 0;
                        if (i >= 7) finalPrize = safePrizeQ7;
                        else if (i >= 5) finalPrize = safePrizeQ5;
                        System.out.println("🏁 You won: ₹" + finalPrize);
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }

        System.out.println(PURPLE + "\n🎉 Congratulations! You completed the quiz! Total Prize: ₹" + prize + RESET);
    }

    static void useAudiencePoll(Question q) {
        System.out.println("\n📊 Audience Poll:");
        Random rand = new Random();
        int correctPercent = 50 + rand.nextInt(26); // 50-75%
        int remaining = 100 - correctPercent;

        int[] otherPercents = new int[3];
        for (int i = 0; i < 2; i++) {
            otherPercents[i] = rand.nextInt(remaining);
            remaining -= otherPercents[i];
        }
        otherPercents[2] = remaining;

        int idx = 0;
        for (int i = 0; i < 4; i++) {
            if (i == q.correctIndex) {
                System.out.println((i + 1) + ". " + q.options[i] + " : " + correctPercent + "%");
            } else {
                System.out.println((i + 1) + ". " + q.options[i] + " : " + otherPercents[idx++] + "%");
            }
        }
    }

    static void useFiftyFifty(Question q) {
        System.out.println("\n🧠 50-50 Lifeline:");
        List<Integer> incorrectOptions = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i != q.correctIndex) incorrectOptions.add(i);
        }
        Collections.shuffle(incorrectOptions);
        int keepIndex = incorrectOptions.get(0);

        for (int i = 0; i < 4; i++) {
            if (i == q.correctIndex || i == keepIndex) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }
        }
    }
}
