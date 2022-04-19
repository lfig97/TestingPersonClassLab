package person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Double expectedShoeSize = 0.0;
        String expectedCountryOfOrigin = "";
        String expectedShirtSize = "";
        String expectedEyeColor = "";
        String expectedHairColor = "";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Double actualShoeSize = person.getShoeSize();
        String actualCountryOfOrigin = person.getCountryOfOrigin();
        String actualShirtSize = person.getShirtSize();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedShoeSize, actualShoeSize);
        Assert.assertEquals(expectedCountryOfOrigin, actualCountryOfOrigin);
        Assert.assertEquals(expectedShirtSize, actualShirtSize);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithShoeAndShirtSize() {
        // Given
        String expectedShirtSize = "Small";
        Double expectedShoeSize = 9.0;

        // When
        Person person = new Person(expectedShoeSize,expectedShirtSize);

        // Then
        String actualShirtSize = person.getShirtSize();
        Double actualShoeSize = person.getShoeSize();
        Assert.assertEquals(expectedShirtSize, actualShirtSize);
        Assert.assertEquals(expectedShoeSize,actualShoeSize);
    }

    @Test
    public void testConstructorWithEyeAndHairColorAndCountryOfOrigin() {
        // Given
        String expectedEyeColor = "Brown";
        String expectedHairColor = "Black";
        String expectedCountryOfOrigin = "USA";

        // When
        Person person = new Person(expectedEyeColor,expectedHairColor,expectedCountryOfOrigin);

        // Then
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();
        String actualCountryOfOrigin = person.getCountryOfOrigin();
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor,actualHairColor);
        Assert.assertEquals(expectedCountryOfOrigin,actualCountryOfOrigin);
    }


    @Test
    public void testConstructorWithAllFields() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Double expectedShoeSize = 9.0;
        String expectedCountryOfOrigin = "USA";
        String expectedShirtSize = "Small";
        String expectedEyeColor = "Brown";
        String expectedHairColor = "Black";

        // When
        Person person = new Person(expectedName, expectedAge,expectedShoeSize,expectedCountryOfOrigin,expectedShirtSize,expectedEyeColor,expectedHairColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Double actualShoeSize = person.getShoeSize();
        String actualCountryOfOrigin = person.getCountryOfOrigin();
        String actualShirtSize = person.getShirtSize();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedShoeSize, actualShoeSize);
        Assert.assertEquals(expectedCountryOfOrigin, actualCountryOfOrigin);
        Assert.assertEquals(expectedShirtSize, actualShirtSize);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        // Given
        Person person = new Person();
        Double expected = 9.0;

        // When
        person.setShoeSize(expected);

        // Then
        Double actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCountryOfOrigin() {
        // Given
        Person person = new Person();
        String expected = "USA";

        // When
        person.setCountryOfOrigin(expected);

        // Then
        String actual = person.getCountryOfOrigin();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetShirtSize() {
        // Given
        Person person = new Person();
        String expected = "Small";

        // When
        person.setShirtSize(expected);

        // Then
        String actual = person.getShirtSize();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Brown";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHairColor() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

}
