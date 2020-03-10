package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Resultat extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));

        double bmi = weight / (height * height) * 100 * 100;

        request.setAttribute("bmi", bmi);
        request.setAttribute("height", height);
        request.setAttribute("weight", weight);



        if (bmi < 18.5) {
            request.setAttribute("kategori", "Undervægtig");
            return "resultat";
        }

        if (bmi > 30) {
            request.setAttribute("kategori", "Svært overvægtig");
            return "resultat";
        }

        if (bmi < 25) {
            request.setAttribute("kategori", "Normalvægtig");
            return "resultat";
        }

        request.setAttribute("kategori", "Overvægtig");
        return "resultat";
    }
}
