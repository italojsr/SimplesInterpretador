
public class Main {

    public static void main(String[] args) {
        
        /* 
        String input = """
                push 10
                push 20
                add
                pop a
                push 45
                push a
                sub
                print    
                """;
        */

        String input = """
            let a = 42 + palavra + 2;
            let b = 15 + 3;
            print a + b;       
                """;
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
        
        //Parser p = new Parser (input.getBytes());
        //p.parse();

        //Interpretador i = new Interpretador (p.getOutput());
        //i.run();
        
   
    }
    

    
}
