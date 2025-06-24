package classwork.day22;

import java.io.IOException;

public class JsonParserRunner {

    public static void main(String[] args) throws IOException {

        JsonParser jsonParser = new JsonParser();

        jsonParser.toJson();

        jsonParser.fromJson();

        jsonParser.fromJson1();
    }
}
