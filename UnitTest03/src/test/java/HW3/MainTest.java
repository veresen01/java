package org.example.HW3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


// Задание 1.

@BeforeEach
void setUp() {
    main = new Main();
}

@AfterEach
void tearDown() {
    main = null;
}

/**
 * Проверяем метод evenOddNumber с вводом четного числа
 * Ожидаем true
 */
@Test
@DisplayName("Even input number should return true")
void testEvenNumberWithEvenInput() {
    assertTrue(main.evenOddNumber(2));
}

/**
 * Проверяем метод evenOddNumber с вводом нечетного числа
 * Ожидаем false
 */
@Test
@DisplayName("Odd input number should return false")
void testEvenNumberWithOddInput() {
    assertFalse(main.evenOddNumber(1));
}

/**
 * Проверяем метод evenOddNumber с вводом числа 0
 * Ожидаем true
 */
@Test
@DisplayName("Zero input number should return true")
void testEvenNumberWithZeroInput() {
    assertTrue(main.evenOddNumber(0));
}

/**
 * Проверяем метод evenOddNumber с вводом отрицательного числа
 * Ожидаем true
 */
@Test
@DisplayName("Negative input number should return true")
void testEvenNumberWithNegativeInput() {
    assertTrue(main.evenOddNumber(-2));
}

// Задание 2.

/**
 * Проверяем метод numberInInterval с вводом числа в интервале
 * Ожидаем true
 */
@Test
@DisplayName("Number within the interval should return true")
void testNumberInIntervalWithinRange() {
    assertTrue(main.numberInInterval(30));
}

/**
 * Проверяем метод numberInInterval с вводом числа вне интервала
 * Ожидаем false
 */
@Test
@DisplayName("Number outside the interval should return false")
void testNumberInIntervalOutsideRange() {
    assertFalse(main.numberInInterval(24));
    assertFalse(main.numberInInterval(101));
}

/**
 * Проверяем метод numberInInterval при верхней границе интервала
 * Ожидаем true
 */
@Test
@DisplayName("Number at the upper boundary of the interval should return true")
void testNumberAtUpperBoundary() {
    assertTrue(main.numberInInterval(25));
}

/**
 * Проверяем метод numberInInterval при нижней границе интервала
 * Ожидаем true
 */
@Test
@DisplayName("Number at the lower boundary of the interval should return true")
void testNumberAtLowerBoundary() {
    assertTrue(main.numberInInterval(100));
}

/**
 * Проверяем метод numberInInterval с вводом отрицательного числа
 * Ожидаем false
 */
@Test
@DisplayName("Negative number should return false")
void testNegativeNumberInInterval() {
    assertFalse(main.numberInInterval(-30));
}

