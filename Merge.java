package dzPZ2;

public class Merge {
    
    public int [] sortArray(int [] arrayA) {

        if (arrayA == null) return null; 
        if (arrayA.length < 2) return arrayA;
    
        int [] arrayB = new int [arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        int [] arrayC = new int [arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
    
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
    
        return mergeArray(arrayB, arrayC);
        
    }

    public int [] mergeArray(int [] arrayA, int [] arrayB) {

        int [] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length){
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

}


