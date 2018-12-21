package myWeb;

public class SpringWebInitializer implements SpringWeb {
    //配置
    @Override
    public void config() {
        System.out.println("初始化");
    }
}
