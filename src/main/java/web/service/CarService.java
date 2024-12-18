package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Car1", "Model_01", 2018));
        cars.add(new Car("Car2", "Model_02", 2022));
        cars.add(new Car("Car3", "Model_03", 2004));
        cars.add(new Car("Car4", "Model_04", 2012));
        cars.add(new Car("Car5", "Model_05", 2007));
    }

    public List<Car> getCars(Integer count) {
        if(count == null || count >= cars.size() || count < 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
