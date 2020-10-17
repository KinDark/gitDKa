package pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 21.05.2020
 **/
@JavaTopic(topic = "Przykład użycia adnotacji na pole i metodę", decription = "Java zaawansowana", createdBy = "Trener")
public class Main extends MainClass {

    public Main(){
        super();
    }

    @Override
    protected void implementacjaProgramu() throws Exception {
        MyClass myClass = new MyClass();

        /**
         * Pobranie adnotacji z metody
         */
        Method method = myClass.getClass().getMethod("method");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.B());

        /**
         * Pobranie adnotacji z pola
         */
        Field fieldName = myClass.getClass().getField("name");
        FieldAnnotation annotationField = fieldName.getAnnotation(FieldAnnotation.class);
        System.out.println(annotationField.author());
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
    }



}
