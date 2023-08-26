
package clases;

public class principal {
    public static void main(String [] args){
        estudiantes estudiante =new estudiantes("nicol","2220221050","4","desarrollo de software", 40.02f);
        estudiante.mostrardatos();
        
        profesor profe=new profesor("Daniel","02364","Tecnologia para aplicaciones moviles", 1.200);
         profe.mostrardatos();
         
         nota notas=new nota("Uniagustinianasss","2220221050","nicol","daniel",5.0f);
         notas.mostrardatos();
    }
}
