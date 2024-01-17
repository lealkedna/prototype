public class ClienteECommerce {
    public static void main(String[] args) {
        
        Laptop laptopPadrao = new Laptop("MarcaX", "Intel i5", 8, 256);

        try {
            
            Laptop laptopUsuario1 = laptopPadrao.clone();
            laptopUsuario1.exibirConfiguracao();  
            laptopUsuario1.setMemoriaRAM(16);   
            laptopUsuario1.setArmazenamento(512); 
            laptopUsuario1.exibirConfiguracao();  
           
            Laptop laptopUsuario2 = laptopPadrao.clone();
            laptopUsuario2.exibirConfiguracao();  
            laptopUsuario2.setProcessador("AMD Ryzen 7"); 
            laptopUsuario2.setArmazenamento(1_024);     
            laptopUsuario2.exibirConfiguracao();  
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
