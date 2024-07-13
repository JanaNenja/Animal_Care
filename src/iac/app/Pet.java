package iac.app;

/**
 *
 * @author Jana Omar Baqays 1805288
 */
public class Pet {

    private String userName;
    private String Animal_Name;
    private String  Animal_Age;
    private String Animal_Kind;
    private String VaccinationSchedule;

    /**
     * Creates new value Pet.
     * @param username
     * @param AnimalName
     * @param AnimalAge
     * @param AnimalKind
     * @param VaccinationSchedule
     */
    public Pet(String username, String AnimalName, String AnimalAge, String AnimalKind, String VaccinationSchedule) {
        this.userName = username;
        this.Animal_Name = AnimalName;
        this.Animal_Age = AnimalAge;
        this.Animal_Kind = AnimalKind;
        this.VaccinationSchedule = VaccinationSchedule;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     *
     * @return
     */
    public String getAnimal_Name() {
        return Animal_Name;
    }

    /**
     *
     * @param Animal_Name
     */
    public void setAnimal_Name(String Animal_Name) {
        this.Animal_Name = Animal_Name;
    }

    /**
     *
     * @return
     */
    public String getAnimal_Age() {
        return Animal_Age;
    }

    /**
     *
     * @param Animal_Age
     */
    public void setAnimal_Age(String Animal_Age) {
        this.Animal_Age = Animal_Age;
    }

    /**
     *
     * @return
     */
    public String getAnimal_Kind() {
        return Animal_Kind;
    }

    /**
     *
     * @param Animal_Kind
     */
    public void setAnimal_Kind(String Animal_Kind) {
        this.Animal_Kind = Animal_Kind;
    }

    /**
     *
     * @return
     */
    public String getVaccinationSchedule() {
        return VaccinationSchedule;
    }

    /**
     *
     * @param VaccinationSchedule
     */
    public void setVaccinationSchedule(String VaccinationSchedule) {
        this.VaccinationSchedule = VaccinationSchedule;
    }

    public String toString() {
        return this.getUserName() + "," + this.getAnimal_Name() + "," + this.getAnimal_Age() + "," + this.getAnimal_Kind() + "," + this.getVaccinationSchedule();
    }
}
