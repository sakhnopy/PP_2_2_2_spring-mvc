package web.dao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import web.config.WebConfig;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao {

    ApplicationContext context = new AnnotationConfigApplicationContext(Car.class);

    private static final  List<Car> carList = new ArrayList<>();

     {
         Car car1 = context.getBean("car", Car.class);
         car1.setModel("en1");
         car1.setNumber(1);
         car1.setEngine("1");

         Car car2 = context.getBean("car", Car.class);
         car2.setModel("en2");
         car2.setNumber(2);
         car2.setEngine("2");

         Car car3 = context.getBean("car", Car.class);
         car3.setModel("en3");
         car3.setNumber(3);
         car3.setEngine("3");

         Car car4 = context.getBean("car", Car.class);
         car4.setModel("en4");
         car4.setNumber(4);
         car4.setEngine("4");

         Car car5 = context.getBean("car", Car.class);
         car5.setModel("en5");
         car5.setNumber(5);
         car5.setEngine("5");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }


    @Override
    public List<Car> createCars(int counter) {
        if (counter == 0) {
            return carList;
        }
        return carList.stream().limit(counter).collect(Collectors.toList());
    }
}
