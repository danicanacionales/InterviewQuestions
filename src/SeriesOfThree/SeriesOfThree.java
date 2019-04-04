package SeriesOfThree;

public class SeriesOfThree {
    public static void main(String[] args) {
        int seriesOfThreeOf10 = new SeriesOfThree().getSeriesOfThree(10);
    }

    public int getSeriesOfThree(int position){

        int x = 1;
        int y = 1;
        int z = 1;

        int sum = 0;

        for(int i = 0; i < position; i++){
            sum = x + y + z;
            x = y;
            y = z;
            z = sum;
            System.out.println(sum);
        }

        return sum;
    }
}
