package maven.jsonparser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = "data.json";
        String stringJson = Jsonparser.readString((inputFile));
        System.out.println(stringJson);

        List<Employee> employees = Jsonparser.jsonToList(stringJson);
        System.out.println(employees);
    }// main
}