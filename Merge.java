package dzPZ2;

public class Merge {
    
    public int [] sortArray(int [] arrayA) {

        if (arrayA == null) return null; 
        if (arrayA.length < 2) return arrayA;
    
        int [] leftSize = new int [arrayA.length / 2];
        System.arraycopy(arrayA, 0, leftSize, 0, arrayA.length / 2);
        int [] rightSize = new int [arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, rightSize, 0, arrayA.length - arrayA.length / 2);
    
        leftSize = sortArray(leftSize);
        rightSize = sortArray(rightSize);
    
        return mergeArray(leftSize, rightSize);
        
    }

    public int [] mergeArray(int [] arrayA, int [] arrayB) {

        int [] arrayC = new int[arrayA.length + arrayB.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (leftIndex == arrayA.length){
                arrayC[i] = arrayB[rightIndex];
                rightIndex++;
            } else if (rightIndex == arrayB.length) {
                arrayC[i] = arrayA[leftIndex];
                leftIndex++;
            } else if (arrayA[leftIndex] < arrayB[rightIndex]) {
                arrayC[i] = arrayA[leftIndex];
                leftIndex++;
            } else {
                arrayC[i] = arrayB[rightIndex];
                rightIndex++;
            }
        }
        return arrayC;
    }

}


