package com.thobho.tut.spring.core.xmlbeans.car;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/services.xml"})
public class CarTest {
    private static final Logger logger = Logger.getLogger( com.thobho.tut.spring.core.xmlbeans.philosopher.PhylosopherTest.class.getName() );

    @Autowired
    private Car car;

    @Test
    public void testCar(){
        String brand = car.getBrand();
        assertEquals("Skoda", brand);
    }

    @Test
    public void testCarEngine(){
        Engine engine = car.getEngine();
        assertEquals(1200, engine.getEngineVolume());
    }

    @Test
    public void testCarEngine2(){
        Engine engine = car.getEngine();
        assertEquals(1300, engine.getEngineVolume());
    }

}
