package com.devops.aquarium.web.controller;

import com.devops.aquarium.AquariumApplication;
import com.devops.aquarium.AquariumApplicationTests;
import com.devops.aquarium.model.Animal;
import com.devops.aquarium.web.controller.AnimalController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@Transactional
@DataJpaTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureTestEntityManager
public class AnimalControllerTest extends AquariumApplicationTests {

    @Autowired
    AnimalController activityController;

    @Before
    public void setUp(){}

    @Test
    public void testFindById(){
        Animal activity = new Animal();
        activity.setId(2);
        activityController.saveAnimal(activity);
        assertEquals(activity, activityController.findAnimalById(2));
    }

    @Test
    public void testFindByName(){
        Animal activity = new Animal(); activity.setId(1);
        activityController.saveAnimal(activity);
        assertEquals(activity, activityController.findAnimalById(1));
    }

    @Test
    public void testSave(){
        Animal activity = new Animal();
        activity.setId(1);
        activityController.saveAnimal(activity);
        assertEquals(activity, activityController.findAnimalById(1));
    }

    @Test
    public void testUpdate(){
        Animal activity = activityController.findAnimalById(1);
        activity.setId(2);
        activityController.updateAnimal(activity);
        assertEquals(activity, activityController.findAnimalById(2));
    }

    @Test
    public void testDelete(){
        Animal activity = new Animal(); activity.setId(2);
        assertNotNull(activityController.saveAnimal(activity));
        activityController.deleteAnimal(2);
        assertNull(activityController.findAnimalById(2));
    }

}