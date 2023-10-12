package person;

import generators.ParamGenerator;
import person.models.Phone;
import utils.MyMath;

import java.util.Random;

public class PersonFactory {

    public static Person getPerson(final String code) {
        Phone phone = new Phone("N/A");

        // добавляем телефон, только если введённый код не палиндром
        if (!code.equals(new StringBuilder(code).reverse().toString())) {
            final String number = "+79"
                    + String.format("%02d", MyMath.getDigitsSum(Integer.parseInt(code)))
                    + String.format("%03d", new Random().nextInt(1000))
                    + String.format("%04d", Integer.parseInt(code));
            phone = new Phone(number);
        }

        return new Person(
                        code,
                        new ParamGenerator().generationLastName(Integer.parseInt(code)),
                        new ParamGenerator().generationFirstName(Integer.parseInt(code)),
                        new ParamGenerator().generationMiddleName(Integer.parseInt(code)),
                        new ParamGenerator().generationPhysics(Integer.parseInt(code)),
                        new ParamGenerator().generationAppearance(Integer.parseInt(code)),
                phone,
                new ParamGenerator().generationPassportNumber(Integer.parseInt(code))
                );
    }
}
