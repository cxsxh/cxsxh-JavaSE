package com.itheima.myset;

public class StudentTwo implements Comparable<StudentTwo>{
    private String name;
    private int age;
    private int Chinese;
    private int Meth;
    private int English;


    public StudentTwo() {
    }

    public StudentTwo(String name, int age, int Chinese, int Meth, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.Meth = Meth;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return Meth
     */
    public int getMeth() {
        return Meth;
    }

    /**
     * 设置
     * @param Meth
     */
    public void setMeth(int Meth) {
        this.Meth = Meth;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    public String toString() {
        int sum = this.getChinese() + this.getMeth() + this.getEnglish();
        return "StudentTwo{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", Meth = " + Meth + ", English = " + English + ", sum = " +  sum + "}";
    }

    @Override
    public int compareTo(StudentTwo o) {
        int sum1 = this.getChinese() + this.getMeth() + this.getEnglish();
        int sum2 = o.getChinese() + o.getMeth() + o.getEnglish();
        int i = sum1 - sum2;
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMeth() - o.getMeth() : i;
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;

        return i;
    }
}
