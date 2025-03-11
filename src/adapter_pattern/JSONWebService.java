package adapter_pattern;

public class JSONWebService {
    public String processJSON(String json) {
        System.out.println("Web Service nhận JSON: " + json);
        return "{\"response\": \"Xử lý thành công cho " + json + "\"}";
    }
}