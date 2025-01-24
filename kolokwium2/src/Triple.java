public class Triple <T>{
        T first;
        T second;
        T third;

        public Triple(T first, T second, T third){
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public T getThird() {
            return third;
        }

        public static void main(String[] args) {
            Triple triple = new Triple("string", 2.0, 3);

            System.out.println(triple.getFirst());
            System.out.println(triple.getSecond());
            System.out.println(triple.getThird());
        }
}
