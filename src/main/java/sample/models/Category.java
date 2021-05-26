package sample.models;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.beans.property.*;
import org.json.JSONObject;

import java.time.LocalDate;

public class Category implements APIModel{
    private final StringProperty name;
    private final LongProperty id;

    public Category(Long id, String name, Task task){
        this.id = new SimpleLongProperty(id);
        this.name = new SimpleStringProperty(name);
    }
//    ObjectMapper mapper = new ObjectMapper();
//
//    try {
//        return mapper.writeValueAsString(this);
//    }
//    catch (JsonGenerationException | JsonMappingException e) {
//        e.printStackTrace();
//    }

    @Override
    public JSONObject toJson() {
        JSONObject map = new JSONObject();
        map.put("id", id.get());
        map.put("name", name.get());
        return map;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }
}
