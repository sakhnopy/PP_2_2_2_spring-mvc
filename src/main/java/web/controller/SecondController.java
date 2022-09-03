package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;
import web.services.CarServiceImp;

import java.util.List;

@Controller
public class SecondController{

    private CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.showCars(count);
        model.addAttribute("cars", cars);
        return "cars";

    }

}