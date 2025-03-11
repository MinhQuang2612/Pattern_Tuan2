package adapter_pattern;

public class Main {
    public static void main(String[] args) {
        JSONWebService webService = new JSONWebService();
        XMLSystem adapter = new JSONToXMLAdapter(webService);
        String xmlRequest = "<request>Thanh toán 100000 VND</request>";
        System.out.println("Hệ thống cũ gửi XML: " + xmlRequest);
        adapter.processXML(xmlRequest);
    }
}