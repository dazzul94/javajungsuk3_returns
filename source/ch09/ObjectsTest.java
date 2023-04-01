package source.ch09;

import com.sun.xml.internal.ws.client.sei.StubAsyncHandler;

import java.util.*;
import java.util.*;
import java.util.stream.StreamSupport;

public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{ "aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"},{"AAA", "BBB"}};
        System.out.print("str2D: {");
        Arrays.stream(str2D).forEach(tmp -> System.out.print(Arrays.toString(tmp)));
        System.out.println("}");

        System.out.print("str2D_2={");
        Arrays.stream(str2D_2).forEach(tmp -> System.out.print(Arrays.toString(tmp)));
        System.out.println("}");

        System.out.println("equals(str2D, str2D_2)=" + Objects.equals(str2D, str2D_2));
        System.out.println("deepEquals(str2D, str2D_2)=" + Objects.deepEquals(str2D, str2D_2));
        System.out.println("isNull(null) = " + Objects.isNull(null));
        System.out.println("nonNull(null) = " + Objects.nonNull(null));
        System.out.println("hashCode(null) = " + Objects.hashCode(null));
        System.out.println("toString(null) = " + Objects.toString(null));
        System.out.println("toString(null, \"\")" + Objects.toString(null, ""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;
        System.out.println("compare(\"aa\",\"bb\") = " + Objects.compare("aa", "bb", c));
        System.out.println("compare(\"bb\",\"aa\") = " + Objects.compare("bb", "aa", c));
        System.out.println("compare(\"ab\",\"AB\") = " + Objects.compare("ab", "AB", c));
    }
}
