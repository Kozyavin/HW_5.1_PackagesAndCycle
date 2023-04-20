package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.FreelancerVacation;

public class FreelancerVacationTest {

    @Test

    public void CalculateVocationOne() {
        FreelancerVacation service = new FreelancerVacation();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void CalculateVocationTwo() {
        FreelancerVacation service = new FreelancerVacation();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
