public class LoginManager {//class name 名詞
    
    private String username;
    private String password;


    public LoginManager(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //approach 2
    public static class BusinessRuntimeException extends RuntimeException {
       
       
        //runtime  -> spelling mistake
        //"Invalid User Name."
        //"Invalid Password"
        //if 公司有30個 systems, 統一
        //用 enum 可以鍞定 句子, 唔洗你寫

        //static method inside class
        public static BusinessRuntimeException of(SysError sysError) {
            return new BusinessRuntimeException(sysError);
        }


        //constructor
        public BusinessRuntimeException(SysError sysErr) {//best , compile time
            //sysErr.getDesc() 去左
            super(sysErr.getDesc());//compile time
        }
        
        
        // private BusinessRuntimeException(String message) {//original public now private 自己用
        //     //Runtime
            
        //     super(message);
        // }
    }




    //approach 1
    //下面有 new object, 所以有 class
    //有 constructor
    //因為有 extends RuntimException, 可以 pass message
    public static class InvalidUsernameException extends RuntimeException {
        public InvalidUsernameException(String message) {
            super(message);
        }
        
    }


    public static class InvalidUserpasswordException extends RuntimeException {
        public InvalidUserpasswordException(String message) {
            super(message);
        }
            
    }

    /**
     * method 行為, 動詞
     */
    //!!!
    public void validateUsername() {
        if (this.username == null || this.username.isEmpty()) {
            //Exception 係一個 object, 要 new, 所以有個 class, 有 constructor
          throw new InvalidUsernameException(
              "Username is invalid: " + this.username);
        }
      }


     


        //!!!
      //regular expression
      public void validatePassword2() {
        if (this.password == null || this.password.length() < 8
            || (!this.password.contains("@") && !this.password.contains("!")
                && !this.password.contains("$") && !this.password.contains("&")
                && !this.password.contains("_"))) {
          
          throw BusinessRuntimeException.of(SysError.INVALID_PASSWORD);
          //原本 new new BusinessRuntimeException(SysError.INVALID_PASSWORD);
          //now change to of
        }
      }


       
      //加左 of and SysError.INVALID_USERNAME
     public void validateUsername2() {
        if (this.username == null || this.username.isEmpty()) {
            
            throw BusinessRuntimeException.of(SysError.INVALID_USERNAME);
            //enum, throw 一件事, 就算你未決定, 我都可以寫
            //"INVALID_USERNAME", 寫錯根本 compile 唔到
            //原本 new new BusinessRuntimeException(SysError.INVALID_USERNAME);
            //now of
        }
    }



    // !!!
    public void validatePassword() {
        if (this.password == null || this.password.length() < 8
            || (!this.password.contains("@") && !this.password.contains("!")
                && !this.password.contains("$") && !this.password.contains("&")
                && !this.password.contains("_"))) {
        throw new InvalidUserpasswordException(
            "Password is invalid: " + this.password);
        }
    }
    
   


      public static void main(String[] args) {
        
            LoginManager loginManager = new LoginManager("jackywong", "abcd123");
            
            //一個 try 但 catch 唔同 exception 會走唔同 flow
            //username go to invalidusernameexception
            
            //approach 1
            try { 
                loginManager.validateUsername();
                loginManager.validatePassword();
            } catch (InvalidUsernameException e) {
                System.out.println(e.getMessage());
            } catch (InvalidUserpasswordException e) {
                System.out.println(e.getMessage());
            }
            


            //approach 2
            LoginManager loginManager2 = new LoginManager("jackywong", "abcd1234");
            
            try { 
                loginManager2.validateUsername();
                loginManager2.validatePassword();
                System.out.println("Valid Success");
            } catch (BusinessRuntimeException e) {
                System.out.println(e.getMessage());
            }
      }


}
