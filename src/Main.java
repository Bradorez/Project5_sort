public class Main
{
    static class Person
    {
        private String name;
        private int birthYear;

        public Person(String name, int birthYear)
        {
            this.name = name;
            this.birthYear = birthYear;
        }


        public int compareTo(Person person_2)
        {
            return Integer.compare(this.birthYear, person_2.birthYear);
        }


    }


    public static void main(String[] args)
    {
        Person A = new Person("Andrii", 2000);
        Person B = new Person("Bob", 2005);
        Person C = new Person("Cattie", 2005);

        System.out.println(A.compareTo(B));
        System.out.println(B.compareTo(A));
        System.out.println(B.compareTo(C));

    }
}