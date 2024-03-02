class hello {
    public static void main(String[] args) {
        // 1. zadanie
        operate();
        // 2. zadanie
        average();
        // 3. zadanie
        evenCheck();
        // 4. zadanie
        bmi();
        // 5. zadanie
        grade();
        // 6. zadanie
        palindrome();
    }

    public static void operate() {
        double firstNum = 2;
        double secondNum = 3;
        double addResult = firstNum + secondNum;
        double subtractResult = firstNum - secondNum;
        double multiplyResult = firstNum * secondNum;
        double divideResult = firstNum / secondNum;

        System.out.println("Wynik dodawania: " + addResult);
        System.out.println("Wynik odejmowania: " + subtractResult);
        System.out.println("Wynik mnożenia: " + multiplyResult);
        System.out.println("Wynik dzielenia: " + divideResult);

    }

    public static void average() {
        double sum = 0;
        double[] numbers = { 2, 3 };
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (sum / numbers.length);
        System.out.println("Średnia liczb: " + average);
    }

    public static void evenCheck() {
        int firstNum = 3;
        if (firstNum % 2 != 0) {
            System.out.println("Liczba nieparzysta.");
        } else {
            System.out.println("Liczba Parzysta.");
        }
    }

    public static void bmi() {
        double masa = 64;
        double wzrost = 1.74;
        double bmi = masa / (wzrost * wzrost);
        System.out.println("Wskaźnik bmi: " + bmi);
    }

    public static void grade() {
        double sum = 0;
        double[] grades = { 2, 3, 4 };
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = (sum / grades.length);
        if (average >= 2 && average < 3) {
            System.out.println("D");
        } else if (average >= 3 && average < 4) {
            System.out.println("C");
        } else if (average >= 4 && average < 5) {
            System.out.println("B");
        }

        else {
            System.out.println("A");
        }
    }

    public static void palindrome() {
        String word = "kajak";
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        System.out.println(newWord);
        if (newWord.equals(word)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Nie palindrom");
        }
    }
}
