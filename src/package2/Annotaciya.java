package package2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

    @Target({ElementType.TYPE,ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    public @interface Annotaciya {

        String myString() default "Meow";
        int myInt_1() default 10;
        int myInt_2() default 20;
    }


