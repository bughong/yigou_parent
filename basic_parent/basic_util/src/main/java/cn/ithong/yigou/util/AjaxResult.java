package cn.ithong.yigou.util;

//操作前台时，返回的json结果
public class AjaxResult {
    private boolean succsee = true;         //默认操作成功的状态值
    private String message = "操作成功";    //默认操作成功
    private Object resultobj = null;   //返回指定的对象

    public boolean isSuccsee() {
        return succsee;
    }

    public AjaxResult setSuccsee(boolean succsee) {
        this.succsee = succsee;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultobj() {
        return resultobj;
    }

    public AjaxResult setResultobj(Object resultobj) {
        this.resultobj = resultobj;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }
}
