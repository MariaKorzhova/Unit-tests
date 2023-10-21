package HW2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Company1", "Model123", 2023);
        motorcycle = new Motorcycle("Company2", "Model3", 2019);
    }

//    - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    void testCarIsVehicle() {

        assertTrue(car instanceof Vehicle);
    }

//    - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    @DisplayName("Объект Car создается с 4-мя колесами")
    void testCarWeels() {

        assertEquals(car.getNumWheels(), 4);
    }

//    - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    @DisplayName("Объект Motorcycle создается с 2-мя колесами")
    void testMotorcycleWeels() {

        assertEquals(motorcycle.getNumWheels(), 2);
    }

//    - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Объект Car развивает скорость 60 в режиме тестового вождения")
    void testCarSpeed() {

        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

//    - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Объект Motorcycle развивает скорость 75 в режиме тестового вождения")
    void testMotorcycleSpeed() {

        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }


//    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    @DisplayName("Объект Car в режиме парковки останавливается")
    void testCarPark() {

        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }


//    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    @DisplayName("Объект Motorcycle в режиме парковки останавливается")
    void testMotorcyclePark() {

        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}