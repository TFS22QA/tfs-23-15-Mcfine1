package generators;

import person.models.Passport;
import person.models.Physical;
import person.models.appearance.Appearance;
import person.models.appearance.Eyes;
import person.models.appearance.Hair;
import person.models.appearance.enums.EyesColor;
import person.models.appearance.enums.HairColor;

import java.util.Random;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class ParamGenerator {
    private final int three = 3;
    private final int ten = 10;
    private final int hundred = 100;
    private final int thousand = 1000;

    /**
     * по третьей цифре кода:
     * Глаза: 0..4
     * Длина волос: i
     * Цвет волос: 0..8.
     *
     * @return .
     */
    public Appearance generationAppearance(final int number) {
        final int i = number % hundred / ten;
        String e = EyesColor.values()[i / 2].name().toLowerCase();
        String hc = null;
        if (i > 0) {
            hc = HairColor.values()[i - 1].name().toLowerCase();
        }
        return new Appearance(new Eyes(e), new Hair(i, hc));
    }

    /**
     * сумма цифр в коде.
     */
    public String generationLastName(final int number) {
        final int i = getDigitsSum(number);
        final String s = (i % 2 == 0) ? "f" : "m";
        return getLinesFromFile("lastNames_" + s).get(i);
    }

    /**
     * сумма первых двух цифр.
     */
    public String generationFirstName(final int number) {
        final int i = getDigitsSum(number);
        final String s = (i % 2 == 0) ? "f" : "m";
        return getLinesFromFile("names_" + s).get(getDigitsSum(number / hundred));
    }

    /**
     * сумма последних двух цифр.
     */
    public String generationMiddleName(final int number) {
        final int i = getDigitsSum(number);
        final String s = (i % 2 == 0) ? "f" : "m";
        return getLinesFromFile("middleNames_" + s).get(getDigitsSum(number % hundred));
    }

    /**
     * по второй цифре кода:
     * Возраст: 10..100
     * Вес: 30..120
     * Рост: 1..1,9
     *
     */
    public Physical generationPhysics(final int number) {
        final int x = number % thousand / hundred;
        int v = (x + 1) * ten;
        int k = three * ten + x * ten;
        double height = (hundred + x * ten) / (float) hundred;
        return new Physical(v, k, height);
    }

    /**
     * Генерация номера паспорта.
     *
     * @param number код
     * @return номер паспорта
     */
    public Passport generationPassportNumber(final int number) {
        final int d = 999999;
        final String pn = String.valueOf(number) + new Random().nextInt(d);
        return new Passport(pn);
    }
}
