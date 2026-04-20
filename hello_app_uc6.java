public class hello_app_uc6 {
    public static void main(String[] args){
        StringBuilder nameBuilder = new StringBuilder();

        for(String name : args){
            nameBuilder.append(name).append(",");
        }

        String result = "";
        if(nameBuilder.length() > 0){
            result = nameBuilder.substring(0, nameBuilder.length() - 1);
        }

        System.out.println("hello " + result);
    }
}