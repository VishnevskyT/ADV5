package exercise_3;

import java.lang.reflect.*;

/**
 * Завдання 3
 * Створіть клас, в ньому визначте 3 поля, до цих полів створіть конструктори та методи.
 * Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.
 */

public class Main {
    public static void main(String[] args) {
        String s = (char) 27 + "[32m";
        String s1 = (char) 27 + "[33m";
        String s2 = (char) 27 + "[35m";
        String s3 = (char) 27 + "[36m";

 Class<?> cl = CustomClass.class;
        System.out.println(s + "Інформація щодо класу \t" + s1 + cl.getSimpleName());

        Field [] fields = cl.getDeclaredFields();
//        int mods = cl.
        System.out.print(s + "\tПоля класу та їх модифікатори: ");
        for (Field field : fields) {
            int mods = field.getModifiers();

            if (Modifier.isPrivate(mods)) {
                System.out.print("\n\t\t" + s2 + field.getName() + " є " + s3 + "private");
                if (Modifier.isFinal(mods)) {
                    System.out.print(", final");
                }
                if (Modifier.isTransient(mods)) {
                    System.out.print(", transient");
                }
            }
            else if (Modifier.isProtected(mods)) {
                System.out.print("\n\t\t" + s2 + field.getName() + " є " + s3 + "protected");
                if (Modifier.isFinal(mods)) {
                    System.out.print(", final");
                }
                if (Modifier.isTransient(mods)) {
                    System.out.print(", transient");
                }
            }

            else if (Modifier.isPublic(mods)) {
                System.out.print("\n\t\t" + s2 + field.getName() + " є " + s3 + "public");
                if (Modifier.isFinal(mods)) {
                    System.out.print(", final");
                }
                if (Modifier.isTransient(mods)) {
                    System.out.print(", transient");
                }
            }
            else {
                System.out.print("\n\t\t" + s2 + field.getName() + s3 + " без модифікаторів");
                if (Modifier.isFinal(mods)) {
                    System.out.print(", final");
                }
                if (Modifier.isTransient(mods)) {
                    System.out.print(", transient");
                }
            }

        }
        System.out.println("\n" + s + "\tМетоди класу: ");
        Method[] methods = cl.getDeclaredMethods();
        for (Member method : methods) {
            System.out.println("\t\t" + s2 + method.getName());
        }

        Member [] constructors = cl.getDeclaredConstructors();
        System.out.println( s + "\tКонструктори класу: ");
        for (Member constructor : constructors) {
            System.out.println("\t\t" + s2 + constructor.toString());
        }

    }

}


