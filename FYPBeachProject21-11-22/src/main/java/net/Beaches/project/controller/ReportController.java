package net.Beaches.project.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.Beaches.project.entity.CoastalReport;

@Controller
@RequestMapping("/reports")
public class ReportController {

  @GetMapping("/coastal")
  public ModelAndView getReports(Model model) {
    String url = "https://www.met.ie/Open_Data/xml/xcoastal.xml";
    try {
      URL xmlUrl = new URL(url);
      HttpURLConnection conn = (HttpURLConnection) xmlUrl.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("Accept", "application/xml");

      if (conn.getResponseCode() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
      }

      BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
      StringBuilder sb = new StringBuilder();
      String output;
      while ((output = br.readLine()) != null) {
        sb.append(output);
      }

      CoastalReport reports = new CoastalReport(sb.toString(), "Report Title", "Report Label", "Report Text");
      model.addAttribute("reports", reports);

      conn.disconnect();

    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return new ModelAndView("reports");
  }
}
