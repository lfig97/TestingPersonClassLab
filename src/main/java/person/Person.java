package person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double shoeSize;
    private String countryOfOrigin;
    private String shirtSize;
    private String eyeColor;
    private String hairColor;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.shoeSize = 0.0;
        this.countryOfOrigin = "";
        this.shirtSize = "";
        this.eyeColor = "";
        this.hairColor = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(double shoeSize,String shirtSize) {
        this.shoeSize = shoeSize;
        this.shirtSize = shirtSize;
    }

    public Person(String eyeColor,String hairColor,String countryOfOrigin) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Person(String name, int age,double shoeSize,String countryOfOrigin,String shirtSize,String eyeColor,String hairColor) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
        this.countryOfOrigin = countryOfOrigin;
        this.shirtSize = shirtSize;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
