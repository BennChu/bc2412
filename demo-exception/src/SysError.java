public enum SysError {

    //用 enum 鍞定 error description
    INVALID_USERNAME("Invalid Username"),
    INVALID_PASSWORD("Invalid Password"),
    ;
    
    private String desc;

    //constructor
    private SysError(String desc) {
        this.desc = desc;
    }

    //getter
    public String getDesc() {
        return this.desc;
    }
}
