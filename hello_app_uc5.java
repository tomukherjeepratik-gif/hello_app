public class hello_app_uc5 {
    public static void main(String[] args){
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for(String name : args){
            if(!first){
                nameBuilder.append(",");
            }
            nameBuilder.append(name);
            first = false;
        }

        String result = nameBuilder.toString();
        System.out.println("hello " + result);
    } 
}