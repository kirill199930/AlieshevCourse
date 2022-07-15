package Tests.day9.Task2;

import Tests.AbstractTest;
import day9.Task2.Circle;
import day9.Task2.Figure;
import day9.Task2.Rectangle;
import day9.Task2.TestFigures;
import day9.Task2.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9TestFiguresTest extends AbstractTest {

    Figure[] f;

    @BeforeEach
    public void init() {
        f = new Figure[]{
                new Triangle(10, 10, 10, "Red"),
                new Triangle(20, 30, 10, "Green"),
                new Triangle(20, 15, 10, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
    }

    @Test
    void calculateRedPerimeter() {
        assertEquals(394.3805208364122, TestFigures.calculateRedPerimeter(f));
    }

    @Test
    void calculateRedArea() {
        assertEquals(1208.884272086772, TestFigures.calculateRedArea(f));
    }
}