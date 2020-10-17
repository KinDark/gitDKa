package pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 21.05.2020
 *
 * Przyklad adnotacja na pole i metodę
 **/
public class MyClass {

    // ponizej adnotacja na pole
    @FieldAnnotation(name = "imie", author = "trener")
    public String name;

    // ponizej adnotacja na metodę
    @MyAnnotation(A = "12.32.12.3", B = "administrator")
    public void method(){
        MyAnnotation annotationValues = null;
        try {
            annotationValues = this.getClass()
                    .getMethod("method")
                    .getAnnotation(MyAnnotation.class);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        // wypisuje wartosc adnotacji A
        System.out.println(annotationValues.A());

    }
}
