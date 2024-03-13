import org.junit.jupiter.api.*;
import ru.inno.task.Fractionable;
import ru.inno.task.Utils;

public class CacheHandlerTests {

    @Test
    @DisplayName("methods without annotation working without sideffects")
    public void testNoAnnotationMethods() {
        System.out.println("---------------------------------");
        System.out.println("-- testNoAnnotationMethods");
        System.out.println("---------------------------------");
        TestFraction fraction = new TestFraction(1, 4);
        Fractionable fraction2 = Utils.cache(fraction);
        System.out.println(fraction2.toString()); //fraction2.toString();
        System.out.println(fraction2.toString()); //fraction2.toString();
        System.out.println(fraction2.toString()); //fraction2.toString();
        Assertions.assertEquals(fraction.count, 3);
    }

    @Test
    @DisplayName("methods without annotation don't clear cache")
    public void testNoAnnotationMethodCachNoClear() {
        System.out.println("---------------------------------");
        System.out.println("-- testNoAnnotationMethodCachNoClear");
        System.out.println("---------------------------------");
        TestFraction fraction = new TestFraction(1, 4);
        Fractionable fraction2 = Utils.cache(fraction);
        //System.out.println(fraction2.toString());
        System.out.println(fraction2.doubleValue());
        //System.out.println(fraction2.toString());
        System.out.println(fraction2.doubleValue());
        System.out.println(fraction2.toString());
        System.out.println(fraction2.doubleValue());
        //System.out.println(fraction2.toString());
        Assertions.assertEquals(fraction.count, 2);
    }
}