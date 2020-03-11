package util;

public class Bmi {

    public static double beregnBmiValue(double height, double weight){
        return weight / (height * height) * 100 * 100;
    }

    public static String beregnBmiKategori(double bmi){
        if (bmi < 18.5) {
            return "Undervægtig";
        }

        if (bmi > 30) {
            return "Svært overvægtig";
        }

        if (bmi < 25) {
            return "Normalvægtig";
        }

        return "Uden for kategori";
    }
}
