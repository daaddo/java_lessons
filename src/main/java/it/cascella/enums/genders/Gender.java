package it.cascella.enums.genders;

public enum Gender {
    MASCHIO("male", "M"),
    FEMMINA("female", "F"),
    INUTILE("useless", "U");

    private String englishGender;
    private String abbreviation;

    private Gender(String englishGender, String abbreviation) {
        this.englishGender = englishGender;
        this.abbreviation = abbreviation;
    }

    public String getEnglishGender() {
        return englishGender;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
