package pages;

public class PersonFactory {
    public static Person createPerson(){
        Person person = new Person();

        person.setTitle(1);
        person.setFirstName("Duke");
        person.setLastName("Nukem");
        person.setPassword("somePass123");
        person.setDayBirth(25);
        person.setMonthBirth(9);
        person.setYearBirth(1982);
        person.setAddressFirstName("addressDuke");
        person.setAddressLastName("addressNukem");
        person.setCompanyName("3DRealms");
        person.setAddress("Apogee Software, Ltd");
        person.setCity("LassVegas");
        person.setState(28);
        person.setZipCode("88901");
        person.setCountry("UnitedStates");
        person.setPhone("775-684-5725");
        person.setAlias("Apogee Software, Ltd");

        return person;
    }
}
