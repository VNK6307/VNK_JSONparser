package maven.jsonparser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Jsonparser {
    public static String readString(String inputFile) throws IOException {
        return new String(Files.readAllBytes(Path.of(inputFile)));
    }

    public static List<Employee> jsonToList(String input) {
        List<Employee> list = new ArrayList<>();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        try {
            Object obj = new JSONParser().parse(input);
            JSONArray employees = (JSONArray) obj;
            for (Object employee : employees) {
                list.add(gson.fromJson(employee.toString(), Employee.class));
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}// class
