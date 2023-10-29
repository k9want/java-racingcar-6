package racingcar.controller;

import racingcar.model.Car;
import racingcar.util.Validation;
import java.util.ArrayList;
import java.util.List;

public class CarController {

    public static List<Car> cars = new ArrayList<>();

    public static void makeCar(String inputCarNames) {
        String[] carNames = splitInputCarNames(inputCarNames);
        Validation.valiEmptySplitInputCarNames(carNames);
        for (int i = 0; i < carNames.length; i++) {
            String carName = carNames[i].trim();
            Validation.valiCarName(carName.trim());
            cars.add(new Car(carName));
        }
    }

    private static String[] splitInputCarNames(String inputCarNames) {
        return inputCarNames.split(",");
    }
}
