import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int valColumnIndex = getColumnIndex(ext);
        int sortColumnIndex = getColumnIndex(sort_by);
        
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            if(data[i][valColumnIndex] < val_ext) {
                list.add(data[i]);
            }
        }
        list.sort(Comparator.comparing(x -> x[sortColumnIndex]));

        // return list.toArray(int[][]::new);
        return list.toArray(n -> new int[n][]);
        
    }
    public int getColumnIndex(String ext) {
        int columnIndex = -1;
        switch(ext) {
            case "code":
                columnIndex = 0;
                break;
            case "date":
                columnIndex = 1;
                break;
            case "maximum":
                columnIndex = 2;
                break;
            case "remain":
                columnIndex = 3;
                break;
        }
        return columnIndex;
    }
}