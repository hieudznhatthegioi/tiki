
public class Week4 {
    /**
     * int max2int(int a, int b)
     * 
     * @param a : so nguyen duong
     * @param b : so nguyen duong
     * @return : result
     */
    public static int max2Int(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    /**
     * minArray(int[] array)
     * int minArray(int[] array)
     * 
     * @param array : mang so nguyen
     * @return : result
     */
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    /**
     * calculateBMI(double weight, double height)
     * 
     * @param weight : can nang cua nguoi
     * @param height : chieu cao cua nguoi
     * @return : result
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10.0) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
