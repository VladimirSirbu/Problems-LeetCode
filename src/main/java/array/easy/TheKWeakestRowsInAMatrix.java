package array.easy;

import java.util.*;

public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, List<Integer>> sortedMap = new TreeMap<>();
        int countOnes = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    countOnes++;
            }
            if (sortedMap.containsKey(countOnes))
                sortedMap.get(countOnes).add(i);
            else {
                List<Integer> lst = new ArrayList<>();
                lst.add(i);
                sortedMap.put(countOnes, lst);
            }
            countOnes = 0;
        }

        int[] newArr = new int[k];
        int i = 0;
        for (var entry : sortedMap.entrySet()) {
            List<Integer> list = entry.getValue();
            Iterator itr = list.iterator();
            while (i < newArr.length && itr.hasNext()) {
                newArr[i++] = (int) itr.next();
            }
        }
        return newArr;
    }

    public int[] kWeakestRows1(int[][] mat, int k) {
        int[] storeNrOfSoldiers = new int[mat.length];
        int countOnes = 0;
        int l = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    countOnes++;
                }
            }
            storeNrOfSoldiers[l++] = countOnes;
            countOnes = 0;
        }

        int index = 0;
        int[] resultArr = new int[k];
        l = 0;
        for (int i = 0; i < resultArr.length; i++) {
            int min = minElement(storeNrOfSoldiers);
            for (int j = 0; j < storeNrOfSoldiers.length; j++) {
                if (storeNrOfSoldiers[j] != min)
                    index++;
                else {
                    resultArr[l++] = index;
                    storeNrOfSoldiers[index] = Integer.MAX_VALUE;
                    break;
                }
            }
            index = 0;
        }
        return resultArr;
    }

    private int minElement(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
}
