import java.util.Scanner;

public class corredor{

    public static void main(String[]args){

        Scanner lector = new Scanner(System.in);

        double tiempoH, tiempoM, tiempoS, km_h, km_m, km_s, m_m, m_s;

        int h, m;

        System.out.println("Indica la cantidad de horas: ");
        h = lector.nextInt();
        System.out.println("Indica la cantidad de minutos: ");
        m = lector.nextInt();

        tiempoH = h + (m/60.0);
        tiempoM = (h*60) + m;
        tiempoS = (h*3600) + (m*60); 

        km_h = 42.195 / tiempoH;
        km_m = 42.195 / tiempoM;
        km_s = 42.195 / tiempoS;
        
        m_m = 42195 / tiempoM;
        m_s = 42195 / tiempoS;

        System.out.println("La velocidad media del corredor fue: " + km_h + " Km/h.\n" +
        km_m + " Km/min\n"
        + km_s + " Km/s\n"
        + m_m + " m/min\n"
        + m_s + " m/seg.");





    }
}