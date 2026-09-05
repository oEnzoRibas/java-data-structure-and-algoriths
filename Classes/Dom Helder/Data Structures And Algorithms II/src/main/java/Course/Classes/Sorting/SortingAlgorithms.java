package Course.Classes.Sorting;

public class SortingAlgorithms {




    public static void insertionsSort(int[] v){
        int size = v.length;

        for (int i = 1; i < size; i ++) {
            int key = v[i];
            int j = i-1;
            for (; j >= 0 && v[j] > key; j--){
                v[j+1] = v[j];
            }
            v[j+1] = key;
        }
    }

    public static void selectionSort(int[] v){
        for(int j = 0; j< v.length; j++) {
            int minIndex = j;
            for (int i = j+1; i < v.length; i++) {
                if (v[i] < v[minIndex]) {
                    minIndex = i;
                }
            }
            swap(v,j,minIndex);
        }
    }

    public static int[] countingSort(int[] v){
        int size = v.length;

        int max = v[0];
        for (int i = 1; i < size; i++){
            if (v[i] > max) max = v[i];
        }

        int[] cntArr = new int[max+1];

        for (int i= 0; i < size; i++){
            cntArr[v[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            cntArr[i] += cntArr[i - 1];
        }

        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            int a = v[i];
            ans[cntArr[a] - 1] = a;
            cntArr[a]--;
        }
        return ans;
    }

    public static void swap(int[]v, int a, int b){
        int tmp= v[a];
        v[a] = v[b];
        v[b] = tmp;
    }

    public static void main(String[] args) {

        int[] vet = {2, 7, 6, 40, 1, 30};

        int[]res = countingSort(vet);

        for (int i : res){
            System.out.println(i);
        }
    }


}
