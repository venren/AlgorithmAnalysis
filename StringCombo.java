public class StringCombo {
    public static void main(String[] args) {
        String input = "abc";
        execute(input,"");
    }

    private static void execute(String input, String prefix) {
        if(input.length() == 1){
            System.out.println(prefix+input);
            return;
        }

        for(int i=0; i< input.length(); i++){
            String newPrefix = String.valueOf(input.charAt(i));
            String newInput = input.substring(0,i) + input.substring(i+1);
            execute(newInput,prefix+newPrefix);
        }


    }

}
