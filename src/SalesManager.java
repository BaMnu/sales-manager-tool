public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long truncatedMean() {

        long max = sales[0];
        long min = sales[1];

        for (int ii = 1; ii < sales.length; ii++) {
            max = Math.max(sales[ii], max);
            min = Math.min(sales[ii], min);
        }

        int count = 0;
        for (long arrayIndex : sales) {
            if (arrayIndex != max && arrayIndex != min) {
                count++;
            }
        }

        long[] array2 = new long[count];
        int count2 = 0;
        for (long j : sales) {
            if (j != max && j != min) {
                array2[count2] = j;
                count2++;
            }
        }
        int sum = 0;
        for (long i : array2) {
            sum += i;
        }

        return sum / array2.length;
    }

}
