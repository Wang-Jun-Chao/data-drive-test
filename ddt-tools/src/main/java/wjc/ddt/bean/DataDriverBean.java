package wjc.ddt.bean;

/**
 * Author: 王俊超
 * Date: 2018-01-13 06:59
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class DataDriverBean {

    private String inputType;
    private String inputValue;
    private String outputType;
    private String outputValue;

    private String validate;

    public DataDriverBean() {
    }

    public DataDriverBean(String inputType, String inputValue, String outputType, String outputValue, String validate) {
        this.inputType = inputType;
        this.inputValue = inputValue;
        this.outputType = outputType;
        this.outputValue = outputValue;
        this.validate = validate;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public String getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    @Override
    public String toString() {
        return "DataDriverBean{" +
                "inputType='" + inputType + '\'' +
                ", inputValue='" + inputValue + '\'' +
                ", outputType='" + outputType + '\'' +
                ", outputValue='" + outputValue + '\'' +
                ", validate='" + validate + '\'' +
                '}';
    }
}
