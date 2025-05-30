package excerciseSwitch;

import java.util.Scanner; // Importa la clase Scanner para leer los datos ingresados desde la consola.
public class Main { // Define la clase Main.
    public static void main(String[] args) { // Define el método main para la entrada.
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el numero del caso seleccionado, los cuales van del 1 al 32");
        int option = input.nextInt();

        switch (option) {
            case 1:
            System.out.println("CASO 1: Calcular la distancia recorrida por un móvil");
            System.out.println("Ingrese la velocidad");
            int velocity = input.nextInt();
            System.out.println("Ingrese el tiempo");
            int time= input.nextInt();
            int distance = velocity * time;
            System.out.println("La distancia recorrida es" + distance);
            break;

            case 2:
            System.out.println("CASO 2: Calcular el promedio de tres notas");
            System.out.println("Ingrese la primera nota");
            int numberOne = input.nextInt();
            System.out.println("Ingrese la segunda nota");
            int numberTwo = input.nextInt();
            System.out.println("Ingrese la tercera nota");
            int numberThree = input.nextInt();
            int average = (numberOne+numberTwo+numberThree)/3;
            System.out.println("El promedio es:" + average);
            break;
            
            case 3:
            System.out.println("CASO 3: Calcular el puntaje final de un examen");
            System.out.println("Ingrese las respuestas correctas");
            int answerCorrect =input.nextInt();
            System.out.println("Ingrese las respuestas Incorrectas");
            int answerIncorrect =input.nextInt();
            System.out.println("Ingrese las respuestas en blanco");
            int answerBlank =input.nextInt();
            int scoreAnswerCorrect = answerCorrect * 4;
            int scoreAnswerIncorrect = answerIncorrect * -1;
            int scoreEnd = scoreAnswerCorrect + scoreAnswerIncorrect;
            int result = scoreEnd;
            System.out.println("Las respuestas en blanco son:" + answerBlank);
            System.out.println("El puntaje final es:" + result);
            break;
            
            case 4:
            System.out.println("CASO 4: Calcular el total de puntos obtenidos en un torneo de futbol");
            System.out.println("Ingrese los partidos ganados");
            int matchesWon =input.nextInt();
            System.out.println("Ingrese los partidos empatados");
            int matchesTied =input.nextInt();
            System.out.println("Ingrese los partidos perdidos");
            int matchesLost =input.nextInt();
            int scoreMatchesWon = matchesWon * 3;
            int scoreMatchesTied = matchesTied * 1;
            int scoreTotal = scoreMatchesWon + scoreMatchesTied;
            result = scoreTotal;
            System.out.println("El total de partidos son:" + result);
            System.out.println("El total de partidos perdidos son:" + matchesLost);
            break;

            case 5:
            System.out.println("CASO 5: Calcular la planilla de un empleado");
            System.out.println("Ingrese las horas laboradas");
            int hourdWorked =input.nextInt();
            System.out.println("Ingrese la tarifa por hora");
            int hourlyRate =input.nextInt();
            int payroll = hourdWorked * hourlyRate;
            int resultado = payroll;
            System.out.println("Planilla: " + resultado);
            break;

            case 6:
            System.out.println("CASO 6: Calcular el área de un triángulo");
            System.out.println("Ingrese el lado A del traingulo");
            double ladoOne =input.nextInt();
            System.out.println("Ingrese el lado B del traingulo");
            double ladoTwo =input.nextInt();
            System.out.println("Ingrese el lado C del traingulo");
            double ladoThree =input.nextInt();
            double perimeter = (ladoOne + ladoTwo + ladoThree) / 2;
            double area = Math.sqrt( perimeter * (perimeter - ladoOne) * (perimeter - ladoTwo) * (perimeter - ladoThree));
            System.out.println("El area del triangulo es: " + area);
            break;

            case 7:
            System.out.println("CASO 7: Calcular la cantidad de CDs que se pueden grabar en un disco duro");
            System.out.println("Ingrese el numero de GB del disco duro");
            double GB =input.nextInt();
            double MG = GB * 1.024;
            double CD = Math.floor((MG / 700) + 1);
            double R = CD;
            System.out.println(R);
            break;

            case 8:
            System.out.println("CASO 8: Calcular la distancia entre dos puntos en un plano cartesiano");
            System.out.println("Ingrese el punto A");
            double abcisaA =input.nextDouble();
            System.out.println("Ingrese abcisa B");
            double abcisaB =input.nextDouble();
            System.out.println("Ingrese ordenada A");
            double orderlyA =input.nextDouble();
            System.out.println("Ingrese ordenada B");
            double orderlyB =input.nextDouble();
            double distances = Math.sqrt((abcisaB - abcisaA) *2 + (orderlyB - orderlyA) *2);
            double answer = distances;
            System.out.println("La distancia es:" + answer);
            break;

            case 9:
            System.out.println("CASO 9: Calcular si una persona debe solicitar su CUIL");
            System.out.println("Ingrese su año de nacimiento");
            int yearBirth =input.nextInt();
            System.out.println("Ingrese el año actual");
            int currentYear =input.nextInt();
            int age = currentYear - yearBirth;
            if ( age > 17){
                System.out.println("Debe solicitar su CUIL");
            }
            else {
                System.out.println( "No debe solicitar su CUIL aun");
            }
            break;
    

            case 10:
            System.out.println("CASO 10: Calcular la diferencia de edad entre dos hermanos");
            System.out.println("Ingrese la edad del primer hermano");
            int ageOne =input.nextInt();
            System.out.println("Ingrese la edad del segundo hermano");
            int ageTwo =input.nextInt();
            int ageDifference;
            if (ageOne > ageTwo){
                System.out.println("El primer hermano es el mayor, por");
                ageDifference = ageOne - ageTwo;
            }
            else {
                System.out.println("El segundo hermano es el mayor por");
                ageDifference = ageTwo - ageOne;
            }
            System.out.println("La diferencia de edades es:" + ageDifference);
            break;

            case 11:
            System.out.println("CASO 11: Calcular si un empleado recibirá incentivos por su producción semanal");
            System.out.println("Ingrese la producción del dia lunes");
            int productionMonday =input.nextInt();
            System.out.println("Ingrese la producción del dia Martes");
            int productionTuesday =input.nextInt();
            System.out.println("Ingrese la producción del dia Miercoles");
            int productionThursday =input.nextInt();
            System.out.println("Ingrese la producción del dia Jueves");
            int productionWednesday =input.nextInt();
            System.out.println("Ingrese la producción del dia Viernes");
            int productionFriday =input.nextInt();
            System.out.println("Ingrese la producción del dia Sabado");
            int productionSaturday =input.nextInt();
            int productionTotal = (productionMonday + productionTuesday + productionThursday + productionWednesday + productionFriday + productionSaturday);
            int pPromedia = productionTotal / 6;
            if (pPromedia >= 100){
                System.out.println("Recibira Incentivos");
            }
            else {
                System.out.println("No recibira Incentivos");
            }
            break;

            case 12:

            System.out.println("Ingresa el primer numero");
            int numOne =input.nextInt();
            System.out.println("Ingresa el segundo numero");
            int numTwo =input.nextInt();
            System.out.println("Ingresa el tercer numero:");
            int numThree =input.nextInt();
            int largerNumber;
            if ((numOne > numTwo) && (numOne > numThree)){
                largerNumber = numOne;
            }
            else if (numOne > numThree){
                largerNumber = numTwo;
            }
            else{
                largerNumber = numThree;
            }
            System.out.println("El numero mayor es:" + largerNumber);
            break;

            case 13:
            System.out.println("CASO 13: Determinar el tipo de triángulo según sus lados");
            System.out.println("Ingrese el primer lado");
            int lOne =input.nextInt();
            System.out.println("Ingrese el segundo lado");
            int lTwo =input.nextInt();
            System.out.println("Ingrese el tercer lado");
            int lThree =input.nextInt();
            String triangleType;
            if ((lOne != lTwo) && (lTwo != lThree) && (lThree != lOne)){
                triangleType = "Escaleno";
            }
            else if ((lOne == lTwo) && (lTwo == lThree )){
                triangleType = "Equilatero";
            }
            else{
                triangleType = "Isósceles";
            }
            System.out.println("El tipo de triangulo es:" + triangleType);
            break;

            case 14:
            System.out.println("CASO 14: Convertir un número entero a su representación en números romanos");
            System.out.println("Ingrese un numero entero entre 1 y 10:");
            int num =input.nextInt();
            String numberEnteger = "0";
            switch (num) {
                case 1: numberEnteger = "I";
                break;
                case 3: numberEnteger = "II";
                break;
                case 4: numberEnteger = "IIi";
                break;
                case 5: numberEnteger = "IV";
                break;
                case 6: numberEnteger = "VI";
                break;
                case 7: numberEnteger = "VII";
                break;
                case 8: numberEnteger = "VIII";
                break;
                case 9: numberEnteger = "IX";
                break;
                case 10: numberEnteger = "X";
                break;
            }
            System.out.println("El numero en romano es:" + numberEnteger);

            case 15:
            System.out.println("CASO 15: Calcular la bonificación de un vendedor según el monto de venta alcanzado");
            System.out.println("Ingrese el monto de venta alcanzado:");
            int amountSold =input.nextInt();
            int totalBonus;
    
            if ( amountSold >= 0 && amountSold  <= 1000) {
                totalBonus = (0 * amountSold ) / 100;
            }else if (amountSold  >= 1000 && amountSold  < 5000){
                totalBonus = (3 *amountSold ) / 100;
            }else if (amountSold  >= 5000 && amountSold  < 20000){
                totalBonus = (5 * amountSold ) / 100;
            }else if (amountSold  >= 20000){
                totalBonus = (8 * amountSold ) / 100;
            }else {
                totalBonus = 0;     }
            System.out.println("El total de bonificación es:" + totalBonus);
            break;

            case 16:
            System.out.println("CASO 16: Convertir un número entero del 1 al 5 a su representación en vocales");
            System.out.println("Ingrese un numero entero del 1 al 5:");
            num =input.nextInt();
            String vocal = "";
            switch (num) {
                case 1: vocal = "A";
                break;
                case 2: vocal = "E";
                break;
                case 3: vocal = "I";
                break;
                case 4: vocal = "O";
                break;
                case 5: vocal = "U";
                break;
                default:vocal = "Valor incorrecto";
                break;
            }
            System.out.println("El resultado es:" + vocal);
            break;

            case 17:
            System.out.println("CASO 17: Descomponer un número entero de dos dígitos en decenas y unidades");
            System.out.println("Ingresa un numero entero de dos digitos");
            int numb =input.nextInt();
            double integerquotient = Math.sqrt(numb / 10);
            double remainder  = numb - (integerquotient * 10);
            double tens = integerquotient;
            double units = remainder ;
            System.out.println("Decenas:" + tens);
            System.out.println("Unidades:" + units);
            break;

            case 18:
            System.out.println("CASO 18: Determinar si un número entero es par o impar");
            System.out.println("Ingresa un numero entero diferente a cero");
            num =input.nextInt();
            int integerquotien = num / 2;
            int remainde = num - ( integerquotien * 2);
    
            if (remainde == 0){
                System.out.println("Is pair");
            }else{
                System.out.println("Is odd");
            }
            break;
            
            case 19:
            System.out.println("CASO 19: Imprimir los primeros 5 números pares");
            int number = 2;
            System.out.println(number);
            for (int counter = 1; counter <= 4; counter++){
                number = number + 2;
                System.out.println(number);
            }
            break;

            case 20:
            System.out.println("CASO 20: Calcular el sueldo promedio de empleados");
            System.out.println("Ingresa el numero de empleados");
            int numnerEmployee =input.nextInt();
            double SS= 0;
            double SE = 0;
            double SP = 0;
            int counter;
            for (counter = 1; counter <= numnerEmployee; counter++){
                System.out.println("Ingrese sueldo");
                SE =input.nextDouble();
                SS = SS + SE;
            }
            SP = SS / numnerEmployee;
            System.out.println("El sueldo promedio es:" + SP);
            break;

            case 21:
            System.out.println("CASO 21: Contar la cantidad de personas mayores y menores de edad");
            int menores = 0;
            int mayores = 0;
            for (counter = 1; counter <= 200; counter++){
                System.out.println("Ingresa la edad");
                int EP =input.nextInt();
                if (EP < 18 ){
                    menores = menores + 1;
                }else{
                    mayores = mayores + 1;
                }
            }
            System.out.println("La cantidad de mayores es:" + mayores);
            System.out.println("La cantidad de menores es:" + menores);
            break;

            case 22:
            System.out.println("CASO 22: Calcular el producto de dos números enteros sin usar el operador de multiplicación");
            System.out.println("Ingresa el primer numero entero");
            int num1 =input.nextInt();
            System.out.println("Ingresa el segundo numero entero");
            int num2 =input.nextInt();
            int producto = 0;
            for (counter = 1; counter <= num2; counter++){
                producto = producto + num1;
            }
            System.out.println("El producto es:" + producto);
            break;

            case 23:
            System.out.println("CASO 23: Imprimir los primeros 10 números impares");
            counter = 0;
            for (num = 1; counter < 10; num++){
                if(num % 2 != 0){
                    System.out.println(num);
                    counter++;
                } }
            break;

            case 24:
            System.out.println("CASO 24: Imprimir una serie de números a partir de un número ingresado");
            System.out.println("Ingresa la serie");
            int serie =input.nextInt();
            while (serie < 1000)
            System.out.println(serie);
            serie = (serie * 2 ) + 1;
            break;

            case 25:
            System.out.println("CASO 25: Imprimir letras hasta que se ingrese una vocal");
            System.out.println("Ingresa letras");
            char letras =input.next().charAt(0);
            String SEMAF = "V";
            while (SEMAF.equals("V")){
                System.out.println(letras);
                switch (letras) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
    
                    SEMAF = "R";
                        break;
                    default:
                    SEMAF = "V";
                        break;
                }
            }
            System.out.println("Fin del programa ingresaste una vocal");
            break;

            case 26:
            num1 = 0;
            num2 = 1;
            int num3 = num1 + num2;
            System.out.println(num1);
            System.out.println(num2);
            while (num3 < 100000){
                System.out.println(num3);
                num1 = num2;
                num2 = num3;
                num3 = num1 + num2;
            }
            break;

            case 27:
            System.out.println("CASO 27: Realizar operaciones aritméticas básicas");
            System.out.println("Ingresa el primer numero");
            num1 =input.nextInt();
            System.out.println("Ingresa el primer numero");
            num2 =input.nextInt();
            System.out.println("Ingresa un operador aritmetico");
            String op =input.nextLine();
            switch (op) {
                case "+" :
                result = num1 + num2;
                System.out.println(result);
                    break;
                
                case "-" :
                result = num1 - num2;
                System.out.println(result);
                    break;
    
                case "*" :
                result = num1 * num2;
                System.out.println(result);
                    break;
    
                case "" :
                result = num1 * num2;
                System.out.println(result);
                    break;
            
                default:
                result = 0;
                    break;
            }
            break;

            case 28:
            System.out.println("CASO 28: Contar vocales y consonantes en una secuencia de letras");
            System.out.println("Ingrese 10 letras");
            char letra =input.next().charAt(0);
            int NV,NC;
            NV = 0;
            NC = 0;
            for (counter = 1; counter <= 10; counter++){
                System.out.println(letra);
                switch (letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    NV = NV + 1;    
                    break;
                    default:
                    NC = NC + 1;
                        break;
                }
            }
            System.out.println("Numero de vocales" +NV);
            System.out.println("Numero de consonates" +NC);
            break;

            case 29:
                System.out.println("Ingrese el voto");
                int VE =input.nextInt();
                int G;
                int C1 = 0;
                int C2 = 0;
                int C3 = 0;
                int C0 = 0;
                for (counter = 1; counter <= 160; counter++){
                    System.out.println(VE);
                    switch (VE) {
                        case 1:
                        case 2:
                        case 3:
                        C1 = C1 + 1;     
                            break;
                    
                        default:
                        C0 = C0 + 1;
                            break;
                    }
                }
                if ((C1 > C2) && (C2 > C3) && (C1 > C0)){
                    G = C1;
                }else if((C2 > C3) && (C2 > C0)){
                    G = C2;
                }else if(C3 > C0){
                    G = C3;
                }else{
                    G = C0;
                }
                System.out.println("El ganador es:" +G);
            break;

            case 30:
                System.out.println("Ingrese el primer numero");
                num1 =input.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 =input.nextInt();
                result = (num1 + num2) / 2;
                System.out.println("El promedio de los numeros es:" + result);
                break;

             case 31:
            System.out.println("Ingrese un numero");
            num =input.nextInt();
            switch (num) {
                    case 1:
                    System.out.println("enero");
                        break;
                    case 2: 
                    System.out.println("febrero");
                    case 3:
                    System.out.println("Marzo");
                        break;
                    case 4:
                    System.out.println("Abril");
                        break;
                    case 5:
                    System.out.println("Mayo");
                        break;
                    case 6:
                    System.out.println("Junio");
                        break;
                    case 7:
                    System.out.println("Julio");
                        break;
                    case 8:
                    System.out.println("Agosto");
                        break;
                    case 9:
                    System.out.println("septiembre");
                        break;
                    case 10:
                    System.out.println("Octubre");
                        break;
                    case 11:
                    System.out.println("Noviembre");
                        break;
                    case 12:
                    System.out.println("Diciembre");
                        break;
                    default:
                    break;
            }

            case 32:
            System.out.println("ingrese un numero");
            num = input.nextInt();
            if(num == 0){
                System.out.println("El numero ingresado no puede ser cero");
            }
            for (counter = 1; counter <= num; counter++){
                if (num %  counter == 0){
                    System.out.println(counter);
                }
            }break;
            default:
                break;
        }
    }  
}
