package ru.reksoft;

class Lesson2 {


    public static void main (String[] args){
        System.out.println(Lesson2.initials("Иванов Петр Александрович"));
    }
    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula(int x) {
        return (int) Math.sqrt(13*x + 13/x);
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {

        String[] names = fullName.split(" ");
        String surname = String.valueOf(names[0].charAt(0));
        String name = String.valueOf(names[1].charAt(0));
        String middleName = String.valueOf(names[2].charAt(0));
        return surname.toUpperCase() + "." + name.toUpperCase() + "." + middleName.toUpperCase() + ".";
    }


}
