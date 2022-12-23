package ru.netology.delivery.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataGenerator {
    private DataGenerator() {

    }

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.mm.yyyy"));
    }

    public static String generateCity() {
        var cities = new String[]{

        }
    }
}
