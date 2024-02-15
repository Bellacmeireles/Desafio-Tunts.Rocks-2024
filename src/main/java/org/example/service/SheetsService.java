package org.example.service;

import com.google.api.services.sheets.v4.Sheets;
import org.example.config.CredentialsConfig;
import org.example.properties.SheetsProperties;

import java.io.IOException;
import java.util.List;

public class SheetsService {

    private SheetsProperties sheetsProperties;

    public SheetsService() {
        this.sheetsProperties = new SheetsProperties();
    }


    public List<List<Object>> getValuesForRanger(String range) throws IOException {
        Sheets service = new Sheets.Builder(sheetsProperties.getHTTP_TRANSPORT(), sheetsProperties.getJSON_FACTORY(),
                CredentialsConfig.getCredentials(sheetsProperties.getHTTP_TRANSPORT()))
                .setApplicationName(sheetsProperties.getAPPLICATION_NAME())
                .build();

        return service.spreadsheets().values()
                .get(sheetsProperties.getSpreadsheetId(), range)
                .execute()
                .getValues();
    }
}
