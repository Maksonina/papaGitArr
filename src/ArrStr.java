public class ArrStr{
    public static void main(String[] args) {
        String g = "иван Иванов Иванович";
        String b = "иван иванов иванович";
        checkUserName(g,b);
    }
    public static void checkUserName(String g,String b){
        if(g.equalsIgnoreCase(b)){
            System.out.println("Ваше имя имеет длину "+g.length()+" символов");
            System.out.println("А бех пробелов Ваше имя имеет длину "+g.replace(" ","").length()+" символов");
        }
        else System.out.println("Выберите другое имя!");

    }
}

