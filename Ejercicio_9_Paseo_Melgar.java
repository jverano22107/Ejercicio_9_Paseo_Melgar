import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;
import java.util.Locale;
public class Ejercicio_9_Paseo_Melgar
    {
        public static void main(String[] args)
        {
             /**
                * Notas:
                 * Bus de 60 pasajeros
                    * Valor de plato de comida $10.000
                      * Platos de comida diaria {Gordos: 5 Flacos: 3} 
                        * Estudiantes por habitación :4
                          * Costo de la habitación $25.000
                            */
        int N_Est_flacos, N_Est_Gordos,N_dias,N_platos;
        double Costo_Comida, Costo_Hab_D,Costo_Viaje,N_buses,N_Habit; 
        Scanner Tecl = new Scanner(System.in);
        System.out.print("Numero de estudiantes flacos = ");
        N_Est_flacos = Tecl.nextInt();
        System.out.print("Numero de estudiantes gordos = ");
        N_Est_Gordos = Tecl.nextInt();
        System.out.print("Cuantos dias de estadia = ");
        N_dias = Tecl.nextInt();
        N_buses = Math.ceil((float)(N_Est_flacos+N_Est_Gordos)/60);
        N_platos = ((N_Est_flacos * 3) + (N_Est_Gordos * 5));
        Costo_Comida = N_platos * 10000;
        N_Habit = Math.ceil((float)(N_Est_flacos+N_Est_Gordos)/4);
        Costo_Hab_D = N_Habit * 25000;
        Costo_Viaje = Costo_Comida + (Costo_Hab_D * N_dias);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String Valor_comida = format.format(Costo_Comida);
        String Valor_Dia = format.format(Costo_Hab_D);
        String Valor_Hab_total = format.format(Costo_Hab_D*N_dias);
        String Total = format.format(Costo_Viaje);
        System.out.println("Cantidad de buses para el paseo "+N_buses);
        System.out.println("Se deben servir diariamente " + N_platos + 
        " platos de comida y se requiren en total " +(N_dias *N_platos) +" platos");
        System.out.println("Numero de habitaciones requeridas = "+N_Habit);
        System.out.println("Valor a pagar por comida diarimente = "+Valor_comida);
        System.out.println("Valor a pagar por hospedaje diario = "+Valor_Dia);
        System.out.println("Valor total hospedaje = "+Valor_Hab_total);
        System.out.println("Costo total del paseo = "+Total);
  
    }
    }
