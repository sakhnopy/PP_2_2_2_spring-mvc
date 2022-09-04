package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements Cars {

    private static final  List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("engine1", 1, "hover1"));
        carList.add(new Car("engine2", 2, "hover2"));
        carList.add(new Car("engine3", 3, "hover3"));
        carList.add(new Car("engine4", 4, "hover4"));
        carList.add(new Car("engine5", 5, "hover5"));
    }

    @Override
    public List<Car> createCars(int counter) {
        if (counter == 0) {
            return carList;
        }
        return carList.stream().limit(counter).collect(Collectors.toList());
    }
}
