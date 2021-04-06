package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    @Test
    public void testCircleGetArea()
    {
        Circle circle = new Circle(TestData.getTestCircleArea_name, TestData.testCircleGetArea_radius);
        double actual_result = circle.getArea();


        assertEquals(TestData.testCircleGetArea_expected_result, actual_result);
    }
    @Test
    public void testCircleGetHekef()
    {
        Circle circle = new Circle("circle1", 6.2);
        double actual_result = circle.getHekef();
        double expected_result = 38.955748904513435;

        assertEquals(expected_result, actual_result);
    }
}
