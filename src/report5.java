public class report5{
    public static void main(String[] args){
        try{
            String str = "壱百満";
            int value = Integer.parseInt(str);
            System.out.println(value);
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。" + e.getMessage());
        }
    }
}
