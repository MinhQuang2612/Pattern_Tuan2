package adapter_pattern;

public class JSONToXMLAdapter implements XMLSystem {
    private JSONWebService adaptee;

    public JSONToXMLAdapter(JSONWebService adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void processXML(String xml) {
        String json = convertXMLToJSON(xml);
        String jsonResponse = adaptee.processJSON(json);
        String xmlResponse = convertJSONToXML(jsonResponse);
        System.out.println("Hệ thống cũ nhận XML phản hồi: " + xmlResponse);
    }

    private String convertXMLToJSON(String xml) {
        String json = xml.replace("<request>", "{\"request\": \"")
                        .replace("</request>", "\"}");
        return json;
    }

    private String convertJSONToXML(String json) {
        String xml = json.replace("{\"response\": \"", "<response>")
                        .replace("\"}", "</response>");
        return xml;
    }
}