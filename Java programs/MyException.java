public class MyException extends Exception {
   private String msg;

   MyException() {
   }

   MyException(String s) {
     msg = s;
   }

   public void setMsg(String s) {
     msg = s;
   }

   public String getMsg() {
     return msg;
   }
}
