public class Part6
{

    public static void sort(Comparable[] a)
    {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    {
        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }


    public static void main(String[] args)
    {
        Integer[] a = {5, 2, 7, 0, 3, 9};
        sort(a);
        for (Integer num : a)
        {
            System.out.print(num + " ");
        }
    }
}
/*Part7
[9, 0, 8, 3, 7, 1, 4]
1: [9, 0, 8] – sort left half
2: [9] – sort left half
2: [0, 8] – sort right half
3: [0] – sort left half
3: [8] – sort right half
3: [0, 8] – merged and sorted
2: [0, 8, 9] – merged and sorted
1: [3, 7, 1, 4] – sort right half
2: [3, 7] – sort left half
3: [3] – sort left half
3: [7] – sort right half
3: [3, 7] – merged and sorted
2: [1, 4] – sort right half
3: [1] – sort left half
3: [4] – sort right half
3: [1, 4] – merged and sorted
2: [1, 3, 4, 7] – merged and sorted
1: [0, 1, 3, 4, 7, 8, 9] – merged and sorted


 */
