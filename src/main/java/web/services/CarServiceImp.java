package web.services;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> showCars(int count) {
        List<Car> cars= new ArrayList<>();
        {
            cars.add(new Car("engine1", 1, "hover1"));
            cars.add(new Car("engine2", 2, "hover2"));
            cars.add(new Car("engine3", 3, "hover3"));
            cars.add(new Car("engine4", 4, "hover4"));
            cars.add(new Car("engine5", 5, "hover5"));
        }
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
