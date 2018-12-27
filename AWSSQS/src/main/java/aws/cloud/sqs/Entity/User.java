package aws.cloud.sqs.Entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull(message = "Not null")
    @Size(min = 0, max = 255, message = "Please insert description")
    private String name;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num1;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num2;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num3;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num4;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num5;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num6;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num7;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num8;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num9;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num10;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num11;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num12;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num13;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num14;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num15;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num16;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num17;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num18;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num19;

    @NotNull(message = "Not null")
    @Range(min = 1, max = 10000, message = "range 1 to 10,000")
    private Integer num20;


    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }

    public Integer getNum4() {
        return num4;
    }

    public void setNum4(Integer num4) {
        this.num4 = num4;
    }

    public Integer getNum5() {
        return num5;
    }

    public void setNum5(Integer num5) {
        this.num5 = num5;
    }

    public Integer getNum6() {
        return num6;
    }

    public void setNum6(Integer num6) {
        this.num6 = num6;
    }

    public Integer getNum7() {
        return num7;
    }

    public void setNum7(Integer num7) {
        this.num7 = num7;
    }

    public Integer getNum8() {
        return num8;
    }

    public void setNum8(Integer num8) {
        this.num8 = num8;
    }

    public Integer getNum9() {
        return num9;
    }

    public void setNum9(Integer num9) {
        this.num9 = num9;
    }

    public Integer getNum10() {
        return num10;
    }

    public void setNum10(Integer num10) {
        this.num10 = num10;
    }

    public Integer getNum11() {
        return num11;
    }

    public void setNum11(Integer num11) {
        this.num11 = num11;
    }

    public Integer getNum12() {
        return num12;
    }

    public void setNum12(Integer num12) {
        this.num12 = num12;
    }

    public Integer getNum13() {
        return num13;
    }

    public void setNum13(Integer num13) {
        this.num13 = num13;
    }

    public Integer getNum14() {
        return num14;
    }

    public void setNum14(Integer num14) {
        this.num14 = num14;
    }

    public Integer getNum15() {
        return num15;
    }

    public void setNum15(Integer num15) {
        this.num15 = num15;
    }

    public Integer getNum16() {
        return num16;
    }

    public void setNum16(Integer num16) {
        this.num16 = num16;
    }

    public Integer getNum17() {
        return num17;
    }

    public void setNum17(Integer num17) {
        this.num17 = num17;
    }

    public Integer getNum18() {
        return num18;
    }

    public void setNum18(Integer num18) {
        this.num18 = num18;
    }

    public Integer getNum19() {
        return num19;
    }

    public void setNum19(Integer num19) {
        this.num19 = num19;
    }

    public Integer getNum20() {
        return num20;
    }

    public void setNum20(Integer num20) {
        this.num20 = num20;
    }
}
