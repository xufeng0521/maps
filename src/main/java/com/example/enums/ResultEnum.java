package com.example.enums;

/**
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 *
 * @ClassName ResultEnum
 * @Description
 * @Author sl
 * @Date 2018/10/25 16:02
 * @Version 1.0
 */
public enum ResultEnum {
    UNKOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数不正确"),
    LOGIN_FAIL(25,"登录失败，登录信息不正确"),
    LOOUT_SUCCESS(26,"登出成功"),
    NETWORK_ERROR(36,"网络错误"),
    OPERATE_ERROR(500,"操作失败！刷新后重试"),
    EVALUATESUPPLIER(27,"评价成功"),
    DESIGNATEDSUCCESS(28,"指定成功"),
    REMARK_SUCCESS(29,"备注成功"),
    REMARK_ERROR(30,"备注失败"),
    CHOOSE_SUCCESS(31,"选择成功"),
    CAREER_ERROR(32,"专业领域不正确"),
    DEPT_ERROR(33,"单位不正确"),
    METHOD_ERROR(34,"采购方式不正确"),
    CATEGORY_ERROR(35,"类别不正确"),
    TASKTYPE_ERROR(36,"任务属性不正确")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
