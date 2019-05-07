
public class Pessoa {
    private String Pessoa;
    private Data DataDeNascimento;
    
    private void setPessoa(String Pessoa){
    this.Pessoa = Pessoa;
} 
    private void setDataDeNascimento(Data DataDeNascimento){
    this.DataDeNascimento = DataDeNascimento;
} 
    
  public String getPessoa(){
      return this.Pessoa;
  }
    
  public Data getDataDeNascimento(){
      return this.DataDeNascimento;
  }
  
    public void mostrar(){
    System.out.println(Pessoa);
    DataDeNascimento.mostrar();
   
}

    
}
