package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> showCars(int count);
}
