package ejercicios;

import java.util.Scanner;

public class MainTrabajos {
    public static void main(String[] args) {
        Scanner tomaDato = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Ingrese el numero del Trabajo que desea ver 1 al 28 o 0 para salir:");
            opcion = tomaDato.nextInt();
            
            if (opcion >= 1 && opcion <= 28) {
                switch (opcion) {
                    case 1:
                        Trabajo1 obj1 = new Trabajo1();
                        obj1.ejecutar();
                        break;
                        
                    case 2:
                        Trabajo2 obj2 = new Trabajo2();
                        obj2.Ascensor();
                        break;
                        
                    case 3:
                        Trabajo3 obj3 = new Trabajo3();
                        obj3.PesoAscensor();
                        break;
                        
                    case 4:
                        Trabajo4 obj4 = new Trabajo4();
                        obj4.TemperaturaAmbiente();
                        break;
                        
                    case 5:
                        Trabajo5 obj5 = new Trabajo5();
                        obj5.TemperaturaAmbiente2();
                        break;
                        
                    case 6:
                        Trabajo6 obj6 = new Trabajo6();
                        obj6.SimulacionAscensor();
                        break;
                        
                    case 7:
                        Trabajo7 obj7 = new Trabajo7();
                        obj7.calcularCompra();
                        break;
                        
                    case 8:
                        Trabajo8 obj8 = new Trabajo8();
                        obj8.calcularIMC();
                        break;
                        
                    case 9:
                        Trabajo9 obj9 = new Trabajo9();
                        obj9.recomendarPelicula();
                        break;
                        
                    case 10:
                        Trabajo10 obj10 = new Trabajo10();
                        obj10.clasificacionCampeonato();
                        break;
                        
                    case 11:
                        Trabajo11 obj11 = new Trabajo11();
                        obj11.menuRestaurante();
                        break;
                        
                    case 12:
                        Trabajo12 obj12 = new Trabajo12();
                        obj12.cajeroAutomatico();
                        break;
                        
                    case 13:
                        Trabajo13 obj13 = new Trabajo13();
                        obj13.compraTiendaOnline();
                        break;
                        
                    case 14:
                        Trabajo14 obj14 = new Trabajo14();
                        obj14.impresora();
                        break;
                        
                    case 15:
                        Trabajo15 obj15 = new Trabajo15();
                        obj15.viajeEnCoche();
                        break;
                        
                    case 16:
                        Trabajo16 obj16 = new Trabajo16();
                        obj16.cuentaRegresiva();
                        break;
                        
                    case 17:
                        Trabajo17 obj17 = new Trabajo17();
                        obj17.juegoAdivinanza();
                        break;
                        
                    case 18:
                        Trabajo18 obj18 = new Trabajo18();
                        obj18.registroBiblioteca();
                        break;
                        
                    case 19:
                        Trabajo19 obj19 = new Trabajo19();
                        obj19.menuComidasRapidas();
                        break;
                        
                    case 20:
                        Trabajo20 obj20 = new Trabajo20();
                        obj20.sensorTemperatura();
                        break;
                        
                    case 21:
                        Trabajo21 obj21 = new Trabajo21();
                        obj21.ingresarResultados();
                        break;
                        
                    case 22:
                        Trabajo22 obj22 = new Trabajo22();
                        obj22.gestionTareas();
                        break;
                    
                    case 23:
                        Trabajo23 obj23 = new Trabajo23();
                        obj23.registroVentas();
                        break;
                        
                    case 24:
                        Trabajo24 obj24 = new Trabajo24();
                        obj24.registroVehiculos();
                        break;
                        
                    case 25:
                        Trabajo25 obj25 = new Trabajo25();
                        obj25.carritoCompras();
                        break;
                        
                    case 26:
                        Trabajo26 obj26 = new Trabajo26();
                        obj26.agendaContactos();
                        break;
                        
                    case 27:
                        Trabajo27 obj27 = new Trabajo27();
                        obj27.sumarNumeros();
                        break;
                        
                    case 28:
                        Trabajo28 obj28 = new Trabajo28();
                        obj28.procesoVentas();
                        break;
                
                }
                
            } else if (opcion != 0) {
                System.out.println("El numero ingresado esta fuera del rango (1-28)|");
            }
        } while (opcion != 0);
        
        System.out.println(" saliste");
        tomaDato.close();
    }
}
