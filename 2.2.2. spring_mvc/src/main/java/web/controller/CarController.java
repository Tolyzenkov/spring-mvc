package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    Car car1 = new Car(1, "Nissan", 26484);
    Car car2 = new Car(2, "Toyota", 5648);
    Car car3 = new Car(3, "Subaru", 55564);
    Car car4 = new Car(4, "Lada", 11124);
    Car car5 = new Car(5, "Dodge", 66488);

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                               ModelMap model) {
        List<String> messages = new ArrayList<>();

        if (count == 4) {
            messages.add(car1.getId() + " " + car1.getMark() + " " + car1.getMillage());
            messages.add(car2.getId() + " " + car2.getMark() + " " + car2.getMillage());
            messages.add(car3.getId() + " " + car3.getMark() + " " + car3.getMillage());
            messages.add(car4.getId() + " " + car4.getMark() + " " + car4.getMillage());
        } else if (count == 3) {
            messages.add(car1.getId() + " " + car1.getMark() + " " + car1.getMillage());
            messages.add(car2.getId() + " " + car2.getMark() + " " + car2.getMillage());
            messages.add(car3.getId() + " " + car3.getMark() + " " + car3.getMillage());
        } else if (count == 2) {
            messages.add(car1.getId() + " " + car1.getMark() + " " + car1.getMillage());
            messages.add(car2.getId() + " " + car2.getMark() + " " + car2.getMillage());
        } else if (count == 1) {
            messages.add(car1.getId() + " " + car1.getMark() + " " + car1.getMillage());
        } else {
            messages.add(car1.getId() + " " + car1.getMark() + " " + car1.getMillage());
            messages.add(car2.getId() + " " + car2.getMark() + " " + car2.getMillage());
            messages.add(car3.getId() + " " + car3.getMark() + " " + car3.getMillage());
            messages.add(car4.getId() + " " + car4.getMark() + " " + car4.getMillage());
            messages.add(car5.getId() + " " + car5.getMark() + " " + car5.getMillage());
        }

        model.addAttribute("cars",messages);
        return "car/cars";
    }

}
