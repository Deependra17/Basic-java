package newcourse;

public class ArrayType {
    public void oneDimensionArray() {
        int nums[] = new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10); // Generate a random number between 0 and 9 and store it in the array
            System.out.print(nums[i] + ", "); // Print the element at index i
        }
        System.out.println(); // Print a new line after printing all elements
        System.out.println(nums.length);
    }

    public void multiDimensional() {
        int nums[][] = new int[3][4];

        // Fill the array with random numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // Print the array elements
        for (int m[] : nums) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public void jaggedArray() {
        int nums[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void patternTry() {
        int[][][] multiArray = new int[4][][];

        multiArray[0] = new int[4][];
        multiArray[1] = new int[3][];
        multiArray[2] = new int[2][];
        multiArray[3] = new int[1][];

        // Fill the array with random numbers
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = new int[j + 1]; // Initialize inner arrays with varying sizes
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    multiArray[i][j][k] = (int) (Math.random() * 10); // Fill with random numbers
                }
            }
        }

        // Print the array elements
        for (int[][] arr2D : multiArray) {
            for (int[] arr1D : arr2D) {
                for (int num : arr1D) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void threeDimension() {
        int[][][] threeDArray = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeDArray[i][j][k] = i + j + k;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayType arr = new ArrayType();
        arr.oneDimensionArray();
        arr.multiDimensional();
        arr.jaggedArray();
        arr.patternTry();
        arr.threeDimension();
    }
}
