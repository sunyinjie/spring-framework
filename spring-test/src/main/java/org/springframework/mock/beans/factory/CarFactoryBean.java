package org.springframework.mock.beans.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StringUtils;

/**
 * Created by sunyinjie on 2017/8/4.
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        if (!StringUtils.hasLength(carInfo)) {
            String[] infos = carInfo.split(",");
            car.setBrand(infos[0]);
            car.setMaxSpeed(Integer.valueOf(infos[1]));
            car.setPrice(Double.valueOf(infos[2]));
        }
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
