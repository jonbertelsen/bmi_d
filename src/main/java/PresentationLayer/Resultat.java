package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Resultat extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));

        double bmi = util.Bmi.beregnBmiValue(height, weight);

        String kategori = util.Bmi.beregnBmiKategori(bmi);

        request.setAttribute("bmi", bmi);
        request.setAttribute("height", height);
        request.setAttribute("weight", weight);
        request.setAttribute("kategori", kategori);

        return "resultat";
    }
}
