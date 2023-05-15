public class Part2
{

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (less(a[j], a[min]))
                {
                    min = j;
                }
            }
            exch(a, i, min);
        }
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
        for (Integer num : a) {
            System.out.print(num + " ");
        }
    }
}
/* Part3
array

13 75 12 4 18 6 9 10 7 14 15


(4) 75 12 (13) 18 6 9 10 7 14 15

4 (6) 12 13 18 (75) 9 10 7 14 15

4 6 (7) 13 18 75 9 (12) 10 14 15

4 6 7 (9) 18 75 (13) 12 10 14 15

4 6 7 9 (10) 75 13 (18) 12 14 15

4 6 7 9 10 (12) 75 18 (13) 14 15

4 6 7 9 10 12 (13) 75 18 14 15

4 6 7 9 10 12 13 (14) 75 18 [15]

4 6 7 9 10 12 13 14 (15) 75 (18)

4 6 7 9 10 12 13 14 15 (18) (75)

4 6 7 9 10 12 13 14 15 18 75
 */
