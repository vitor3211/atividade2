public class ContadorLetras {

    private int vog;
    private int cons;

    public ContadorLetras () {
        this.vog = 0;
        this.cons = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua frase:");

        String frase = scan.nextLine();

        System.out.println("Sua frase é: " + frase);

        frase = frase.toLowerCase();

        ContadorLetras cl = new ContadorLetras ();

        int vogal = 0, consoante = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                vogal++;
            }else{
                consoante++;
            }
            
        }

        cl.setVog(vogal);
        cl.setCons(consoante);

        System.out.println("Na frase \"" + frase + "\" temos:\nVogais: " + cl.getVog() + "\nConsoantes: " + 
                cl.getCons());

    }

    public int getVog() {
        return vog;
    }

    public void setVog(int vog) {
        this.vog = vog;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }
}