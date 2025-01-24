public class isEqualOrNull {
    public static <T> boolean isEqualOrNull(T object1, T object2) {
        if (object1 == null && object2 == null) {
            return true;
        }
        if(object1.equals(object2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isEqualOrNull(null, null));
        System.out.println(isEqualOrNull(3, 2));
    }
}
