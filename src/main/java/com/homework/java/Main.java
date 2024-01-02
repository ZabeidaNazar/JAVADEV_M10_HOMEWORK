package com.homework.java;

import com.homework.java.crud.PlanetCrudService;
import com.homework.java.entity.Planet;

public class Main {
    public static void main(String[] args) {
        PlanetCrudService personService = new PlanetCrudService();

        // Створення нової Planet
        Planet newPlanet = new Planet();
        newPlanet.setId("JOHN");
        newPlanet.setName("John Doe");
        personService.save(newPlanet);

        // Читаємо та виводимо Planet по id
        Planet person = personService.findById("JOHN");
        System.out.println("Found Planet: " + person.getName());

        // Оновлюємо Planet
        person.setName("Jane");
        personService.update(person);

        // Видаляємо Planet
        personService.delete(person);

        HibernateUtil.getInstance().close();
    }
}
