package lv.javaguru.homework.lesson10;

public class UserValidationService {

    public static void validate(User user) {

        int nameCharMin = 3;
        int nameCharMax = 15;
        int ageMin = 0;
        int ageMax = 120;

        if (stringNotValid(user.getName(),nameCharMin , nameCharMax)) {
            throw new ValidationException("You have to choose name between 3 to 15 characters");
        } else if (stringNotValid(user.getLastName(),nameCharMin , nameCharMax)) {
            throw new ValidationException("You have to choose last name between 3 to 15 characters");
        } else if (!ageRangeNotValid(user.getAge(), ageMin, ageMax)) {
            throw new ValidationException("Age range is from 0 to 120");
        }
    }

    private static boolean stringNotValid(String value, int min, int max) {
        return !ageRangeNotValid(value.length(), min, max);
    }

    private static boolean ageRangeNotValid(int value, int min, int max) {
        return value > min && value < max;
    }

}
