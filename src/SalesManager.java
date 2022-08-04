public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int truncatedMean(int[] array) {

        int max = array[0];
        int min = array[1];

        for (int ii = 1; ii < array.length; ii++) {
            max = Math.max(array[ii], max);
            min = Math.min(array[ii], min);
        }

        int count = 0;
        for (int arrayIndex : array) {
            if (arrayIndex != max && arrayIndex != min) {
                count++;
            }
        }

        int[] array2 = new int[count];

        int count2 = 0;

        for (int j : array) {
            if (j != max && j != min) {
                array2[count2] = j;
                count2++;
            }
        }
        int sum = 0;
        for (int i : array2) {
            sum += i;
        }

        int statistics = sum / array2.length;

        return statistics;
    }

}
