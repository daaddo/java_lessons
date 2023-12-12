package it.cascella.jsons.test5_recursive;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class DataConverter {
    public static <T> T fromJson(String json, Class<T> clazz) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        T person = mapper.readValue(json, clazz);
        return person;
    }
    public static <T > String toJson(T person) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        if (person instanceof List list) {
            List<String> convertedList = new ArrayList<>();
            for (Object o : list) {
                convertedList.add(toJson(o));
            }
            return "[" + String.join(", ", convertedList) + "]";
        }
        else {
            String json = mapper.writeValueAsString(person);
            return json;
        }
    }

    public static String prettyPrint(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode obj = mapper.readTree(json);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }

}
