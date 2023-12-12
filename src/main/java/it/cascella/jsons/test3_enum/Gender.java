package it.cascella.jsons.test3_enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.naming.ldap.PagedResultsControl;

public enum Gender {
    MALE("Maschio"),
    FEMALE("Femmina"),
    UNKNOWN("Inutile");

    private String value;
    Gender(String value){
        this.value = value;
    }
    @JsonValue
    public String getValue(){
        return value;
    }

    @JsonCreator
    public static Gender of(String value){
        return switch (value){
            case "Maschio" -> Gender.MALE;
            case "Femmina" -> Gender.FEMALE;
            case "Inutile" -> Gender.UNKNOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
