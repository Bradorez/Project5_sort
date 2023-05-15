
public class Part8
{

    public static void sort(Comparable[] a)
    {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {

        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true)
        {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
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
/*Part 9
[5, 4, 2, 9, 1, 7, 3, 8, 6]
1: Pivot = 5
1: swap 5 and 3
1: swap 9 and 1
1: swap 8 and 2
1: Partition: 3
1: [3, 4, 2, 1, 5, 7, 9, 8, 6] – Array after partitioning
1: [3, 4, 2, 1] – sort left part
2: Pivot = 3
2: swap 3 and 1
2: swap 4 and 2
2: Partition: 1
2: [1, 2, 3, 4] – Array after partitioning
2: [1] – sort left part
2: [2, 3, 4] – sort right part
3: Pivot = 2
3: swap 2 and 2
3: Partition: 1
3: [2, 3, 4] – Array after partitioning
3: [] – sort left part
3: [3, 4] – sort right part
4: Pivot = 3
4: swap 3 and 3
4: Partition: 1
4: [3, 4] – Array after partitioning
4: [] – sort left part
4: [] – sort right part
4: [3, 4] – sort result
3: [2, 3, 4] – sort result
2: [1, 2, 3, 4] – sort result
1: [5, 7, 9, 8, 6] – sort right part
2: Pivot = 5
2: swap 5 and 6
2: Partition: 1
2: [5, 6, 9, 8, 7] – Array after partitioning
2: [] – sort left part
2: [6, 9, 8, 7] – sort right part
3: Pivot = 6
3: swap 6 and 6
3: Partition: 1
3: [6, 9, 8, 7] – Array after partitioning
3: [] – sort left part
3: [9, 8, 7] – sort right part
4: Pivot = 9
4: swap 9 and 7
4: Partition: 2
4: [7, 8, 9] – Array after partitioning
4: [7, 8] – sort left part
5: Pivot = 7
5: swap 7 and 7
5: Partition: 1
5: [7, 8] – Array after partitioning
5: [] – sort left part
5: [] – sort right part
5: [7, 8] – sort result
 */

