package exercise_2;

import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Завдання 2
 * Напишіть програму, яка виводитиме всю інформацію про клас, користувач сам вибирає, який саме клас цікавить.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        System.out.print("Введіть повне ім'я класу: _");
        String name = scanner.next();

        Class<?> cl = Class.forName(name);

        System.out.println("За запитуваним класом " + s1 + cl + "доступна наступна інформація: ");
        System.out.println(s + "Constructors" + s2);
        classMember(cl.getConstructors());
        System.out.println(s + "Fields" + s2);
        classMember(cl.getFields());
        System.out.println(s + "Methods" + s2);
        classMember(cl.getMethods());

        System.out.println(s + "Annotations" + s2);
        System.out.println(Arrays.toString(cl.getAnnotations()));
        System.out.println(s + "Interfaces" + s2);
        System.out.println(Arrays.toString(cl.getInterfaces()));
    }

    public static void classMember (Member[] members) {
        for (Member member : members) {
            if (member.getDeclaringClass() == Object.class) {
                continue;
            }
            String info = member.toString();
            System.out.println("\t" + info);
        }
    }

}
