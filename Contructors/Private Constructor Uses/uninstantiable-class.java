public class StringUtils {
    
    private StringUtils() {
        // this class cannot be instantiated
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
// The StringUtils class contains a couple of static utility methods and can’t be instantiated due to the private constructor.

// Really, there’s no need to allow object instantiation since static methods don’t require an object instance to be used.