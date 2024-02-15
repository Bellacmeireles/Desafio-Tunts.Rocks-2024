package org.example.config;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import org.example.service.CalculatorService;
import org.example.service.SheetsService;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class SheetsQuickstart {
    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();


    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */

    /**
     * Prints the names and majors of students in a sample spreadsheet:
     * <a href="https://docs.google.com/spreadsheets/d/15hDrYerqMb5g4dQbVrV8nFY11FOdBgr_BRjqBsrhoiQ/edit#gid=0">...</a>
     */
    public static void main(String... args) throws IOException, GeneralSecurityException {
        SheetsService sheetsService = new SheetsService();
        final String range = "A4:H27";

        List<List<Object>> values = sheetsService.getValuesForRanger(range);

        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
            System.out.println("Name, Major");
            for (List<Object> row : values) {

                // Calculation of grade average
                double p1 = Double.parseDouble((String) row.get(3));
                double p2 = Double.parseDouble((String) row.get(4));
                double p3 = Double.parseDouble((String) row.get(5));

                double average = CalculatorService.average(p1, p2, p3);

                // Calc of the percentage of absences
                int absences = Integer.parseInt((String) row.get(2));
                double absencesPercentage = CalculatorService.absencesPercentage(absences);

                // Situation based on average and absences
                String situation = getSituation(absencesPercentage, average);

                // Calc of the "Grade for Final Approval" for students in the "Final Exam
                double naf = 0;
                if (situation.equals("Final exam")) {
                    naf = CalculatorService.naf(average);
                }
                // Printing the results
                System.out.printf("Name: %s, Average: %.2f, Situation: %s, NAF: %.0f\n", row.get(1), average, situation, naf);
            }

        }
    }

    private static String getSituation(double absencesPercentage, double average) {
        String situation;
        if (absencesPercentage > 25) {
            situation = "Failed due to absence";
        } else if (average < 5) {
            situation = "Failed by grade";
        } else if (average >= 5 && average < 7) {
            situation = "Final exam";
        } else {
            situation = "Approved";
        }
        return situation;
    }
}