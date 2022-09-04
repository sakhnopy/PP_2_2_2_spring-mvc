package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDaoImpl carDao;
    @Override
    public List<Car> showCars(int count) {
        return carDao.createCars(count);
    }
}
