public class People {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public People(int yearOfBirth, String name, String town, String jobTitle) {
        if (name == null || name == "") {
            this.name = "информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < -1) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < -1) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " из города " + town + " , я родился " + yearOfBirth + " году. Я работаю на должности: " + jobTitle + ". Будем знакомы!";
    }
}
