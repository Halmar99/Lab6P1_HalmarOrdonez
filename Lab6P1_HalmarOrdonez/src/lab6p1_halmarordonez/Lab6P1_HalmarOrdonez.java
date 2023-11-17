
package lab6p1_halmarordonez;
import java.util.Scanner;
import java.util.Random;

public class Lab6P1_HalmarOrdonez {
static Scanner read = new Scanner(System.in);
static Random rng = new Random();

    public static void main(String[] args) {
        char syn = 's';
        while(syn=='s' || syn=='S'){
            System.out.println("----------Menu----------");
            System.out.println("1. Conjuntos");
            System.out.println("2. Cuantos primos tienes?");
            System.out.println("3. Salir del programa");
            System.out.print("Ingrese su opcion: ");
            int opc = read.nextInt();
            System.out.println();
            
            
            switch(opc){
                case 1->{
                    System.out.println("----------Conjuntos----------");
                    System.out.print("Size SET1: ");
                    int size = read.nextInt();
                    System.out.print("Size SET2: ");
                    int size2 = read.nextInt();
                    
                    char [] set1 = genRandCharArray(size);
                    char [] set2 = genRandCharArray(size2);
                    imprimirchar(set1);
                    imprimirchar(set2);
                    
                    System.out.println();
                    System.out.println("----------Operaciones----------");
                    System.out.println("1. Interseccion");
                    System.out.println("2. Diferencia");
                    System.out.print("Ingrese su opcion: ");
                    int opc2 = read.nextInt();
                    
                    switch(opc2){
                        case 1->{
                            System.out.print("Intersection(SET1,SET2): ");
                            char [] inter = intersection(set1,set2);
                            imprimirchar(inter);
                        }
                        case 2->{
                            System.out.print("Difference(SET1,SET2): ");
                            char [] diff = diferencia(set1,set2);
                            imprimirchar(diff);
                        }
                        default->{
                            System.out.println("Opcion invalida");
                        }
                    }
                }
                case 2->{
                    System.out.println("----------Cuantos primos tienes?----------");
                    System.out.print("Ingrese el tamano del arrerglo a generar: ");
                    int tam = read.nextInt();
                    
                    int [] num = genRandArray(tam);
                    imprimirint(num);
                    
                    
                    
                }
                case 3->{
                    System.out.println("Saliendo del programa...");
                }
                default->{
                    System.out.println("Opcion invalida");
                }
            }
            if(opc!=3){
                System.out.println();
                System.out.println("Desea regresar al menu inicial(s/n)?: ");
                syn = read.next().charAt(0);
            }
        }
    }
    public static void imprimirchar(char [] arreglo){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]!='/'){
                System.out.print("[" + arreglo[i] + "]");  
            }    
        }
        System.out.println();
    }//FIN IMPRIMIR
    public static void imprimirint(int [] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print("[" + arreglo[i] + "]");
        }
    }
    public static char [] genRandCharArray (int size){
        int temp [] = new int [size];
        char temp2 [] = new char [size];
        for(int i=0;i<size;i++){
            temp[i]=rng.nextInt((90-65)+1)+65;
            temp2[i]=(char)temp[i];
        }
        return temp2;
    }//FIN GENRANDCHARARRAY
    public static char [] intersection (char [] set1, char [] set2){
        char temp[]=new char[set1.length];
        for(int i=0;i<set1.length;i++){
            for(int j=0;j<set2.length;j++){
                if(set1[i]==set2[j]){
                    temp[i]=set1[i];
                }
                else{
                    temp[i]='/';
                }
            }
        }
        return temp;
    }//FIN INTERSECTION
    public static char [] diferencia(char [] set1, char [] set2){
        char temp[]=new char[set1.length];
        for(int i=0;i<set1.length;i++){
            for(int j=0;j<set2.length;j++){
                if(set1[i]!=set2[j]){
                    temp[i]=set1[i];
                }
                else{
                    temp[i]='/';
                }
            }
        }
        return temp;
    }//FIN DIFERENCIA
    public static int [] genRandArray(int tam){
        int temp[]=new int[tam];
        System.out.print("Ingresar limite inferior: ");
        int min=read.nextInt();
        System.out.print("Ingresar limite superior: ");
        int max=read.nextInt();    
        for(int i=0;i<tam;i++){
            temp[i]=rng.nextInt((max-min)+1)+min;
        }
        return temp;
    }
    public static boolean [] isprime(int num){
        boolean temp[]=new boolean[num];
        int ctdr2=1, ctdr=0;
        for(int i=0;i<temp.length;i++){
            while(ctdr2<=num){
                if(num%ctdr2 == 0){
                    ctdr++;
                }
                ctdr2++;
            }
            if(ctdr==2){
                temp[i]=true;
            }
            else{
                temp[i]=false;
            }
        }
        return temp;
    }
    //public static int [] countPrimeFactors(int tam){
        
    //}
}
