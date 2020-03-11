package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String modtagerside = request.getParameter("modtagerside");

        switch (modtagerside){
            case "resultat":
                request.setAttribute("kategori", "Du er helt uden for kategori");
                return "resultat";
            case "about": return "about";
            case "index": return "index";
            default: return "index";
        }
    }
}
