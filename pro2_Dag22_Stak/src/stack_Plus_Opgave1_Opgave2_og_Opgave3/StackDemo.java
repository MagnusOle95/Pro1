package stack_Plus_Opgave1_Opgave2_og_Opgave3;

public class StackDemo {
    public static void main(String[] args) {
      //  StackI s = new NodeStack();
         StackI s = new ArrayStack(5);
        s.push("Tom");
        s.push("Diana");
        s.push("Harry");
        s.push("Thomas");
        s.push("Bob");
        s.push("Brian");
        System.out.println(s.peek());
        System.out.println(s.isEmpty() + " " + s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();
        
        // -------- test af reverse --------
        
//        Integer[] tal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        reverse(tal);
//        for (int i = 0; i < tal.length; i++) {
//            System.out.print(tal[i] + " ");
//        }


        //Opgave 1-----------------------------------------------------------!!
        //Opretter og tester om listen er tom
        StackI arraylistStack = new ArraylistStack();
        System.out.println("Er listen tom = " + arraylistStack.isEmpty());
        //Tilføjer personer til stacken og tester metoden push
        arraylistStack.push("Per");
        arraylistStack.push("Frank");
        arraylistStack.push("Egon");
        arraylistStack.push("Jennerboi");
        arraylistStack.push("Gert");
        //Tester metoden size.
        System.out.println("Stack størrelse = " + arraylistStack.size());
        //tester metoden peek
        System.out.println("Navnet på personen øverst i stakken = " + arraylistStack.peek());
        //Tester pop metoden og tjekker om hvad der så er øverst i stakken.
        arraylistStack.pop();
        System.out.println("Det nye navn øverst = " + arraylistStack.peek());
        System.out.println("størrelsen er nu = " + arraylistStack.size());

        //Opgave 2 parantestjek.
        String test = "(3+{5{99{*}}[23[{67}67]]}){[(())]}()[[]]";
        System.out.println(parantesTjek(test));

        //Opgave3 A
        System.out.println();
        //Opretter nodeDropoutStack
        StackI nodeDropoutStack = new NodeDropOutStack(5);
        //Tilføjer elementer til min stack.
        nodeDropoutStack.push("Per");
        nodeDropoutStack.push("Frank");
        nodeDropoutStack.push("Gert");
        nodeDropoutStack.push("Jebber");
        nodeDropoutStack.push("Hauli");
        //tjekker øverste element i stakken.
        System.out.println(nodeDropoutStack.peek());
        //Tjekker størelsen på stakken.
        System.out.println(nodeDropoutStack.size());
        //tilføjer en 6 person til stakken.
        nodeDropoutStack.push("Lilian");
        //tjekker øverste element i stakken igen og størrelsen.
        System.out.println(nodeDropoutStack.peek());
        System.out.println(nodeDropoutStack.size());
        //Tjekker hver eneste af de 5 personer i stakken. og sletter dem samtidig. ( Den der skal være slettet er Per)
        System.out.println(nodeDropoutStack.pop());
        System.out.println(nodeDropoutStack.pop());
        System.out.println(nodeDropoutStack.pop());
        System.out.println(nodeDropoutStack.size()); // tjekker størelsen af listen her.
        System.out.println(nodeDropoutStack.pop());
        System.out.println(nodeDropoutStack.pop());
        //Tjekker om du kan pop med en tom liste.
        //System.out.println(nodeDropoutStack.pop());
        //Tjekker om du kan peek med en tom liste.
        //System.out.println(nodeDropoutStack.peek());

        //Opgave3 - C
        System.out.println();
        System.out.println("Opgave 3 - C");
        //Opretter nodeDropoutStackDouble
        StackI nodeDropoutStackDouble = new NodeDropOutStackDouble(5);
        //Tilføjer elementer til min stack.
        nodeDropoutStackDouble.push("Per");
        nodeDropoutStackDouble.push("Frank");
        nodeDropoutStackDouble.push("Gert");
        nodeDropoutStackDouble.push("Jebber");
        nodeDropoutStackDouble.push("Hauli");
        //tjekker øverste element i stakken.
        System.out.println(nodeDropoutStackDouble.peek());
        //Tjekker størelsen på stakken.
        System.out.println(nodeDropoutStackDouble.size());
        //tilføjer en 6 person til stakken.
        nodeDropoutStackDouble.push("Lilian");
        //tjekker øverste element i stakken igen og størrelsen.
        System.out.println(nodeDropoutStackDouble.peek());
        System.out.println(nodeDropoutStackDouble.size());
        //Tjekker hver eneste af de 5 personer i stakken. og sletter dem samtidig. ( Den der skal være slettet er Per)
        System.out.println(nodeDropoutStackDouble.pop());
        System.out.println(nodeDropoutStackDouble.pop());
        System.out.println(nodeDropoutStackDouble.pop());
        System.out.println(nodeDropoutStackDouble.size()); // tjekker størelsen af listen her.
        System.out.println(nodeDropoutStackDouble.pop());
        System.out.println(nodeDropoutStackDouble.pop());
        //Tjekker om du kan pop med en tom liste.
        //System.out.println(nodeDropoutStackDouble.pop());
        //Tjekker om du kan peek med en tom liste.
        //System.out.println(nodeDropoutStackDouble.peek());

        //Opgave3 - B
        System.out.println();
        System.out.println("Opgave 3 - B");
        //Opretter nodeDropoutStackDouble
        StackI arrayDropOutStack = new ArrayDropOutStack(5);
        //Tilføjer elementer til min stack.
        arrayDropOutStack.push("Per");
        arrayDropOutStack.push("Frank");
        arrayDropOutStack.push("Gert");
        arrayDropOutStack.push("Jebber");
        arrayDropOutStack.push("Hauli");
        //tjekker øverste element i stakken.
        System.out.println(arrayDropOutStack.peek());
        //Tjekker størelsen på stakken.
        System.out.println(arrayDropOutStack.size());
        //tilføjer en 6 person til stakken.
        arrayDropOutStack.push("Lilian");
        //tjekker øverste element i stakken igen og størrelsen.
        System.out.println(arrayDropOutStack.peek());
        System.out.println(arrayDropOutStack.size());
        //Tjekker hver eneste af de 5 personer i stakken. og sletter dem samtidig. ( Den der skal være slettet er Per)
        System.out.println(arrayDropOutStack.pop());
        System.out.println(arrayDropOutStack.pop());
        System.out.println(arrayDropOutStack.pop());
        System.out.println(arrayDropOutStack.size()); // tjekker størelsen af listen her.
        System.out.println(arrayDropOutStack.pop());
        System.out.println(arrayDropOutStack.pop());
        //Tjekker om du kan pop med en tom liste.
        //System.out.println(arrayDropOutStack.pop());
        //Tjekker om du kan peek med en tom liste.
        //System.out.println(arrayDropOutStack.peek());










    }
    
    public static void reverse(Object[] tabel) {
        StackI stack = new ArrayStack(tabel.length);
        // StackI stack = new NodeStack();
        for (int i = 0; i < tabel.length; i++) {
            stack.push(tabel[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            tabel[i] = stack.pop();
            i++;
        }
        
    }

    public static boolean parantesTjek(String s){
        StackI stack = new ArraylistStack();
        boolean sOk = true;
        int index = 0;
        while (sOk && index < s.length()){
            char ch = s.charAt(index);
            if (ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
            }
            else if (ch == ')'){
                if (!stack.isEmpty() && stack.peek().equals('(')){
                    stack.pop();
                }
                else{
                    sOk = false;
                }
            }
            else if (ch == '}'){
                if (!stack.isEmpty() && stack.peek().equals('{')){
                    stack.pop();
                }
                else{
                    sOk = false;
                }
            }
            else if (ch == ']'){
                if (!stack.isEmpty() && stack.peek().equals('[')){
                    stack.pop();
                }
                else{
                    sOk = false;
                }
            }
            index++;
        }
        if (!stack.isEmpty()){
            sOk = false;
        }
        return sOk;
    }








}