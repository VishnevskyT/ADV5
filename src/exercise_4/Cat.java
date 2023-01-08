package exercise_4;

import java.lang.reflect.Field;

public class Cat {

    Class<?> cl = Animal.class;
    Animal animal = new Animal();

    public void valuesChange() {
        try {
            String s = (char) 27 + "[93m";
            String s1 = (char) 27 + "[94m";
            String s2 = (char) 27 + "[95m";

            System.out.println(s + "First field:");
            Field fieldAge = cl.getDeclaredField("age");
            if (!fieldAge.canAccess(animal)) {
                fieldAge.setAccessible(true);
            }
            System.out.println(s1 + "Initial value of field " + fieldAge.getName() + " = " + s2 + fieldAge.getInt(animal));
            fieldAge.setInt(animal, 5);
            System.out.println(s1 + "Amended value of field " + fieldAge.getName() + " = " + s2 + fieldAge.getInt(animal));

            System.out.println(s + "Second field:");
            Field fieldName = cl.getDeclaredField("name");
            if (!fieldName.canAccess(animal)) {
                fieldName.setAccessible(true);
            }
            System.out.println(s1 + "Initial value of field " + fieldName.getName() + " = " + s2 + fieldName.get(animal));
            fieldName.set(animal, "Джусікет");
            System.out.println(s1 + "Amended value of field " + fieldName.getName() + " = " + s2 + fieldName.get(animal));

            System.out.println(s + "Third field:");
            Field fieldIsVaccinated = cl.getDeclaredField("isVaccinated");
            if (!fieldIsVaccinated.canAccess(animal)) {
                fieldIsVaccinated.setAccessible(true);
            }
            System.out.println(s1 + "Initial value of field " + fieldIsVaccinated.getName() + " = " + s2 + fieldIsVaccinated.getBoolean(animal));
            fieldIsVaccinated.setBoolean(animal, true);
            System.out.println(s1 + "Amended value of field " + fieldIsVaccinated.getName() + " = " + s2 + fieldIsVaccinated.getBoolean(animal));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);

    }

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.valuesChange();
    }


}
