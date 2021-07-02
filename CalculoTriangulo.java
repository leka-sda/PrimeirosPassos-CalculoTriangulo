// Importa biblioteca que habilita o uso de raízes quadradas
import java.lang.*; 
  
public class Programa {  
    public static void main (String[] args) {  
  
        Retangulo retangulo = new Retangulo();  
        TrianguloRetangulo triangulo = new TrianguloRetangulo();  
  
        triangulo.setAltura(50.0);  
        triangulo.setBase(25.0);  
        System.out.println("A área do triangulo é de " + triangulo.getArea());  
        System.out.println("A hipotenusa do triangulo é de " + triangulo.getHipotenusa());  
  
        retangulo.setAltura(50.0);  
        retangulo.setBase(20.0);  
        System.out.println("A área do retângulo é de " + retangulo.getArea());  
    }  
}  

class Figura {  
    private double altura;  
    private double base;  
  
    public void setBase (double base) {  
        this.base = base;  
    }  
    public double getBase() {  
        return base;  
    }  
    public void setAltura (double altura) {  
        this.altura = altura;  
    }  
    public double getAltura() {  
        return altura;  
    } 
    public double getArea() {   
        return 0.0;  
    }  
} 

class TrianguloRetangulo extends Figura {  
    public double getArea() {  
        return (this.getAltura() * this.getBase() / 2.0);  
    }  
    public double getHipotenusa() {  
        return Math.sqrt(this.getBase() * this.getBase() + this.getAltura() * this.getAltura());  
    }  
}  

class Retangulo extends Figura {  
    public double getArea() {  
        return (this.getBase() * this.getAltura());  
    }  
}