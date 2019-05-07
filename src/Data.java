
public class Data {
    private int Dia;
    private int Mes;
    private int Ano;
    
 private void setDia(int Dia){
    this.Dia = Dia;
} 
  
 private void setMes(int Mes){
    this.Mes = Mes;
} 
  
 private void setAno(int Ano){
    this.Ano = Ano;
} 
  
    
 public int getDia(){
     return this.Dia;
 }
 
 public int getMes(){
     return this.Mes;
 }
 
 public int getAno(){
     return this.Ano;
 }
 
public void mostrar(){
    System.out.println(Dia +Mes +Ano);
}


}
