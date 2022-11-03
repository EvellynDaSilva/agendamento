package arquivo;


public class Matematica {
    
    //Criar um metodo para dividir o v1 e v2
    public double v1;
    public double v2;
    private String operacao;
    
    //Esse Exception dividir lança uma Exception e lança 
    public double dividir() throws ArithmeticException {
        //Queremos dividir v1 por v2 
        return v1 / v2;
    }
    public void setOperacao(String operacao) throws Exception{
        if(operacao.length()< 3){
           
                throw new Exception("Deve ter pelo menos 3 letras");
            } else {
                this.operacao = operacao;
            
        }
        
    }
           
}
