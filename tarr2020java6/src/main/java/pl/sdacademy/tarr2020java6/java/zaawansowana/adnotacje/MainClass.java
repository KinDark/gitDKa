package pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
public abstract class MainClass {

    protected abstract void implementacjaProgramu() throws Exception;

    public MainClass(){
        Class obj = this.getClass();// pobieramy klase w ktorej jestesmy
        if (obj.isAnnotationPresent(JavaTopic.class)) {// czy jest adnotacja JavaTopi
            Annotation annotacja = obj.getAnnotation(JavaTopic.class);// pobieramy adnotacje
            JavaTopic javaTopic = (JavaTopic) annotacja;
            System.out.printf(
                    "===========================================================================");
            // %s oznacza String
            // %n oznacza new line
            System.out.printf("%nTopic: %s", javaTopic.topic());
            System.out.printf("%nDescription: %s", javaTopic.decription());
            System.out.printf("%nPriority: %s", javaTopic.priority());
            System.out.printf("%nCreatedBy: %s", javaTopic.createdBy());
            System.out.printf("%nTags: ");

            // zamien tablice na liste
            List<String> tagsList = Arrays.asList(javaTopic.tags());

            // wypisz tagi za pomocą stream()
            tagsList.stream().forEach(tag -> System.out.print(tag + ","));
            // wypisz tagi w czytelny sposób używając separatora

            System.out.printf(
                    "\n===========================================================================%n%n");

        }
        try {
            implementacjaProgramu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
