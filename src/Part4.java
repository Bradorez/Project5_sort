public class Part4
{


        public static void sort(Comparable[] a)
        {
            int n = a.length;
            for (int i = 1; i < n; i++)
            {
                for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                {
                    exch(a, j, j - 1);;
                }

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
/* Part5
13 75 12 4 18 6 9 10 7 14 15

13 75 12 4 18 6 9 10 7 14 15

12 13 75 4 18 6 9 10 7 14 15

4 12 13 75 18 6 9 10 7 14 15

4 12 13 18 75 6 9 10 7 14 15

4 6 12 13 18 75 9 10 7 14 15

4 6 9 12 13 18 75 10 7 14 15

4 6 9 10 12 13 18 75 7 14 15

4 6 7 9 10 12 13 18 75 14 15

4 6 7 9 10 12 13 14 18 75 15

4 6 7 9 10 12 13 14 15 18 75

4 6 7 9 10 12 13 14 15 18 75
 */
