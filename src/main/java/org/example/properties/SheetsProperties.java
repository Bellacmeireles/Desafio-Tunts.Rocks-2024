package org.example.properties;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;

public class SheetsProperties {
    private NetHttpTransport HTTP_TRANSPORT;
    private JsonFactory JSON_FACTORY;
    private final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private final String spreadsheetId = "15hDrYerqMb5g4dQbVrV8nFY11FOdBgr_BRjqBsrhoiQ";

    public SheetsProperties() {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            JSON_FACTORY = GsonFactory.getDefaultInstance();
        } catch (Exception e) {
            System.out.printf("Erro de configuração %s%n", e.getMessage());
        }
    }

    public NetHttpTransport getHTTP_TRANSPORT() {
        return HTTP_TRANSPORT;
    }

    public JsonFactory getJSON_FACTORY() {
        return JSON_FACTORY;
    }

    public String getAPPLICATION_NAME() {
        return APPLICATION_NAME;
    }

    public String getSpreadsheetId() {
        return spreadsheetId;
    }
}
