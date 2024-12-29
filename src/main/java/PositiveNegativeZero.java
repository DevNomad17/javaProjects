import java.util.*;

import static java.lang.Math.round;

public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        double kphToMphCoefficient = 0.6213711922;

        return round(kilometersPerHour * kphToMphCoefficient);
    }

    public static void printConversion(double kilometersPerHour) {
        //valid output format: 1.5 km/h = 1 mi/h
        //invalid output format: Invalid Value

        String resString = (kilometersPerHour >= 0) ? (kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h") : ("Invalid Value");

        System.out.println(resString);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // valid output format: "XX KB = YY MB and ZZ KB"
        // If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

        if (kiloBytes < 0)
            System.out.format("Invalid Value");
        else
            System.out.format("%d KB = %d MB and %d KB%n", kiloBytes, kiloBytes / 1024, kiloBytes % 1024);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay < 24)
            if (hourOfDay > 22 || hourOfDay < 8)
                return true;
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;

        if ((year % 4 == 0) && (year % 100 != 0))
            return true;

        if ((year % 100 == 0) && (year % 400 == 0))
            return true;

        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (((int) (a * 1000)) == ((int) (b * 1000)));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        return ((a + b) == c);
    }

    public static boolean isTeen(int a) {
        return ((a >= 13) && (a <= 19));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }

    public static double convertToCentimeters(double inches) {
        return (inches * 2.54);
    }

    public static double convertToCentimeters(double feet, double inches) {
        return (convertToCentimeters(feet * 12 + inches));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0)
            return "Invalid input";

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        return hours + "hh " + minutes + "mm " + seconds + "ss";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0)
            return "Invalid output";

        return getDurationString(minutes * 60 + seconds);
    }

    public static double area(double radius) {
        if (radius < 0)
            return -1;
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        String res = "Invalid Value";
        if (minutes >= 0) {
            int minutesInDay = 24 * 60;
            int minutesInYear = minutesInDay * 365;
            int years = (int) (minutes / minutesInYear);

            int remainingMinutes = (int) minutes % minutesInYear;
            int remainingDays = remainingMinutes / minutesInDay;

            //"XX min = YY y and ZZ d"

            res = minutes + " min = " + years + " y and " + remainingDays + " d";
        }
        System.out.println(res);
    }

    public static void printEqual(int a, int b, int c) {
        String res = "Invalid Value";

        if (a >= 0 && b >= 0 && c >= 0)
            if (a == b && b == c)
                res = "All numbers are equal";
            else if (a != b && b != c && a != c)
                res = "All numbers are different";
            else
                res = "Neither all are equal or different";

        System.out.println(res);
    }

    public static boolean isCatPlaying(boolean summer, int temp) {
        int low = 25;
        int high = summer ? 45 : 35;

        return (temp >= low && temp <= high);
    }

    public static String charToNatoCodeword(String s) {
        return switch (s.toUpperCase()) {
            case "A" -> "ABLE";
            case "B" -> "BAKER";
            case "C" -> "CHARLIE";
            case "D" -> "DOG";
            case "E" -> "EASY";
            case "EXIT" -> "BYE BYE";
            default -> "UNRECOGNIZED character! Please enter characters A - E";
        };
    }

    public static void printDayOfWeek(int dayNumber) {
        System.out.format("Day no %d is '%s'%n", dayNumber,
                switch (dayNumber) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    case -1 -> "BYE BYE";
                    default -> "UNRECOGNIZED";
                }
        );
    }

    public static void printNumberInWord(int number) {
        System.out.println(switch (number) {
                    case 0 -> "ZERO";
                    case 1 -> "ONE";
                    case 2 -> "TWO";
                    case 3 -> "THREE";
                    case 4 -> "FOUR";
                    case 5 -> "FIVE";
                    case 6 -> "SIX";
                    case 7 -> "SEVEN";
                    case 8 -> "EIGHT";
                    case 9 -> "NINE";
                    default -> "other";
                }
        );
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2: {
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            }
        }

        return -1;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (1 + interestRate / 100));
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumbers(int lowerLimit, int upperLimit) {
        if (lowerLimit > upperLimit) {
            System.out.println("Upper limit must be greater than lower limit!");
            return;
        }
        if (lowerLimit < 0 || upperLimit < 0) {
            System.out.println("Both limits must be positive integers!");
            return;
        }

        System.out.format("%nPrime numbers between %d and %d are as follows: %n",lowerLimit, upperLimit);
        int numbersInCurrentRow = 1;
        int totalPrimes = 0;

        for (int i = lowerLimit; i <= upperLimit; i++) {

            if (isPrimeNumber(i)) {
                totalPrimes++;
                if (numbersInCurrentRow < 15) {
                    System.out.print(i + ", ");
                    numbersInCurrentRow++;
                } else {
                    System.out.println(i);
                    numbersInCurrentRow = 1;
                }
            }
        }
        System.out.format("%nTotal count of prime numbers in the interval %d to %d is %d%n%n",lowerLimit,upperLimit,totalPrimes);

    }

    public static void sumThreeFiveChallenge(int lowerLimit, int upperLimit) {
        int resultSum = 0;
        int resultCount = 0;

        for (int i = lowerLimit; i < upperLimit && resultCount < 5; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                resultSum += i;
                resultCount++;
                if (resultCount % 15 != 0) {
                    System.out.print(i + ", ");
                } else {
                    System.out.println(i);
                }
            }
        }
        System.out.format("%nTotal sum of first up to 5 numbers divisible by 3 and 5 in the interval %d to %d is %d%n%n",lowerLimit,upperLimit,resultSum);
    }

    public static boolean isOdd(int number) {
        if (number <=0)
            return false;
        if (number % 2 == 0)
            return false;

        return true;
    }

    public static boolean isEven(int number) {
        return !isOdd(number);
    }

    public static void printEven(int lowerLimit, int upperLimit) {
        if (lowerLimit <= 0 || upperLimit <=0)
            return;
        if (lowerLimit > upperLimit)
            return;

        int i = isEven(lowerLimit)?lowerLimit:lowerLimit+1;
        do {
            if (isEven(i))
                System.out.format("%d, ",i);
            i+=2;
        } while (i <= upperLimit);
        System.out.format("%n%n");
    }

    public static int sumOdd(int lowerLimit, int upperLimit) {
        if (lowerLimit <= 0 || upperLimit <=0)
            return -1;
        if (lowerLimit > upperLimit)
            return -1;
        if (!isOdd(lowerLimit))
            lowerLimit++;
        int resultSum = 0;

        for (int i = lowerLimit; i <= upperLimit; i+=2) {
            resultSum += i;
        }
        return resultSum;
    }

    public static int sumDigits(int number) {
        if (number < 0)
            return -1;

        int sum = 0;

        do {
            sum += number % 10;
            number = number /10;
        } while (number > 0);

        return sum;
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverseNumber = 0;
        int increment = 0;
        int tempNumber = number;

        if (tempNumber < 10)
            return true;

        while (tempNumber > 0) {
            reverseNumber *= 10;
            increment = tempNumber % 10;
            reverseNumber += increment;
            tempNumber /= 10;
        }

//        System.out.format("Entered number: %d, reverse number: %d%n",number,reverseNumber);

        if (reverseNumber == number)
            return true;

        return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        int currentDigit = 0;
        int resultSum = 0;
        int position = 0;

        while (number > 0) {
            position++; //set current digit position
            currentDigit = number % 10; //parse current digit
            if (position == 1) // if it is the first digit, add it into the result
                resultSum += currentDigit;
            number /= 10; //truncate the current digit
            if (number == 0) //if it was the first digit, add it into the result
                resultSum += currentDigit;
        }

        return resultSum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int currentDigit = 0;
        int resultSum = 0;

        while (number > 0) {
            currentDigit = number % 10; //parse current digit
            if (isEven(currentDigit)) //if the digit is even, add it into the result
                resultSum += currentDigit;
            number /= 10; //truncate the current digit
        }

        return resultSum;
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99)
            return false;

        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;

        a1 = a / 10;
        a2 = a % 10;
        b1 = b / 10;
        b2 = b % 10;

        if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2)
            return true;

        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000)
            return false;
        return true;
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (!(isValid(a) && isValid(b) && isValid(c)))
            return false;

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        if (lastDigitA == lastDigitB || lastDigitB == lastDigitC || lastDigitA == lastDigitC)
            return true;

        return false;
    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.print("1 ");
        for (int i = 2; i <= number/2 ; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        if (number > 1)
            System.out.print(number);
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10)
            return -1;

        if (a==b)
            return a;

        int smallerInput = a < b ? a : b;

        if ((a % smallerInput == 0) && (b % smallerInput == 0))
            return smallerInput;

        int max = 0;

        for (int i = 1; i <= smallerInput / 2; i++) {
            if ((a % i == 0) && (b % i == 0))
                max = i;
        }
        return max;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;

        int sum = 0;

        for (int i = 1; i <= number/2 ; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number)
            return true;
        return false;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int reverse(int number) {
        if (number == 0)
            return 0;

        int absNumber = Math.abs(number);
        int reverseNumber = 0;

        while (absNumber > 0) {
            reverseNumber *= 10;
            reverseNumber += absNumber % 10;
            absNumber /= 10;
        }

        return number > 0 ? reverseNumber : reverseNumber * -1;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int j = getDigitCount(number);
        number = reverse(number);

        for (int i = 0; i < j; i++) {
            switch (number % 10) {
                case 0: System.out.println("Zero");break;
                case 1: System.out.println("One");break;
                case 2: System.out.println("Two");break;
                case 3: System.out.println("Three");break;
                case 4: System.out.println("Four");break;
                case 5: System.out.println("Five");break;
                case 6: System.out.println("Six");break;
                case 7: System.out.println("Seven");break;
                case 8: System.out.println("Eight");break;
                case 9: System.out.println("Nine");break;
            }
            number /= 10;
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        if (goal % 5 > smallCount)
            return false;

        if ((5 * bigCount + smallCount) >= goal)
            return true;

        return false;
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;

        int maxPrimeFactor = -1;
        boolean isPrime;

        for (int i = 2; i <= number ; i++) {
            if (number % i == 0) {
                isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0)
                        isPrime = false;
                }
                if (isPrime)
                    maxPrimeFactor = i;
            }
        }
        return maxPrimeFactor;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || j == 0 || i == number - 1 || j == number - 1) {
                    System.out.print("*");
                    continue;
                }
                if (i == j || i == number - j - 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        int sum = 0;
        int avg = 0;
        int i = 0;
        double avgDouble = 0;

        System.out.format("Enter valid integer number or exit by entering a character%n");

        while (true) {
            try {
                userInput = in.nextInt();
            } catch (Exception e) {
                System.out.format("SUM = %d AVG = %d%n",sum,avg);
//                in.next();
                break;
            }
            i++;
            sum += userInput;
            avgDouble = (double)sum/i;
            avg = (int)Math.round(avgDouble);

        }
//        System.out.format("%nMin: %d, Max: %d - out of %d entered numbers%n%n",min, max, i);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;

        double area = width * height;
        int bucketsTotal = (int)Math.ceil(area / areaPerBucket);

        if (extraBuckets >= bucketsTotal)
            return 0;
        return bucketsTotal-extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket,0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;

        return (int)Math.ceil(area / areaPerBucket);
    }

    public static void inheritanceBankAccountChallenge() {
        BankAccount n26 = new BankAccount();

        n26.setAccountNumber("DE20 1234 5678 9012 3456 7890");
        n26.setCustomerName("Ondrej Gabco");
        n26.setEmail("ondrej17@gmail.com");
        n26.setPhoneNumber("+421910683897");
        n26.setBalance(1204);

        n26.deposit(80);
        n26.deposit(-20);
        n26.withdrawal(100);
        n26.withdrawal(2000);

    }

    public static int[] generateRandomIntArray(int length) {
        if (length <= 0)
            return new int[]{-1};

        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(150);
        }

        System.out.print("Randomly generated array: ");
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static int readInteger() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static int[] readElements(int length) {
        if (length <= 0)
            return new int[]{-1};

        int[] arr = new int[length];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("Element %d contents %d%n",i,arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        Arrays.sort(arr);
        reverse(arr);

        return arr;
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        System.out.print("Array = ");
        System.out.println(Arrays.toString(arr));

        while (start < end) {
            // Swap the elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the start and end indices towards the center
            start++;
            end--;
        }

        System.out.print("Reversed array = ");
        System.out.println(Arrays.toString(arr));
    }

    private static ArrayList<String> groomListOfStrings(ArrayList<String> arrayStringIn) {
        ArrayList<String> arrayStringOut = new ArrayList<>();

        for (String s : arrayStringIn) {
            s = s.trim().toLowerCase();
            if (!arrayStringOut.contains(s) && !s.isEmpty()) {
                arrayStringOut.add(s);
            }
        }

        arrayStringOut.sort(Comparator.naturalOrder());
        return arrayStringOut;
    }

    private static LinkedList<PlaceToVisit> createListOfPlaces() {
        LinkedList<PlaceToVisit> myPlaces = new LinkedList<PlaceToVisit>();
        String name;
        int distance;

        for (int i = 0; i<=6; i++) {
            switch(i) {
                case 0 -> {
                    name = "Sydney";
                    distance = 0;
                }
                case 1 -> {
                    name = "Adelaide";
                    distance = 1374;
                }
                case 2 -> {
                    name = "Alice Springs";
                    distance = 2771;
                }
                case 3 -> {
                    name = "Brisbane";
                    distance = 917;
                }
                case 4 -> {
                    name = "Darwin";
                    distance = 3972;
                }
                case 5 -> {
                    name = "Melbourne";
                    distance = 877;
                }
                case 6 -> {
                    name = "Perth";
                    distance = 3923;
                }
                default -> {
                    return myPlaces;
                }
            }
            PlaceToVisit p = new PlaceToVisit(name, distance);
            myPlaces.push(p);
        }
        Collections.sort(myPlaces, new CustomComparator());
        return myPlaces;
    }

    public static void populateInputExecuteChallenge() {
        Scanner in = new Scanner(System.in);
        int i = 0;

        LinkedList<PlaceToVisit> myPlaces = createListOfPlaces();
        var iterator = myPlaces.listIterator();

        String menu = """
                    Your options:
                    1. Forward
                    2. Backward
                    3. List items
                    4. Print Menu
                    5. Quit
                    """;

        while (true) {
            System.out.println(menu);
            System.out.print("Your choice: ");
            try {
                i = in.nextInt();
                if (i < 1 || i > 4) //       (s.toUpperCase().equals("EXIT"))
                    break;
            } catch (Exception e) {
                System.out.format("%n...quitting...%n%n");
                in.next();
                break;
            }
            switch (i) {
                case 1 : {
                    if (iterator.hasNext())  {
                        System.out.println("Currently selected item: " + myPlaces.get(iterator.nextIndex()));
                        iterator.next();
                        try {
                            System.out.println("Moved to item: " + myPlaces.get(iterator.nextIndex()));
                        }
                        catch (Exception e) {
                            System.out.println("Moved to the end of the list");
                            iterator.previous();
                        }

                    }
                    else
                        System.out.println("Reached end of list");
                    break;
                }
                case 2 : {
                    if (iterator.hasPrevious())  {
                       System.out.println("Currently selected item: " + myPlaces.get(iterator.nextIndex()));
                       iterator.previous();
                       System.out.println("Moved to item: " + myPlaces.get(iterator.nextIndex()));
                    }
                    else
                        System.out.println("Reached start of list");
                    break;
                }
                case 3 : {
                    var iterator2 = myPlaces.iterator();
                    System.out.println("Contents of the list:");
                    while (iterator2.hasNext()) {
                        System.out.println(iterator2.next());
                    }
                    break;
                }
            }

            System.out.println();System.out.println();
        }
    }

    public static void createNodes() {

    }
//    public static void runMyLinkedListExcercise() {
//        String s = "5 4 1 6 2 3";
//        int[] intArray = Integer.parseInt(s.split(" "));
//
//        List<Integer> arr = new List<Integer>();
//
//
//        MyLinkedList lst = new MyLinkedList(one);
//        lst.addItem(one);
//        lst.traverse(lst.getRoot());
//    }

    public static void runSearchTreeExcercise() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        SearchTree tree = new SearchTree(one);
        tree.addItem(two);
        tree.addItem(three);
        tree.addItem(four);
        tree.addItem(five);
        tree.addItem(six);
        tree.traverse(tree.getRoot());
    }

    public static void runPlayerMonsterExercise() {
        Player ondrej = new Player("Ondrej",100,7);
        ondrej.write();
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------- M A I N -------------------------------------");
//        populateInputExecuteChallenge();

        System.out.println("-----------------------------------------------------------------------------------------");
        runPlayerMonsterExercise();

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}


