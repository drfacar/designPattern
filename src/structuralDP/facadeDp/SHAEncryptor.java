package structuralDP.facadeDp;

public class SHAEncryptor {

    public void encrypt(String text,String securityKey,boolean type){

        if (type){
            System.out.println("<SHA> "+ text + securityKey+ "<SHA>");
        }else {
            System.out.println("<SHA> "+ securityKey+ text  +"<SHA>");
        }
    }
}
