package Day19.AnnotationEx;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String name();
    int version() default 1;
}
