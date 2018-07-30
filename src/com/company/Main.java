package com.company;


import javax.swing.text.html.parser.Element;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@interface Rampl{
    String Unicode() default "Maison";
    float Version() default 1.0F;
}

public class Main {
    public static void main(String[] args) {
        Classic c = new Classic();
        c.showAnnotation();
        CyclicBarrierDemo demo = new CyclicBarrierDemo();
        demo.runSimulation(5, 3);
    }
}


@Rampl(Unicode = "UTF-8", Version = 0.4F)
private class Classic{
    public  void showAnnotation(){
        Annotation annotation =  (Annotation) this.getClass().getAnnotation(Rampl.class);
        System.out.println(annotation);
    }
}

