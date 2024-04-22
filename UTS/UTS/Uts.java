package UTS;
public class Uts {
    int angka;

    public void mergeSort(int[] angka) {
    }

    public void merge(int angka[], int left, int middle, int right) {
        int[] temp = new int[angka.length];
        for (int i = left; i <= right; i++) {
            temp[i] = angka[i];
        }

        int a = left;
        int b = middle + 1;  
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                angka[c] = temp[a];
                a++;
            } else {
               angka[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            angka[c + i] = temp[a + i];
        }
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    }


