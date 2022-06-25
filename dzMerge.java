package dzPZ2;

public class dzMerge {
    public static void main(String[] args) {
        
        Merge testMerge = new Merge();
        int [] result = testMerge.sortArray(new int[] {2,3,1,4,23,48,12,7});

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
