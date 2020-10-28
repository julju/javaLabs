package lab2;

import java.util.Scanner;

public class Lab2 {

        public static final int MAX = 15;
        public static final int MIN = 7;
        public static final int MAX_DIMENTIONS = 20;
        public static final int MIN_DIMENTIONS = 1;


        //HELPERS (convert int to boolean)
        private static boolean intToBoolean(int input) {
            if((input==0)||(input==1)) {
                return input!=0;
            }else {
                throw new IllegalArgumentException("Входное значение может быть равно только 0 или 1 !");
            }
        }


        public static void main(String[] args)
        {
            int x, y;
            boolean isRandom;
            Scanner in = new Scanner(System.in);

            System.out.println("Hi! This is a simple MatrixMaker\nPlease enter x:");
            x = enterMatrixDimention();
            System.out.println("Cool!\nAnd please enter y:");
            y = enterMatrixDimention();
            System.out.println("Wow, amazing!\nYou want to write by yourself(0) or make matrix with random(1) digits");
            System.out.println("(please enter 0 or 1)");
            isRandom = intToBoolean(in.nextInt());
            int[][] myMatrix;

            myMatrix = makeMatrix(x, y, isRandom);

            int minNum = findMin(myMatrix);
            System.out.println("Minimum of matrix is " + minNum);
            int maxNum = findMax(myMatrix);
            System.out.println("Maximum of matrix is " + maxNum);
            double aver = findAverage(myMatrix);
            System.out.println("Average of matrix is " + aver);

        }

        private static int[][] makeMatrix(int sizeX,int sizeY, boolean isRandom) {
            int[][] matrix = new int[sizeX][sizeY];
            if (isRandom){
                int amountOfNumbers = MAX+MIN+1;
                int minForRandomizer = Math.min(Math.abs(MAX), Math.abs(MIN));
                for (int i = 0; i < sizeX; i++) {
                    for (int j = 0; j < sizeY; j++) {
                        matrix[i][j] = (int) Math.round((Math.random() * amountOfNumbers) - minForRandomizer);
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            else{
                for (int i = 0; i < sizeX; i++) {
                    for (int j = 0; j < sizeY; j++) {
                        Scanner in = new Scanner(System.in);
                        System.out.print("Enter next number: ");
                        matrix[i][j] = in.nextInt();
                        System.out.println(" ");
                    }
                }
                for (int i = 0; i < sizeX; i++) {
                    for (int j = 0; j < sizeY; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            return matrix;
        }

        private static int enterMatrixDimention(){
            int number;
            Scanner in = new Scanner(System.in);
            number = in.nextInt();
            while (number>MAX_DIMENTIONS||number<MIN_DIMENTIONS)
            {
                System.out.println("number must be between " +MIN_DIMENTIONS+ " and "+ MAX_DIMENTIONS+"\nPlease enter other num:");
                number = in.nextInt();
            }
            return number;
        }

        private static int findMin(int[][] matrix){
            int minNumber = MAX;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (minNumber >= matrix[i][j])
                        minNumber = matrix[i][j];
                }
            }
            return minNumber;
        }

        private static int findMax(int[][] matrix){
            int maxNumber = MIN;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (maxNumber <= matrix[i][j])
                        maxNumber = matrix[i][j];
                }
            }
            return maxNumber;
        }

        private static double findAverage(int[][] matrix){
            double sum = 0;
            double amount = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    sum = sum + matrix[i][j];
                    amount++;
                }
            }
            return sum / amount;
        }

    }
