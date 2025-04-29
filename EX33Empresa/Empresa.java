import javax.swing.JOptionPane;

public class Empresa {
    private String nome;
    private String cidade;
    private String estado;
    private int cep;
    private int fone;

    public Empresa() {
        this("", "", "", 0, 0); 
    }

    public Empresa(String nome, String cidade, String estado) {
        this(nome, cidade, estado, 0, 0);
    }

    public Empresa(int cep, int fone) {
        this("", "", "", cep, fone);
    }

    public Empresa(String nome, String cidade, String estado, int cep, int fone) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public String getcidade(){
        return cidade;
    }
    public void setcidade(String cidade){
        this.cidade=cidade;
    }
    public String getestado(){
        return estado;
    }
    public void setestado(String estado){
        this.estado=estado;
    }
    public int getcep(){
        return cep;
    }
    public void setcep(int cep){
        this.cep=cep;
    }
    public int getfone(){
        return fone;
    }
    public void setfone(int fone){
        this.fone=fone;
    }
    public void leitura(){
        setnome(JOptionPane.showInputDialog("Digite o nome da empresa:"));
        setcidade(JOptionPane.showInputDialog("Digite a cidade da empresa:"));
        setestado(JOptionPane.showInputDialog("Digite o estado da empresa:"));
        setcep(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP da empresa (apenas números):")));
        setfone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone da empresa (apenas números):")));
    }
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome da empresa: " + getnome());
        JOptionPane.showMessageDialog(null, "Cidade da empresa: " + getcidade());
        JOptionPane.showMessageDialog(null, "Estado da empresa: " + getestado());
        JOptionPane.showMessageDialog(null, "CEP da empresa: " + getcep());
        JOptionPane.showMessageDialog(null, "Telefone da empresa: " + getfone());
    }
    public String paraString(){
        return ("/nome" + getnome() + " /cidade" + getcidade() + " /estado" +getestado() + " /CEP " + getcep() + " /fone " + getfone());
    } 
    
}
